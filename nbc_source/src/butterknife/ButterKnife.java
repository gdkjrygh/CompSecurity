// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package butterknife:
//            ImmutableList

public final class ButterKnife
{
    public static interface Action
    {

        public abstract void apply(View view, int i);
    }

    public static abstract class Finder extends Enum
    {

        private static final Finder $VALUES[];
        public static final Finder ACTIVITY;
        public static final Finder DIALOG;
        public static final Finder VIEW;

        public static transient Object[] arrayOf(Object aobj[])
        {
            return filterNull(aobj);
        }

        private static Object[] filterNull(Object aobj[])
        {
            int j = 0;
            for (int i = 0; i < aobj.length;)
            {
                Object obj = aobj[i];
                int k = j;
                if (obj != null)
                {
                    aobj[j] = obj;
                    k = j + 1;
                }
                i++;
                j = k;
            }

            return Arrays.copyOfRange(aobj, 0, j);
        }

        public static transient List listOf(Object aobj[])
        {
            return new ImmutableList(filterNull(aobj));
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
                throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Nullable' annotation.").toString());
            } else
            {
                return obj1;
            }
        }

        protected abstract View findView(Object obj, int i);

        public abstract Context getContext(Object obj);

        static 
        {
            VIEW = new Finder("VIEW", 0) {

                protected View findView(Object obj, int i)
                {
                    return ((View)obj).findViewById(i);
                }

                public Context getContext(Object obj)
                {
                    return ((View)obj).getContext();
                }

            };
            ACTIVITY = new Finder("ACTIVITY", 1) {

                protected View findView(Object obj, int i)
                {
                    return ((Activity)obj).findViewById(i);
                }

                public Context getContext(Object obj)
                {
                    return (Activity)obj;
                }

            };
            DIALOG = new Finder("DIALOG", 2) {

                protected View findView(Object obj, int i)
                {
                    return ((Dialog)obj).findViewById(i);
                }

                public Context getContext(Object obj)
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

    public static interface Setter
    {

        public abstract void set(View view, Object obj, int i);
    }

    public static interface ViewBinder
    {

        public abstract void bind(Finder finder, Object obj, Object obj1);

        public abstract void unbind(Object obj);
    }


    static final Map BINDERS = new LinkedHashMap();
    static final ViewBinder NOP_VIEW_BINDER = new ViewBinder() {

        public void bind(Finder finder, Object obj, Object obj1)
        {
        }

        public void unbind(Object obj)
        {
        }

    };
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
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            action.apply((View)list.get(i), i);
        }

    }

    public static void apply(List list, Setter setter, Object obj)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            setter.set((View)list.get(i), obj, i);
        }

    }

    public static void bind(Activity activity)
    {
        bind(activity, activity, Finder.ACTIVITY);
    }

    public static void bind(Dialog dialog)
    {
        bind(dialog, dialog, Finder.DIALOG);
    }

    public static void bind(View view)
    {
        bind(view, view, Finder.VIEW);
    }

    public static void bind(Object obj, Activity activity)
    {
        bind(obj, activity, Finder.ACTIVITY);
    }

    public static void bind(Object obj, Dialog dialog)
    {
        bind(obj, dialog, Finder.DIALOG);
    }

    public static void bind(Object obj, View view)
    {
        bind(obj, view, Finder.VIEW);
    }

    static void bind(Object obj, Object obj1, Finder finder)
    {
        Class class1 = obj.getClass();
        ViewBinder viewbinder;
        try
        {
            if (debug)
            {
                Log.d("ButterKnife", (new StringBuilder()).append("Looking up view binder for ").append(class1.getName()).toString());
            }
            viewbinder = findViewBinderForClass(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder()).append("Unable to bind views for ").append(class1.getName()).toString(), ((Throwable) (obj)));
        }
        if (viewbinder == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        viewbinder.bind(finder, obj, obj1);
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

    private static ViewBinder findViewBinderForClass(Class class1)
        throws IllegalAccessException, InstantiationException
    {
        Object obj;
        obj = (ViewBinder)BINDERS.get(class1);
        if (obj != null)
        {
            if (debug)
            {
                Log.d("ButterKnife", "HIT: Cached in view binder map.");
            }
            return ((ViewBinder) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            if (debug)
            {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            }
            return NOP_VIEW_BINDER;
        }
        ViewBinder viewbinder = (ViewBinder)Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewBinder").toString()).newInstance();
        obj = viewbinder;
        if (!debug)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Log.d("ButterKnife", "HIT: Loaded view binder class.");
        obj = viewbinder;
_L2:
        BINDERS.put(class1, obj);
        return ((ViewBinder) (obj));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (debug)
        {
            Log.d("ButterKnife", (new StringBuilder()).append("Not found. Trying superclass ").append(class1.getSuperclass().getName()).toString());
        }
        classnotfoundexception = findViewBinderForClass(class1.getSuperclass());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void setDebug(boolean flag)
    {
        debug = flag;
    }

    public static void unbind(Object obj)
    {
        Class class1 = obj.getClass();
        ViewBinder viewbinder;
        try
        {
            if (debug)
            {
                Log.d("ButterKnife", (new StringBuilder()).append("Looking up view binder for ").append(class1.getName()).toString());
            }
            viewbinder = findViewBinderForClass(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder()).append("Unable to unbind views for ").append(class1.getName()).toString(), ((Throwable) (obj)));
        }
        if (viewbinder == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        viewbinder.unbind(obj);
    }

}
