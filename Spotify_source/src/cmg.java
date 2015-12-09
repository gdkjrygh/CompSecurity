// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class cmg
    implements bqw, bqx
{

    private clz a;

    private cmg(clz clz1)
    {
        a = clz1;
        super();
    }

    cmg(clz clz1, byte byte0)
    {
        this(clz1);
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        a.d.a(new cmb(a));
    }

    public final void a(ConnectionResult connectionresult)
    {
        a.b.lock();
        if (!a.a(connectionresult)) goto _L2; else goto _L1
_L1:
        a.i();
        a.h();
_L4:
        a.b.unlock();
        return;
_L2:
        a.b(connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        a.b.unlock();
        throw connectionresult;
    }
}
