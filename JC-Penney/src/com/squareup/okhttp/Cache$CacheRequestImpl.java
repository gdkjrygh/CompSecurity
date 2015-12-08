// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.ac;
import c.m;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp:
//            Cache

final class ditor
    implements CacheRequest
{

    private ac body;
    private ac cacheOut;
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

    public ac body()
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

    public ditor(com.squareup.okhttp.internal._cls1 _pcls1)
    {
        this$0 = Cache.this;
        super();
        editor = _pcls1;
        cacheOut = _pcls1.Sink(1);
        class _cls1 extends m
        {

            final Cache.CacheRequestImpl this$1;
            final com.squareup.okhttp.internal.DiskLruCache.Editor val$editor;
            final Cache val$this$0;

            public void close()
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

            _cls1(com.squareup.okhttp.internal.DiskLruCache.Editor editor1)
            {
                this$1 = Cache.CacheRequestImpl.this;
                this$0 = cache;
                editor = editor1;
                super(final_ac);
            }
        }

        body = new _cls1(_pcls1);
    }
}
