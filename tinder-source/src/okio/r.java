// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.Closeable;
import java.io.IOException;

// Referenced classes of package okio:
//            c, s

public interface r
    extends Closeable
{

    public abstract long a(c c, long l)
        throws IOException;

    public abstract void close()
        throws IOException;

    public abstract s q_();
}
