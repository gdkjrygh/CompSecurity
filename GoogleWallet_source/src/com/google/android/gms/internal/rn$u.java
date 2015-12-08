// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            ra, rn, ro

final class auM extends ra
{

    final rn aCC;
    private final com.google.android.gms.common.api.mplementation.b auM;

    public final void a(int i, Bundle bundle, DataHolder dataholder)
    {
        Object obj = null;
        if (ro.qQ())
        {
            ro.t("PeopleClient", (new StringBuilder("Owner callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
        }
        com.google.android.gms.common.api.Status status = rn.b(i, null, bundle);
        if (dataholder == null)
        {
            bundle = obj;
        } else
        {
            bundle = new OwnerBuffer(dataholder);
        }
        aCC.b(new (aCC, auM, status, bundle));
    }

    public ementation.b(rn rn1, com.google.android.gms.common.api.mplementation.b b)
    {
        aCC = rn1;
        super();
        auM = b;
    }
}
