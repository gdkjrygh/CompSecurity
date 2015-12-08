// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.io;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.io:
//            HttpTransportMetrics

public interface SessionOutputBuffer
{

    public abstract void flush();

    public abstract HttpTransportMetrics getMetrics();

    public abstract void write(int i);

    public abstract void write(byte abyte0[]);

    public abstract void write(byte abyte0[], int i, int j);

    public abstract void writeLine(String s);

    public abstract void writeLine(CharArrayBuffer chararraybuffer);
}
