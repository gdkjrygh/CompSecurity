// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class k
{

    public static FloatBuffer a(float af[])
    {
        FloatBuffer floatbuffer = ByteBuffer.allocateDirect(af.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < af.length; i++)
        {
            floatbuffer.put(i, af[i]);
        }

        floatbuffer.position(0);
        return floatbuffer;
    }
}
