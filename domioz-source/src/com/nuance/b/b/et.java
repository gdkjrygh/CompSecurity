// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.af;
import com.nuance.b.b.a.ai;
import com.nuance.b.b.a.aj;
import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            es, fr, v, az, 
//            eu, ev

final class et
{

    Resources a;
    MediaPlayer b;
    b c;
    es d;

    public et(es es1, Resources resources)
    {
        a = resources;
        d = es1;
    }

    static void a(et et1)
    {
        et1.c();
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        c.d(new ai(c.b()));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(et et1)
    {
        et1.d();
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        d();
        boolean flag = d.a();
        c.a(new aj(c.b(), flag));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.release();
            b = null;
            fr.e("Local file playing resources released");
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null && b.isPlaying())
        {
            fr.c("Cancelling local audio");
            b.stop();
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(b b1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        b = new MediaPlayer();
        az az1 = v.r().j();
        b.setAudioStreamType(az1.x());
        c = b1;
        AssetFileDescriptor assetfiledescriptor = null;
        AssetFileDescriptor assetfiledescriptor1 = a.openRawResourceFd(i);
        assetfiledescriptor = assetfiledescriptor1;
        b.setOnCompletionListener(new eu(this));
        b.setOnErrorListener(new ev(this, b1, i));
        b.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getDeclaredLength());
        b.prepare();
        b.start();
        b();
        fr.e((new StringBuilder("Started playing local audio file (")).append(i).append(")").toString());
        if (assetfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        assetfiledescriptor.close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        fr.a((new StringBuilder("Unable to close audio file (")).append(i).append(")  Reason: ").append(b1).toString());
          goto _L1
        b1;
        throw b1;
        Exception exception1;
        exception1;
_L6:
        fr.a((new StringBuilder("Unable to play audio for Android resource id ")).append(i).append("  Reason: ").append(exception1).toString());
        d();
        boolean flag = d.a();
        b1.b(new ae(b1.b(), af.f, exception1, (new StringBuilder("Unable to play audio for Android resource id ")).append(i).toString(), flag));
        if (assetfiledescriptor == null) goto _L1; else goto _L2
_L2:
        assetfiledescriptor.close();
          goto _L1
        b1;
        fr.a((new StringBuilder("Unable to close audio file (")).append(i).append(")  Reason: ").append(b1).toString());
          goto _L1
        b1;
        assetfiledescriptor = null;
_L5:
        if (assetfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        assetfiledescriptor.close();
_L3:
        throw b1;
        Exception exception;
        exception;
        fr.a((new StringBuilder("Unable to close audio file (")).append(i).append(")  Reason: ").append(exception).toString());
          goto _L3
        b1;
        continue; /* Loop/switch isn't completed */
        b1;
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
          goto _L6
    }
}
