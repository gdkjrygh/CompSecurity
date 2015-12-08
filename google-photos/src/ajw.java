// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ajw
{

    HashMap a;
    HashMap b;
    public boolean c;
    public boolean d;

    public ajw()
    {
        a = null;
        b = null;
        c = true;
        d = true;
    }

    public final ajw a()
    {
        c = false;
        d = false;
        return this;
    }

    public final ajw a(String s, int i, aif aif)
    {
        aif = new ajx(i, aif);
        if (a == null)
        {
            a = new HashMap();
        }
        if (a.containsKey(s))
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 42)).append("Attempting to add duplicate input port '").append(s).append("'!").toString());
        } else
        {
            a.put(s, aif);
            return this;
        }
    }

    final void a(ahn ahn1)
    {
        Object obj = new HashSet();
        ((Set) (obj)).addAll(ahn1.mConnectedOutputPorts.keySet());
        if (b != null)
        {
            String s;
            for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); ((Set) (obj)).remove(s))
            {
                Object obj1 = (java.util.Map.Entry)iterator.next();
                s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (ajx)((java.util.Map.Entry) (obj1)).getValue();
                if (ahn1.b(s) == null && ((ajx) (obj1)).a())
                {
                    ahn1 = String.valueOf(ahn1);
                    throw new RuntimeException((new StringBuilder(String.valueOf(ahn1).length() + 46 + String.valueOf(s).length())).append("Filter ").append(ahn1).append(" does not have required output port '").append(s).append("'!").toString());
                }
            }

        }
        if (!d && !((Set) (obj)).isEmpty())
        {
            ahn1 = String.valueOf(ahn1);
            obj = String.valueOf(obj);
            throw new RuntimeException((new StringBuilder(String.valueOf(ahn1).length() + 35 + String.valueOf(obj).length())).append("Filter ").append(ahn1).append(" has invalid output ports: ").append(((String) (obj))).append("!").toString());
        } else
        {
            return;
        }
    }

    public final ajw b(String s, int i, aif aif)
    {
        aif = new ajx(i, aif);
        if (b == null)
        {
            b = new HashMap();
        }
        if (b.containsKey(s))
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 43)).append("Attempting to add duplicate output port '").append(s).append("'!").toString());
        } else
        {
            b.put(s, aif);
            return this;
        }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuffer.append(String.valueOf(((ajx)entry.getValue()).a("input", (String)entry.getKey())).concat("\n")))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = b.entrySet().iterator(); iterator1.hasNext(); stringbuffer.append(String.valueOf(((ajx)entry1.getValue()).a("output", (String)entry1.getKey())).concat("\n")))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        if (!c)
        {
            stringbuffer.append("disallow other inputs\n");
        }
        if (!d)
        {
            stringbuffer.append("disallow other outputs\n");
        }
        return stringbuffer.toString();
    }
}
