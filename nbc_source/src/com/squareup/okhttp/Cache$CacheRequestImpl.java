// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import java.io.IOException;
import okio.ForwardingSink;
import okio.Sink;

// Referenced classes of package com.squareup.okhttp:
//            Cache

private final class ditor
    implements CacheRequest
{

    private Sink body;
    private Sink cacheOut;
    private boolean done;
    private final com.squareup.okhttp.internal.rt editor;
    final Cache this$0;

    public void abort()
    {
label0:
        {
            synchronized (Cache.this)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        done = true;
        Cache.access$908(Cache.this);
        obj;
        JVM INSTR monitorexit ;
        Util.closeQuietly(cacheOut);
        try
        {
            editor.rt();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Sink body()
    {
        return body;
    }



/*
    static boolean access$702(ditor ditor, boolean flag)
    {
        ditor.done = flag;
        return flag;
    }

*/

    public ditor(com.squareup.okhttp.internal.tor tor)
        throws IOException
    {
        this$0 = Cache.this;
        super();
        editor = tor;
        cacheOut = tor.Sink(1);
        body = new ForwardingSink(tor) {

            final Cache.CacheRequestImpl this$1;
            final com.squareup.okhttp.internal.DiskLruCache.Editor val$editor;
            final Cache val$this$0;

            public void close()
                throws IOException
            {
label0:
                {
                    synchronized (Cache.CacheRequestImpl.this.this$0)
                    {
                        if (!done)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                done = true;
                Cache.access$808(Cache.CacheRequestImpl.this.this$0);
                cache1;
                JVM INSTR monitorexit ;
                super.close();
                editor.commit();
                return;
                exception;
                cache1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$1 = Cache.CacheRequestImpl.this;
                this$0 = cache;
                editor = editor1;
                super(final_sink);
            }
        };
    }
}
