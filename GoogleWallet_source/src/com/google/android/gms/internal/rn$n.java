// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ra, rn, ro

final class auM extends ra
{

    final rn aCC;
    private final com.google.android.gms.common.api.mplementation.b auM;

    public final void a(int i, Bundle bundle, Bundle bundle1)
    {
        Object obj = null;
        if (ro.qQ())
        {
            ro.t("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
        }
        com.google.android.gms.common.api.Status status = rn.b(i, null, bundle);
        if (bundle1 == null)
        {
            bundle = obj;
        } else
        {
            bundle = bundle1.getString("avatarurl");
        }
        aCC.b(new <init>(aCC, auM, status, bundle));
    }

    public ementation.b(rn rn1, com.google.android.gms.common.api.mplementation.b b)
    {
        aCC = rn1;
        super();
        auM = b;
    }
}
