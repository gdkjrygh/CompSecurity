// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class com.google.android.gms.common.internal.safeparcel.a
{
    public static class a extends RuntimeException
    {

        public a(String s1, Parcel parcel)
        {
            super((new StringBuilder()).append(s1).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static int A(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static String[] A(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(i1 + j1);
            return as;
        }
    }

    public static int B(Parcel parcel)
    {
        int j1 = A(parcel);
        int k1 = a(parcel, j1);
        int i1 = parcel.dataPosition();
        if (ar(j1) != 20293)
        {
            throw new a((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(j1)).toString(), parcel);
        }
        j1 = i1 + k1;
        if (j1 < i1 || j1 > parcel.dataSize())
        {
            throw new a((new StringBuilder()).append("Size read is invalid start=").append(i1).append(" end=").append(j1).toString(), parcel);
        } else
        {
            return j1;
        }
    }

    public static ArrayList B(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(i1 + j1);
            return arraylist;
        }
    }

    public static Parcel C(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            Parcel parcel1 = Parcel.obtain();
            parcel1.appendFrom(parcel, j1, i1);
            parcel.setDataPosition(i1 + j1);
            return parcel1;
        }
    }

    public static Parcel[] D(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        Parcel aparcel[] = new Parcel[l1];
        i1 = 0;
        while (i1 < l1) 
        {
            int i2 = parcel.readInt();
            if (i2 != 0)
            {
                int j2 = parcel.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel, j2, i2);
                aparcel[i1] = parcel1;
                parcel.setDataPosition(i2 + j2);
            } else
            {
                aparcel[i1] = null;
            }
            i1++;
        }
        parcel.setDataPosition(k1 + j1);
        return aparcel;
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

    private static void a(Parcel parcel, int i1, int j1)
    {
        i1 = a(parcel, i1);
        if (i1 != j1)
        {
            throw new a((new StringBuilder()).append("Expected size ").append(j1).append(" got ").append(i1).append(" (0x").append(Integer.toHexString(i1)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    private static void a(Parcel parcel, int i1, int j1, int k1)
    {
        if (j1 != k1)
        {
            throw new a((new StringBuilder()).append("Expected size ").append(k1).append(" got ").append(j1).append(" (0x").append(Integer.toHexString(j1)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void a(Parcel parcel, int i1, List list, ClassLoader classloader)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return;
        } else
        {
            parcel.readList(list, classloader);
            parcel.setDataPosition(i1 + j1);
            return;
        }
    }

    public static int ar(int i1)
    {
        return 0xffff & i1;
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

    public static Boolean d(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        if (j1 == 0)
        {
            return null;
        }
        a(parcel, i1, j1, 4);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public static byte e(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (byte)parcel.readInt();
    }

    public static short f(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (short)parcel.readInt();
    }

    public static int g(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt();
    }

    public static Integer h(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        if (j1 == 0)
        {
            return null;
        } else
        {
            a(parcel, i1, j1, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long i(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static Long j(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        if (j1 == 0)
        {
            return null;
        } else
        {
            a(parcel, i1, j1, 8);
            return Long.valueOf(parcel.readLong());
        }
    }

    public static BigInteger k(Parcel parcel, int i1)
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
            return new BigInteger(abyte0);
        }
    }

    public static float l(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readFloat();
    }

    public static double m(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readDouble();
    }

    public static BigDecimal n(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            int k1 = parcel.readInt();
            parcel.setDataPosition(i1 + j1);
            return new BigDecimal(new BigInteger(abyte0), k1);
        }
    }

    public static String o(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            String s1 = parcel.readString();
            parcel.setDataPosition(i1 + j1);
            return s1;
        }
    }

    public static IBinder p(Parcel parcel, int i1)
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

    public static Bundle q(Parcel parcel, int i1)
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

    public static byte[] r(Parcel parcel, int i1)
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

    public static byte[][] s(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return (byte[][])null;
        }
        int l1 = parcel.readInt();
        byte abyte0[][] = new byte[l1][];
        for (i1 = 0; i1 < l1; i1++)
        {
            abyte0[i1] = parcel.createByteArray();
        }

        parcel.setDataPosition(k1 + j1);
        return abyte0;
    }

    public static boolean[] t(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            boolean aflag[] = parcel.createBooleanArray();
            parcel.setDataPosition(i1 + j1);
            return aflag;
        }
    }

    public static int[] u(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            int ai[] = parcel.createIntArray();
            parcel.setDataPosition(i1 + j1);
            return ai;
        }
    }

    public static long[] v(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            long al[] = parcel.createLongArray();
            parcel.setDataPosition(i1 + j1);
            return al;
        }
    }

    public static BigInteger[] w(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        BigInteger abiginteger[] = new BigInteger[l1];
        for (i1 = 0; i1 < l1; i1++)
        {
            abiginteger[i1] = new BigInteger(parcel.createByteArray());
        }

        parcel.setDataPosition(k1 + j1);
        return abiginteger;
    }

    public static float[] x(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            float af[] = parcel.createFloatArray();
            parcel.setDataPosition(i1 + j1);
            return af;
        }
    }

    public static double[] y(Parcel parcel, int i1)
    {
        i1 = a(parcel, i1);
        int j1 = parcel.dataPosition();
        if (i1 == 0)
        {
            return null;
        } else
        {
            double ad[] = parcel.createDoubleArray();
            parcel.setDataPosition(i1 + j1);
            return ad;
        }
    }

    public static BigDecimal[] z(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        BigDecimal abigdecimal[] = new BigDecimal[l1];
        for (i1 = 0; i1 < l1; i1++)
        {
            byte abyte0[] = parcel.createByteArray();
            int i2 = parcel.readInt();
            abigdecimal[i1] = new BigDecimal(new BigInteger(abyte0), i2);
        }

        parcel.setDataPosition(k1 + j1);
        return abigdecimal;
    }
}
