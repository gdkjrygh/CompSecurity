// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife
{
    public static abstract class Finder extends Enum
    {

        private static final Finder $VALUES[];
        public static final Finder ACTIVITY;
        public static final Finder DIALOG;
        public static final Finder VIEW;

        public static Finder valueOf(String s)
        {
            return (Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
        }

        public static Finder[] values()
        {
            return (Finder[])$VALUES.clone();
        }

        public Object castView(View view, int i, String s)
        {
            return view;
        }

        public Object findOptionalView(Object obj, int i, String s)
        {
            return castView(findView(obj, i), i, s);
        }

        public Object findRequiredView(Object obj, int i, String s)
        {
            Object obj1 = findOptionalView(obj, i, s);
            if (obj1 == null)
            {
                obj = getContext(obj).getResources().getResourceEntryName(i);
                throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
            } else
            {
                return obj1;
            }
        }

        protected abstract View findView(Object obj, int i);

        protected abstract Context getContext(Object obj);

        static 
        {
            VIEW = new Finder("VIEW", 0) {

                protected View findView(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return ((View)obj).getContext();
                }

            };
            ACTIVITY = new Finder("ACTIVITY", 1) {

                protected View findView(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return (Activity)obj;
                }

            };
            DIALOG = new Finder("DIALOG", 2) {

                protected View findView(Object obj, int i)
                {
                    return ((Dialog)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return ((Dialog)obj).getContext();
                }

            };
            $VALUES = (new Finder[] {
                VIEW, ACTIVITY, DIALOG
            });
        }

        private Finder(String s, int i)
        {
            super(s, i);
        }

    }

    public static interface Injector
    {

        public abstract void inject(Finder finder, Object obj, Object obj1);
    }


    static final Map INJECTORS = new LinkedHashMap();
    static final Injector NOP_INJECTOR = new Injector() {

        public void inject(Finder finder, Object obj, Object obj1)
        {
        }

    };
    private static boolean debug = false;

    private static Injector findInjectorForClass(Class class1)
        throws IllegalAccessException, InstantiationException
    {
        Object obj;
        obj = (Injector)INJECTORS.get(class1);
        if (obj != null)
        {
            if (debug)
            {
                Log.d("ButterKnife", "HIT: Cached in injector map.");
            }
            return ((Injector) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            if (debug)
            {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            }
            return NOP_INJECTOR;
        }
        Injector injector = (Injector)Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).newInstance();
        obj = injector;
        if (!debug)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Log.d("ButterKnife", "HIT: Class loaded injection class.");
        obj = injector;
_L2:
        INJECTORS.put(class1, obj);
        return ((Injector) (obj));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (debug)
        {
            Log.d("ButterKnife", (new StringBuilder()).append("Not found. Trying superclass ").append(class1.getSuperclass().getName()).toString());
        }
        classnotfoundexception = findInjectorForClass(class1.getSuperclass());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void inject(Activity activity)
    {
        inject(activity, activity, Finder.ACTIVITY);
    }

    public static void inject(Object obj, View view)
    {
        inject(obj, view, Finder.VIEW);
    }

    static void inject(Object obj, Object obj1, Finder finder)
    {
        Object obj2 = obj.getClass();
        try
        {
            if (debug)
            {
                Log.d("ButterKnife", (new StringBuilder()).append("Looking up view injector for ").append(((Class) (obj2)).getName()).toString());
            }
            obj2 = findInjectorForClass(((Class) (obj2)));
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

}
