// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class byn
    implements android.view.View.OnClickListener
{

    private ccy a;

    byn(ccy ccy1)
    {
        a = ccy1;
        super();
    }

    public final void onClick(View view)
    {
        view.setEnabled(false);
        ccy.f(a);
    }
}
