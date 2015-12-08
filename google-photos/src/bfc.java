// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bfc
    implements android.content.DialogInterface.OnClickListener
{

    private bfb a;

    bfc(bfb bfb1)
    {
        a = bfb1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.O_().setResult(0);
        a.O_().finish();
        a.O_().overridePendingTransition(0, 0);
    }
}
