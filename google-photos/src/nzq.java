// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class nzq
    implements android.content.DialogInterface.OnClickListener
{

    private nzp a;

    nzq(nzp nzp1)
    {
        a = nzp1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        nzp.a(a, i);
        a.onClick(dialoginterface, -1);
        dialoginterface.dismiss();
    }
}
