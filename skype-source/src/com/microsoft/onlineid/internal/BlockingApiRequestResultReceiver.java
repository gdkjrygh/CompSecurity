// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import com.microsoft.onlineid.internal.b.c;
import com.microsoft.onlineid.internal.sso.client.f;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.microsoft.onlineid.internal:
//            ApiRequestResultReceiver

public abstract class BlockingApiRequestResultReceiver extends ApiRequestResultReceiver
{
    public final class a
    {

        final BlockingApiRequestResultReceiver a;
        private final f b;
        private final Exception c;

        static Exception a(a a1)
        {
            return a1.c;
        }

        public final f a()
        {
            return b;
        }

        private a(PendingIntent pendingintent)
        {
            a = BlockingApiRequestResultReceiver.this;
            super();
            b = (new f()).a(pendingintent);
            c = null;
        }

        a(PendingIntent pendingintent, byte byte0)
        {
            this(pendingintent);
        }

        private a(Exception exception)
        {
            a = BlockingApiRequestResultReceiver.this;
            super();
            b = null;
            c = exception;
        }

        a(Exception exception, byte byte0)
        {
            this(exception);
        }

        private a(Object obj)
        {
            a = BlockingApiRequestResultReceiver.this;
            super();
            b = (new f()).a(obj);
            c = null;
        }

        a(Object obj, byte byte0)
        {
            this(obj);
        }
    }


    private final BlockingQueue a = new LinkedBlockingQueue();

    public BlockingApiRequestResultReceiver()
    {
        super(null);
    }

    protected final void a()
    {
        a.add(new a(new c(), (byte)0));
    }

    protected final void a(PendingIntent pendingintent)
    {
        a.add(new a(pendingintent, (byte)0));
    }

    protected final void a(Exception exception)
    {
        a.add(new a(exception, (byte)0));
    }

    protected final void a(Object obj)
    {
        a.add(new a(obj, (byte)0));
    }

    public final f b()
        throws Exception
    {
        a a1 = (a)a.take();
        if (a1 == null)
        {
            throw new IllegalStateException("Expect a result to be available.");
        }
        if (a.a(a1) != null)
        {
            throw a.a(a1);
        } else
        {
            return a1.a();
        }
    }
}
