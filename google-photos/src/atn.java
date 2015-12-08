// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class atn
{

    public final ane a;
    public final List b;
    public final ann c;

    public atn(ane ane1, ann ann1)
    {
        this(ane1, Collections.emptyList(), ann1);
    }

    private atn(ane ane1, List list, ann ann1)
    {
        a = (ane)b.a(ane1, "Argument must not be null");
        b = (List)b.a(list, "Argument must not be null");
        c = (ann)b.a(ann1, "Argument must not be null");
    }
}
