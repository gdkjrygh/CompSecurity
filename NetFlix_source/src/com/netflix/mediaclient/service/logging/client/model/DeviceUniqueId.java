// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;

public class DeviceUniqueId
{

    private long value;

    public DeviceUniqueId()
    {
        value = 10L * System.currentTimeMillis() + (long)Math.abs(getRandom16Bits());
    }

    public DeviceUniqueId(long l)
    {
        value = l;
    }

    private static int getRandom16Bits()
    {
        byte abyte0[] = new byte[2];
        (new Random()).nextBytes(abyte0);
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
        bytebuffer.order(ByteOrder.nativeOrder());
        return bytebuffer.getShort();
    }

    public static DeviceUniqueId parse(long l)
    {
        DeviceUniqueId deviceuniqueid = new DeviceUniqueId();
        deviceuniqueid.value = l;
        return deviceuniqueid;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DeviceUniqueId)obj;
            if (value != ((DeviceUniqueId) (obj)).value)
            {
                return false;
            }
        }
        return true;
    }

    public long getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return (int)(value ^ value >>> 32) + 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DeviceUniqueId [value=").append(value).append("]").toString();
    }
}
