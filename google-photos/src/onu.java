// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public final class onu extends al
    implements android.content.DialogInterface.OnClickListener
{

    public onu()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        Object obj;
        ar ar1;
        obj = null;
        ar1 = O_();
        PackageManager packagemanager;
        android.content.pm.ApplicationInfo applicationinfo;
        packagemanager = ar1.getPackageManager();
        applicationinfo = packagemanager.getApplicationInfo(ar1.getPackageName(), 0);
        bundle = ((Bundle) (obj));
        if (applicationinfo != null)
        {
            try
            {
                bundle = packagemanager.getApplicationLabel(applicationinfo);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle = ((Bundle) (obj));
            }
        }
        obj = bundle;
        if (bundle == null)
        {
            obj = ar1.getString(b.Il);
        }
        bundle = new android.app.AlertDialog.Builder(ar1);
        bundle.setTitle(ar1.getString(b.In, new Object[] {
            obj
        }));
        bundle.setMessage(ar1.getString(b.Im, new Object[] {
            obj
        }));
        bundle.setPositiveButton(0x104000a, this);
        bundle.setCancelable(true);
        return bundle.create();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = O_();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ar ar1;
        switch (i)
        {
        default:
            return;

        case -1: 
            ar1 = O_();
            break;
        }
        onr.b(ar1);
        dialoginterface = String.valueOf(ar1.getPackageName());
        if (dialoginterface.length() != 0)
        {
            dialoginterface = "market://details?id=".concat(dialoginterface);
        } else
        {
            dialoginterface = new String("market://details?id=");
        }
        ar1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dialoginterface)));
        ar1.finish();
    }
}
