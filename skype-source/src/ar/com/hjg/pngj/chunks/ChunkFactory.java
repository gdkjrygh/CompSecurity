// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.IChunkFactory;
import ar.com.hjg.pngj.m;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            d, h, s, y, 
//            n, p, u, o, 
//            aa, q, af, i, 
//            k, t, m, ab, 
//            ac, j, v, x, 
//            l, w, ae

public class ChunkFactory
    implements IChunkFactory
{

    boolean parse;

    public ChunkFactory()
    {
        this(true);
    }

    public ChunkFactory(boolean flag)
    {
        parse = flag;
    }

    public final h createChunk(d d1, m m1)
    {
        h h2 = createEmptyChunkKnown(d1.c, m1);
        h h1 = h2;
        if (h2 == null)
        {
            h1 = createEmptyChunkExtended(d1.c, m1);
        }
        h2 = h1;
        if (h1 == null)
        {
            h2 = createEmptyChunkUnknown(d1.c, m1);
        }
        h2.b(d1);
        if (parse && d1.d != null)
        {
            h2.a(d1);
        }
        return h2;
    }

    protected h createEmptyChunkExtended(String s1, m m1)
    {
        if (s1.equals("oFFs"))
        {
            return new s(m1);
        }
        if (s1.equals("sTER"))
        {
            return new y(m1);
        } else
        {
            return null;
        }
    }

    protected final h createEmptyChunkKnown(String s1, m m1)
    {
        if (s1.equals("IDAT"))
        {
            return new n(m1);
        }
        if (s1.equals("IHDR"))
        {
            return new p(m1);
        }
        if (s1.equals("PLTE"))
        {
            return new u(m1);
        }
        if (s1.equals("IEND"))
        {
            return new o(m1);
        }
        if (s1.equals("tEXt"))
        {
            return new aa(m1);
        }
        if (s1.equals("iTXt"))
        {
            return new q(m1);
        }
        if (s1.equals("zTXt"))
        {
            return new af(m1);
        }
        if (s1.equals("bKGD"))
        {
            return new i(m1);
        }
        if (s1.equals("gAMA"))
        {
            return new k(m1);
        }
        if (s1.equals("pHYs"))
        {
            return new t(m1);
        }
        if (s1.equals("iCCP"))
        {
            return new ar.com.hjg.pngj.chunks.m(m1);
        }
        if (s1.equals("tIME"))
        {
            return new ab(m1);
        }
        if (s1.equals("tRNS"))
        {
            return new ac(m1);
        }
        if (s1.equals("cHRM"))
        {
            return new j(m1);
        }
        if (s1.equals("sBIT"))
        {
            return new v(m1);
        }
        if (s1.equals("sRGB"))
        {
            return new x(m1);
        }
        if (s1.equals("hIST"))
        {
            return new l(m1);
        }
        if (s1.equals("sPLT"))
        {
            return new w(m1);
        } else
        {
            return null;
        }
    }

    protected final h createEmptyChunkUnknown(String s1, m m1)
    {
        return new ae(s1, m1);
    }
}
