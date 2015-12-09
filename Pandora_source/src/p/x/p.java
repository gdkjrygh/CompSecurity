// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import java.net.URL;
import p.r.c;

// Referenced classes of package p.x:
//            j, d

public class p
    implements j
{

    private final j a;

    public p(j j1)
    {
        a = j1;
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((URL)obj, i, k);
    }

    public c a(URL url, int i, int k)
    {
        return a.a(new d(url), i, k);
    }
}
