// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;

import java.lang.reflect.Array;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class JSONWriter
{

    static char hex[] = "0123456789ABCDEF".toCharArray();
    private StringBuffer buf;
    private Stack calls;
    boolean emitClassName;

    public JSONWriter()
    {
        this(true);
    }

    public JSONWriter(boolean flag)
    {
        buf = new StringBuffer();
        calls = new Stack();
        emitClassName = true;
        emitClassName = flag;
    }

    private void array(Object obj)
    {
        addArrayOpen();
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            addArrayValue(Array.get(obj, i));
            if (i < j - 1)
            {
                addArraySeparator();
            }
        }

        addArrayClose();
    }

    private void array(Iterator iterator)
    {
        addArrayOpen();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            addArrayValue(iterator.next());
            if (iterator.hasNext())
            {
                addArraySeparator();
            }
        } while (true);
        addArrayClose();
    }

    private void bool(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        add(s);
    }

    private boolean cyclic(Object obj)
    {
        for (Iterator iterator = calls.iterator(); iterator.hasNext();)
        {
            if (obj == iterator.next())
            {
                return true;
            }
        }

        return false;
    }

    private void map(Map map1)
    {
        addObjectOpen();
        map1 = map1.entrySet().iterator();
        do
        {
            if (!map1.hasNext())
            {
                break;
            }
            add((java.util.Map.Entry)map1.next());
            if (map1.hasNext())
            {
                addObjectSeparator();
            }
        } while (true);
        addObjectClose();
    }

    private void string(Object obj)
    {
        add('"');
        obj = new StringCharacterIterator(obj.toString());
        char c = ((CharacterIterator) (obj)).first();
        while (c != '\uFFFF') 
        {
            if (c == '"')
            {
                add("\\\"");
            } else
            if (c == '\\')
            {
                add("\\\\");
            } else
            if (c == '\b')
            {
                add("\\b");
            } else
            if (c == '\f')
            {
                add("\\f");
            } else
            if (c == '\n')
            {
                add("\\n");
            } else
            if (c == '\r')
            {
                add("\\r");
            } else
            if (c == '\t')
            {
                add("\\t");
            } else
            if (Character.isISOControl(c))
            {
                unicode(c);
            } else
            {
                add(c);
            }
            c = ((CharacterIterator) (obj)).next();
        }
        add('"');
    }

    private void unicode(char c)
    {
        add("\\u");
        boolean flag = false;
        int i = c;
        for (c = flag; c < '\004'; c++)
        {
            add(hex[(0xf000 & i) >> 12]);
            i <<= 4;
        }

    }

    protected void add(char c)
    {
        buf.append(c);
    }

    protected void add(Object obj)
    {
        buf.append(obj);
    }

    protected void add(String s, Object obj)
    {
        add('"');
        add(s);
        add("\":");
        value(obj);
    }

    protected void add(java.util.Map.Entry entry)
    {
        value(entry.getKey());
        add(":");
        value(entry.getValue());
    }

    protected void addArrayClose()
    {
        add(']');
    }

    protected void addArrayOpen()
    {
        add('[');
    }

    protected void addArraySeparator()
    {
        add(",");
    }

    protected void addArrayValue(Object obj)
    {
        value(obj);
    }

    protected void addObjectClose()
    {
        add('}');
    }

    protected void addObjectOpen()
    {
        add('{');
    }

    protected void addObjectSeparator()
    {
        add(',');
    }

    protected void removeTrailingZeroAndAdd(String s)
    {
        StringBuffer stringbuffer = buf;
        String s1 = s;
        if (s.endsWith(".0"))
        {
            s1 = s.substring(0, s.length() - 2);
        }
        stringbuffer.append(s1);
    }

    protected void value(Object obj)
    {
        if (obj == null || cyclic(obj))
        {
            add("null");
            return;
        }
        calls.push(obj);
        if (obj instanceof Class)
        {
            string(obj);
        } else
        if (obj instanceof Boolean)
        {
            bool(((Boolean)obj).booleanValue());
        } else
        if (obj instanceof Double)
        {
            removeTrailingZeroAndAdd(obj.toString());
        } else
        if (obj instanceof Float)
        {
            removeTrailingZeroAndAdd(obj.toString());
        } else
        if (obj instanceof Number)
        {
            add(obj);
        } else
        if (obj instanceof String)
        {
            string(obj);
        } else
        if (obj instanceof Character)
        {
            string(obj);
        } else
        if (obj instanceof Map)
        {
            map((Map)obj);
        } else
        if (obj.getClass().isArray())
        {
            array(obj);
        } else
        if (obj instanceof Iterator)
        {
            array((Iterator)obj);
        } else
        if (obj instanceof Collection)
        {
            array(((Collection)obj).iterator());
        } else
        {
            throw new RuntimeException(obj.getClass().getCanonicalName());
        }
        calls.pop();
    }

    public String write(char c)
    {
        return (new StringBuilder("\"")).append(c).append("\"").toString();
    }

    public String write(double d)
    {
        return String.valueOf(d);
    }

    public String write(long l)
    {
        return String.valueOf(l);
    }

    public String write(Object obj)
    {
        buf.setLength(0);
        value(obj);
        return buf.toString();
    }

    public String write(boolean flag)
    {
        return String.valueOf(flag);
    }

}
