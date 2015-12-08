// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.Map;

public final class crf
    implements Comparator
{

    private final Map a;

    public crf(Map map)
    {
        a = (Map)b.a(map, "displayableByMediaId", null);
    }

    public final int compare(Object obj, Object obj1)
    {
        long l1 = 0L;
        obj = (cnq)obj;
        obj1 = (cnq)obj1;
        coi coi1 = ((cnz)a.get(((cnq) (obj)).e)).b();
        coi coi2 = ((cnz)a.get(((cnq) (obj1)).e)).b();
        long l;
        long l2;
        long l3;
        if (coi1.e == coj.a)
        {
            l = coi1.a().f;
        } else
        {
            l = 0L;
        }
        if (coi2.e == coj.a)
        {
            l1 = coi2.a().f;
        }
        l2 = coi1.b;
        l3 = coi2.b;
        return Long.signum(((l2 - l) + ((cnq) (obj)).f.b) - ((l3 - l1) + ((cnq) (obj1)).f.b));
    }
}
