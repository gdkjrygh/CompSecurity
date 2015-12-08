// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hzo
    implements omb, opv
{

    public mwx a;
    public mwz b;
    public Runnable c;
    public final Runnable d = new hzp(this);
    private final rz e;

    public hzo(rz rz, opd opd1)
    {
        e = rz;
        opd1.a(this);
    }

    static Runnable a(hzo hzo1, Runnable runnable)
    {
        hzo1.c = runnable;
        return runnable;
    }

    static mwz a(hzo hzo1, mwz mwz)
    {
        hzo1.b = null;
        return null;
    }

    static rz a(hzo hzo1)
    {
        return hzo1.e;
    }

    public final hzo a(olm olm1)
    {
        olm1.a(hzo, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mwx)olm1.a(mwx);
    }
}
