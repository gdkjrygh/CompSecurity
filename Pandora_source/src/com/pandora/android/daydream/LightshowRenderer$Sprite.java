// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.pandora.android.daydream:
//            LightshowRenderer

private static class l
    implements Parcelable
{

    public static final android.os.owRenderer.Sprite.l CREATOR = new android.os.Parcelable.Creator() {

        public LightshowRenderer.Sprite a(Parcel parcel)
        {
            return new LightshowRenderer.Sprite(parcel);
        }

        public LightshowRenderer.Sprite[] a(int i1)
        {
            return new LightshowRenderer.Sprite[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public double f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeFloat(a);
        parcel.writeFloat(b);
        parcel.writeFloat(e);
        parcel.writeDouble(f);
        parcel.writeFloat(g);
        parcel.writeFloat(h);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeInt(l);
    }


    public _cls1()
    {
    }

    public _cls1(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readFloat();
        e = parcel.readFloat();
        f = parcel.readDouble();
        g = parcel.readFloat();
        h = parcel.readFloat();
        i = parcel.readInt();
        j = parcel.readInt();
        k = parcel.readInt();
        l = parcel.readInt();
    }
}
