// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class bnt extends bsr
{

    private bnp a;

    bnt(bnp bnp1, String s)
    {
        a = bnp1;
        super(s);
    }

    public final mtf a(String s)
    {
        return new bog(s, bnp.f(a).d(), bnp.c(a), bnp.m(a).a, a.c.b.m);
    }

    public final boolean a(String s, mue mue1)
    {
        if (mue1.b == 0)
        {
            bnp.a(a, bxf.g);
            bnp.a("error looking up cloud media uris.");
            return false;
        }
        if (mue1.b == 1)
        {
            bnp.a(a).h();
            bnp.i(a);
            bnp.a("assets contain movies that are still being rendered.");
            return false;
        }
        Object obj1 = (ddv)mue1.a().getParcelable("media");
        s = mue1.a().getParcelableArrayList("deletedMedia");
        Object obj = (ddt)mue1.a().getParcelable("localVideoStreams");
        a.c.a(((ddv) (obj1)).a);
        obj1 = a.c;
        HashSet hashset = new HashSet(s);
        ((bww) (obj1)).b.k.clear();
        ((bww) (obj1)).b.k.addAll(hashset);
        obj1 = a.c;
        obj = Collections.unmodifiableMap(((ddt) (obj)).a);
        ((bww) (obj1)).b.j.clear();
        ((bww) (obj1)).b.j.putAll(((Map) (obj)));
        if (s.isEmpty())
        {
            if (mue1.a().getBoolean("allAssetsLocal"))
            {
                a.c.a(bxd.b);
                bnp.l(a).b();
                return true;
            }
            bnp.a(a, bxf.i);
        } else
        {
            bnp.a(a, bxf.h);
        }
        return true;
    }
}
