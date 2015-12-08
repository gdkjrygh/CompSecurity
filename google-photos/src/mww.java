// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;

public final class mww extends al
    implements android.content.DialogInterface.OnClickListener
{

    public mww()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage("Set tracing token?");
        bundle.setPositiveButton(0x104000a, this);
        bundle.setNegativeButton(0x1040000, this);
        bundle.setCancelable(false);
        return bundle.create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            Object obj = O_().getIntent().getData().getQueryParameter("token");
            dialoginterface = ((DialogInterface) (obj));
            if (obj == null)
            {
                dialoginterface = "";
            }
            obj = PreferenceManager.getDefaultSharedPreferences(O_()).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("tracing_token_key", dialoginterface);
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("debug.plus.frontend.tracing", true);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        O_().finish();
    }
}
