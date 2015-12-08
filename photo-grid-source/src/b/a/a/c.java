// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a.a:
//            b, d

public final class c extends HashMap
    implements b, Map
{

    public c()
    {
    }

    public static String a(Map map)
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
            String s;
            Object obj;
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            obj = (java.util.Map.Entry)map.next();
            s = String.valueOf(((java.util.Map.Entry) (obj)).getKey());
            obj = ((java.util.Map.Entry) (obj)).getValue();
            stringbuffer.append('"');
            if (s == null)
            {
                stringbuffer.append("null");
            } else
            {
                d.a(s, stringbuffer);
            }
            stringbuffer.append('"').append(':');
            stringbuffer.append(d.a(obj));
        }
        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    public final String a()
    {
        return a(((Map) (this)));
    }

    public final String toString()
    {
        return a(this);
    }
}
