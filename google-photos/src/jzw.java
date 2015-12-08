// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

final class jzw
    implements jyq
{

    private jzu a;

    jzw(jzu jzu1)
    {
        a = jzu1;
        super();
    }

    public final void a(int i)
    {
        a.a.lock();
        a.s.a(i);
        a.a.unlock();
        return;
        Exception exception;
        exception;
        a.a.unlock();
        throw exception;
    }

    public final void a(Bundle bundle)
    {
        a.a.lock();
        a.s.a(bundle);
        a.a.unlock();
        return;
        bundle;
        a.a.unlock();
        throw bundle;
    }
}
