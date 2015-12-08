// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.x509.ReasonFlags;

class ReasonsMask
{

    static final ReasonsMask allReasons = new ReasonsMask(33023);
    private int _reasons;

    ReasonsMask()
    {
        this(0);
    }

    private ReasonsMask(int i)
    {
        _reasons = i;
    }

    ReasonsMask(ReasonFlags reasonflags)
    {
        _reasons = reasonflags.intValue();
    }

    void addReasons(ReasonsMask reasonsmask)
    {
        _reasons = _reasons | reasonsmask.getReasons();
    }

    int getReasons()
    {
        return _reasons;
    }

    boolean hasNewReasons(ReasonsMask reasonsmask)
    {
        return (_reasons | reasonsmask.getReasons() ^ _reasons) != 0;
    }

    ReasonsMask intersect(ReasonsMask reasonsmask)
    {
        ReasonsMask reasonsmask1 = new ReasonsMask();
        reasonsmask1.addReasons(new ReasonsMask(_reasons & reasonsmask.getReasons()));
        return reasonsmask1;
    }

    boolean isAllReasons()
    {
        return _reasons == allReasons._reasons;
    }

}
