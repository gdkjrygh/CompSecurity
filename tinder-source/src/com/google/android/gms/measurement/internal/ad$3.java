// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//            ad, ac, UserAttributeParcel, AppMetadata

final class b
    implements Runnable
{

    final UserAttributeParcel a;
    final AppMetadata b;
    final ad c;

    public final void run()
    {
        ad.a(c).a(a, b);
    }

    tadata(ad ad1, UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
    {
        c = ad1;
        a = userattributeparcel;
        b = appmetadata;
        super();
    }
}
