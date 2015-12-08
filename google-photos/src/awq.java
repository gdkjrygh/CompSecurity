// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Queue;

final class awq
{

    private final Queue a = bag.a(0);

    awq()
    {
    }

    public final amy a(ByteBuffer bytebuffer)
    {
        this;
        JVM INSTR monitorenter ;
        amy amy2 = (amy)a.poll();
        amy amy1;
        amy1 = amy2;
        if (amy2 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        amy1 = new amy();
        bytebuffer = amy1.a(bytebuffer);
        this;
        JVM INSTR monitorexit ;
        return bytebuffer;
        bytebuffer;
        throw bytebuffer;
    }

    public final void a(amy amy1)
    {
        this;
        JVM INSTR monitorenter ;
        amy1.a = null;
        amy1.b = null;
        a.offer(amy1);
        this;
        JVM INSTR monitorexit ;
        return;
        amy1;
        throw amy1;
    }
}
