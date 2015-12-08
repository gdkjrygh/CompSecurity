// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.base.GraphInputSource;
import androidx.media.filterpacks.base.GraphOutputTarget;
import androidx.media.filterpacks.base.VariableSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ahq
{

    ajr a;
    HashMap b;
    ahn c[];
    aiw d;
    final HashSet e;
    final Object f;
    public ahq g;

    ahq(ajr ajr1, ahq ahq1)
    {
        b = new HashMap();
        c = null;
        e = new HashSet();
        f = new Object();
        a = ajr1;
        ajr ajr2 = a;
        synchronized (ajr2.b)
        {
            ajr2.b.add(this);
        }
        if (ahq1 != null)
        {
            g = ahq1;
            g.e.add(this);
        }
        return;
        ahq1;
        ajr1;
        JVM INSTR monitorexit ;
        throw ahq1;
    }

    private void c()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((ahq)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        if (d != null)
        {
            aiw aiw1 = d;
            if (b() != aiw1)
            {
                throw new IllegalArgumentException("Attempting to tear down graph with foreign GraphRunner!");
            }
            aiw1.g.a(11, this);
        }
        return;
    }

    public final ahn a(String s)
    {
        return (ahn)b.get(s);
    }

    public final void a()
    {
        if (g != null)
        {
            throw new RuntimeException("Attempting to tear down sub-graph!");
        } else
        {
            c();
            return;
        }
    }

    public final void a(aiw aiw1)
    {
        if (d == null)
        {
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((ahq)iterator.next()).a(aiw1)) { }
            synchronized (aiw1.f)
            {
                aiw1.f.add(this);
            }
            d = aiw1;
        } else
        if (d != aiw1)
        {
            throw new RuntimeException("Cannot attach FilterGraph to GraphRunner that is already attached to another GraphRunner!");
        }
        return;
        aiw1;
        set;
        JVM INSTR monitorexit ;
        throw aiw1;
    }

    public final aiw b()
    {
        if (d == null)
        {
            a(new aiw(a));
        }
        return d;
    }

    public final VariableSource b(String s)
    {
        ahn ahn1 = (ahn)b.get(s);
        if (ahn1 != null && (ahn1 instanceof VariableSource))
        {
            return (VariableSource)ahn1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 30)).append("Unknown variable '").append(s).append("' specified!").toString());
        }
    }

    public final GraphOutputTarget c(String s)
    {
        ahn ahn1 = (ahn)b.get(s);
        if (ahn1 != null && (ahn1 instanceof GraphOutputTarget))
        {
            return (GraphOutputTarget)ahn1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 28)).append("Unknown target '").append(s).append("' specified!").toString());
        }
    }

    public final GraphInputSource d(String s)
    {
        ahn ahn1 = (ahn)b.get(s);
        if (ahn1 != null && (ahn1 instanceof GraphInputSource))
        {
            return (GraphInputSource)ahn1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 28)).append("Unknown source '").append(s).append("' specified!").toString());
        }
    }
}
