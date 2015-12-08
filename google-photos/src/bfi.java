// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bfi
    implements android.content.DialogInterface.OnClickListener
{

    private bfh a;

    bfi(bfh bfh1)
    {
        a = bfh1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mry.a(bfh.a(a), 4);
        a.O_().setResult(0);
        a.O_().finish();
        a.O_().overridePendingTransition(0, 0);
    }
}
