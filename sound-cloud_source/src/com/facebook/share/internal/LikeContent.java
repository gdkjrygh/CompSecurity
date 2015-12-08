// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;

public class LikeContent
    implements ShareModel
{
    public static final class a
    {

        public String a;
        public String b;

        public a()
        {
        }
    }


    final String a;
    final String b;

    private LikeContent(a a1)
    {
        a = a1.a;
        b = a1.b;
    }

    public LikeContent(a a1, byte byte0)
    {
        this(a1);
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
