// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.aj;
import com.android.slyce.a.ap;
import com.android.slyce.a.av;
import java.nio.ByteBuffer;

public class e extends av
{

    public e(ap ap)
    {
        super(ap);
    }

    public void a()
    {
        a(0x7fffffff);
        a(new aj());
        a(0);
    }

    public aj b(aj aj1)
    {
        aj1.b(ByteBuffer.wrap((new StringBuilder()).append(Integer.toString(aj1.d(), 16)).append("\r\n").toString().getBytes()));
        aj1.a(ByteBuffer.wrap("\r\n".getBytes()));
        return aj1;
    }
}
