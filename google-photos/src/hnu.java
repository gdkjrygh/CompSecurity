// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

public final class hnu
    implements android.content.DialogInterface.OnClickListener
{

    private hnv a;
    private Activity b;

    public hnu(hnv hnv1, Activity activity)
    {
        a = hnv1;
        b = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
        Activity activity = b;
        Object obj = b;
        dialoginterface = String.valueOf("market://details?id=");
        obj = String.valueOf(((Context) (obj)).getApplicationContext().getPackageName());
        if (((String) (obj)).length() != 0)
        {
            dialoginterface = dialoginterface.concat(((String) (obj)));
        } else
        {
            dialoginterface = new String(dialoginterface);
        }
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(dialoginterface));
        dialoginterface.addFlags(0x10000000);
        activity.startActivity(dialoginterface);
    }
}
