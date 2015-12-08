// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ButterKnife
{

    static final Map INJECTORS = new LinkedHashMap();
    static final Injector NOP_INJECTOR = new _cls1();
    private static final String TAG = "ButterKnife";
    private static boolean debug = false;

    private ButterKnife()
    {
        throw new AssertionError("No instances.");
    }

    public static void apply(List list, Property property, Object obj)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            property.set(list.get(i), obj);
        }

    }

    public static void apply(List list, Action action)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            action.apply((View)list.get(i), i);
        }

    }

    public static void apply(List list, Setter setter, Object obj)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            setter.set((View)list.get(i), obj, i);
        }

    }

    public static View findById(Activity activity, int i)
    {
        return activity.findViewById(i);
    }

    public static View findById(Dialog dialog, int i)
    {
        return dialog.findViewById(i);
    }

    public static View findById(View view, int i)
    {
        return view.findViewById(i);
    }

    private static Injector findInjectorForClass(Class class1)
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

    public static void inject(Dialog dialog)
    {
        inject(dialog, dialog, Finder.DIALOG);
    }

    public static void inject(View view)
    {
        inject(view, view, Finder.VIEW);
    }

    public static void inject(Object obj, Activity activity)
    {
        inject(obj, activity, Finder.ACTIVITY);
    }

    public static void inject(Object obj, Dialog dialog)
    {
        inject(obj, dialog, Finder.DIALOG);
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

    public static void reset(Object obj)
    {
        Object obj1 = obj.getClass();
        try
        {
            if (debug)
            {
                Log.d("ButterKnife", (new StringBuilder()).append("Looking up view injector for ").append(((Class) (obj1)).getName()).toString());
            }
            obj1 = findInjectorForClass(((Class) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder()).append("Unable to reset views for ").append(obj).toString(), exception);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ((Injector) (obj1)).reset(obj);
    }

    public static void setDebug(boolean flag)
    {
        debug = flag;
    }


    private class Action
    {

        public abstract void apply(View view, int i);
    }


    private class Setter
    {

        public abstract void set(View view, Object obj, int i);
    }


    private class Injector
    {

        public abstract void inject(Finder finder, Object obj, Object obj1);

        public abstract void reset(Object obj);
    }


    private class Finder extends Enum
    {

        private static final Finder $VALUES[];
        public static final Finder ACTIVITY;
        public static final Finder DIALOG;
        public static final Finder VIEW;

        public static transient Object[] arrayOf(Object aobj[])
        {
            return aobj;
        }

        public static transient List listOf(Object aobj[])
        {
            return new ImmutableList(aobj);
        }

        public static Finder valueOf(String s)
        {
            return (Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
        }

        public static Finder[] values()
        {
            return (Finder[])$VALUES.clone();
        }

        public Object castParam(Object obj, String s, int i, String s1, int j)
        {
            return obj;
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
            class _cls1 extends Finder
            {

                protected View findView(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return ((View)obj).getContext();
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            VIEW = new _cls1("VIEW", 0);
            class _cls2 extends Finder
            {

                protected View findView(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return (Activity)obj;
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ACTIVITY = new _cls2("ACTIVITY", 1);
            class _cls3 extends Finder
            {

                protected View findView(Object obj, int i)
                {
                    return ((Dialog)obj).findViewById(i);
                }

                protected Context getContext(Object obj)
                {
                    return ((Dialog)obj).getContext();
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            DIALOG = new _cls3("DIALOG", 2);
            $VALUES = (new Finder[] {
                VIEW, ACTIVITY, DIALOG
            });
        }

        private Finder(String s, int i)
        {
            super(s, i);
        }

        Finder(String s, int i, _cls1 _pcls1)
        {
            this(s, i);
        }
    }


    private class _cls1
        implements Injector
    {

        public void inject(Finder finder, Object obj, Object obj1)
        {
        }

        public void reset(Object obj)
        {
        }

        _cls1()
        {
        }
    }

}
