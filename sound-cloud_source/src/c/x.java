// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

// Referenced classes of package c:
//            z, e

public interface x
    extends Closeable, Flushable
{

    public abstract void close()
        throws IOException;

    public abstract void flush()
        throws IOException;

    public abstract z timeout();

    public abstract void write(e e, long l)
        throws IOException;
}
