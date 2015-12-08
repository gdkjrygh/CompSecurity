// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class eag
    implements dup, omb
{

    private final dzi a = new dzi();
    private Resources b;

    public eag()
    {
    }

    public final hgo a(dum dum1)
    {
        Object obj = (dzl)dum1.a(dzl);
        obj = a.a(dum1, ((dzl) (obj))).a(b.getString(b.kF), new eah(this, ((dzl) (obj))), pwt.E);
        obj.k = new eaf();
        return new dzg(dum1, ((dwh) (obj)).a());
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        b = context.getResources();
    }

    public final void a(olm olm)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}
