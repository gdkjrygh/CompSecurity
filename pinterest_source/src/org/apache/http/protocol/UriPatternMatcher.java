// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UriPatternMatcher
{

    private final Map map = new HashMap();

    public UriPatternMatcher()
    {
    }

    public Map getObjects()
    {
        this;
        JVM INSTR monitorenter ;
        Map map1 = map;
        this;
        JVM INSTR monitorexit ;
        return map1;
        Exception exception;
        exception;
        throw exception;
    }

    public Object lookup(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Request URI may not be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i = s.indexOf("?");
        String s1;
        s1 = s;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s1 = s.substring(0, i);
        s = ((String) (map.get(s1)));
        Object obj1 = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
        Iterator iterator = map.keySet().iterator();
_L3:
        obj1 = s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (String)iterator.next();
        if (!matchUriRequestPattern(((String) (obj1)), s1))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (((String) (obj)).length() >= ((String) (obj1)).length() && (((String) (obj)).length() != ((String) (obj1)).length() || !((String) (obj1)).endsWith("*")))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        obj = map.get(obj1);
        s = ((String) (obj1));
_L4:
        obj1 = obj;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return obj1;
        String s2 = s;
        s = ((String) (obj));
        obj = s2;
          goto _L4
    }

    protected boolean matchUriRequestPattern(String s, String s1)
    {
        while (s.equals("*") || s.endsWith("*") && s1.startsWith(s.substring(0, s.length() - 1)) || s.startsWith("*") && s1.endsWith(s.substring(1, s.length()))) 
        {
            return true;
        }
        return false;
    }

    public void register(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("URI request pattern may not be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        map.put(s, obj);
        this;
        JVM INSTR monitorexit ;
    }

    public void setHandlers(Map map1)
    {
        this;
        JVM INSTR monitorenter ;
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
        map1;
        this;
        JVM INSTR monitorexit ;
        throw map1;
        map.clear();
        map.putAll(map1);
        this;
        JVM INSTR monitorexit ;
    }

    public void setObjects(Map map1)
    {
        this;
        JVM INSTR monitorenter ;
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
        map1;
        this;
        JVM INSTR monitorexit ;
        throw map1;
        map.clear();
        map.putAll(map1);
        this;
        JVM INSTR monitorexit ;
    }

    public void unregister(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        map.remove(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }
}
