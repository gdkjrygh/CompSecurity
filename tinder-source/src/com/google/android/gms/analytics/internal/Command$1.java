// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            Command

static final class _cls9
    implements android.os..Creator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new Command(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new Command[i];
    }

    _cls9()
    {
    }
}
