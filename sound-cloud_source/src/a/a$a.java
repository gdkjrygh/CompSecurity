// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package a:
//            a, c, d, e

public static abstract class ang.String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static Object a(View view)
    {
        return view;
    }

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(a/a$a, s);
    }

    public static ang.String[] values()
    {
        return ([])d.clone();
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
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }

    (String s, int i, byte byte0)
    {
        this(s, i);
    }
}
