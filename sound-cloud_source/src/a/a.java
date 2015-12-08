// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package a:
//            b, c, d, e

public final class a.a
{
    public static abstract class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static Object a(View view)
        {
            return view;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(a/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        protected abstract View a(Object obj, int i);

        public final Object a(Object obj)
        {
            return a(obj, 0x7f0f0221);
        }

        public final Object a(Object obj, int i, String s)
        {
            View view = a(obj, i);
            if (view == null)
            {
                obj = b(obj).getResources().getResourceEntryName(i);
                throw new IllegalStateException((new StringBuilder("Required view '")).append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Nullable' annotation.").toString());
            } else
            {
                return view;
            }
        }

        public abstract Context b(Object obj);

        static 
        {
            a = new c("VIEW");
            b = new d("ACTIVITY");
            c = new e("DIALOG");
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    public static interface b
    {

        public abstract void bind(a a1, Object obj, Object obj1);

        public abstract void unbind(Object obj);
    }


    static final Map a = new LinkedHashMap();
    static final b b = new a.b();
    private static boolean c = false;

    private static b a(Class class1)
        throws IllegalAccessException, InstantiationException
    {
        Object obj = (b)a.get(class1);
        if (obj != null)
        {
            return ((b) (obj));
        }
        obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            return b;
        }
        try
        {
            obj = (b)Class.forName((new StringBuilder()).append(((String) (obj))).append("$$ViewBinder").toString()).newInstance();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            if (c)
            {
                (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName());
            }
            classnotfoundexception = a(class1.getSuperclass());
        }
        a.put(class1, obj);
        return ((b) (obj));
    }

    public static View a(Activity activity, int i)
    {
        return activity.findViewById(i);
    }

    public static View a(View view, int i)
    {
        return view.findViewById(i);
    }

    public static void a(View view)
    {
        a(view, view, a.a);
    }

    public static void a(Object obj)
    {
        Class class1 = obj.getClass();
        b b1;
        try
        {
            if (c)
            {
                (new StringBuilder("Looking up view binder for ")).append(class1.getName());
            }
            b1 = a(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Unable to unbind views for ")).append(class1.getName()).toString(), ((Throwable) (obj)));
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        b1.unbind(obj);
    }

    public static void a(Object obj, Activity activity)
    {
        a(obj, activity, a.b);
    }

    public static void a(Object obj, View view)
    {
        a(obj, view, a.a);
    }

    private static void a(Object obj, Object obj1, a a1)
    {
        Class class1 = obj.getClass();
        b b1;
        try
        {
            if (c)
            {
                (new StringBuilder("Looking up view binder for ")).append(class1.getName());
            }
            b1 = a(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Unable to bind views for ")).append(class1.getName()).toString(), ((Throwable) (obj)));
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        b1.bind(a1, obj, obj1);
    }

}
