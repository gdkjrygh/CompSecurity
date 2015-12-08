// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class com.google.android.gms.common.internal.safeparcel.zza
{
    public static class zza extends RuntimeException
    {

        public zza(String s, Parcel parcel)
        {
            super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static ArrayList zzC(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(i + j);
            return arraylist;
        }
    }

    public static int zza(Parcel parcel, int i)
    {
        if ((i & 0xffff0000) != 0xffff0000)
        {
            return i >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable zza(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    private static void zza(Parcel parcel, int i, int j)
    {
        i = zza(parcel, i);
        if (i != j)
        {
            throw new zza((new StringBuilder()).append("Expected size ").append(j).append(" got ").append(i).append(" (0x").append(Integer.toHexString(i)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static int zzaa(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int zzab(Parcel parcel)
    {
        int j = zzaa(parcel);
        int k = zza(parcel, j);
        int i = parcel.dataPosition();
        if (zzbA(j) != 20293)
        {
            throw new zza((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(j)).toString(), parcel);
        }
        j = i + k;
        if (j < i || j > parcel.dataSize())
        {
            throw new zza((new StringBuilder()).append("Size read is invalid start=").append(i).append(" end=").append(j).toString(), parcel);
        } else
        {
            return j;
        }
    }

    public static void zzb(Parcel parcel, int i)
    {
        parcel.setDataPosition(zza(parcel, i) + parcel.dataPosition());
    }

    public static Object[] zzb(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    public static int zzbA(int i)
    {
        return 0xffff & i;
    }

    public static boolean zzc(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int zzg(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt();
    }

    public static long zzi(Parcel parcel, int i)
    {
        zza(parcel, i, 8);
        return parcel.readLong();
    }

    public static float zzl(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readFloat();
    }

    public static String zzo(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(i + j);
            return s;
        }
    }

    public static IBinder zzp(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(i + j);
            return ibinder;
        }
    }

    public static Bundle zzq(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(i + j);
            return bundle;
        }
    }
}
