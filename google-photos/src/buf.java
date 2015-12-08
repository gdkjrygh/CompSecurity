// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class buf
    implements nfp
{

    public final Collection a = new ArrayList();
    public final buj b = new buj("No analysis is active");
    public final bul c = new bul("No active storyboard");
    public final bul d = new bul("No startup intent");
    public final bul e = new bul("No player screen controller");
    public final nfp f = new bug(this);
    private final nfp g;
    private final buk h;
    private final Collection i = new ArrayList();
    private final buj j = new buj("No playback loop is active");
    private final nfg k = new nfg();

    public buf(nfp nfp1, buk buk1)
    {
        g = (nfp)b.a(nfp1, "historicalAnalysisPerformanceLogs", null);
        h = (buk)b.a(buk1, "settings", null);
    }

    static buk a(buf buf1)
    {
        return buf1.h;
    }

    static Collection b(buf buf1)
    {
        return buf1.a;
    }

    static buj c(buf buf1)
    {
        return buf1.j;
    }

    static bul d(buf buf1)
    {
        return buf1.c;
    }

    static bul e(buf buf1)
    {
        return buf1.e;
    }

    static nfg f(buf buf1)
    {
        return buf1.k;
    }

    public final void a(nfi nfi)
    {
        i.add(nfi);
    }

    public final void a(nfn nfn)
    {
        if (!h.o())
        {
            return;
        }
        g.a(nfn);
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((nfp)iterator.next()).a(nfn)) { }
        b.a(nfn);
        d.a(nfn);
        f.a(nfn);
    }

    public final void a(nfp nfp1)
    {
        j.a(nfp1);
    }

    static 
    {
        buf.getSimpleName();
    }
}
