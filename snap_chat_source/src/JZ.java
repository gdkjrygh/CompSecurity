// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.cache.DiskCacheMissReason;

public final class JZ
{

    public final byte bytes[];
    public final DiskCacheMissReason missReason;

    public JZ(DiskCacheMissReason diskcachemissreason)
    {
        bytes = null;
        missReason = diskcachemissreason;
    }

    public JZ(byte abyte0[])
    {
        bytes = abyte0;
        missReason = null;
    }
}
