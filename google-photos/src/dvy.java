// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class dvy
{

    final int a;
    final List b;
    final String c;
    final String d[];

    private dvy(int i, List list, String s, String as[])
    {
        a = i;
        b = Collections.unmodifiableList(list);
        c = s;
        d = as;
    }

    public dvy(int i, List list, String s, String as[], byte byte0)
    {
        this(i, list, s, as);
    }
}
