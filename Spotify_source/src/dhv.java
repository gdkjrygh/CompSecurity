// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class dhv
{

    public static dhu a(Context context, ViewGroup viewgroup)
    {
        context = a(context, viewgroup, 0x7f01020e);
        context.j = new dhz(((dcn) (context)).a);
        return context;
    }

    private static dhu a(Context context, ViewGroup viewgroup, int i)
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
            return new dhu(viewgroup);
        }
    }

    public static dhu a(Context context, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f010217;
        } else
        {
            i = 0x7f010210;
        }
        viewgroup = a(context, viewgroup, i);
        viewgroup.j = new did(context, ((dcn) (viewgroup)).a);
        return viewgroup;
    }

    public static dhu b(Context context, ViewGroup viewgroup)
    {
        context = a(context, viewgroup, 0x7f010214);
        context.j = new dhz(((dcn) (context)).a);
        return context;
    }

    public static dhu c(Context context, ViewGroup viewgroup)
    {
        context = a(context, viewgroup, 0x7f010215);
        context.j = new dhy(((dcn) (context)).a);
        return context;
    }

    public static dhu d(Context context, ViewGroup viewgroup)
    {
        return a(context, viewgroup, false);
    }

    public static dhu e(Context context, ViewGroup viewgroup)
    {
        viewgroup = a(context, viewgroup, 0x7f010211);
        viewgroup.j = new dic(context, ((dcn) (viewgroup)).a);
        return viewgroup;
    }

    public static dhu f(Context context, ViewGroup viewgroup)
    {
        viewgroup = a(context, viewgroup, 0x7f010216);
        viewgroup.j = new dic(context, ((dcn) (viewgroup)).a);
        return viewgroup;
    }

    public static dhu g(Context context, ViewGroup viewgroup)
    {
        viewgroup = a(context, viewgroup, 0x7f010212);
        viewgroup.j = new dif(context, ((dcn) (viewgroup)).a);
        return viewgroup;
    }
}
