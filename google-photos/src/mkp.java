// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class mkp
{

    public final int a;
    public final long b;
    public final long c;
    public final List d;

    mkp(String s, int i, long l, long l1, List list)
    {
        a = i;
        b = l;
        c = l1;
        d = Collections.unmodifiableList(list);
    }
}
