// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.Closeable;
import java.io.IOException;

// Referenced classes of package okio:
//            Buffer, Timeout

public interface Source
    extends Closeable
{

    public abstract void close()
        throws IOException;

    public abstract long read(Buffer buffer, long l)
        throws IOException;

    public abstract Timeout timeout();
}
