// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.threads:
//            i, k

public class TitanAttachmentInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final int e;
    private final ImageData f;

    private TitanAttachmentInfo(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readInt();
        f = (ImageData)parcel.readParcelable(com/facebook/messages/model/threads/TitanAttachmentInfo$ImageData.getClassLoader());
    }

    TitanAttachmentInfo(Parcel parcel, i j)
    {
        this(parcel);
    }

    TitanAttachmentInfo(k k1)
    {
        a = k1.a();
        b = k1.b();
        c = k1.c();
        d = k1.d();
        e = k1.e();
        f = k1.f();
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public ImageData f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeParcelable(f, j);
    }


    private class ImageData
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        private int a;
        private int b;

        public int a()
        {
            return a;
        }

        public int b()
        {
            return b;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
        }


        public ImageData(int l, int i1)
        {
            a = l;
            b = i1;
        }

        public ImageData(Parcel parcel)
        {
            a = parcel.readInt();
            b = parcel.readInt();
        }
    }

}
