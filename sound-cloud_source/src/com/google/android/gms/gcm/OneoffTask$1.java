// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

final class 
    implements android.os.eator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return zzeh(parcel);
    }

    public final Object[] newArray(int i)
    {
        return zzgt(i);
    }

    public final OneoffTask zzeh(Parcel parcel)
    {
        return new OneoffTask(parcel, null);
    }

    public final OneoffTask[] zzgt(int i)
    {
        return new OneoffTask[i];
    }

    ()
    {
    }
}
