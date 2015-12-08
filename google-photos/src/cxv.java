// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.summarizer.ClusteringSummarizer;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public final class cxv
{

    private static Set a = a(new int[] {
        2, 6, 3
    });
    private static Set b = a(new int[] {
        5
    });
    private static cxd c;

    public static cxs a(cwl cwl1)
    {
        return new cxs(new ClusteringSummarizer(cwl1.a, c, 1.401298E-45F, a), new ClusteringSummarizer(cwl1.b, c, 0.0F, b));
    }

    private static transient Set a(int ai[])
    {
        TreeSet treeset = new TreeSet();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            treeset.add(Integer.valueOf(ai[i]));
        }

        return Collections.unmodifiableSet(treeset);
    }

    public static cxs b(cwl cwl1)
    {
        return new cxs(new cxz(cwl1.a, c, 0.5F, a), new cxz(cwl1.b, c, 0.5F, b));
    }

    static 
    {
        c = new cwz((new cxa()).a(0.38629F, new cxc()).a(0.09895F, new cxe(0)).a(0.13312F, new cxe(1)).a);
    }
}
