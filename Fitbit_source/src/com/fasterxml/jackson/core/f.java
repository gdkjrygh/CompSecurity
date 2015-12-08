// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public interface f
{

    public abstract int a(OutputStream outputstream)
        throws IOException;

    public abstract int a(ByteBuffer bytebuffer)
        throws IOException;

    public abstract int a(byte abyte0[], int i);

    public abstract int a(char ac[], int i);

    public abstract String a();

    public abstract int b();

    public abstract int b(OutputStream outputstream)
        throws IOException;

    public abstract int b(ByteBuffer bytebuffer)
        throws IOException;

    public abstract int b(byte abyte0[], int i);

    public abstract int b(char ac[], int i);

    public abstract char[] c();

    public abstract byte[] d();

    public abstract byte[] e();
}
