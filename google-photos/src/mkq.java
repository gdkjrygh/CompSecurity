// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class mkq
{

    public final String a;
    public final String b;
    final long c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;
    public final mkr h;

    mkq(String s, String s1, int i, long l, String s2, String s3, 
            mkr mkr, List list)
    {
        a = s;
        b = s1;
        d = i;
        c = l;
        e = s2;
        f = s3;
        h = mkr;
        g = Collections.unmodifiableList(list);
    }
}
