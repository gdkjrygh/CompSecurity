// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class nvc
    implements lxh
{

    final nva a;

    nvc(nva nva1)
    {
        a = nva1;
        super();
    }

    public final void a()
    {
        nva.e(a).a("5FD0CDC9", true, new nvd(this));
    }

    public final void a(String s)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "CastClient disconnected ".concat(s);
        } else
        {
            s = new String("CastClient disconnected ");
        }
        Log.e("CastApi", s);
        s = a;
        zb.a(zb.b());
    }

    public final void b()
    {
        nva nva1 = a;
        zb.a(zb.b());
    }
}
