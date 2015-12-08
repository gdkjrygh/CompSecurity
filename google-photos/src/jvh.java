// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class jvh
    implements jyq
{

    private jva a;

    jvh(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void a(int i)
    {
        jva.b().c(String.format("[Instance: %s] ConnectionSuspended %d", new Object[] {
            this, Integer.valueOf(i)
        }), new Object[0]);
    }

    public final void a(Bundle bundle)
    {
        jva.a(a, "onConnected");
        jva.f(a);
    }
}
