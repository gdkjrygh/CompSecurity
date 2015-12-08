// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class dzy
    implements dup, mti, omb
{

    public dyx a;
    public mtj b;
    public noz c;
    private Context d;

    dzy()
    {
    }

    public final hgo a(dum dum)
    {
        dum = hik.b;
        return null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (dyx)olm1.a(dyx);
        b = (mtj)olm1.a(mtj);
        b.a(this);
        d = context;
        c = noz.a(context, "AlbumCardRenderer", new String[0]);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (!"AlbumCardLoadFullCollectionTask".equals(s) || mue1 == null || mue1.c()) 
        {
            return;
        }
        s = mue1.a();
        mue1 = (ekq)s.getParcelable("mediaCollection");
        int i = s.getInt("accountId");
        s = (new hom(d, mue1, i)).a();
        d.startActivity(s);
    }

    public final void a(olm olm1)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}
