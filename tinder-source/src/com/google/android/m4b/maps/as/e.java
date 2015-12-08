// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.nio.ShortBuffer;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.as:
//            a, c

public final class e extends a
{

    private static final c e = new c() {

        protected final Object a()
        {
            return new short[2058];
        }

    };

    public e(int i)
    {
        super(i, 11, e);
    }

    public final void a(ShortBuffer shortbuffer)
    {
        for (int i = 0; i < b; i++)
        {
            shortbuffer.put((short[])a.get(i), 0, 2048);
        }

        if (b != a.size())
        {
            shortbuffer.put((short[])c, 0, d);
        }
    }

}
