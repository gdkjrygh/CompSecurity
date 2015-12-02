// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaPartialUserUpgradeActivity

class am
    implements android.content.DialogInterface.OnClickListener
{

    final OrcaPartialUserUpgradeActivity a;

    am(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        a = orcapartialuserupgradeactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            OrcaPartialUserUpgradeActivity.d(a).b(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.facebook.katana")), a);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            OrcaPartialUserUpgradeActivity.d(a).b(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.facebook.katana")), a);
        }
        dialoginterface.dismiss();
    }
}
