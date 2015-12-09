// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            b

public class a
{

    public static int a(int i1)
    {
        return 0xffff & i1;
    }

    public static int a(Parcel parcel)
    {
        return parcel.readInt();
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
            throw new b((new StringBuilder()).append("Expected size ").append(j1).append(" got ").append(i1).append(" (0x").append(Integer.toHexString(i1)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    private static void a(Parcel parcel, int i1, int j1, int k1)
    {
        if (j1 != k1)
        {
            throw new b((new StringBuilder()).append("Expected size ").append(k1).append(" got ").append(j1).append(" (0x").append(Integer.toHexString(j1)).append(")").toString(), parcel);
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

    public static int b(Parcel parcel)
    {
        int j1 = a(parcel);
        int k1 = a(parcel, j1);
        int i1 = parcel.dataPosition();
        if (a(j1) != 20293)
        {
            throw new b((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(j1)).toString(), parcel);
        }
        j1 = i1 + k1;
        if (j1 < i1 || j1 > parcel.dataSize())
        {
            throw new b((new StringBuilder()).append("Size read is invalid start=").append(i1).append(" end=").append(j1).toString(), parcel);
        } else
        {
            return j1;
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

    public static Integer f(Parcel parcel, int i1)
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

    public static long g(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static float h(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readFloat();
    }

    public static double i(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readDouble();
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
            String s = parcel.readString();
            parcel.setDataPosition(i1 + j1);
            return s;
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

    public static ArrayList m(Parcel parcel, int i1)
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
}
