// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class jzq
    implements jyq, jys
{

    private jzf a;

    jzq(jzf jzf1)
    {
        a = jzf1;
        super();
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        a.d.a(new jzj(a));
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
