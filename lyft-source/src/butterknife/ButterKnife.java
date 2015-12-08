// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife
{

    static final Map a = new LinkedHashMap();
    static final Injector b = new Injector() {

        public void inject(Finder finder, Object obj, Object obj1)
        {
        }

    };
    private static boolean c = false;

    public static View a(View view, int i)
    {
        return view.findViewById(i);
    }

    private static Injector a(Class class1)
    {
        Object obj;
        obj = (Injector)a.get(class1);
        if (obj != null)
        {
            if (c)
            {
                Log.d("ButterKnife", "HIT: Cached in injector map.");
            }
            return ((Injector) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            if (c)
            {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            }
            return b;
        }
        Injector injector = (Injector)Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).newInstance();
        obj = injector;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Log.d("ButterKnife", "HIT: Class loaded injection class.");
        obj = injector;
_L2:
        a.put(class1, obj);
        return ((Injector) (obj));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (c)
        {
            Log.d("ButterKnife", (new StringBuilder()).append("Not found. Trying superclass ").append(class1.getSuperclass().getName()).toString());
        }
        classnotfoundexception = a(class1.getSuperclass());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Activity activity)
    {
        a(activity, activity, Finder.b);
    }

    public static void a(View view)
    {
        a(view, view, Finder.a);
    }

    public static void a(Object obj, View view)
    {
        a(obj, view, Finder.a);
    }

    static void a(Object obj, Object obj1, Finder finder)
    {
        Object obj2 = obj.getClass();
        try
        {
            if (c)
            {
                Log.d("ButterKnife", (new StringBuilder()).append("Looking up view injector for ").append(((Class) (obj2)).getName()).toString());
            }
            obj2 = a(((Class) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw new RuntimeException((new StringBuilder()).append("Unable to inject views for ").append(obj).toString(), ((Throwable) (obj1)));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((Injector) (obj2)).inject(finder, obj, obj1);
    }


    private class Injector
    {

        public abstract void inject(Finder finder, Object obj, Object obj1);
    }


    private class Finder extends Enum
    {

        public static final Finder a;
        public static final Finder b;
        public static final Finder c;
        private static final Finder d[];

        public static Finder valueOf(String s)
        {
            return (Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
        }

        public static Finder[] values()
        {
            return (Finder[])d.clone();
        }

        protected abstract Context a(Object obj);

        protected abstract View a(Object obj, int i);

        public Object a(View view, int i, String s)
        {
            return view;
        }

        public Object a(Object obj, int i, String s)
        {
            Object obj1 = b(obj, i, s);
            if (obj1 == null)
            {
                obj = a(obj).getResources().getResourceEntryName(i);
                throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
            } else
            {
                return obj1;
            }
        }

        public Object b(Object obj, int i, String s)
        {
            return a(a(obj, i), i, s);
        }

        static 
        {
            a = new Finder("VIEW", 0) {

                protected Context a(Object obj)
                {
                    return ((View)obj).getContext();
                }

                protected View a(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

            };
            b = new Finder("ACTIVITY", 1) {

                protected Context a(Object obj)
                {
                    return (Activity)obj;
                }

                protected View a(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

            };
            c = new Finder("DIALOG", 2) {

                protected Context a(Object obj)
                {
                    return ((Dialog)obj).getContext();
                }

                protected View a(Object obj, int i)
                {
                    return ((Dialog)obj).findViewById(i);
                }

            };
            d = (new Finder[] {
                a, b, c
            });
        }

        private Finder(String s, int i)
        {
            super(s, i);
        }

    }

}
