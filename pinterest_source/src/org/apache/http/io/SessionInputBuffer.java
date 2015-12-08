// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.io;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.io:
//            HttpTransportMetrics

public interface SessionInputBuffer
{

    public abstract HttpTransportMetrics getMetrics();

    public abstract boolean isDataAvailable(int i);

    public abstract int read();

    public abstract int read(byte abyte0[]);

    public abstract int read(byte abyte0[], int i, int j);

    public abstract int readLine(CharArrayBuffer chararraybuffer);

    public abstract String readLine();
}
