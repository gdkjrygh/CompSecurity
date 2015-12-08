// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class zzb
{

    private static int zzF(Parcel parcel, int i)
    {
        parcel.writeInt(0xffff0000 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzG(Parcel parcel, int i)
    {
        int j = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(j - i);
        parcel.setDataPosition(j);
    }

    public static void zzH(Parcel parcel, int i)
    {
        zzG(parcel, i);
    }

    public static int zzM(Parcel parcel)
    {
        return zzF(parcel, 20293);
    }

    public static void zza(Parcel parcel, int i, byte byte0)
    {
        zzb(parcel, i, 4);
        parcel.writeInt(byte0);
    }

    public static void zza(Parcel parcel, int i, double d)
    {
        zzb(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void zza(Parcel parcel, int i, float f)
    {
        zzb(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void zza(Parcel parcel, int i, long l)
    {
        zzb(parcel, i, 8);
        parcel.writeLong(l);
    }

    public static void zza(Parcel parcel, int i, Bundle bundle, boolean flag)
    {
        if (bundle == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeBundle(bundle);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, IBinder ibinder, boolean flag)
    {
        if (ibinder == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeStrongBinder(ibinder);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, Parcel parcel1, boolean flag)
    {
        if (parcel1 == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, Parcelable parcelable, int j, boolean flag)
    {
        if (parcelable == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcelable.writeToParcel(parcel, j);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, Boolean boolean1, boolean flag)
    {
        boolean flag1 = false;
        if (boolean1 == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        }
        zzb(parcel, i, 4);
        i = ((flag1) ? 1 : 0);
        if (boolean1.booleanValue())
        {
            i = 1;
        }
        parcel.writeInt(i);
    }

    public static void zza(Parcel parcel, int i, Integer integer, boolean flag)
    {
        if (integer == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            zzb(parcel, i, 4);
            parcel.writeInt(integer.intValue());
            return;
        }
    }

    public static void zza(Parcel parcel, int i, Long long1, boolean flag)
    {
        if (long1 == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            zzb(parcel, i, 8);
            parcel.writeLong(long1.longValue());
            return;
        }
    }

    public static void zza(Parcel parcel, int i, String s, boolean flag)
    {
        if (s == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeString(s);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        }
        int j = zzF(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        for (i = 0; i < k; i++)
        {
            parcel.writeInt(((Integer)list.get(i)).intValue());
        }

        zzG(parcel, j);
    }

    public static void zza(Parcel parcel, int i, short word0)
    {
        zzb(parcel, i, 4);
        parcel.writeInt(word0);
    }

    public static void zza(Parcel parcel, int i, boolean flag)
    {
        zzb(parcel, i, 4);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public static void zza(Parcel parcel, int i, byte abyte0[], boolean flag)
    {
        if (abyte0 == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeByteArray(abyte0);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, int ai[], boolean flag)
    {
        if (ai == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeIntArray(ai);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, Parcelable aparcelable[], int j, boolean flag)
    {
        if (aparcelable == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        }
        int k = zzF(parcel, i);
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
                zza(parcel, parcelable, j);
            }
            i++;
        }
        zzG(parcel, k);
    }

    public static void zza(Parcel parcel, int i, String as[], boolean flag)
    {
        if (as == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeStringArray(as);
            zzG(parcel, i);
            return;
        }
    }

    public static void zza(Parcel parcel, int i, byte abyte0[][], boolean flag)
    {
        boolean flag1 = false;
        if (abyte0 == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        }
        int j = zzF(parcel, i);
        int k = abyte0.length;
        parcel.writeInt(k);
        for (i = ((flag1) ? 1 : 0); i < k; i++)
        {
            parcel.writeByteArray(abyte0[i]);
        }

        zzG(parcel, j);
    }

    private static void zza(Parcel parcel, Parcelable parcelable, int i)
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

    private static void zzb(Parcel parcel, int i, int j)
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

    public static void zzb(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeStringList(list);
            zzG(parcel, i);
            return;
        }
    }

    public static void zzc(Parcel parcel, int i, int j)
    {
        zzb(parcel, i, 4);
        parcel.writeInt(j);
    }

    public static void zzc(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        }
        int j = zzF(parcel, i);
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
                zza(parcel, parcelable, 0);
            }
            i++;
        }
        zzG(parcel, j);
    }

    public static void zzd(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                zzb(parcel, i, 0);
            }
            return;
        } else
        {
            i = zzF(parcel, i);
            parcel.writeList(list);
            zzG(parcel, i);
            return;
        }
    }
}
