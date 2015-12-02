// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadlist:
//            VersionUpgradePromoView

class bp
    implements android.view.View.OnClickListener
{

    final VersionUpgradePromoView a;

    bp(VersionUpgradePromoView versionupgradepromoview)
    {
        a = versionupgradepromoview;
        super();
    }

    public void onClick(View view)
    {
        VersionUpgradePromoView.a(a);
    }
}
