// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.media.MediaPlayer;

// Referenced classes of package p.dg:
//            m

class .Object
    implements Runnable
{

    final m a;

    public void run()
    {
        while (!m.j(a) || !m.h(a) || !m.g(a) || a.a == null || !a.t()) 
        {
            return;
        }
        a.a("PAUSE");
        try
        {
            a.a.pause();
            m.o(a);
            return;
        }
        catch (Exception exception)
        {
            m.a(a, (new StringBuilder()).append("Error during togglepause ").append(exception.getMessage()).toString(), -1, -1);
        }
    }

    n(m m1)
    {
        a = m1;
        super();
    }
}
