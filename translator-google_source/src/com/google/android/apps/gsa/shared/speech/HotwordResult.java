// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.gsa.shared.speech:
//            a

public class HotwordResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final boolean a;
    private final boolean b;
    private final float c;
    private final boolean d;
    private final boolean e;
    private final float f;
    private final int g;
    private final float h;
    private final String i;
    private final float j;
    private final int k;
    private final byte l[];

    HotwordResult(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        g = parcel.readInt();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        c = parcel.readFloat();
        f = parcel.readFloat();
        l = parcel.createByteArray();
        k = parcel.readInt();
        j = parcel.readFloat();
        h = parcel.readFloat();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
        i = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        String s = String.valueOf("[Hotword detected., SpeakerTriggered=");
        boolean flag = e;
        float f1 = c;
        float f2 = f;
        int i1 = k;
        boolean flag1 = a;
        boolean flag2 = d;
        boolean flag3 = b;
        int j1 = g;
        String s1 = i;
        return (new StringBuilder(String.valueOf(s).length() + 222 + String.valueOf(s1).length())).append(s).append(flag).append(", SoftwareHotwordScore=").append(f1).append(", SpeakerScore=").append(f2).append(", SampleRate=").append(i1).append(", DspHotwordTriggered=").append(flag1).append(", MagicMicTriggered=").append(flag2).append(", SoftwareHotwordTriggered=").append(flag3).append(", SpeakerMode=").append(j1).append(", HotwordModel=").append(s1).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeInt(g);
        if (e)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeFloat(c);
        parcel.writeFloat(f);
        parcel.writeByteArray(l);
        parcel.writeInt(k);
        parcel.writeFloat(h);
        parcel.writeFloat(j);
        if (a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (d)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeString(i);
    }

}
