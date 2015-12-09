// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dds
{

    public static ddd a(View view)
    {
        return (ddd)dcq.a(view);
    }

    public static ddf a(Context context, ViewGroup viewgroup, int i)
    {
        context = new ddg(b(context, viewgroup, 0x7f01021a));
        context.a(i);
        dcq.a(context);
        return context;
    }

    public static ddi a(Context context, ViewGroup viewgroup)
    {
        context = new ddj(b(context, viewgroup, 0x7f01020f));
        dcq.a(context);
        return context;
    }

    public static ddl a(Context context, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f010217;
        } else
        {
            i = 0x7f010210;
        }
        context = new ddo(b(context, viewgroup, i));
        dcq.a(context);
        return context;
    }

    private static View b(Context context, ViewGroup viewgroup, int i)
    {
        TypedValue typedvalue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedvalue, true))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid attribute: ")).append(i).toString());
        } else
        {
            i = typedvalue.resourceId;
            viewgroup = (ViewGroup)LayoutInflater.from(context).inflate(0x7f030101, viewgroup, false);
            viewgroup.addView(LayoutInflater.from(context).inflate(i, viewgroup, false), 0);
            return viewgroup;
        }
    }

    public static ddh b(Context context, ViewGroup viewgroup)
    {
        context = new ddk(b(context, viewgroup, 0x7f010214));
        dcq.a(context);
        return context;
    }

    public static ddm b(Context context, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f010218;
        } else
        {
            i = 0x7f010211;
        }
        context = new ddn(b(context, viewgroup, i));
        dcq.a(context);
        return context;
    }

    public static ddl c(Context context, ViewGroup viewgroup)
    {
        context = a(context, viewgroup, false);
        dcq.a(context);
        return context;
    }

    public static ddp c(Context context, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f010219;
        } else
        {
            i = 0x7f010213;
        }
        context = new ddq(b(context, viewgroup, i));
        dcq.a(context);
        return context;
    }

    public static ddm d(Context context, ViewGroup viewgroup)
    {
        context = b(context, viewgroup, false);
        dcq.a(context);
        return context;
    }

    public static ddp e(Context context, ViewGroup viewgroup)
    {
        context = c(context, viewgroup, false);
        dcq.a(context);
        return context;
    }
}
