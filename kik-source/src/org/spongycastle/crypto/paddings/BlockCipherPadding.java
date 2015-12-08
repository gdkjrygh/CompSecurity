// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;

public interface BlockCipherPadding
{

    public abstract int a(byte abyte0[]);

    public abstract int a(byte abyte0[], int i);

    public abstract void a(SecureRandom securerandom);
}
