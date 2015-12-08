// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class hzr
    implements omb, opv
{

    mwx a;
    mwz b;
    final Runnable c = new hzs(this);
    private final rz d;

    public hzr(rz rz, opd opd1)
    {
        d = rz;
        opd1.a(this);
    }

    static mwz a(hzr hzr1, mwz mwz)
    {
        hzr1.b = null;
        return null;
    }

    static rz a(hzr hzr1)
    {
        return hzr1.d;
    }

    public final hzr a(olm olm1)
    {
        olm1.a(hzr, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mwx)olm1.a(mwx);
    }
}
