// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.opengl.GLES20;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class cid
{

    public final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Context d;

    public cid(Context context)
    {
        d = context;
    }

    public final cij a(int i, int j)
    {
        cik cik1 = new cik(new cic(i), new cic(j));
        Object obj = a(cik1);
        if (obj != null)
        {
            return ((cij) (obj));
        }
        ciq ciq1 = a(i);
        if (d == null)
        {
            throw new RuntimeException("Cannot load fragment shader from resource id without a context");
        }
        cic cic1 = new cic(j);
        chj chj1 = (chj)a.get(cic1);
        obj = chj1;
        if (chj1 == null)
        {
            obj = new chj(d, j);
            a.put(cic1, obj);
        }
        return a(cik1, ciq1, ((chj) (obj)));
    }

    public cij a(cik cik1)
    {
        return (cij)c.get(cik1);
    }

    public cij a(cik cik1, ciq ciq1, chj chj1)
    {
        ciq1 = new cij(ciq1, chj1);
        c.put(cik1, ciq1);
        return ciq1;
    }

    public final ciq a(int i)
    {
        if (d == null)
        {
            throw new RuntimeException("Cannot load vertex shader from resource id without a context");
        }
        cic cic1 = new cic(i);
        ciq ciq2 = (ciq)b.get(cic1);
        ciq ciq1 = ciq2;
        if (ciq2 == null)
        {
            ciq1 = new ciq(d, i);
            b.put(cic1, ciq1);
        }
        return ciq1;
    }

    public final void a()
    {
        for (Iterator iterator = c.values().iterator(); iterator.hasNext();)
        {
            cij cij1 = (cij)iterator.next();
            if (cij1.c == 0)
            {
                throw new RuntimeException("ShaderProgram had destroy() called twice");
            }
            GLES20.glDeleteProgram(cij1.c);
            cij1.c = 0;
        }

        for (Iterator iterator1 = b.values().iterator(); iterator1.hasNext(); ((ciq)iterator1.next()).a()) { }
        for (Iterator iterator2 = a.values().iterator(); iterator2.hasNext(); ((chj)iterator2.next()).a()) { }
        c.clear();
        b.clear();
        a.clear();
    }
}
