// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ad, ac, ab, AppMetadata, 
//            w, UserAttributeParcel, k

final class b
    implements Runnable
{

    final UserAttributeParcel a;
    final AppMetadata b;
    final ad c;

    public final void run()
    {
        ac ac1;
        UserAttributeParcel userattributeparcel;
        AppMetadata appmetadata;
        ac1 = ad.a(c);
        userattributeparcel = a;
        appmetadata = b;
        ac1.f().e();
        ac1.a();
        if (TextUtils.isEmpty(appmetadata.c))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ac1.e().f.("Removing user attribute", userattributeparcel.b);
        ac1.h().b();
        ac1.a(appmetadata);
        ac1.h().b(appmetadata.b, userattributeparcel.b);
        ac1.h().o();
        ac1.e().f.("User attribute removed", userattributeparcel.b);
        ac1.h().p();
        return;
        Exception exception;
        exception;
        ac1.h().p();
        throw exception;
    }

    tadata(ad ad1, UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
    {
        c = ad1;
        a = userattributeparcel;
        b = appmetadata;
        super();
    }
}
