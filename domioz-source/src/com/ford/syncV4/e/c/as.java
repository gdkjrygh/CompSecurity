// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.h;
import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

public final class as extends e
{

    public as()
    {
        super("PerformInteraction");
    }

    public final void a(h h)
    {
        if (h != null)
        {
            b.put("interactionMode", h);
            return;
        } else
        {
            b.remove("interactionMode");
            return;
        }
    }

    public final void a(String s)
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

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("initialPrompt", vector);
            return;
        } else
        {
            b.remove("initialPrompt");
            return;
        }
    }

    public final void b(Integer integer)
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

    public final void b(Vector vector)
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

    public final void c(Vector vector)
    {
        if (vector != null)
        {
            b.put("helpPrompt", vector);
            return;
        } else
        {
            b.remove("helpPrompt");
            return;
        }
    }

    public final void d()
    {
        b.remove("vrHelp");
    }

    public final void d(Vector vector)
    {
        if (vector != null)
        {
            b.put("timeoutPrompt", vector);
            return;
        } else
        {
            b.remove("timeoutPrompt");
            return;
        }
    }
}
