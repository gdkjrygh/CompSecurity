// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;
import com.facebook.common.executors.AndroidThreadUtil;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class <init>
    implements Runnable
{

    final TextureViewImplementation a;
    private final Object b;
    private int c;
    private boolean d;

    public final void a()
    {
        synchronized (b)
        {
            d = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (b)
        {
            d = true;
        }
        c = TextureViewImplementation.m(a).getCurrentPosition();
        TextureViewImplementation.p(a).schedule(this, 50L, TimeUnit.MILLISECONDS);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
label0:
        {
            synchronized (b)
            {
                if (d)
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        if (TextureViewImplementation.m(a).getCurrentPosition() > c)
        {
            TextureViewImplementation.a(a, -1);
            a();
            class _cls1
                implements Runnable
            {

                final TextureViewImplementation.AdvanceCheck a;

                public void run()
                {
                    TextureViewImplementation.a(a.a, false);
                }

            _cls1()
            {
                a = TextureViewImplementation.AdvanceCheck.this;
                super();
            }
            }

            TextureViewImplementation.a(a).a(new _cls1());
            return;
        } else
        {
            TextureViewImplementation.p(a).schedule(this, 50L, TimeUnit.MILLISECONDS);
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _cls1(TextureViewImplementation textureviewimplementation)
    {
        a = textureviewimplementation;
        super();
        b = new Object();
    }

    b(TextureViewImplementation textureviewimplementation, byte byte0)
    {
        this(textureviewimplementation);
    }
}
