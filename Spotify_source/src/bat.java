// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class bat
    implements bdy
{

    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final List e;
    private String f;

    public bat(long l, long l1, boolean flag, long l2, 
            String s, List list)
    {
        a = l;
        b = l1;
        c = flag;
        d = l2;
        f = s;
        e = Collections.unmodifiableList(list);
    }

    public final String a()
    {
        return f;
    }
}
