// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class igp
{

    private static final oni b = new oni("debug.photos.share_resize");
    private static final long c;
    final igg a;
    private final igs d;

    public igp(Context context, igs igs1)
    {
        d = igs1;
        a = new igg(context, igs1);
    }

    private static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            jdy jdy1 = (jdy)((ekp)list.next()).b(jdy);
            if (jdy1 != null && !jdy1.a() && !jdy1.b())
            {
                return true;
            }
        }

        return false;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        if (!d.b || d.c && a(d.a)) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag;
        if (a.a(igj.c) < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = Collections.singletonList(igj.c);
_L6:
        return ((List) (obj));
_L4:
        obj = d.a;
        arraylist.add(igj.c);
_L2:
        obj = arraylist;
        if (d.c)
        {
            arraylist.add(igj.d);
            return arraylist;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        c = oqm.c.f * 10L;
    }
}
