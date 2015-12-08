// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ehu
    implements android.view.View.OnClickListener
{

    private ehw a;
    private hkf b;
    private eht c;

    ehu(eht eht1, ehw ehw1, hkf hkf)
    {
        c = eht1;
        a = ehw1;
        b = hkf;
        super();
    }

    public final void onClick(View view)
    {
        a.a(eht.a(c), b);
    }
}
