// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.BassBoost;
import android.media.audiofx.Equalizer;
import android.media.audiofx.PresetReverb;
import android.media.audiofx.Virtualizer;
import com.arist.b.a;
import com.arist.model.b.b;
import java.util.ArrayList;

// Referenced classes of package com.arist.model.equize:
//            k

public final class j
{

    private static j h;
    public Equalizer a;
    public Virtualizer b;
    public BassBoost c;
    public PresetReverb d;
    public k e;
    private Context f;
    private b g;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final short n[];

    private j()
    {
        i = false;
        short aword0[] = new short[7];
        aword0[1] = 1;
        aword0[2] = 2;
        aword0[3] = 3;
        aword0[4] = 4;
        aword0[5] = 5;
        aword0[6] = 6;
        n = aword0;
    }

    public static j a()
    {
        if (h == null)
        {
            h = new j();
        }
        return h;
    }

    private void a(AudioEffect audioeffect)
    {
        if (audioeffect == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        a(audioeffect, false);
        audioeffect.release();
        return;
        audioeffect;
        audioeffect.printStackTrace();
        return;
    }

    private void a(AudioEffect audioeffect, boolean flag)
    {
        try
        {
            if (audioeffect.getEnabled() != flag)
            {
                audioeffect.setEnabled(flag);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AudioEffect audioeffect)
        {
            a(((Exception) (audioeffect)));
        }
    }

    private void a(Exception exception)
    {
        exception.printStackTrace();
        i = false;
        c();
    }

    public final void a(double d1)
    {
        e.b((float)d1);
        c.setStrength((short)(int)((double)m * d1));
    }

    public final void a(int i1)
    {
        try
        {
            e.b(i1);
            d.getProperties();
            android.media.audiofx.PresetReverb.Settings settings = new android.media.audiofx.PresetReverb.Settings();
            settings.preset = n[i1];
            d.setProperties(settings);
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    public final void a(int i1, int j1)
    {
        a.setBandLevel((short)i1, (short)j1);
    }

    public final void a(Context context, int i1)
    {
        c();
        try
        {
            f = context.getApplicationContext();
            g = new b(f);
            e = new k(f);
            a = new Equalizer(13, i1);
            b = new Virtualizer(13, i1);
            c = new BassBoost(13, i1);
            d = new PresetReverb(13, i1);
            j = a.getBandLevelRange()[1];
            k = a.getBandLevelRange()[0];
            m = c.getRoundedStrength();
            l = b.getRoundedStrength();
            a(true);
            a(b());
            a(e.e());
            b(e.d());
            a(e.c());
            i = true;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a(((Exception) (context)));
        }
        if (i)
        {
            a(e.b());
        }
    }

    public final void a(a a1)
    {
        boolean flag = false;
        e.a(a1.g);
        int i1;
        if (a1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = a1.b;
        }
        a(0, i1);
        if (a1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = a1.c;
        }
        a(1, i1);
        if (a1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = a1.d;
        }
        a(2, i1);
        if (a1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = a1.e;
        }
        a(3, i1);
        if (a1 == null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = a1.f;
        }
        a(4, i1);
    }

    public final void a(boolean flag)
    {
        e.a(flag);
        a(((AudioEffect) (b)), flag);
        a(((AudioEffect) (c)), flag);
        a(((AudioEffect) (d)), flag);
        a(((AudioEffect) (a)), flag);
    }

    public final a b()
    {
        return g.a(e.a());
    }

    public final void b(double d1)
    {
        e.a((float)d1);
        b.setStrength((short)(int)((double)l * d1));
    }

    public final void b(a a1)
    {
        g.c(a1);
        e.a(a1.g);
    }

    public final void c()
    {
        a(a);
        a(b);
        a(c);
        a(d);
        e = null;
        f = null;
        g = null;
    }

    public final void c(a a1)
    {
        g.b(a1);
        if (e.a() == a1.g)
        {
            e.a(1);
        }
    }

    public final int d()
    {
        return j;
    }

    public final void d(a a1)
    {
        g.a(a1);
    }

    public final boolean e()
    {
        return i;
    }

    public final ArrayList f()
    {
        return g.b();
    }

    public final ArrayList g()
    {
        return g.a();
    }
}
