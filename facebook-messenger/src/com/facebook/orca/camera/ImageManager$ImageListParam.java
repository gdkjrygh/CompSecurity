// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.camera:
//            r, p, o

public class <init>
    implements Parcelable
{

    public static final android.os.mageListParam.f CREATOR = new r();
    public p a;
    public int b;
    public int c;
    public String d;
    public Uri e;
    public boolean f;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,single=%s}", new Object[] {
            a, Integer.valueOf(b), Integer.valueOf(c), d, Boolean.valueOf(f), e
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.ordinal());
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, i);
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    public ()
    {
    }

    private (Parcel parcel)
    {
        a = p.values()[parcel.readInt()];
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = (Uri)parcel.readParcelable(null);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    f(Parcel parcel, o o)
    {
        this(parcel);
    }
}
