// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class b
{

    private static int F(Parcel parcel, int i)
    {
        parcel.writeInt(0xffff0000 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void G(Parcel parcel, int i)
    {
        int j = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(j - i);
        parcel.setDataPosition(j);
    }

    public static int H(Parcel parcel)
    {
        return F(parcel, 20293);
    }

    public static void H(Parcel parcel, int i)
    {
        G(parcel, i);
    }

    public static void a(Parcel parcel, int i, byte byte0)
    {
        b(parcel, i, 4);
        parcel.writeInt(byte0);
    }

    public static void a(Parcel parcel, int i, double d1)
    {
        b(parcel, i, 8);
        parcel.writeDouble(d1);
    }

    public static void a(Parcel parcel, int i, float f)
    {
        b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, long l)
    {
        b(parcel, i, 8);
        parcel.writeLong(l);
    }

    public static void a(Parcel parcel, int i, Bundle bundle, boolean flag)
    {
        if (bundle == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeBundle(bundle);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, IBinder ibinder, boolean flag)
    {
        if (ibinder == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeStrongBinder(ibinder);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Parcel parcel1, boolean flag)
    {
        if (parcel1 == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int j, boolean flag)
    {
        if (parcelable == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcelable.writeToParcel(parcel, j);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Boolean boolean1, boolean flag)
    {
        boolean flag1 = false;
        if (boolean1 == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        }
        b(parcel, i, 4);
        i = ((flag1) ? 1 : 0);
        if (boolean1.booleanValue())
        {
            i = 1;
        }
        parcel.writeInt(i);
    }

    public static void a(Parcel parcel, int i, Integer integer, boolean flag)
    {
        if (integer == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            b(parcel, i, 4);
            parcel.writeInt(integer.intValue());
            return;
        }
    }

    public static void a(Parcel parcel, int i, Long long1, boolean flag)
    {
        if (long1 == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            b(parcel, i, 8);
            parcel.writeLong(long1.longValue());
            return;
        }
    }

    public static void a(Parcel parcel, int i, String s, boolean flag)
    {
        if (s == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeString(s);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        }
        int j = F(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        for (i = 0; i < k; i++)
        {
            parcel.writeInt(((Integer)list.get(i)).intValue());
        }

        G(parcel, j);
    }

    public static void a(Parcel parcel, int i, short word0)
    {
        b(parcel, i, 4);
        parcel.writeInt(word0);
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

    public static void a(Parcel parcel, int i, byte abyte0[], boolean flag)
    {
        if (abyte0 == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeByteArray(abyte0);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, int ai[], boolean flag)
    {
        if (ai == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeIntArray(ai);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, Parcelable aparcelable[], int j, boolean flag)
    {
        if (aparcelable == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        }
        int k = F(parcel, i);
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
        G(parcel, k);
    }

    public static void a(Parcel parcel, int i, String as[], boolean flag)
    {
        if (as == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeStringArray(as);
            G(parcel, i);
            return;
        }
    }

    public static void a(Parcel parcel, int i, byte abyte0[][], boolean flag)
    {
        boolean flag1 = false;
        if (abyte0 == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        }
        int j = F(parcel, i);
        int k = abyte0.length;
        parcel.writeInt(k);
        for (i = ((flag1) ? 1 : 0); i < k; i++)
        {
            parcel.writeByteArray(abyte0[i]);
        }

        G(parcel, j);
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

    public static void b(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeStringList(list);
            G(parcel, i);
            return;
        }
    }

    public static void c(Parcel parcel, int i, int j)
    {
        b(parcel, i, 4);
        parcel.writeInt(j);
    }

    public static void c(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        }
        int j = F(parcel, i);
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
        G(parcel, j);
    }

    public static void d(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                b(parcel, i, 0);
            }
            return;
        } else
        {
            i = F(parcel, i);
            parcel.writeList(list);
            G(parcel, i);
            return;
        }
    }
}
