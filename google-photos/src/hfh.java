// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

final class hfh
    implements android.content.DialogInterface.OnClickListener
{

    private hfg a;

    hfh(hfg hfg1)
    {
        a = hfg1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            android.content.Intent intent = hfg.a(a).a(2);
            dialoginterface.dismiss();
            hfg.b(a).startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.e("PlayServicesMixin", "Redirect to Google Play Store failed, unable to update Play Services");
        }
    }
}
