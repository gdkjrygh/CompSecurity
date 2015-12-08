// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.proto;

import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public final class Protos
{

    private static final String TAG = com/google/android/apps/wallet/util/proto/Protos.getSimpleName();

    private Protos()
    {
    }

    public static MessageNano copy(MessageNano messagenano)
    {
        Preconditions.checkNotNull(messagenano);
        MessageNano messagenano1;
        try
        {
            messagenano1 = (MessageNano)messagenano.getClass().newInstance();
            MessageNano.mergeFrom(messagenano1, MessageNano.toByteArray(messagenano));
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Couldn't clone nano-proto", messagenano);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Couldn't instantiate nano-proto", messagenano);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException("Couldn't instantiate nano-proto", messagenano);
        }
        return messagenano1;
    }

    public static MessageNano mergeProto(MessageNano messagenano, byte abyte0[])
    {
        try
        {
            messagenano = MessageNano.mergeFrom(messagenano, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            WLog.e(TAG, "Failed merging proto", messagenano);
            return null;
        }
        return messagenano;
    }

    public static double valueWithDefault(Double double1, double d)
    {
        if (double1 != null)
        {
            d = double1.doubleValue();
        }
        return d;
    }

    public static float valueWithDefault(Float float1, float f)
    {
        if (float1 != null)
        {
            f = float1.floatValue();
        }
        return f;
    }

    public static int valueWithDefault(Integer integer, int i)
    {
        if (integer != null)
        {
            i = integer.intValue();
        }
        return i;
    }

    public static long valueWithDefault(Long long1, long l)
    {
        if (long1 != null)
        {
            l = long1.longValue();
        }
        return l;
    }

    public static String valueWithDefault(String s, String s1)
    {
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public static boolean valueWithDefaultFalse(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            return boolean1.booleanValue();
        } else
        {
            return false;
        }
    }

    public static boolean valueWithDefaultTrue(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            return boolean1.booleanValue();
        } else
        {
            return true;
        }
    }

    public static boolean valuesEqual(Integer integer, int i)
    {
        return integer != null && integer.intValue() == i;
    }

}
