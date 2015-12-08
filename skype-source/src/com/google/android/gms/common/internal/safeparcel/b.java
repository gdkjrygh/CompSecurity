// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class b
{

    public static int a(Parcel parcel)
    {
        return b(parcel, 20293);
    }

    public static void a(Parcel parcel, int i)
    {
        c(parcel, i);
    }

    public static void a(Parcel parcel, int i, byte byte0)
    {
        b(parcel, i, 4);
        parcel.writeInt(byte0);
    }

    public static void a(Parcel parcel, int i, double d)
    {
        b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void a(Parcel parcel, int i, float f)
    {
        b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, int j)
    {
        b(parcel, i, 4);
        parcel.writeInt(j);
    }

    public static void a(Parcel parcel, int i, long l)
    {
        b(parcel, i, 8);
        parcel.writeLong(l);
    }

    public static void a(Parcel parcel, int i, Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeBundle(bundle);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, IBinder ibinder)
    {
        if (ibinder == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeStrongBinder(ibinder);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int j)
    {
        if (parcelable == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcelable.writeToParcel(parcel, j);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeString(s);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, List list)
    {
        if (list == null)
        {
            return;
        }
        int j = b(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        for (i = 0; i < k; i++)
        {
            parcel.writeInt(((Integer)list.get(i)).intValue());
        }

        c(parcel, j);
    }

    public static void a(Parcel parcel, int i, boolean flag)
    {
        b(parcel, i, 4);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public static void a(Parcel parcel, int i, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeByteArray(abyte0);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Parcelable aparcelable[], int j)
    {
        if (aparcelable == null)
        {
            return;
        }
        int k = b(parcel, i);
        int l = aparcelable.length;
        parcel.writeInt(l);
        i = 0;
        while (i < l) 
        {
            Parcelable parcelable = aparcelable[i];
            if (parcelable == null)
            {
                parcel.writeInt(0);
            } else
            {
                a(parcel, parcelable, j);
            }
            i++;
        }
        c(parcel, k);
    }

    public static void a(Parcel parcel, int i, String as[])
    {
        if (as == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeStringArray(as);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, Parcel parcel1)
    {
        if (parcel1 == null)
        {
            return;
        } else
        {
            int i = b(parcel, 2);
            parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            c(parcel, i);
            return;
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i)
    {
        int j = parcel.dataPosition();
        parcel.writeInt(1);
        int k = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        i = parcel.dataPosition();
        parcel.setDataPosition(j);
        parcel.writeInt(i - k);
        parcel.setDataPosition(i);
    }

    public static void a(Parcel parcel, Integer integer)
    {
        if (integer == null)
        {
            return;
        } else
        {
            b(parcel, 5, 4);
            parcel.writeInt(integer.intValue());
            return;
        }
    }

    public static void a(Parcel parcel, List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            int i = b(parcel, 3);
            parcel.writeList(list);
            c(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, short word0)
    {
        b(parcel, 3, 4);
        parcel.writeInt(word0);
    }

    public static void a(Parcel parcel, int ai[])
    {
        if (ai == null)
        {
            return;
        } else
        {
            int i = b(parcel, 8);
            parcel.writeIntArray(ai);
            c(parcel, i);
            return;
        }
    }

    private static int b(Parcel parcel, int i)
    {
        parcel.writeInt(0xffff0000 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void b(Parcel parcel, int i, int j)
    {
        if (j >= 65535)
        {
            parcel.writeInt(0xffff0000 | i);
            parcel.writeInt(j);
            return;
        } else
        {
            parcel.writeInt(j << 16 | i);
            return;
        }
    }

    public static void b(Parcel parcel, int i, List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            i = b(parcel, i);
            parcel.writeStringList(list);
            c(parcel, i);
            return;
        }
    }

    private static void c(Parcel parcel, int i)
    {
        int j = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(j - i);
        parcel.setDataPosition(j);
    }

    public static void c(Parcel parcel, int i, List list)
    {
        if (list == null)
        {
            return;
        }
        int j = b(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        i = 0;
        while (i < k) 
        {
            Parcelable parcelable = (Parcelable)list.get(i);
            if (parcelable == null)
            {
                parcel.writeInt(0);
            } else
            {
                a(parcel, parcelable, 0);
            }
            i++;
        }
        c(parcel, j);
    }
}
