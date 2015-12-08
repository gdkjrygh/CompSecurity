// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class lfr
{

    final Status a;
    final lfs b;
    final byte c[];
    public final long d;
    final lfh e;
    public final lfv f;

    public lfr(Status status, lfh lfh, lfs lfs)
    {
        this(status, lfh, null, null, lfs, 0L);
    }

    public lfr(Status status, lfh lfh, byte abyte0[], lfv lfv, lfs lfs, long l)
    {
        a = status;
        e = lfh;
        c = abyte0;
        f = lfv;
        b = lfs;
        d = l;
    }
}
