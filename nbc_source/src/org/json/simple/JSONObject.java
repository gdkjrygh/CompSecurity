// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.json.simple:
//            JSONAware, JSONStreamAware, JSONValue

public class JSONObject extends HashMap
    implements Map, JSONAware, JSONStreamAware
{

    private static final long serialVersionUID = 0xf9036888bc188444L;

    public JSONObject()
    {
    }

    public JSONObject(Map map)
    {
        super(map);
    }

    public static String escape(String s)
    {
        return JSONValue.escape(s);
    }

    private static String toJSONString(String s, Object obj, StringBuffer stringbuffer)
    {
        stringbuffer.append('"');
        if (s == null)
        {
            stringbuffer.append("null");
        } else
        {
            JSONValue.escape(s, stringbuffer);
        }
        stringbuffer.append('"').append(':');
        stringbuffer.append(JSONValue.toJSONString(obj));
        return stringbuffer.toString();
    }

    public static String toJSONString(Map map)
    {
        if (map == null)
        {
            return "null";
        }
        StringBuffer stringbuffer = new StringBuffer();
        boolean flag = true;
        map = map.entrySet().iterator();
        stringbuffer.append('{');
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry;
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            entry = (java.util.Map.Entry)map.next();
            toJSONString(String.valueOf(entry.getKey()), entry.getValue(), stringbuffer);
        }
        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    public static String toString(String s, Object obj)
    {
        StringBuffer stringbuffer = new StringBuffer();
        toJSONString(s, obj, stringbuffer);
        return stringbuffer.toString();
    }

    public static void writeJSONString(Map map, Writer writer)
        throws IOException
    {
        if (map == null)
        {
            writer.write("null");
            return;
        }
        boolean flag = true;
        map = map.entrySet().iterator();
        writer.write(123);
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry;
            if (flag)
            {
                flag = false;
            } else
            {
                writer.write(44);
            }
            entry = (java.util.Map.Entry)map.next();
            writer.write(34);
            writer.write(escape(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            JSONValue.writeJSONString(entry.getValue(), writer);
        }
        writer.write(125);
    }

    public String toJSONString()
    {
        return toJSONString(((Map) (this)));
    }

    public String toString()
    {
        return toJSONString();
    }

    public void writeJSONString(Writer writer)
        throws IOException
    {
        writeJSONString(((Map) (this)), writer);
    }
}
