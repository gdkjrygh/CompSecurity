// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface BlockCipherPadding
{

    public abstract int addPadding(byte abyte0[], int i);

    public abstract String getPaddingName();

    public abstract void init(SecureRandom securerandom)
        throws IllegalArgumentException;

    public abstract int padCount(byte abyte0[])
        throws InvalidCipherTextException;
}
