// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ad, ac, ab, AppMetadata, 
//            k, UserAttributeParcel, EventParcel, EventParams

final class a
    implements Runnable
{

    final AppMetadata a;
    final ad b;

    public final void run()
    {
        ac ac1 = ad.a(b);
        AppMetadata appmetadata = a;
        ac1.f().e();
        ac1.a();
        u.a(appmetadata);
        u.a(appmetadata.b);
        if (!TextUtils.isEmpty(appmetadata.c))
        {
            ac1.a(appmetadata);
            if (ac1.h().a(appmetadata.b, "_f") == null)
            {
                long l = ac1.d.a();
                ac1.a(new UserAttributeParcel("_fot", l, Long.valueOf(0x36ee80L * (l / 0x36ee80L + 1L)), "auto"), appmetadata);
                Bundle bundle = new Bundle();
                bundle.putLong("_c", 1L);
                ac1.a(new EventParcel("_f", new EventParams(bundle), "auto", l), appmetadata);
                ac1.l();
            }
        }
    }

    tadata(ad ad1, AppMetadata appmetadata)
    {
        b = ad1;
        a = appmetadata;
        super();
    }
}
