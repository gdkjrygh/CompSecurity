// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.Closeable;
import java.io.Flushable;

// Referenced classes of package okio:
//            Timeout, Buffer

public interface Sink
    extends Closeable, Flushable
{

    public abstract void close();

    public abstract void flush();

    public abstract Timeout timeout();

    public abstract void write(Buffer buffer, long l);
}
