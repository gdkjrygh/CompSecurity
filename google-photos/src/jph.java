// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.FrameLayout;

final class jph
    implements Runnable
{

    boolean a;
    private jpe b;

    jph(jpe jpe1)
    {
        a = false;
        b = jpe1;
    }

    public final void a()
    {
        kwz.a.postDelayed(this, 250L);
    }

    public final void run()
    {
        if (!a)
        {
            jpe jpe1 = b;
            long l = jpe1.d.b();
            if (jpe1.f != l && l > 0L)
            {
                if (jpe1.b())
                {
                    jpe1.b.removeView(jpe1.e);
                }
                jpe1.a("timeupdate", new String[] {
                    "time", String.valueOf((float)l / 1000F)
                });
                jpe1.f = l;
            }
            a();
        }
    }
}
