// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsAuthentication, TlsCipher, ProtocolVersion, TlsCompression, 
//            TlsKeyExchange, TlsClientContext

public interface TlsClient
{

    public abstract TlsAuthentication getAuthentication()
        throws IOException;

    public abstract TlsCipher getCipher()
        throws IOException;

    public abstract int[] getCipherSuites();

    public abstract Hashtable getClientExtensions()
        throws IOException;

    public abstract ProtocolVersion getClientVersion();

    public abstract TlsCompression getCompression()
        throws IOException;

    public abstract short[] getCompressionMethods();

    public abstract TlsKeyExchange getKeyExchange()
        throws IOException;

    public abstract void init(TlsClientContext tlsclientcontext);

    public abstract void notifySecureRenegotiation(boolean flag)
        throws IOException;

    public abstract void notifySelectedCipherSuite(int i);

    public abstract void notifySelectedCompressionMethod(short word0);

    public abstract void notifyServerVersion(ProtocolVersion protocolversion)
        throws IOException;

    public abstract void notifySessionID(byte abyte0[]);

    public abstract void processServerExtensions(Hashtable hashtable);
}
