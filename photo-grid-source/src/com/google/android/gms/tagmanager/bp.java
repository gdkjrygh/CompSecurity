// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            bn, i

final class bp
    implements Runnable
{

    final i a;
    final bn b;

    bp(bn bn1, i j)
    {
        b = bn1;
        a = j;
        super();
    }

    public final void run()
    {
        a.a(bn.a(b));
    }
}
