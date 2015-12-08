// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Referenced classes of package org.json.simple:
//            JSONAware, JSONObject, JSONArray, JSONStreamAware

public class JSONValue
{

    public JSONValue()
    {
    }

    public static String escape(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            escape(s, stringbuffer);
            return stringbuffer.toString();
        }
    }

    static void escape(String s, StringBuffer stringbuffer)
    {
        int i = 0;
_L11:
        char c;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 8: default 96
    //                   8: 201
    //                   9: 241
    //                   10: 221
    //                   12: 211
    //                   13: 231
    //                   34: 175
    //                   47: 251
    //                   92: 191;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break; /* Loop/switch isn't completed */
_L7:
        stringbuffer.append("\\\"");
_L12:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        stringbuffer.append("\\\\");
          goto _L12
_L2:
        stringbuffer.append("\\b");
          goto _L12
_L5:
        stringbuffer.append("\\f");
          goto _L12
_L4:
        stringbuffer.append("\\n");
          goto _L12
_L6:
        stringbuffer.append("\\r");
          goto _L12
_L3:
        stringbuffer.append("\\t");
          goto _L12
_L8:
        stringbuffer.append("\\/");
          goto _L12
_L1:
        if ((c < 0 || c > '\037') && (c < '\177' || c > '\237') && (c < '\u2000' || c > '\u20FF'))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        String s1 = Integer.toHexString(c);
        stringbuffer.append("\\u");
        for (int j = 0; j < 4 - s1.length(); j++)
        {
            stringbuffer.append('0');
        }

        stringbuffer.append(s1.toUpperCase());
        break; /* Loop/switch isn't completed */
        stringbuffer.append(c);
          goto _L12
    }

    public static Object parse(Reader reader)
    {
        try
        {
            reader = ((Reader) ((new JSONParser()).parse(reader)));
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            return null;
        }
        return reader;
    }

    public static Object parse(String s)
    {
        return parse(((Reader) (new StringReader(s))));
    }

    public static Object parseWithException(Reader reader)
        throws IOException, ParseException
    {
        return (new JSONParser()).parse(reader);
    }

    public static Object parseWithException(String s)
        throws ParseException
    {
        return (new JSONParser()).parse(s);
    }

    public static String toJSONString(Object obj)
    {
        if (obj == null)
        {
            return "null";
        }
        if (obj instanceof String)
        {
            return "\"" + escape((String)obj) + "\"";
        }
        if (obj instanceof Double)
        {
            if (((Double)obj).isInfinite() || ((Double)obj).isNaN())
            {
                return "null";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Float)
        {
            if (((Float)obj).isInfinite() || ((Float)obj).isNaN())
            {
                return "null";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Number)
        {
            return obj.toString();
        }
        if (obj instanceof Boolean)
        {
            return obj.toString();
        }
        if (obj instanceof JSONAware)
        {
            return ((JSONAware)obj).toJSONString();
        }
        if (obj instanceof Map)
        {
            return JSONObject.toJSONString((Map)obj);
        }
        if (obj instanceof List)
        {
            return JSONArray.toJSONString((List)obj);
        } else
        {
            return obj.toString();
        }
    }

    public static void writeJSONString(Object obj, Writer writer)
        throws IOException
    {
        if (obj == null)
        {
            writer.write("null");
            return;
        }
        if (obj instanceof String)
        {
            writer.write(34);
            writer.write(escape((String)obj));
            writer.write(34);
            return;
        }
        if (obj instanceof Double)
        {
            if (((Double)obj).isInfinite() || ((Double)obj).isNaN())
            {
                writer.write("null");
                return;
            } else
            {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Float)
        {
            if (((Float)obj).isInfinite() || ((Float)obj).isNaN())
            {
                writer.write("null");
                return;
            } else
            {
                writer.write(obj.toString());
                return;
            }
        }
        if (obj instanceof Number)
        {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof Boolean)
        {
            writer.write(obj.toString());
            return;
        }
        if (obj instanceof JSONStreamAware)
        {
            ((JSONStreamAware)obj).writeJSONString(writer);
            return;
        }
        if (obj instanceof JSONAware)
        {
            writer.write(((JSONAware)obj).toJSONString());
            return;
        }
        if (obj instanceof Map)
        {
            JSONObject.writeJSONString((Map)obj, writer);
            return;
        }
        if (obj instanceof List)
        {
            JSONArray.writeJSONString((List)obj, writer);
            return;
        } else
        {
            writer.write(obj.toString());
            return;
        }
    }
}
