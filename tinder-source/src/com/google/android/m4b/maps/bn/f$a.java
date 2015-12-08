// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.bm.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            f

public static final class nit> extends f
{

    public final void a(ByteBuffer bytebuffer)
    {
        throw new UnsupportedOperationException("Immutable");
    }

    public final void b(d d)
    {
        throw new UnsupportedOperationException("Immutable");
    }

    public tion(float af[])
    {
        super(9);
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
        bytebuffer.asFloatBuffer().put(af);
        super.a(bytebuffer);
    }
}
