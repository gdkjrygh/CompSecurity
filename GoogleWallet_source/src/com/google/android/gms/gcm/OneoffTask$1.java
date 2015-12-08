// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

static final class 
    implements android.os.eator
{

    private static OneoffTask eX(Parcel parcel)
    {
        return new OneoffTask(parcel, null);
    }

    private static OneoffTask[] hf(int i)
    {
        return new OneoffTask[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return eX(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hf(i);
    }

    ()
    {
    }
}
