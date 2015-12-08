// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;

public final class hzg
    implements omb, opv
{

    public hzh a;
    public hzd b;
    private hyp c;

    public hzg(opd opd1)
    {
        opd1.a(this);
    }

    public hzg(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final hzg a(olm olm1)
    {
        olm1.a(hzg, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hzh)olm1.a(hzh);
        b = (hzd)olm1.a(hzd);
        c = (hyp)olm1.a(hyp);
    }

    public final void a(ehr ehr1)
    {
        hzd hzd1 = b;
        hzd1.g.b(hzd.a);
        hzd1.g.b(hzd.b);
        hzd1.g.a(new ele(ehr1.a, ehr1.b, ekk.a, hzd.a));
    }

    public final void a(ekp ekp)
    {
        hzh hzh1 = a;
        hzh1.b.b(ekp);
        hzh1.a(Collections.singletonList(ekp));
        hzh1.d();
        c.a();
    }

    public final void b(ekp ekp)
    {
        hzh hzh1 = a;
        hzh1.b.a(ekp);
        hzh1.b(Collections.singletonList(ekp));
        hzh1.d();
        c.a();
    }
}
