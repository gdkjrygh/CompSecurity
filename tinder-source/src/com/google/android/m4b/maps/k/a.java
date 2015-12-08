// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class com.google.android.m4b.maps.k.a
{
    public static final class a extends RuntimeException
    {

        public a(String s, Parcel parcel)
        {
            int i1 = parcel.dataPosition();
            int j1 = parcel.dataSize();
            super((new StringBuilder(String.valueOf(s).length() + 41)).append(s).append(" Parcel: pos=").append(i1).append(" size=").append(j1).toString());
        }
    }


    public static int a(Parcel parcel)
    {
        int j1 = parcel.readInt();
        int k1 = a(parcel, j1);
        int i1 = parcel.dataPosition();
        if ((0xffff & j1) != 20293)
        {
            String s = String.valueOf(Integer.toHexString(j1));
            if (s.length() != 0)
            {
                s = "Expected object header. Got 0x".concat(s);
            } else
            {
                s = new String("Expected object header. Got 0x");
            }
            throw new a(s, parcel);
        }
        j1 = i1 + k1;
        if (j1 < i1 || j1 > parcel.dataSize())
        {
            throw new a((new StringBuilder(54)).append("Size read is invalid start=").append(i1).append(" end=").append(j1).toString(), parcel);
        } else
        {
            return j1;
        }
    }

    public static int a(Parcel parcel, int i1)
    {
        if ((i1 & 0xffff0000) != 0xffff0000)
        {
            return i1 >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable a(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(i1 + j1);
            return creator;
        }
    }

    public static void a(Parcel parcel, int i1, int j1)
    {
        i1 = a(parcel, i1);
        if (i1 != j1)
        {
            String s = String.valueOf(Integer.toHexString(i1));
            throw new a((new StringBuilder(String.valueOf(s).length() + 46)).append("Expected size ").append(j1).append(" got ").append(i1).append(" (0x").append(s).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void b(Parcel parcel, int i1)
    {
        parcel.setDataPosition(a(parcel, i1) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(i1 + j1);
            return creator;
        }
    }

    public static ArrayList c(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            creator = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(i1 + j1);
            return creator;
        }
    }

    public static boolean c(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt() != 0;
    }

    public static byte d(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (byte)parcel.readInt();
    }

    public static int e(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt();
    }

    public static long f(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static float g(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readFloat();
    }

    public static double h(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readDouble();
    }

    public static String i(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(i1 + j1);
            return s;
        }
    }

    public static IBinder j(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(i1 + j1);
            return ibinder;
        }
    }

    public static Bundle k(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(i1 + j1);
            return bundle;
        }
    }

    public static byte[] l(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(i1 + j1);
            return abyte0;
        }
    }
}
