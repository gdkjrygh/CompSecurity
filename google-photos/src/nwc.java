// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class nwc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new nwd();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    nwc(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
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
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    nwc(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, 
            boolean flag7)
    {
        a = flag;
        b = flag1;
        c = flag2;
        d = flag3;
        e = flag4;
        f = flag5;
        g = flag6;
        h = flag7;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof nwc)
        {
            if (((nwc) (obj = (nwc)obj)).a == a && ((nwc) (obj)).b == b && ((nwc) (obj)).c == c && ((nwc) (obj)).d == d && ((nwc) (obj)).e == e && ((nwc) (obj)).f == f && ((nwc) (obj)).g == g && ((nwc) (obj)).h == h)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        char c1 = '\0';
        int i;
        byte byte0;
        byte byte1;
        byte byte2;
        byte byte3;
        byte byte4;
        byte byte5;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (b)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (c)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        if (d)
        {
            byte2 = 8;
        } else
        {
            byte2 = 0;
        }
        if (e)
        {
            byte3 = 16;
        } else
        {
            byte3 = 0;
        }
        if (f)
        {
            byte4 = 32;
        } else
        {
            byte4 = 0;
        }
        if (g)
        {
            byte5 = 64;
        } else
        {
            byte5 = 0;
        }
        if (h)
        {
            c1 = '\200';
        }
        return byte5 + (byte0 + i + byte1 + byte2 + byte3 + byte4) + c1;
    }

    public final String toString()
    {
        String s = String.valueOf("PhotosCloudSettingsData{autoCreateEnabled=");
        boolean flag = a;
        boolean flag1 = b;
        boolean flag2 = c;
        boolean flag3 = d;
        boolean flag4 = e;
        boolean flag5 = f;
        boolean flag6 = g;
        boolean flag7 = h;
        return (new StringBuilder(String.valueOf(s).length() + 189)).append(s).append(flag).append(", drivePhotosAllowed=").append(flag1).append(", drivePhotosEnabled=").append(flag2).append(", shareLocation=").append(flag3).append(", faceClusteringAllowed=").append(flag4).append(", faceClusteringEnabled=").append(flag5).append(", timeMachineAllowed=").append(flag6).append(", timeMachineEnabled=").append(flag7).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (a)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (b)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (c)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (d)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (e)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (f)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (g)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (h)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
