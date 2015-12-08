// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class eea
{

    public final List a;
    public final Map b;

    eea(List list, Map map)
    {
        a = list;
        b = Collections.unmodifiableMap(map);
    }
}
