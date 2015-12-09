// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.google.android.gms.internal:
//            ra, rn, ro

final class auM extends ra
{

    final rn aCC;
    private final com.google.android.gms.common.api.mplementation.b auM;

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
    {
        int j = 0;
        if (ro.qQ())
        {
            ro.t("PeopleClient", (new StringBuilder("Avatar callback: status=")).append(i).append(" resolution=").append(bundle).append(" pfd=").append(parcelfiledescriptor).toString());
        }
        bundle = rn.b(i, null, bundle);
        boolean flag;
        if (bundle1 != null)
        {
            flag = bundle1.getBoolean("rewindable");
            i = bundle1.getInt("width");
            j = bundle1.getInt("height");
        } else
        {
            i = 0;
            flag = false;
        }
        aCC.b(new (aCC, auM, bundle, parcelfiledescriptor, flag, i, j));
    }

    public ementation.b(rn rn1, com.google.android.gms.common.api.mplementation.b b)
    {
        aCC = rn1;
        super();
        auM = b;
    }
}
