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

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            b

public final class a
{

    public static int a(Parcel parcel)
    {
        int j1 = parcel.readInt();
        int k1 = a(parcel, j1);
        int i1 = parcel.dataPosition();
        if ((0xffff & j1) != 20293)
        {
            throw new b((new StringBuilder("Expected object header. Got 0x")).append(Integer.toHexString(j1)).toString(), parcel);
        }
        j1 = i1 + k1;
        if (j1 < i1 || j1 > parcel.dataSize())
        {
            throw new b((new StringBuilder("Size read is invalid start=")).append(i1).append(" end=").append(j1).toString(), parcel);
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

    private static void a(Parcel parcel, int i1, int j1)
    {
        i1 = a(parcel, i1);
        if (i1 != j1)
        {
            throw new b((new StringBuilder("Expected size ")).append(j1).append(" got ").append(i1).append(" (0x").append(Integer.toHexString(i1)).append(")").toString(), parcel);
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

    public static int d(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt();
    }

    public static long e(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static BigInteger f(Parcel parcel, int i1)
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

    public static BigDecimal i(Parcel parcel, int i1)
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

    public static String j(Parcel parcel, int i1)
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

    public static IBinder k(Parcel parcel, int i1)
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

    public static Bundle l(Parcel parcel, int i1)
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

    public static byte[] m(Parcel parcel, int i1)
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

    public static int[] n(Parcel parcel, int i1)
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

    public static BigDecimal[] o(Parcel parcel, int i1)
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

    public static String[] p(Parcel parcel, int i1)
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

    public static ArrayList q(Parcel parcel, int i1)
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

    public static Parcel r(Parcel parcel, int i1)
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

    public static Parcel[] s(Parcel parcel, int i1)
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
