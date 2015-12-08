// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;


public interface Translator
{

    public abstract int decode(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract int encode(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract int getDecodedBlockSize();

    public abstract int getEncodedBlockSize();
}
