// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class cdf
    implements android.content.DialogInterface.OnClickListener
{

    private ccy a;

    cdf(ccy ccy1)
    {
        a = ccy1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ccy.c(a);
    }
}
