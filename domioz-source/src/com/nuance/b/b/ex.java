// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.a.l;
import com.nuance.dragon.toolkit.audio.b.a;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.f;

// Referenced classes of package com.nuance.b.b:
//            fr, eo, v, az, 
//            fq, es, ez

final class ex
{

    Handler a;
    es b;
    ez c;
    private a d;

    public ex(es es, Handler handler)
    {
        b = es;
        a = handler;
    }

    private void a(int i, e e1)
    {
        this;
        JVM INSTR monitorenter ;
        com.nuance.b.b.fr.e("NMT Prompt: createPlayerSink()...");
        d = new eo(i, e1, c);
        com.nuance.b.b.fr.e("NMT Prompt: Player sink created");
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(fq fq1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        az az1;
        az1 = v.r().j();
        obj1 = az1.w();
        com.nuance.b.b.fr.e((new StringBuilder("NMT audio source type: ")).append(((e) (obj1)).l).append("  ").append(((e) (obj1)).m).toString());
        obj = fq1.a();
        if (((e) (obj1)).m != f.b)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (obj1 != e.g) goto _L2; else goto _L1
_L1:
        fq1 = e.d;
_L3:
        com.nuance.b.b.fr.e("Creating SPEEX decoder");
        obj1 = new l();
        ((l) (obj1)).a(((com.nuance.dragon.toolkit.audio.b) (obj)));
        obj = obj1;
_L4:
        if (d == null)
        {
            a(az1.x(), ((e) (fq1)));
        }
        d.d(((com.nuance.dragon.toolkit.audio.b) (obj)));
        d.a(c);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fq1 = e.f;
          goto _L3
        fq1;
        throw fq1;
        fq1 = ((fq) (obj1));
          goto _L4
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            com.nuance.b.b.fr.f("NMT Prompt: disconnecting playerSink");
            d.h();
            com.nuance.b.b.fr.f("NMT Prompt: disconnectAudioSource returned, calling stop");
            d.b();
            com.nuance.b.b.fr.e("NMT Prompt: stopPlaying returned");
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
