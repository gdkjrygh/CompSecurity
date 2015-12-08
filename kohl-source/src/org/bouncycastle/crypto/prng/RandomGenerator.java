// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


public interface RandomGenerator
{

    public abstract void addSeedMaterial(long l);

    public abstract void addSeedMaterial(byte abyte0[]);

    public abstract void nextBytes(byte abyte0[]);

    public abstract void nextBytes(byte abyte0[], int i, int j);
}
