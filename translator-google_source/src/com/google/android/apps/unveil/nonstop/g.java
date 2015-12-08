// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;


// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            f

final class g
    implements Runnable
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void run()
    {
        f.a(a);
        f.b(a);
    }
}
