// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.math.BigInteger;

public final class ah
{

    public static BigInteger a()
    {
        BigInteger biginteger = BigInteger.valueOf(-1L);
        Object obj;
        try
        {
            obj = new StatFs(Environment.getDataDirectory().getPath());
            obj = BigInteger.valueOf(((StatFs) (obj)).getAvailableBlocks()).multiply(BigInteger.valueOf(((StatFs) (obj)).getBlockSize()));
        }
        catch (Exception exception)
        {
            return biginteger;
        }
        return ((BigInteger) (obj));
    }

    public static BigInteger b()
    {
        BigInteger biginteger = BigInteger.valueOf(-1L);
        Object obj;
        try
        {
            obj = new StatFs(Environment.getDataDirectory().getPath());
            obj = BigInteger.valueOf(((StatFs) (obj)).getBlockCount()).multiply(BigInteger.valueOf(((StatFs) (obj)).getBlockSize()));
        }
        catch (Exception exception)
        {
            return biginteger;
        }
        return ((BigInteger) (obj));
    }

    public static BigInteger c()
    {
        BigInteger biginteger = BigInteger.valueOf(-1L);
        Object obj;
        try
        {
            obj = new StatFs(Environment.getExternalStorageDirectory().getPath());
            obj = BigInteger.valueOf(((StatFs) (obj)).getAvailableBlocks()).multiply(BigInteger.valueOf(((StatFs) (obj)).getBlockSize()));
        }
        catch (Exception exception)
        {
            return biginteger;
        }
        return ((BigInteger) (obj));
    }

    public static BigInteger d()
    {
        BigInteger biginteger = BigInteger.valueOf(-1L);
        Object obj;
        try
        {
            obj = new StatFs(Environment.getExternalStorageDirectory().getPath());
            obj = BigInteger.valueOf(((StatFs) (obj)).getBlockCount()).multiply(BigInteger.valueOf(((StatFs) (obj)).getBlockSize()));
        }
        catch (Exception exception)
        {
            return biginteger;
        }
        return ((BigInteger) (obj));
    }
}
