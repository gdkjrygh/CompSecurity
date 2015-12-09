// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


// Referenced classes of package com.nuance.b.a:
//            u, v, w

public final class t
{

    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final u h;
    public final v i;
    public final w j;
    public final boolean k;
    public final String l;

    public t(t t1, String s)
    {
        if (t1 == null)
        {
            throw new NullPointerException("originalValue cannot be null.");
        } else
        {
            a = t1.a;
            b = s;
            c = t1.c;
            d = t1.d;
            e = t1.e;
            f = t1.f;
            g = t1.g;
            h = t1.h;
            i = t1.i;
            j = t1.j;
            k = t1.k;
            l = t1.l;
            return;
        }
    }

    t(String s, String s1, String s2, int i1, int j1, float f1, float f2, 
            u u, v v, w w, boolean flag, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = i1;
        e = j1;
        f = f1;
        g = f2;
        h = u;
        i = v;
        j = w;
        k = flag;
        l = s3;
    }

    public final String toString()
    {
        return (new StringBuilder("[ConceptValue: surfaceMeaning=")).append(a).append(", groundedMeaning=").append(b).append(", literal=").append(c).append(", attempt=").append(d).append(", turn=").append(e).append(", confidence=").append(f).append(", predictionScore=").append(g).append(", inputMode=").append(h).append(", source=").append(i).append(", status=").append(j).append(", collectedLastTurn=").append(k).append(", agentName=").append(l).append("]").toString();
    }
}
