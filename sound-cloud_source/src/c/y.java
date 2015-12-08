// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.Closeable;
import java.io.IOException;

// Referenced classes of package c:
//            e, z

public interface y
    extends Closeable
{

    public abstract long a(e e, long l)
        throws IOException;

    public abstract void close()
        throws IOException;

    public abstract z timeout();
}
