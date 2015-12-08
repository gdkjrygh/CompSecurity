// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.al;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.l;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bm, fx

final class fw extends l
{

    private static e a;
    private static final byte e[] = {
        82, 73, 70, 70, 0, 0, 0, 0, 87, 65, 
        86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 
        1, 0, 1, 0, 64, 31, 0, 0, -128, 62, 
        0, 0, 2, 0, 16, 0, 100, 97, 116, 97, 
        0, 0, 0, 0
    };
    private ByteArrayOutputStream b;
    private bm c;
    private final com.nuance.b.c.b d;
    private ExecutorService f;

    public final void a()
    {
        fr.a("AudioCollector framesDropped");
    }

    public final void a(b b1)
    {
        Object obj = b1.e(this);
        b1 = b;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (g)((Iterator) (obj)).next();
            if (((g) (obj1)).c != null)
            {
                obj1 = ((g) (obj1)).c;
                int k = obj1.length;
                int i = 0;
                while (i < k) 
                {
                    short word0 = obj1[i];
                    b1.write(word0 & 0xff);
                    b1.write((word0 & 0xff00) >> 8);
                    i++;
                }
            } else
            {
                byte abyte0[] = ((g) (obj1)).b;
                int i1 = abyte0.length;
                int j = 0;
                while (j < i1) 
                {
                    b1.write(abyte0[j]);
                    j++;
                }
            }
        }

    }

    public final void b()
    {
        if (c != null)
        {
            com.nuance.b.b.fr.e("AudioCollector: recorder.stop");
            c.d();
        }
    }

    public final void b(b b1)
    {
        h();
        com.nuance.b.b.fr.e((new StringBuilder("AudioCollector sink sourceClosed ")).append(b.size()).append(" bytes collected.").toString());
        b1 = b.toByteArray();
        b = null;
        if (b1.length <= 44)
        {
            d.b(new ak(d.b(), al.e, "Audio collect error"));
            return;
        } else
        {
            int i = b1.length - 44;
            int j = i + 36;
            b1[4] = (byte)(j & 0xff);
            b1[5] = (byte)((j & 0xff00) >> 8);
            b1[6] = (byte)((j & 0xff0000) >> 16);
            b1[7] = (byte)((j & 0xff000000) >> 24);
            b1[40] = (byte)(i & 0xff);
            b1[41] = (byte)((i & 0xff00) >> 8);
            b1[42] = (byte)((i & 0xff0000) >> 16);
            b1[43] = (byte)((i & 0xff000000) >> 24);
            f.execute(new fx(c, d, b1));
            return;
        }
    }

    static 
    {
        a = e.f;
    }
}
