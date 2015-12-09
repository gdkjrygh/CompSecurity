// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.nio.ByteBuffer;
import java.util.Comparator;

class ak
    implements Comparator
{

    ak()
    {
    }

    public int a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
    {
        if (bytebuffer.capacity() == bytebuffer1.capacity())
        {
            return 0;
        }
        return bytebuffer.capacity() <= bytebuffer1.capacity() ? -1 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ByteBuffer)obj, (ByteBuffer)obj1);
    }
}
