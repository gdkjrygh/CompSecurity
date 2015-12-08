// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.v;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            a, h, c

public class e
{

    List a;
    final m b;
    boolean c;

    public e(m m)
    {
        a = new ArrayList();
        c = false;
        b = m;
    }

    public final h a(String s)
    {
        List list = ar.com.hjg.pngj.chunks.a.a(a, new c(s) {

            final String a;

            public final boolean a(h h1)
            {
                return h1.a.equals(a);
            }

            
            {
                a = s;
                super();
            }
        });
        if (list.isEmpty())
        {
            return null;
        }
        if (list.size() > 1 && !((h)list.get(0)).a())
        {
            throw new v((new StringBuilder("unexpected multiple chunks id=")).append(s).toString());
        } else
        {
            return (h)list.get(list.size() - 1);
        }
    }

    public final void a(h h1, int i)
    {
        h1.a(i);
        a.add(h1);
        if (h1.a.equals("PLTE"))
        {
            c = true;
        }
    }

    public String toString()
    {
        return (new StringBuilder("ChunkList: read: ")).append(a.size()).toString();
    }
}
