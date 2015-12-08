// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import com.android.slyce.h.a;
import com.android.slyce.k.i;

// Referenced classes of package com.android.slyce.j:
//            a, g

class f
    implements Runnable
{

    final com.android.slyce.j.a a;

    f(com.android.slyce.j.a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        android.graphics.Bitmap bitmap = i.a(a.a.g());
        com.android.slyce.c.a.a(com.android.slyce.j.a.e(a)).a(bitmap, new g(this));
    }
}
