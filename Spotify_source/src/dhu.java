// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public class dhu extends dcn
{

    private final dhr k;
    private final View l;

    dhu(View view)
    {
        super(view);
        dgn.a(dhu, this);
        k = new dhr((ViewGroup)view.findViewById(0x7f1102f5));
        l = view.findViewById(0x7f11046f);
    }

    public static dhu b(View view)
    {
        if (view == null)
        {
            view = null;
        } else
        {
            dcn dcn1 = (dcn)view.getTag(0x7f110053);
            view = dcn1;
            if (dcn1 == null)
            {
                throw new IllegalStateException("This view doesn't have a GlueViewHolder associated with it.");
            }
        }
        return (dhu)view;
    }

    public final void a(View view)
    {
        k.a(view);
        k.a();
    }

    public final void e(boolean flag)
    {
        View view = l;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final View x()
    {
        return k.a;
    }
}
