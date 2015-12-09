// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.gms.common.internal.safeparcel.a
{
    public static final class a extends RuntimeException
    {

        public a(String s1, Parcel parcel)
        {
            super((new StringBuilder()).append(s1).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static String[] B(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(j + k);
            return as;
        }
    }

    public static ArrayList E(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(j + k);
            return arraylist;
        }
    }

    private static int a(Parcel parcel, int j)
    {
        if ((j & 0xffff0000) != 0xffff0000)
        {
            return j >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable a(Parcel parcel, int j, android.os.Parcelable.Creator creator)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(j + k);
            return creator;
        }
    }

    private static void a(Parcel parcel, int j, int k)
    {
        j = a(parcel, j);
        if (j != k)
        {
            throw new a((new StringBuilder("Expected size ")).append(k).append(" got ").append(j).append(" (0x").append(Integer.toHexString(j)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    private static void a(Parcel parcel, int j, int k, int i1)
    {
        if (k != i1)
        {
            throw new a((new StringBuilder("Expected size ")).append(i1).append(" got ").append(k).append(" (0x").append(Integer.toHexString(k)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void a(Parcel parcel, int j, List list, ClassLoader classloader)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return;
        } else
        {
            parcel.readList(list, classloader);
            parcel.setDataPosition(j + k);
            return;
        }
    }

    public static void b(Parcel parcel, int j)
    {
        parcel.setDataPosition(a(parcel, j) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int j, android.os.Parcelable.Creator creator)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(j + k);
            return creator;
        }
    }

    public static int bS(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int bT(Parcel parcel)
    {
        int k = bS(parcel);
        int i1 = a(parcel, k);
        int j = parcel.dataPosition();
        if (dk(k) != 20293)
        {
            throw new a((new StringBuilder("Expected object header. Got 0x")).append(Integer.toHexString(k)).toString(), parcel);
        }
        k = j + i1;
        if (k < j || k > parcel.dataSize())
        {
            throw new a((new StringBuilder("Size read is invalid start=")).append(j).append(" end=").append(k).toString(), parcel);
        } else
        {
            return k;
        }
    }

    public static ArrayList c(Parcel parcel, int j, android.os.Parcelable.Creator creator)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            creator = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(j + k);
            return creator;
        }
    }

    public static boolean c(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return parcel.readInt() != 0;
    }

    public static int dk(int j)
    {
        return 0xffff & j;
    }

    public static byte e(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return (byte)parcel.readInt();
    }

    public static short f(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return (short)parcel.readInt();
    }

    public static int g(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return parcel.readInt();
    }

    public static Integer h(Parcel parcel, int j)
    {
        int k = a(parcel, j);
        if (k == 0)
        {
            return null;
        } else
        {
            a(parcel, j, k, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long i(Parcel parcel, int j)
    {
        a(parcel, j, 8);
        return parcel.readLong();
    }

    public static float l(Parcel parcel, int j)
    {
        a(parcel, j, 4);
        return parcel.readFloat();
    }

    public static double m(Parcel parcel, int j)
    {
        a(parcel, j, 8);
        return parcel.readDouble();
    }

    public static String p(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            String s1 = parcel.readString();
            parcel.setDataPosition(j + k);
            return s1;
        }
    }

    public static IBinder q(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(j + k);
            return ibinder;
        }
    }

    public static Bundle r(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(j + k);
            return bundle;
        }
    }

    public static byte[] s(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(j + k);
            return abyte0;
        }
    }

    public static byte[][] t(Parcel parcel, int j)
    {
        int k = a(parcel, j);
        int i1 = parcel.dataPosition();
        if (k == 0)
        {
            return null;
        }
        int j1 = parcel.readInt();
        byte abyte0[][] = new byte[j1][];
        for (j = 0; j < j1; j++)
        {
            abyte0[j] = parcel.createByteArray();
        }

        parcel.setDataPosition(i1 + k);
        return abyte0;
    }

    public static int[] v(Parcel parcel, int j)
    {
        j = a(parcel, j);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        } else
        {
            int ai[] = parcel.createIntArray();
            parcel.setDataPosition(j + k);
            return ai;
        }
    }
}
