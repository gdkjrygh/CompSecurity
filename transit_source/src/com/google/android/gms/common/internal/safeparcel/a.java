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

    public static short e(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (short)parcel.readInt();
    }

    public static int f(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt();
    }

    public static long g(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static BigInteger h(Parcel parcel, int i1)
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

    public static float i(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readFloat();
    }

    public static int i(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static double j(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readDouble();
    }

    public static int j(Parcel parcel)
    {
        int j1 = i(parcel);
        int k1 = a(parcel, j1);
        int i1 = parcel.dataPosition();
        if (y(j1) != 20293)
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

    public static BigDecimal k(Parcel parcel, int i1)
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

    public static String l(Parcel parcel, int i1)
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

    public static IBinder m(Parcel parcel, int i1)
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

    public static Bundle n(Parcel parcel, int i1)
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

    public static byte[] o(Parcel parcel, int i1)
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

    public static boolean[] p(Parcel parcel, int i1)
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

    public static int[] q(Parcel parcel, int i1)
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

    public static long[] r(Parcel parcel, int i1)
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

    public static BigInteger[] s(Parcel parcel, int i1)
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

    public static float[] t(Parcel parcel, int i1)
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

    public static double[] u(Parcel parcel, int i1)
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

    public static BigDecimal[] v(Parcel parcel, int i1)
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

    public static String[] w(Parcel parcel, int i1)
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

    public static ArrayList x(Parcel parcel, int i1)
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

    public static int y(int i1)
    {
        return 0xffff & i1;
    }

    public static Parcel y(Parcel parcel, int i1)
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

    public static Parcel[] z(Parcel parcel, int i1)
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
}
