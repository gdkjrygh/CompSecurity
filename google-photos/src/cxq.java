// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class cxq
{

    public final List a;
    public final Map b;
    public final long c;
    public final cqp d = new cqp();
    public final long e;

    cxq(cxr cxr1)
    {
        a = Collections.unmodifiableList(cxr1.a);
        b = Collections.unmodifiableMap(cxr1.b);
        c = cxr1.d;
        d.a(cxr1.c);
        e = cxr1.e;
    }
}
