// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            em

final class fo
    implements Runnable
{

    final String a;
    final em b;

    fo(em em1, String s)
    {
        b = em1;
        a = s;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
