// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bfg
    implements android.view.View.OnClickListener
{

    private String a;
    private msp b;
    private msp c;
    private bfd d;

    bfg(bfd bfd1, String s, msp msp, msp msp1)
    {
        d = bfd1;
        a = s;
        b = msp;
        c = msp1;
        super();
    }

    public final void onClick(View view)
    {
        bfd.a(d, view, a, b, c);
    }
}
