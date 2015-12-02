// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.ipc:
//            FrozenNewMessageNotification

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public FrozenNewMessageNotification a(Parcel parcel)
    {
        return (FrozenNewMessageNotification)com.facebook.ipc.annotation.b.a(parcel, com/facebook/messages/ipc/FrozenNewMessageNotification);
    }

    public FrozenNewMessageNotification[] a(int i)
    {
        return new FrozenNewMessageNotification[i];
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
