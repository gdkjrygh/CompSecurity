// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class hls
    implements opt, opu, opv
{

    public List a;
    public hgz b;
    public boolean c;
    public aep d;

    public hls(opd opd1)
    {
        d = new hlt(this);
        opd1.a(this);
    }

    static List a(hls hls1)
    {
        return hls1.a;
    }

    public final void V_()
    {
        c = false;
        if (b != null)
        {
            b.b(d);
        }
    }

    public final void X_()
    {
        c = true;
        if (b != null)
        {
            b.a(d);
        }
    }

    public final hls a(olm olm1)
    {
        olm1.a(hls, this);
        return this;
    }
}
