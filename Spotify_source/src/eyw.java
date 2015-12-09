// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.party.view.ModeTunerView;

public final class eyw
    implements Runnable
{

    public float a;
    public int b;
    public final ModeTunerView c;
    private long d;

    private eyw(ModeTunerView modetunerview)
    {
        c = modetunerview;
        super();
    }

    public eyw(ModeTunerView modetunerview, byte byte0)
    {
        this(modetunerview);
    }

    public final void a()
    {
        c.removeCallbacks(this);
        km.a(c, this);
    }

    public final void run()
    {
        if (ModeTunerView.c(c) != com.spotify.mobile.android.spotlets.party.view.ModeTunerView.TouchState.a)
        {
            return;
        }
        float f;
        float f1;
        float f2;
        float f3;
        int i;
        int j;
        long l;
        if (b != 0x80000000)
        {
            i = b;
        } else
        {
            i = Math.max(0, Math.min(ModeTunerView.b(c) - 1, Math.round(ModeTunerView.a(c))));
        }
        j = c.getWidth() / ModeTunerView.b(c);
        f1 = ModeTunerView.a(c);
        f2 = i;
        f3 = j;
        if (ModeTunerView.a(c) < 0.0F || ModeTunerView.a(c) > (float)(ModeTunerView.b(c) - 1))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            f = 40F;
        } else
        {
            f = 20F;
        }
        f = f * -a + -120F * (f3 * (f1 - f2));
        l = gcf.a();
        f1 = (float)Math.min(l - d, 50L) / 1000F;
        d = l;
        a = a + f * f1;
        c.removeCallbacks(this);
        if (Math.abs(f) > 20F)
        {
            km.a(c, this);
        } else
        {
            ModeTunerView.a(c, Math.round(ModeTunerView.a(c)));
        }
        ModeTunerView.b(c, ModeTunerView.a(c) + (f1 * a) / (float)j);
        c.invalidate();
    }
}
