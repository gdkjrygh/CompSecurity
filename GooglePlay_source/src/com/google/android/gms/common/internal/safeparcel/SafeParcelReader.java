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

public final class SafeParcelReader
{
    public static final class ParseException extends RuntimeException
    {

        public ParseException(String s, Parcel parcel)
        {
            super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static BigDecimal createBigDecimal(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            int k = parcel.readInt();
            parcel.setDataPosition(j + i);
            return new BigDecimal(new BigInteger(abyte0), k);
        }
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i)
    {
        int j = readSize(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        int l = parcel.readInt();
        BigDecimal abigdecimal[] = new BigDecimal[l];
        for (i = 0; i < l; i++)
        {
            byte abyte0[] = parcel.createByteArray();
            int i1 = parcel.readInt();
            abigdecimal[i] = new BigDecimal(new BigInteger(abyte0), i1);
        }

        parcel.setDataPosition(k + j);
        return abigdecimal;
    }

    public static BigInteger createBigInteger(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(j + i);
            return new BigInteger(abyte0);
        }
    }

    public static Bundle createBundle(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(j + i);
            return bundle;
        }
    }

    public static byte[] createByteArray(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(j + i);
            return abyte0;
        }
    }

    public static int[] createIntArray(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            int ai[] = parcel.createIntArray();
            parcel.setDataPosition(j + i);
            return ai;
        }
    }

    public static ArrayList createIntegerList(Parcel parcel, int i)
    {
        int j = readSize(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int l = parcel.readInt();
        for (i = 0; i < l; i++)
        {
            arraylist.add(Integer.valueOf(parcel.readInt()));
        }

        parcel.setDataPosition(k + j);
        return arraylist;
    }

    public static long[] createLongArray(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            long al[] = parcel.createLongArray();
            parcel.setDataPosition(j + i);
            return al;
        }
    }

    public static Parcel createParcel(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Parcel parcel1 = Parcel.obtain();
            parcel1.appendFrom(parcel, j, i);
            parcel.setDataPosition(j + i);
            return parcel1;
        }
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i)
    {
        int j = readSize(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        int l = parcel.readInt();
        Parcel aparcel[] = new Parcel[l];
        i = 0;
        while (i < l) 
        {
            int i1 = parcel.readInt();
            if (i1 != 0)
            {
                int j1 = parcel.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel, j1, i1);
                aparcel[i] = parcel1;
                parcel.setDataPosition(j1 + i1);
            } else
            {
                aparcel[i] = null;
            }
            i++;
        }
        parcel.setDataPosition(k + j);
        return aparcel;
    }

    public static Parcelable createParcelable(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(j + i);
            return creator;
        }
    }

    public static String createString(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(j + i);
            return s;
        }
    }

    public static String[] createStringArray(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(j + i);
            return as;
        }
    }

    public static ArrayList createStringList(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(j + i);
            return arraylist;
        }
    }

    public static Object[] createTypedArray(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(j + i);
            return creator;
        }
    }

    public static ArrayList createTypedList(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(j + i);
            return creator;
        }
    }

    public static void enforceSize$ae3cd4b(Parcel parcel, int i, int j)
    {
        if (i != j)
        {
            throw new ParseException((new StringBuilder("Expected size ")).append(j).append(" got ").append(i).append(" (0x").append(Integer.toHexString(i)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void readAndEnforceSize(Parcel parcel, int i, int j)
    {
        i = readSize(parcel, i);
        if (i != j)
        {
            throw new ParseException((new StringBuilder("Expected size ")).append(j).append(" got ").append(i).append(" (0x").append(Integer.toHexString(i)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static boolean readBoolean(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte readByte(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 4);
        return (byte)parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float readFloat(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder readIBinder(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(j + i);
            return ibinder;
        }
    }

    public static int readInt(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        if (i == 0)
        {
            return null;
        } else
        {
            enforceSize$ae3cd4b(parcel, i, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long readLong(Parcel parcel, int i)
    {
        readAndEnforceSize(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        if (i == 0)
        {
            return null;
        } else
        {
            enforceSize$ae3cd4b(parcel, i, 8);
            return Long.valueOf(parcel.readLong());
        }
    }

    public static int readSize(Parcel parcel, int i)
    {
        if ((i & 0xffff0000) != 0xffff0000)
        {
            return i >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static void skipUnknownField(Parcel parcel, int i)
    {
        i = readSize(parcel, i);
        parcel.setDataPosition(parcel.dataPosition() + i);
    }

    public static int validateObjectHeader(Parcel parcel)
    {
        int j = parcel.readInt();
        int k = readSize(parcel, j);
        int i = parcel.dataPosition();
        if ((0xffff & j) != 20293)
        {
            throw new ParseException((new StringBuilder("Expected object header. Got 0x")).append(Integer.toHexString(j)).toString(), parcel);
        }
        j = i + k;
        if (j < i || j > parcel.dataSize())
        {
            throw new ParseException((new StringBuilder("Size read is invalid start=")).append(i).append(" end=").append(j).toString(), parcel);
        } else
        {
            return j;
        }
    }
}
