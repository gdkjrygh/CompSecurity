// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class dcq
{

    public static dcp a(View view)
    {
        if (view == null)
        {
            view = null;
        } else
        {
            dcp dcp1 = (dcp)view.getTag(0x7f110053);
            view = dcp1;
            if (dcp1 == null)
            {
                throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
            }
        }
        return view;
    }

    public static void a(dcp dcp1)
    {
        dcp1.a().setTag(0x7f110053, dcp1);
    }
}
