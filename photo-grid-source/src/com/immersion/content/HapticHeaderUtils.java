// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.content;

import java.nio.ByteBuffer;

// Referenced classes of package com.immersion.content:
//            HeaderUtils

public class HapticHeaderUtils extends HeaderUtils
{

    private static final String b = "HapticHeaderUtils";
    public static int b042104210421042104210421 = 33;
    public static int b042104210421042104210421 = 0;
    public static int b042104210421042104210421 = 2;
    public static int b042104210421042104210421 = 1;
    long a;
    private byte c[];
    private int d;

    public HapticHeaderUtils()
    {
        int i = b042104210421042104210421;
        switch ((i * (b042104210421042104210421 + i)) % b042104210421042104210421)
        {
        default:
            b042104210421042104210421 = 43;
            b042104210421042104210421 = b042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b042104210421042104210421()
    {
        return 1;
    }

    public static int b042104210421042104210421()
    {
        return 80;
    }

    public static int b042104210421042104210421()
    {
        return 0;
    }

    private native int calculateBlockRateNative(long l);

    private native int calculateBlockSizeNative(long l);

    private native int calculateByteOffsetIntoHapticDataNative(long l, int i);

    private native void disposeNative(long l);

    private native String getContentIdNative(long l);

    private native int getEncryptionNative(long l);

    private native int getMajorVersionNumberNative(long l);

    private native int getMinorVersionNumberNative(long l);

    private native int getNumChannelsNative(long l);

    private native long init(byte abyte0[], int i);

    public int calculateBlockRate()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 12;
        }
        return calculateBlockRateNative(a);
    }

    public int calculateBlockSize()
    {
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 84;
        }
        return calculateBlockSizeNative(a);
    }

    public int calculateByteOffsetIntoHapticData(int i)
    {
        long l = a;
        int j = b042104210421042104210421();
        switch ((j * (b042104210421042104210421 + j)) % b042104210421042104210421)
        {
        default:
            b042104210421042104210421 = 89;
            b042104210421042104210421 = b042104210421042104210421();
            // fall through

        case 0: // '\0'
            return calculateByteOffsetIntoHapticDataNative(l, i);
        }
    }

    public void dispose()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 92;
        }
        disposeNative(a);
    }

    public String getContentUUID()
    {
        String s;
        long l;
        try
        {
            l = a;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
        {
            b042104210421042104210421 = 46;
            b042104210421042104210421 = 43;
        }
        s = getContentIdNative(l);
        return s;
    }

    public int getEncryption()
    {
        long l = a;
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        return getEncryptionNative(l);
    }

    public int getMajorVersionNumber()
    {
        return getMajorVersionNumberNative(a);
    }

    public int getMinorVersionNumber()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        int i;
        long l;
        try
        {
            l = a;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            i = getMinorVersionNumberNative(l);
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return i;
    }

    public int getNumChannels()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = 92;
            b042104210421042104210421 = b042104210421042104210421();
        }
        int i;
        try
        {
            i = getNumChannelsNative(a);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return i;
    }

    public void setEncryptedHSI(ByteBuffer bytebuffer, int i)
    {
        d = i;
        c = new byte[d];
        bytebuffer.get(c, 0, d);
        a = init(c, d);
    }
}
