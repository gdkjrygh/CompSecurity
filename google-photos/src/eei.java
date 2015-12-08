// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class eei
{

    public final List a;
    public final Map b;
    public final hgo c;
    public final int d;

    eei(List list, Map map, hgo hgo, int i)
    {
        a = Collections.unmodifiableList(list);
        b = Collections.unmodifiableMap(map);
        c = hgo;
        d = i;
    }
}
