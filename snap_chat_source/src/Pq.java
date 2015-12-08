// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.SecureRandom;

public final class Pq
{

    final SecureRandom mRgen;

    public Pq()
    {
        this(new SecureRandom());
    }

    private Pq(SecureRandom securerandom)
    {
        mRgen = securerandom;
    }
}
