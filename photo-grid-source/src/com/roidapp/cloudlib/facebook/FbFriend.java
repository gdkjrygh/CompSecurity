// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            n

public class FbFriend
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private String a;
    private String b;

    public FbFriend()
    {
    }

    static String a(FbFriend fbfriend, String s)
    {
        fbfriend.a = s;
        return s;
    }

    static String b(FbFriend fbfriend, String s)
    {
        fbfriend.b = s;
        return s;
    }

    public final FbFriend a()
    {
        FbFriend fbfriend = new FbFriend();
        fbfriend.a = a;
        fbfriend.b = b;
        return fbfriend;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
