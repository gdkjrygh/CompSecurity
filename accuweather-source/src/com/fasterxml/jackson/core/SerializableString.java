// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public interface SerializableString
{

    public abstract int appendQuoted(char ac[], int i);

    public abstract int appendQuotedUTF8(byte abyte0[], int i);

    public abstract int appendUnquoted(char ac[], int i);

    public abstract int appendUnquotedUTF8(byte abyte0[], int i);

    public abstract char[] asQuotedChars();

    public abstract byte[] asQuotedUTF8();

    public abstract byte[] asUnquotedUTF8();

    public abstract int charLength();

    public abstract String getValue();

    public abstract int putQuotedUTF8(ByteBuffer bytebuffer)
        throws IOException;

    public abstract int putUnquotedUTF8(ByteBuffer bytebuffer)
        throws IOException;

    public abstract int writeQuotedUTF8(OutputStream outputstream)
        throws IOException;

    public abstract int writeUnquotedUTF8(OutputStream outputstream)
        throws IOException;
}
