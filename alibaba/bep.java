// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;

public final class bep
{

    private final Set a = new LinkedHashSet();

    public bep()
    {
    }

    public void a(beo beo1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(beo1);
        this;
        JVM INSTR monitorexit ;
        return;
        beo1;
        throw beo1;
    }

    public void a(beo beo1, IOException ioexception)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(beo1);
        if (!(ioexception instanceof SSLHandshakeException))
        {
            a.add(beo1.d());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        beo1;
        throw beo1;
    }

    public boolean b(beo beo1)
    {
        this;
        JVM INSTR monitorenter ;
        if (beo1.b().e()) goto _L2; else goto _L1
_L1:
        boolean flag = a.contains(beo1);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        beo1;
        throw beo1;
    }
}
