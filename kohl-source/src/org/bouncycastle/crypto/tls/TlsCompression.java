// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression
{

    public abstract OutputStream compress(OutputStream outputstream);

    public abstract OutputStream decompress(OutputStream outputstream);
}
