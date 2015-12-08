// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;


// Referenced classes of package com.pandora.android.ads:
//            c, a

class a
    implements com.pandora.android.util.
{

    final c a;

    public void a(int i)
    {
        if (c.l(a) > System.currentTimeMillis())
        {
            c.a(a, 0L);
            c.d("skipping volume change because it is too soon since the last headset event");
        } else
        if (c.m(a) != i)
        {
            a a1 = c.n(a);
            if (a1 != null && c.a(a, "test_volume_change", a1, false))
            {
                a.a(a1.d, "volume_change", false);
            }
            c.a(a, i);
            return;
        }
    }

    a(c c1)
    {
        a = c1;
        super();
    }
}
