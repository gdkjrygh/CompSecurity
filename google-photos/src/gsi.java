// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class gsi
    implements android.view.View.OnClickListener
{

    private ekq a;
    private gsh b;

    gsi(gsh gsh1, ekq ekq)
    {
        b = gsh1;
        a = ekq;
        super();
    }

    public final void onClick(View view)
    {
        gsh.a(b).a(pws.m);
        view = new gsm(a);
        gsh.b(b).b(view);
    }
}
