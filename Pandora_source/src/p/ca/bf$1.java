// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import p.df.a;

// Referenced classes of package p.ca:
//            bf

class Object
    implements Runnable
{

    final bf a;

    public void run()
    {
        while (a.k() || a.getActivity() == null || a.q || p.ca.bf.a(a) > System.currentTimeMillis()) 
        {
            return;
        }
        a.u = true;
        p.df.a.c("VIDEO AD", "load timed out");
        a.a("Timeout waiting for video to load", 1, 0);
    }

    System(bf bf1)
    {
        a = bf1;
        super();
    }
}
