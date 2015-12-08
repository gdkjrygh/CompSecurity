// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class asm
{

    public static Hashtable a(JSONObject jsonobject)
    {
        Hashtable hashtable = new Hashtable();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj instanceof JSONObject)
            {
                hashtable.put(s, a((JSONObject)obj));
            } else
            if (obj instanceof JSONArray)
            {
                obj = (JSONArray)obj;
                Vector vector = new Vector(((JSONArray) (obj)).length());
                int i = 0;
                while (i < ((JSONArray) (obj)).length()) 
                {
                    Object obj1 = ((JSONArray) (obj)).get(i);
                    if (obj1 instanceof JSONObject)
                    {
                        vector.add(a((JSONObject)obj1));
                    } else
                    {
                        vector.add(obj1);
                    }
                    i++;
                }
                hashtable.put(s, vector);
            } else
            {
                hashtable.put(s, obj);
            }
        }

        return hashtable;
    }

    public static Hashtable a(byte abyte0[])
    {
        axg.a(InterfaceActivityDirection.b, abyte0, "42baba60-eb57-11df-98cf-0800200c9a66");
        try
        {
            abyte0 = a(new JSONObject(new String(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            axt.a("Failed to parse JSON", abyte0);
            return null;
        }
        return abyte0;
    }

    private static JSONArray a(Vector vector)
    {
        JSONArray jsonarray = new JSONArray();
        for (vector = vector.iterator(); vector.hasNext();)
        {
            Object obj = vector.next();
            if (obj instanceof atn)
            {
                jsonarray.put(((atn)obj).g());
            } else
            if (obj instanceof Hashtable)
            {
                jsonarray.put(a((Hashtable)obj));
            } else
            {
                jsonarray.put(obj);
            }
        }

        return jsonarray;
    }

    public static JSONObject a(Hashtable hashtable)
    {
        JSONObject jsonobject = new JSONObject();
        for (Iterator iterator = hashtable.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = hashtable.get(s);
            if (obj instanceof atn)
            {
                jsonobject.put(s, ((atn)obj).g());
            } else
            if (obj instanceof Vector)
            {
                jsonobject.put(s, a((Vector)obj));
            } else
            if (obj instanceof Hashtable)
            {
                jsonobject.put(s, a((Hashtable)obj));
            } else
            {
                jsonobject.put(s, obj);
            }
        }

        return jsonobject;
    }

    public static byte[] a(ati ati1, byte byte0)
    {
        ati1 = ati1.a(byte0).toString().getBytes();
        axg.a(InterfaceActivityDirection.a, ati1, "42baba60-eb57-11df-98cf-0800200c9a66");
        return ati1;
        JSONException jsonexception;
        jsonexception;
        ati1 = null;
_L2:
        axt.a("Failed to encode messages to JSON.", jsonexception);
        return ati1;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
