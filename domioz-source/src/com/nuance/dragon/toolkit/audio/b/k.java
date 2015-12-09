// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import java.util.ArrayList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a

final class k
    implements Runnable
{

    final ArrayList a;
    final a b;

    k(a a1, ArrayList arraylist)
    {
        b = a1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
