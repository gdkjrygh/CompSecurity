// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package kik.android.widget:
//            ProgressWheel, da

static class <init> extends android.view.State
{

    public static final android.os.edState.k CREATOR = new da();
    float a;
    float b;
    boolean c;
    float d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;

    public void writeToParcel(Parcel parcel, int l)
    {
        boolean flag = true;
        super.cel(parcel, l);
        parcel.writeFloat(a);
        parcel.writeFloat(b);
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeByte((byte)l);
        parcel.writeFloat(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
        parcel.writeInt(h);
        parcel.writeInt(i);
        if (j)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeByte((byte)l);
        if (k)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = 0;
        }
        parcel.writeByte((byte)l);
    }


    private (Parcel parcel)
    {
        boolean flag1 = true;
        super(parcel);
        a = parcel.readFloat();
        b = parcel.readFloat();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readFloat();
        e = parcel.readInt();
        f = parcel.readInt();
        g = parcel.readInt();
        h = parcel.readInt();
        i = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k = flag;
    }

    k(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
