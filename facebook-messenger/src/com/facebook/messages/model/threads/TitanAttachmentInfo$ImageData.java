// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.messages.model.threads:
//            j

public class b
    implements Parcelable
{

    public static final android.os.AttachmentInfo.ImageData.b CREATOR = new j();
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

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
    }


    public (int i, int k)
    {
        a = i;
        b = k;
    }

    public b(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
    }
}
