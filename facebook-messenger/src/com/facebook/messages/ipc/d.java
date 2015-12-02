// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.os.Parcel;
import com.facebook.ipc.annotation.b;

// Referenced classes of package com.facebook.messages.ipc:
//            FrozenParticipant

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public FrozenParticipant a(Parcel parcel)
    {
        return (FrozenParticipant)b.a(parcel, com/facebook/messages/ipc/FrozenParticipant);
    }

    public FrozenParticipant[] a(int i)
    {
        return new FrozenParticipant[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
