// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.content;

import android.content.Context;
import android.util.Log;

public class EndpointWarp
{

    private static final String b = "EndpointWarp";
    public static int b041504150415041504150415 = 39;
    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415;
    long a;

    public EndpointWarp(Context context, byte byte0, byte byte1, byte byte2, byte byte3, int i, short word0, 
            byte byte4, byte abyte0[], byte byte5)
    {
        if (((b041504150415041504150415 + b041504150415041504150415()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 10;
            b041504150415041504150415 = b041504150415041504150415();
        }
        a = create(context, byte0, byte1, byte2, byte3, i, word0, byte4, abyte0, byte5);
    }

    public EndpointWarp(Context context, byte abyte0[], int i)
    {
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415())
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
        a = createWarp(context, abyte0, i);
    }

    public static int b041504150415041504150415()
    {
        return 29;
    }

    public static int b041504150415041504150415()
    {
        return 1;
    }

    public static int b041504150415041504150415()
    {
        return 0;
    }

    private native long create(Context context, byte byte0, byte byte1, byte byte2, byte byte3, int i, short word0, 
            byte byte4, byte abyte0[], byte byte5);

    private native long createWarp(Context context, byte abyte0[], int i);

    private native void disposeWarp(long l);

    private native void flushWarp(long l);

    private native long getWarpCurrentPosition(long l);

    public static boolean loadSharedLibrary()
    {
        System.loadLibrary("ImmEndpointWarpJ");
        return true;
_L2:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        Log.e("EndpointWarp", "Unable to load libImmEndpointWarpJ.so.Please make sure this file is in the libs/armeabi folder.");
        if (((b041504150415041504150415() + b041504150415041504150415) * b041504150415041504150415()) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
        unsatisfiedlinkerror.printStackTrace();
        return false;
        unsatisfiedlinkerror;
        if (System.getProperty("java.vm.name").contains("Java HotSpot"))
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private native void startWarp(long l);

    private native void stopWarp(long l);

    private native void updateWarp(long l, byte abyte0[], int i, long l1, long l2);

    public void dispose()
    {
        do
        {
        } while (true);
    }

    public void flush()
    {
        flushWarp(a);
    }

    public long getCurrentPosition()
    {
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
        return getWarpCurrentPosition(a);
    }

    public void start()
    {
        int i;
        long l;
        try
        {
            l = a;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        i = b041504150415041504150415;
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = 27;
            b041504150415041504150415 = b041504150415041504150415();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            startWarp(l);
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public void stop()
    {
        long l = a;
        if (((b041504150415041504150415() + b041504150415041504150415) * b041504150415041504150415()) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 12;
            b041504150415041504150415 = b041504150415041504150415();
        }
        stopWarp(l);
    }

    public void update(byte abyte0[], int i, long l, long l1)
    {
        try
        {
            updateWarp(a, abyte0, i, l, l1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
    }
}
