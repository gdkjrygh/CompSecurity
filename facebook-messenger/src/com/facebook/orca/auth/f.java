// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import android.view.View;

// Referenced classes of package com.facebook.orca.auth:
//            UpgradeScreenOrcaFragment

class f
    implements android.view.View.OnClickListener
{

    final UpgradeScreenOrcaFragment a;

    f(UpgradeScreenOrcaFragment upgradescreenorcafragment)
    {
        a = upgradescreenorcafragment;
        super();
    }

    public void onClick(View view)
    {
        UpgradeScreenOrcaFragment.b(a);
    }
}
