// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gfg
{

    private static final ekk e = (new ekm()).a(hpg).a();
    private final Context a;
    private final int b;
    private final eto c;
    private final hpb d;

    gfg(Context context, int i)
    {
        a = context;
        b = i;
        c = (eto)olm.a(context, eto);
        d = (hpb)olm.a(context, hpb);
    }

    public final boolean a(String s)
    {
        s = Collections.singletonList(s);
        Object obj = new dmb(b, s);
        Object obj1 = b.a(a, ((ekq) (obj)));
        Object obj2;
        try
        {
            obj2 = (List)((ekv) (obj1)).a(((ekq) (obj)), ekw.a, e).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        obj = new HashSet();
        obj1 = new ArrayList();
        for (obj2 = d.a(((java.util.Collection) (obj2))).iterator(); ((Iterator) (obj2)).hasNext();)
        {
            hpk hpk1 = (hpk)((Iterator) (obj2)).next();
            if (hpk1.f())
            {
                ((Set) (obj)).add(hpk1.e);
            } else
            {
                p.b(hpk1.a());
                ((List) (obj1)).add(hpk1.c);
            }
        }

        obj = iyd.a(a, b, new ArrayList(((java.util.Collection) (obj))), ((List) (obj1)), iye.a);
        ((nxx) (obj)).d();
        if (((nxx) (obj)).l())
        {
            return false;
        } else
        {
            c.a(b, s, Collections.emptyList(), true);
            return true;
        }
    }

}
