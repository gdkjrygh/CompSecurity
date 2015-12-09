// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

// Referenced classes of package com.pandora.android.daydream:
//            LightshowRenderer

public static class .CREATOR
    implements Parcelable
{

    public static final android.os.howRenderer.State.d CREATOR = new android.os.Parcelable.Creator() {

        public LightshowRenderer.State a(Parcel parcel)
        {
            return new LightshowRenderer.State(parcel);
        }

        public LightshowRenderer.State[] a(int i)
        {
            return new LightshowRenderer.State[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public float a;
    public float b;
    public ArrayList c;
    private Bitmap d;

    static Bitmap a(.CREATOR creator)
    {
        return creator.d;
    }

    static Bitmap a(d d1, Bitmap bitmap)
    {
        d1.d = bitmap;
        return bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeFloat(b);
        parcel.writeTypedList(c);
        parcel.writeParcelable(d, 0);
    }


    public _cls1()
    {
    }

    public _cls1(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readFloat();
        c = new ArrayList();
        parcel.readTypedList(c, .CREATOR);
    }
}
