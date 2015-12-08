// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.b.c;
import com.nuance.dragon.toolkit.b.e;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.b:
//            fq, ax, gc, fr, 
//            dv, v, az, gh, 
//            gb

final class ga extends fq
{

    final String c;
    final String d;
    final String e;
    final gh f;
    private c g;
    private ax h;
    private com.nuance.dragon.toolkit.audio.b i;

    public ga(gh gh1, String s, dv dv1, String s1, String s2, b b1)
    {
        super(dv1, b1);
        h = new ax();
        f = gh1;
        c = s;
        g = new gc(b1);
        d = s1;
        e = s2;
    }

    static c a(ga ga1)
    {
        return ga1.g;
    }

    static com.nuance.dragon.toolkit.audio.b a(ga ga1, com.nuance.dragon.toolkit.audio.b b1)
    {
        ga1.i = b1;
        return b1;
    }

    public final com.nuance.dragon.toolkit.audio.b a()
    {
        com.nuance.b.b.fr.e("CloudVocalizerPrompt.getAudioSource");
        long l = b.b();
        Object obj2 = c;
        dv dv1 = a;
        Object obj = d;
        Object obj1 = e;
        e e1 = new e();
        e1.a("tts_input", ((String) (obj2)));
        e1.a("tts_type", dv1.toString());
        obj2 = ax.a(l);
        if (obj != null)
        {
            ((e) (obj2)).a("tts_voice", ((String) (obj)));
        }
        if (obj1 != null)
        {
            ((e) (obj2)).a("tts_language", ((String) (obj1)));
        }
        obj = new com.nuance.dragon.toolkit.a.b.e("NINA_TTS_CMD", ((e) (obj2)), "TEXT_TO_READ", e1, v.r().j().w());
        obj1 = new CountDownLatch(1);
        gh.d().post(new gb(this, ((com.nuance.dragon.toolkit.a.b.e) (obj)), ((CountDownLatch) (obj1))));
        try
        {
            ((CountDownLatch) (obj1)).await();
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        obj = i;
        i = null;
        com.nuance.b.b.fr.e((new StringBuilder("CloudVocalizerPrompt getAudioSource ")).append(obj).toString());
        return ((com.nuance.dragon.toolkit.audio.b) (obj));
    }
}
