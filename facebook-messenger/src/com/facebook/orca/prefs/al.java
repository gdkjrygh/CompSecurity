// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaPartialUserUpgradeActivity

class al
    implements android.content.DialogInterface.OnClickListener
{

    final OrcaPartialUserUpgradeActivity a;

    al(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        a = orcapartialuserupgradeactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        OrcaPartialUserUpgradeActivity.c(a);
    }
}
