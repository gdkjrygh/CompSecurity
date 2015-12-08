// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ipw
    implements android.view.View.OnClickListener
{

    private ipu a;

    ipw(ipu ipu1)
    {
        a = ipu1;
        super();
    }

    public final void onClick(View view)
    {
        if (ipu.a(a))
        {
            return;
        } else
        {
            ipu.a(a, true);
            ipu.a(a, view, 2);
            ipu.c(a).startAnimation(ipu.b(a));
            return;
        }
    }
}
