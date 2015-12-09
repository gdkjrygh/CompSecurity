// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            Sink, AsyncTimeout, Timeout, Buffer

final class it>
    implements Sink
{

    final AsyncTimeout this$0;
    final Sink val$sink;

    public final void close()
        throws IOException
    {
        enter();
        val$sink.close();
        exit(true);
        return;
        Object obj;
        obj;
        throw exit(((IOException) (obj)));
        obj;
        exit(false);
        throw obj;
    }

    public final void flush()
        throws IOException
    {
        enter();
        val$sink.flush();
        exit(true);
        return;
        Object obj;
        obj;
        throw exit(((IOException) (obj)));
        obj;
        exit(false);
        throw obj;
    }

    public final Timeout timeout()
    {
        return AsyncTimeout.this;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.sink(")).append(val$sink).append(")").toString();
    }

    public final void write(Buffer buffer, long l)
        throws IOException
    {
        enter();
        val$sink.write(buffer, l);
        exit(true);
        return;
        buffer;
        throw exit(buffer);
        buffer;
        exit(false);
        throw buffer;
    }

    der()
    {
        this$0 = final_asynctimeout;
        val$sink = Sink.this;
        super();
    }
}
