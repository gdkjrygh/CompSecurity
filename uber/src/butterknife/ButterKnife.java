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
            Log.d("ButterKnife", (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName()).toString());
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
                Log.d("ButterKnife", (new StringBuilder("Looking up view injector for ")).append(((Class) (obj2)).getName()).toString());
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
            throw new RuntimeException((new StringBuilder("Unable to inject views for ")).append(obj).toString(), ((Throwable) (obj1)));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_54;
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
                Log.d("ButterKnife", (new StringBuilder("Looking up view injector for ")).append(((Class) (obj1)).getName()).toString());
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
            throw new RuntimeException((new StringBuilder("Unable to reset views for ")).append(obj).toString(), exception);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        ((Injector) (obj1)).reset(obj);
    }

    public static void setDebug(boolean flag)
    {
        debug = flag;
    }


    /* member class not found */
    class Action {}


    /* member class not found */
    class Setter {}


    /* member class not found */
    class Injector {}


    /* member class not found */
    class Finder {}


    /* member class not found */
    class _cls1 {}

}
