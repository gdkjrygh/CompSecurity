// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.media.MediaPlayer;
import com.pandora.radio.data.aa;
import com.pandora.radio.util.i;

// Referenced classes of package p.dg:
//            m

class .Object
    implements Runnable
{

    final m a;

    public void run()
    {
        float f = 1.0F;
        String s;
        if (a.a != null)
        {
            if (!i.a(s = m.b(a).F()))
            {
                float f2 = Float.parseFloat(s);
                float f1 = (float)Math.pow(10D, f2 / 100F) * 0.95F;
                a.a(String.format("gain=%s; adjusted track volume=%s", new Object[] {
                    Float.valueOf(f2), Float.valueOf(f1)
                }));
                if (f1 <= 1.0F)
                {
                    f = f1;
                }
                try
                {
                    a.a.setVolume(f, f);
                    return;
                }
                catch (Exception exception)
                {
                    m.a(a, "Exception setting volume", exception);
                }
                return;
            }
        }
    }

    n(m m1)
    {
        a = m1;
        super();
    }
}
