// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.os.Parcel;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbFriend

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FbFriend fbfriend = new FbFriend();
        FbFriend.a(fbfriend, parcel.readString());
        FbFriend.b(fbfriend, parcel.readString());
        return fbfriend;
    }

    public final volatile Object[] newArray(int i)
    {
        return new FbFriend[i];
    }
}
