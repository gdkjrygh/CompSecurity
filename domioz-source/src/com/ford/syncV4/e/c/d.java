// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            bv

public final class d extends e
{

    public d()
    {
        super("Alert");
    }

    public final void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("playTone", boolean1);
            return;
        } else
        {
            b.remove("playTone");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            b.put("alertText1", s);
            return;
        } else
        {
            b.remove("alertText1");
            return;
        }
    }

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("ttsChunks", vector);
            return;
        } else
        {
            b.remove("ttsChunks");
            return;
        }
    }

    public final void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("duration", integer);
            return;
        } else
        {
            b.remove("duration");
            return;
        }
    }

    public final String d()
    {
        return (String)b.get("alertText1");
    }

    public final Vector e()
    {
        if (b.get("ttsChunks") instanceof Vector)
        {
            Object obj = (Vector)b.get("ttsChunks");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof bv)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new bv((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }
}
