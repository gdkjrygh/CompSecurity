// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife
{

    static final Map a = new LinkedHashMap();
    static final Map b = new LinkedHashMap();
    static final Method c = null;
    private static boolean d = false;

    private static Method a(Class class1)
    {
        Object obj;
        obj = (Method)a.get(class1);
        if (obj != null)
        {
            if (d)
            {
                Log.d("ButterKnife", "HIT: Cached in injector map.");
            }
            return ((Method) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            if (d)
            {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            }
            return c;
        }
        Method method = Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).getMethod("inject", new Class[] {
            butterknife/ButterKnife$Finder, class1, java/lang/Object
        });
        obj = method;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        Log.d("ButterKnife", "HIT: Class loaded injection class.");
        obj = method;
_L2:
        a.put(class1, obj);
        return ((Method) (obj));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (d)
        {
            Log.d("ButterKnife", (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName()).toString());
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

    public static void a(Object obj)
    {
        Object obj1 = obj.getClass();
        try
        {
            if (d)
            {
                Log.d("ButterKnife", (new StringBuilder("Looking up view injector for ")).append(((Class) (obj1)).getName()).toString());
            }
            obj1 = b(((Class) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        catch (Exception exception)
        {
            Object obj2 = exception;
            if (exception instanceof InvocationTargetException)
            {
                obj2 = exception.getCause();
            }
            throw new RuntimeException((new StringBuilder("Unable to reset views for ")).append(obj).toString(), ((Throwable) (obj2)));
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ((Method) (obj1)).invoke(null, new Object[] {
            obj
        });
    }

    public static void a(Object obj, View view)
    {
        a(obj, view, Finder.a);
    }

    private static void a(Object obj, Object obj1, Finder finder)
    {
        Object obj2 = obj.getClass();
        try
        {
            if (d)
            {
                Log.d("ButterKnife", (new StringBuilder("Looking up view injector for ")).append(((Class) (obj2)).getName()).toString());
            }
            obj2 = a(((Class) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Finder finder)
        {
            obj1 = finder;
            if (finder instanceof InvocationTargetException)
            {
                obj1 = finder.getCause();
            }
            throw new RuntimeException((new StringBuilder("Unable to inject views for ")).append(obj).toString(), ((Throwable) (obj1)));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ((Method) (obj2)).invoke(null, new Object[] {
            finder, obj, obj1
        });
    }

    private static Method b(Class class1)
    {
        Object obj;
        obj = (Method)b.get(class1);
        if (obj != null)
        {
            if (d)
            {
                Log.d("ButterKnife", "HIT: Cached in injector map.");
            }
            return ((Method) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            if (d)
            {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            }
            return c;
        }
        Method method = Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).getMethod("reset", new Class[] {
            class1
        });
        obj = method;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        Log.d("ButterKnife", "HIT: Class loaded injection class.");
        obj = method;
_L2:
        b.put(class1, obj);
        return ((Method) (obj));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (d)
        {
            Log.d("ButterKnife", (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName()).toString());
        }
        classnotfoundexception = b(class1.getSuperclass());
        if (true) goto _L2; else goto _L1
_L1:
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

        public abstract View a(Object obj, int i);

        public final View a(Object obj, int i, String s)
        {
            View view = a(obj, i);
            if (view == null)
            {
                obj = a(obj).getResources().getResourceEntryName(i);
                throw new IllegalStateException((new StringBuilder("Required view '")).append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
            } else
            {
                return view;
            }
        }

        static 
        {
            class _cls1 extends Finder
            {

                protected final Context a(Object obj)
                {
                    return ((View)obj).getContext();
                }

                public final View a(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

                _cls1(String s)
                {
                    super(s, 0, (byte)0);
                }
            }

            a = new _cls1("VIEW");
            class _cls2 extends Finder
            {

                protected final Context a(Object obj)
                {
                    return (Activity)obj;
                }

                public final View a(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

                _cls2(String s)
                {
                    super(s, 1, (byte)0);
                }
            }

            b = new _cls2("ACTIVITY");
            class _cls3 extends Finder
            {

                protected final Context a(Object obj)
                {
                    return ((Dialog)obj).getContext();
                }

                public final View a(Object obj, int i)
                {
                    return ((Dialog)obj).findViewById(i);
                }

                _cls3(String s)
                {
                    super(s, 2, (byte)0);
                }
            }

            c = new _cls3("DIALOG");
            d = (new Finder[] {
                a, b, c
            });
        }

        private Finder(String s, int i)
        {
            super(s, i);
        }

        Finder(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
