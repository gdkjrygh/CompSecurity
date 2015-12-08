// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class ButterKnife
{
    public static abstract class Finder extends Enum
    {

        private static final Finder $VALUES[];
        public static final Finder ACTIVITY;
        public static final Finder VIEW;

        public static Finder valueOf(String s)
        {
            return (Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
        }

        public static Finder[] values()
        {
            return (Finder[])$VALUES.clone();
        }

        public abstract View findById(Object obj, int i);

        static 
        {
            class _cls1 extends Finder
            {

                public final View findById(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            VIEW = new _cls1("VIEW", 0);
            class _cls2 extends Finder
            {

                public final View findById(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ACTIVITY = new _cls2("ACTIVITY", 1);
            $VALUES = (new Finder[] {
                VIEW, ACTIVITY
            });
        }

        private Finder(String s, int i)
        {
            super(s, i);
        }

    }

    public static class UnableToInjectException extends RuntimeException
    {

        UnableToInjectException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class UnableToResetException extends RuntimeException
    {

        UnableToResetException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    static final Map INJECTORS = new LinkedHashMap();
    static final Method NO_OP = null;
    static final Map RESETTERS = new LinkedHashMap();
    private static final String TAG = "ButterKnife";
    private static boolean debug = false;

    private ButterKnife()
    {
    }

    public static View findById(Activity activity, int i)
    {
        return activity.findViewById(i);
    }

    public static View findById(View view, int i)
    {
        return view.findViewById(i);
    }

    private static Method findInjectorForClass(Class class1)
    {
        Object obj = (Method)INJECTORS.get(class1);
        if (obj != null)
        {
            return ((Method) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            return NO_OP;
        }
        try
        {
            obj = Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).getMethod("inject", new Class[] {
                butterknife/ButterKnife$Finder, class1, java/lang/Object
            });
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            if (debug)
            {
                (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName());
            }
            classnotfoundexception = findInjectorForClass(class1.getSuperclass());
        }
        INJECTORS.put(class1, obj);
        return ((Method) (obj));
    }

    private static Method findResettersForClass(Class class1)
    {
        Object obj = (Method)RESETTERS.get(class1);
        if (obj != null)
        {
            return ((Method) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            return NO_OP;
        }
        try
        {
            obj = Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewInjector").toString()).getMethod("reset", new Class[] {
                class1
            });
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            if (debug)
            {
                (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName());
            }
            classnotfoundexception = findResettersForClass(class1.getSuperclass());
        }
        RESETTERS.put(class1, obj);
        return ((Method) (obj));
    }

    public static void inject(Activity activity)
    {
        inject(activity, activity, Finder.ACTIVITY);
    }

    public static void inject(View view)
    {
        inject(view, view, Finder.VIEW);
    }

    public static void inject(Object obj, Activity activity)
    {
        inject(obj, activity, Finder.ACTIVITY);
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
                (new StringBuilder("Looking up view injector for ")).append(((Class) (obj2)).getName());
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
            throw new UnableToInjectException((new StringBuilder("Unable to inject views for ")).append(obj).toString(), ((Throwable) (obj1)));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ((Method) (obj2)).invoke(null, new Object[] {
            finder, obj, obj1
        });
    }

    public static void reset(Object obj)
    {
        Object obj1 = obj.getClass();
        try
        {
            if (debug)
            {
                (new StringBuilder("Looking up view injector for ")).append(((Class) (obj1)).getName());
            }
            obj1 = findResettersForClass(((Class) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        catch (Exception exception)
        {
            throw new UnableToResetException((new StringBuilder("Unable to reset views for ")).append(obj).toString(), exception);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ((Method) (obj1)).invoke(null, new Object[] {
            obj
        });
    }

    public static void setDebug(boolean flag)
    {
        debug = flag;
    }

}
