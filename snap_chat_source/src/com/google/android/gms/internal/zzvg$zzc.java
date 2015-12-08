// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzvg

static class zzaBW
{

    private Object mData;
    private Status zzHb;
    private long zzaBW;

    public void zzD(Object obj)
    {
        mData = obj;
    }

    public void zzJ(long l)
    {
        zzaBW = l;
    }

    public void zzaO(Status status)
    {
        zzHb = status;
    }

    public long zzum()
    {
        return zzaBW;
    }

    public (Status status, Object obj, long l)
    {
        zzHb = status;
        mData = obj;
        zzaBW = l;
    }
}
