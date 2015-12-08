// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class fdo
    implements android.content.DialogInterface.OnClickListener
{

    private fcm a;
    private fdn b;

    fdo(fdn fdn1, fcm fcm)
    {
        b = fdn1;
        a = fcm;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        fdn.a(b, pws.g);
        fdk.a(a).a(((am) (b)).B, "device_mgmt_dialog_confirm");
    }
}
