// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.json.simple:
//            JSONAware, JSONStreamAware, JSONValue

public class JSONArray extends ArrayList
    implements List, JSONAware, JSONStreamAware
{

    private static final long serialVersionUID = 0x36ed996451b68eedL;

    public JSONArray()
    {
    }

    public static String toJSONString(List list)
    {
        if (list == null)
        {
            return "null";
        }
        boolean flag = true;
        StringBuffer stringbuffer = new StringBuffer();
        list = list.iterator();
        stringbuffer.append('[');
        while (list.hasNext()) 
        {
            Object obj;
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            obj = list.next();
            if (obj == null)
            {
                stringbuffer.append("null");
            } else
            {
                stringbuffer.append(JSONValue.toJSONString(obj));
            }
        }
        stringbuffer.append(']');
        return stringbuffer.toString();
    }

    public static void writeJSONString(List list, Writer writer)
        throws IOException
    {
        if (list == null)
        {
            writer.write("null");
            return;
        }
        boolean flag = true;
        list = list.iterator();
        writer.write(91);
        while (list.hasNext()) 
        {
            Object obj;
            if (flag)
            {
                flag = false;
            } else
            {
                writer.write(44);
            }
            obj = list.next();
            if (obj == null)
            {
                writer.write("null");
            } else
            {
                JSONValue.writeJSONString(obj, writer);
            }
        }
        writer.write(93);
    }

    public String toJSONString()
    {
        return toJSONString(((List) (this)));
    }

    public String toString()
    {
        return toJSONString();
    }

    public void writeJSONString(Writer writer)
        throws IOException
    {
        writeJSONString(((List) (this)), writer);
    }
}
