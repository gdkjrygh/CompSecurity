// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class jzy
    implements jys
{

    private jyh a;
    private int b;
    private jzu c;

    jzy(jzu jzu1, jyh jyh, int i)
    {
        c = jzu1;
        a = jyh;
        b = i;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        c.a.lock();
        c.s.a(connectionresult, a, b);
        c.a.unlock();
        return;
        connectionresult;
        c.a.unlock();
        throw connectionresult;
    }
}
