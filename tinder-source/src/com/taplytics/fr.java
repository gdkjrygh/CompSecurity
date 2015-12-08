// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            gs, em

final class fr
    implements com.github.nkzawa.b.a.a
{

    final em a;

    fr(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        gs.b("SocketIO Error", (Exception)aobj[0]);
    }
}
