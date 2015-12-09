// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

final class ang.Object
    implements bqw
{

    private cmk a;

    public final void a(int i)
    {
        a.a.lock();
        a.r.a(i);
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
        a.r.a(bundle);
        a.a.unlock();
        return;
        bundle;
        a.a.unlock();
        throw bundle;
    }

    (cmk cmk1)
    {
        a = cmk1;
        super();
    }
}
