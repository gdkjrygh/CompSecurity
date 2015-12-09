// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;
import p.bh.l;
import p.bh.o;

public class at extends e
{

    public at()
    {
        super("PerformInteraction");
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("initialText", s);
            return;
        } else
        {
            b.remove("initialText");
            return;
        }
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("interactionChoiceSetIDList", vector);
            return;
        } else
        {
            b.remove("interactionChoiceSetIDList");
            return;
        }
    }

    public void a(l l)
    {
        if (l != null)
        {
            b.put("interactionMode", l);
            return;
        } else
        {
            b.remove("interactionMode");
            return;
        }
    }

    public void a(o o)
    {
        if (o != null)
        {
            b.put("interactionLayout", o);
            return;
        } else
        {
            b.remove("interactionLayout");
            return;
        }
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("timeout", integer);
            return;
        } else
        {
            b.remove("timeout");
            return;
        }
    }
}
