// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class fdm
    implements android.content.DialogInterface.OnClickListener
{

    private fcm a;
    private fdk b;

    fdm(fdk fdk1, fcm fcm)
    {
        b = fdk1;
        a = fcm;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        fdk.c(b).a(a);
        mry.a(fdk.d(b), 4, (new msn()).a(fdk.s()).a(fdk.e(b)));
        dialoginterface.dismiss();
    }
}
