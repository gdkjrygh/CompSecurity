// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private dfi a;
    private dfj b;

    public final void onClick(View view)
    {
        if (b.a != null)
        {
            b.a.onClick(a, -1);
        }
        a.dismiss();
    }

    (dfj dfj1, dfi dfi1)
    {
        b = dfj1;
        a = dfi1;
        super();
    }
}
