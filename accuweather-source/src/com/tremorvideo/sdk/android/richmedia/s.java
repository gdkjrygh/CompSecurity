// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            o, ao, z, n, 
//            l

class s
    implements Runnable
{

    final o a;

    s(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        if (a.x != -1 && a.w != null)
        {
            if (a.x == 255)
            {
                a.l();
            } else
            if (a.x == 254)
            {
                a.n();
            } else
            if (a.x == 253)
            {
                a.m();
            } else
            {
                Object obj = a.w.a(a.x);
                obj = a.c.a(((ab) (obj)), a.y);
                a.a(((l) (obj)).a, ((l) (obj)).b, ((l) (obj)).f, ((l) (obj)).g);
            }
            a.f.a(0);
        }
    }
}
