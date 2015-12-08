// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Intent;
import android.os.Parcel;
import com.netflix.mediaclient.Log;

public final class ParcelUtils
{

    private static final String NULL = "=NULL=";
    private static final String TAG = com/netflix/mediaclient/util/ParcelUtils.getSimpleName();

    private ParcelUtils()
    {
    }

    public static boolean readBoolean(Intent intent, String s)
    {
        return intent.getBooleanExtra(s, false);
    }

    public static boolean readBoolean(Parcel parcel)
    {
        return "true".equals(parcel.readString());
    }

    public static int readInt(Intent intent, String s)
    {
        return intent.getIntExtra(s, 0);
    }

    public static int readInt(Parcel parcel)
    {
        return readInt(parcel.readString());
    }

    public static int readInt(String s)
    {
        if ("=NULL=".equals(s))
        {
            return 0;
        }
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Failed to parse string to int ", s);
            return 0;
        }
        return i;
    }

    public static long readLong(Intent intent, String s)
    {
        return intent.getLongExtra(s, 0L);
    }

    public static long readLong(Parcel parcel)
    {
        return readLong(parcel.readString());
    }

    public static long readLong(String s)
    {
        if ("=NULL=".equals(s))
        {
            return 0L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "Failed to parse string to int ", s);
            return 0L;
        }
        return l;
    }

    public static String readString(Intent intent, String s)
    {
        return readString(intent.getStringExtra(s));
    }

    public static String readString(Parcel parcel)
    {
        return readString(parcel.readString());
    }

    public static String readString(String s)
    {
        String s1 = s;
        if ("=NULL=".equals(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static String validateString(String s)
    {
        if (s != null)
        {
            return s;
        } else
        {
            return "=NULL=";
        }
    }

    public static void writeBoolean(Parcel parcel, boolean flag)
    {
        parcel.writeString(String.valueOf(flag));
    }

    public static void writeInt(Parcel parcel, int i)
    {
        parcel.writeString(String.valueOf(i));
    }

    public static void writeLong(Parcel parcel, long l)
    {
        parcel.writeString(String.valueOf(l));
    }

    public static void writeString(Parcel parcel, String s)
    {
        parcel.writeString(validateString(s));
    }

}
