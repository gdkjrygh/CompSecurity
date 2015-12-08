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

    private static int A(Parcel parcel, int i)
    {
        parcel.writeInt(0xffff0000 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void B(Parcel parcel, int i)
    {
        int j = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(j - i);
        parcel.setDataPosition(j);
    }

    public static void C(Parcel parcel, int i)
    {
        B(parcel, i);
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
            i = A(parcel, i);
            parcel.writeBundle(bundle);
            B(parcel, i);
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
            i = A(parcel, i);
            parcel.writeStrongBinder(ibinder);
            B(parcel, i);
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
            i = A(parcel, i);
            parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            B(parcel, i);
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
            i = A(parcel, i);
            parcelable.writeToParcel(parcel, j);
            B(parcel, i);
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
            i = A(parcel, i);
            parcel.writeString(s);
            B(parcel, i);
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
        } else
        {
            i = A(parcel, i);
            parcel.writeStringList(list);
            B(parcel, i);
            return;
        }
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
            i = A(parcel, i);
            parcel.writeByteArray(abyte0);
            B(parcel, i);
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
        int l = A(parcel, i);
        int i1 = aparcelable.length;
        parcel.writeInt(i1);
        i = 0;
        while (i < i1) 
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
        B(parcel, l);
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
            i = A(parcel, i);
            parcel.writeStringArray(as);
            B(parcel, i);
            return;
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i)
    {
        int j = parcel.dataPosition();
        parcel.writeInt(1);
        int l = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        i = parcel.dataPosition();
        parcel.setDataPosition(j);
        parcel.writeInt(i - l);
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
        }
        int j = A(parcel, i);
        int l = list.size();
        parcel.writeInt(l);
        i = 0;
        while (i < l) 
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
        B(parcel, j);
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
        } else
        {
            i = A(parcel, i);
            parcel.writeList(list);
            B(parcel, i);
            return;
        }
    }

    public static int k(Parcel parcel)
    {
        return A(parcel, 20293);
    }
}
