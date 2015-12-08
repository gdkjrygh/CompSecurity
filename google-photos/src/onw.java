// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;

public final class onw extends al
    implements android.content.DialogInterface.OnClickListener
{

    public onw()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setMessage(b.Io).setPositiveButton(0x104000a, this).setCancelable(true).create();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (O_() != null)
        {
            O_().finish();
        }
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            O_().startActivity(new Intent("android.settings.SETTINGS"));
            break;
        }
        dialoginterface = onv.b(O_());
        if (dialoginterface.exists())
        {
            dialoginterface.delete();
        }
        O_().finish();
    }
}
