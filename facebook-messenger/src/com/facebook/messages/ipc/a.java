// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.os.Parcel;
import com.facebook.ipc.annotation.b;

// Referenced classes of package com.facebook.messages.ipc:
//            FrozenGroupMessageInfo

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public FrozenGroupMessageInfo a(Parcel parcel)
    {
        return (FrozenGroupMessageInfo)b.a(parcel, com/facebook/messages/ipc/FrozenGroupMessageInfo);
    }

    public FrozenGroupMessageInfo[] a(int i)
    {
        return new FrozenGroupMessageInfo[i];
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
