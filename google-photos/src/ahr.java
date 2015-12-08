// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.base.BranchFilter;
import androidx.media.filterpacks.base.VariableSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ahr
{

    ajr a;
    private HashMap b;

    public ahr(ajr ajr)
    {
        b = new HashMap();
        a = ajr;
    }

    public final ahn a(String s)
    {
        return (ahn)b.get(s);
    }

    ahq a(ahq ahq1)
    {
        ahq1 = new ahq(a, ahq1);
        ahq1.b = b;
        ahq1.c = (ahn[])b.values().toArray(new ahn[0]);
        ahn ahn1;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); ahn1.w())
        {
            ahn1 = (ahn)((java.util.Map.Entry)iterator.next()).getValue();
            ahn1.mFilterGraph = ahq1;
        }

        return ahq1;
    }

    final VariableSource a(Object obj, String s, String s1)
    {
        ahn ahn1 = a(s);
        if (ahn1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 18)).append("Unknown filter '").append(s).append("'!").toString());
        }
        Object obj1 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(".").append(s1).toString();
        if (a(((String) (obj1))) != null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(s1).length())).append("VariableSource for '").append(s).append("' and input '").append(s1).append("' exists already!").toString());
        }
        obj1 = new VariableSource(a, ((String) (obj1)));
        a(((ahn) (obj1)));
        try
        {
            ((ahn) (obj1)).a("value", ahn1, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 58 + String.valueOf(s).length())).append("Could not connect VariableSource to input '").append(s1).append("' of filter '").append(s).append("'!").toString(), ((Throwable) (obj)));
        }
        if (obj != null)
        {
            ((VariableSource) (obj1)).a(obj);
        }
        return ((VariableSource) (obj1));
    }

    final VariableSource a(String s, String s1, String s2)
    {
        ahn ahn1 = a(s1);
        if (ahn1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s1).length() + 18)).append("Unknown filter '").append(s1).append("'!").toString());
        }
        ahn ahn2 = a(s);
        if (ahn2 == null || !(ahn2 instanceof VariableSource))
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 20)).append("Unknown variable '").append(s).append("'!").toString());
        }
        Object obj;
        String s3;
        try
        {
            s = ahn2.mName;
            s3 = (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf("value").length())).append("__").append(s).append("_").append("value").append("Branch").toString();
            obj = a(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s2).length() + 58 + String.valueOf(s1).length())).append("Could not connect VariableSource to input '").append(s2).append("' of filter '").append(s1).append("'!").toString(), s);
        }
        s = ((String) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        s = new BranchFilter(a, s3, false);
        a(((ahn) (s)));
        ahn2.a("value", s, "input");
        obj = ahn1.mName;
        s.a((new StringBuilder(String.valueOf(obj).length() + 3 + String.valueOf(s2).length())).append("to").append(((String) (obj))).append("_").append(s2).toString(), ahn1, s2);
        return (VariableSource)ahn2;
    }

    void a()
    {
        ahn ahn1;
        ajw ajw1;
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ajw1.a(ahn1))
        {
            ahn1 = (ahn)iterator.next();
            ajw1 = ahn1.b();
            Object obj = new HashSet();
            ((Set) (obj)).addAll(ahn1.mConnectedInputPorts.keySet());
            if (ajw1.a != null)
            {
                String s;
                for (Iterator iterator1 = ajw1.a.entrySet().iterator(); iterator1.hasNext(); ((Set) (obj)).remove(s))
                {
                    Object obj1 = (java.util.Map.Entry)iterator1.next();
                    s = (String)((java.util.Map.Entry) (obj1)).getKey();
                    obj1 = (ajx)((java.util.Map.Entry) (obj1)).getValue();
                    if (ahn1.a(s) == null && ((ajx) (obj1)).a())
                    {
                        obj = String.valueOf(ahn1);
                        throw new RuntimeException((new StringBuilder(String.valueOf(obj).length() + 45 + String.valueOf(s).length())).append("Filter ").append(((String) (obj))).append(" does not have required input port '").append(s).append("'!").toString());
                    }
                }

            }
            if (!ajw1.c && !((Set) (obj)).isEmpty())
            {
                String s1 = String.valueOf(ahn1);
                obj = String.valueOf(obj);
                throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(obj).length())).append("Filter ").append(s1).append(" has invalid input ports: ").append(((String) (obj))).append("!").toString());
            }
        }

    }

    public final void a(ahn ahn1)
    {
        if (b.values().contains(ahn1))
        {
            ahn1 = String.valueOf(ahn1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ahn1).length() + 55)).append("Attempting to add filter ").append(ahn1).append(" that is in the graph already!").toString());
        }
        if (b.containsKey(ahn1.mName))
        {
            ahn1 = ahn1.mName;
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ahn1).length() + 43)).append("Graph contains filter with name '").append(ahn1).append("' already!").toString());
        } else
        {
            b.put(ahn1.mName, ahn1);
            return;
        }
    }
}
