// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class AppInviteContent
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


    public final String a;
    public final String b;

    private AppInviteContent(a a1)
    {
        a = a1.a;
        b = a1.b;
    }

    public AppInviteContent(a a1, byte byte0)
    {
        this(a1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }
}
