// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

public class Annotation
    implements Comparable, Serializable
{

    private static final long serialVersionUID = 0xa594bcd4354c38aeL;
    private Map attributes;
    private String type;

    public Annotation(String s)
    {
        type = null;
        attributes = null;
        setType(s);
        setAttributes(null);
    }

    public Annotation(String s, Map map)
    {
        type = null;
        attributes = null;
        setType(s);
        setAttributes(map);
    }

    Annotation(JSONObject jsonobject)
    {
        Object obj;
        String s;
        Object obj1;
        Iterator iterator1;
        type = null;
        attributes = null;
        s = null;
        obj1 = null;
        iterator1 = jsonobject.keys();
        obj = obj1;
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        s = (String)iterator1.next();
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        type = null;
        obj = obj1;
_L2:
        setType(s);
        setAttributes(((Map) (obj)));
        return;
_L4:
        jsonobject = jsonobject.getJSONObject(s);
        obj = new LinkedHashMap();
        try
        {
            Iterator iterator = jsonobject.keys();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                ((Map) (obj)).put(s1, jsonobject.getString(s1));
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
_L6:
        s = null;
        obj = null;
        if (true) goto _L2; else goto _L5
_L5:
        jsonobject;
          goto _L6
    }

    private SortedSet sortedNames()
    {
        TreeSet treeset = new TreeSet();
        treeset.addAll(getAttributes().keySet());
        return treeset;
    }

    public void addAttribute(String s, String s1)
    {
        attributes.put(s, s1);
    }

    JSONObject asJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put(type, attributes);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    String asParameterValue()
    {
        return asJSONObject().toString();
    }

    public Annotation attribute(String s, String s1)
    {
        addAttribute(s, s1);
        return this;
    }

    public Annotation attributes(Map map)
    {
        setAttributes(map);
        return this;
    }

    public int compareTo(Object obj)
    {
        return compareTo((Annotation)obj);
    }

    public int compareTo(Annotation annotation)
    {
        if (annotation != null) goto _L2; else goto _L1
_L1:
        int i = 1;
_L4:
        return i;
_L2:
        if (this == annotation)
        {
            return 0;
        }
        int j = getType().compareTo(annotation.getType());
        i = j;
        if (j == 0)
        {
            int k = size().compareTo(annotation.size());
            i = k;
            if (k == 0)
            {
                Iterator iterator = sortedNames().iterator();
                Iterator iterator1 = annotation.sortedNames().iterator();
label0:
                do
                {
label1:
                    {
                        if (!iterator.hasNext())
                        {
                            break label1;
                        }
                        String s = (String)iterator.next();
                        String s1 = (String)iterator1.next();
                        int l = s.compareTo(s1);
                        i = l;
                        if (l != 0)
                        {
                            continue;
                        }
                        i = ((String)getAttributes().get(s)).compareTo((String)annotation.getAttributes().get(s1));
                        if (i != 0)
                        {
                            return i;
                        }
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof Annotation)
            {
                obj = (Annotation)obj;
                if (!getType().equals(((Annotation) (obj)).getType()) || !getAttributes().equals(((Annotation) (obj)).getAttributes()))
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public Map getAttributes()
    {
        return attributes;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        return type.hashCode() * 31 + attributes.hashCode();
    }

    public boolean isEmpty()
    {
        return attributes.isEmpty();
    }

    public void setAttributes(Map map)
    {
        Object obj = map;
        if (map == null)
        {
            obj = new LinkedHashMap();
        }
        attributes = ((Map) (obj));
    }

    public void setType(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        type = s1;
    }

    public Integer size()
    {
        return new Integer(attributes.size());
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("Annotation{type='");
        stringbuffer.append(type).append("', attributes={");
        Iterator iterator = attributes.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)attributes.get(s);
            stringbuffer.append('\'').append(s).append("'='").append(s1).append('\'');
            if (iterator.hasNext())
            {
                stringbuffer.append(", ");
            }
        } while (true);
        stringbuffer.append("}}");
        return stringbuffer.toString();
    }

    public Annotation type(String s)
    {
        setType(s);
        return this;
    }
}
