// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.Locale;

public abstract class mmi extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private int ad;

    public mmi()
    {
        ad = 0;
    }

    public final Dialog c(Bundle bundle)
    {
        if (bundle != null)
        {
            ad = bundle.getInt("selected_index");
        }
        bundle = new android.app.AlertDialog.Builder(af);
        bundle.setTitle(b.DN);
        bundle.setPositiveButton(0x104000a, this);
        bundle.setNegativeButton(0x1040000, this);
        bundle.setCancelable(true);
        SparseIntArray sparseintarray = r();
        String as[] = new String[sparseintarray.size()];
        for (int i = sparseintarray.size() - 1; i >= 0; i--)
        {
            as[i] = af.getString(sparseintarray.valueAt(i));
        }

        bundle.setSingleChoiceItems(as, ad, this);
        return bundle.create();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("selected_index", ad);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -2 -1: default 24
    //                   -2 205
    //                   -1 34;
           goto _L1 _L2 _L3
_L1:
        if (i >= 0)
        {
            ad = i;
        }
_L5:
        return;
_L3:
        i = r().keyAt(ad);
        if (i == 4)
        {
            Object obj = Locale.getDefault();
            dialoginterface = String.valueOf(((Locale) (obj)).getLanguage());
            obj = String.valueOf(((Locale) (obj)).getCountry().toLowerCase());
            dialoginterface = (new StringBuilder(String.valueOf(dialoginterface).length() + 1 + String.valueOf(obj).length())).append(dialoginterface).append("-").append(((String) (obj))).toString();
            if ("https://support.google.com/legal/troubleshooter/1114905".contains("%locale%"))
            {
                dialoginterface = "https://support.google.com/legal/troubleshooter/1114905".replace("%locale%", dialoginterface);
            } else
            {
                android.net.Uri.Builder builder = Uri.parse("https://support.google.com/legal/troubleshooter/1114905").buildUpon();
                builder.appendQueryParameter("hl", dialoginterface);
                dialoginterface = builder.build().toString();
            }
            a(new Intent("android.intent.action.VIEW", Uri.parse(dialoginterface)));
            return;
        }
        dialoginterface = (mmj)olm.b(af, mmj);
        if (dialoginterface == null) goto _L5; else goto _L4
_L4:
        dialoginterface.c(i);
        return;
_L2:
        dialoginterface.dismiss();
        return;
    }

    public abstract SparseIntArray r();
}
