// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            Source, AsyncTimeout, Buffer, Timeout

final class it>
    implements Source
{

    final AsyncTimeout this$0;
    final Source val$source;

    public final void close()
        throws IOException
    {
        val$source.close();
        exit(true);
        return;
        Object obj;
        obj;
        throw exit(((IOException) (obj)));
        obj;
        exit(false);
        throw obj;
    }

    public final long read(Buffer buffer, long l)
        throws IOException
    {
        enter();
        l = val$source.read(buffer, l);
        exit(true);
        return l;
        buffer;
        throw exit(buffer);
        buffer;
        exit(false);
        throw buffer;
    }

    public final Timeout timeout()
    {
        return AsyncTimeout.this;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(val$source).append(")").toString();
    }

    der()
    {
        this$0 = final_asynctimeout;
        val$source = Source.this;
        super();
    }
}
