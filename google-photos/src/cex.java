// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cex extends omn
{

    public cex()
    {
    }

    public static cex r()
    {
        return new cex();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.bN).setMessage(c.aq).setPositiveButton(c.aC, new cey(this)).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        dialoginterface = O_();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
