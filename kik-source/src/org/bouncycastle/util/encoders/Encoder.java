// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.OutputStream;

public interface Encoder
{

    public abstract int a(String s, OutputStream outputstream);

    public abstract int a(byte abyte0[], int i, int j, OutputStream outputstream);

    public abstract int a(byte abyte0[], int i, OutputStream outputstream);
}
