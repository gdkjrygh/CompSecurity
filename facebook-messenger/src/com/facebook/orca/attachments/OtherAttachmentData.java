// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.attachments:
//            h

public class OtherAttachmentData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final String a;
    private final int b;
    private final String c;
    private final Uri d;

    private OtherAttachmentData(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readString();
        d = (Uri)parcel.readParcelable(null);
    }

    OtherAttachmentData(Parcel parcel, h h1)
    {
        this(parcel);
    }

    OtherAttachmentData(String s, int i, String s1, Uri uri)
    {
        a = s;
        b = i;
        c = s1;
        d = uri;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public Uri c()
    {
        return d;
    }

    public String d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeParcelable(d, i);
    }

}
