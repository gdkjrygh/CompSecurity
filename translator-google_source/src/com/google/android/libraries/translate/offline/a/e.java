// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;


// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            d, a

final class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        a.b.c();
        a.b.a(a.c, a.d);
        a.b.notifyDataSetChanged();
    }
}
