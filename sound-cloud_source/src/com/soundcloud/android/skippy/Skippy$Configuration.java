// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static class <init>
{

    private int androidVersion;
    private long bufferDurationMs;
    private byte cacheKey[];
    private long cacheMaxSizeBytes;
    private long cacheMinFreeSpaceBytes;
    private String cachePath;
    private on cacheRestriction;
    private boolean enableDebug;
    private int progressIntervalMs;

    public int getAndroidVersion()
    {
        return androidVersion;
    }

    public byte[] getCacheKey()
    {
        return cacheKey;
    }

    public long getCacheMaxSizeBytes()
    {
        return cacheMaxSizeBytes;
    }

    public long getCacheMinFreeSpaceBytes()
    {
        return cacheMinFreeSpaceBytes;
    }

    public String getCachePath()
    {
        return cachePath;
    }

    public on getCacheRestriction()
    {
        return cacheRestriction;
    }

    public boolean getDisableCaching()
    {
        return cacheRestriction == on.DISABLE_CACHE;
    }

    public boolean getEnableDebug()
    {
        return enableDebug;
    }

    public boolean shouldUseCacheOnlineOnly()
    {
        return cacheRestriction == on.ONLINE_ONLY;
    }


    private on()
    {
        androidVersion = android.os.;
        progressIntervalMs = -1;
        bufferDurationMs = -1L;
        cacheMaxSizeBytes = -1L;
        cacheMinFreeSpaceBytes = -1L;
        cachePath = null;
        cacheKey = null;
        enableDebug = true;
        cacheRestriction = on.ONLINE_ONLY;
    }

    public on(int i, long l, long l1, long l2, 
            String s, byte abyte0[], boolean flag, on on)
    {
        androidVersion = android.os.;
        progressIntervalMs = i;
        bufferDurationMs = l;
        cacheMaxSizeBytes = l1;
        cacheMinFreeSpaceBytes = l2;
        cachePath = s;
        enableDebug = flag;
        cacheRestriction = on;
        if (abyte0 != null && abyte0.length != 16)
        {
            throw new IllegalArgumentException("Key needs to be exactly 16 bytes");
        }
        if (abyte0 != null)
        {
            cacheKey = new byte[16];
            System.arraycopy(abyte0, 0, cacheKey, 0, 16);
            return;
        } else
        {
            cacheKey = null;
            return;
        }
    }

    cacheKey(cacheKey cachekey)
    {
        this();
    }
}
