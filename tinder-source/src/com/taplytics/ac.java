// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            ah, ab

final class ac
    implements Runnable
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public final void run()
    {
        (new ah(a.a, (byte)0)).execute(new Void[0]);
    }
}
