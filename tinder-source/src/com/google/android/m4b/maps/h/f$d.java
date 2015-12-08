// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Bundle;
import com.google.android.m4b.maps.dd.c;
import com.google.android.m4b.maps.g.a;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f

final class <init>
    implements <init>, <init>
{

    private f a;

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        a.d.a(new <init>(a));
    }

    public final void a(a a1)
    {
        a.b.lock();
        if (!a.a(a1)) goto _L2; else goto _L1
_L1:
        a.h();
        a.g();
_L4:
        a.b.unlock();
        return;
_L2:
        a.b(a1);
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        a.b.unlock();
        throw a1;
    }

    private (f f1)
    {
        a = f1;
        super();
    }

    a(f f1, byte byte0)
    {
        this(f1);
    }
}
