// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import com.adobe.mediacore.utils.ByteArraySerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.mediacore.metadata:
//            Metadata

public class MetadataNode
    implements Metadata, Serializable
{

    private static final long serialVersionUID = 1L;
    private final Map _byteArrays = new HashMap();
    private final Map _children = new HashMap();
    private final Map _objects = new HashMap();
    private final Map _values = new HashMap();

    public MetadataNode()
    {
    }

    public static Metadata fromByteArray(byte abyte0[])
    {
        abyte0 = ((byte []) (ByteArraySerializer.fromByteArray(abyte0)));
        if (abyte0 instanceof Metadata)
        {
            return (Metadata)abyte0;
        } else
        {
            return null;
        }
    }

    public final boolean containsKey(String s)
    {
        return _values.containsKey(s) || _children.containsKey(s) || _objects.containsKey(s);
    }

    public final boolean containsNode(String s)
    {
        return _children.containsKey(s);
    }

    public final boolean containsObject(String s)
    {
        return _objects.containsKey(s);
    }

    public final byte[] getByteArray(String s)
    {
        return (byte[])_byteArrays.get(s);
    }

    public final MetadataNode getNode(String s)
    {
        return (MetadataNode)_children.get(s);
    }

    public final Object getObject(String s)
    {
        return _objects.get(s);
    }

    public final String getValue(String s)
    {
        return (String)_values.get(s);
    }

    public final boolean isEmpty()
    {
        return _values.isEmpty() && _children.isEmpty();
    }

    public final Set keySet()
    {
        HashSet hashset = new HashSet();
        hashset.addAll(_values.keySet());
        hashset.addAll(_children.keySet());
        return hashset;
    }

    public final void setByteArray(String s, byte abyte0[])
    {
        _byteArrays.put(s, abyte0);
    }

    public final void setNode(String s, Metadata metadata)
    {
        _children.put(s, metadata);
    }

    public final void setObject(String s, Object obj)
    {
        _objects.put(s, obj);
    }

    public final void setValue(String s, String s1)
    {
        _values.put(s, s1);
        if (s1 != null)
        {
            _byteArrays.put(s, s1.getBytes());
        }
    }

    public byte[] toByteArray()
    {
        return ByteArraySerializer.toByteArray(this);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("{");
        String s;
        Object obj;
        for (Iterator iterator = _values.entrySet().iterator(); iterator.hasNext(); stringbuffer.append("\"").append(s).append("\":").append("\"").append(((String) (obj))).append("\","))
        {
            obj = (java.util.Map.Entry)iterator.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
        }

        if (_children.size() > 0)
        {
            stringbuffer.append("\"children\":{");
            String s1;
            Object obj1;
            for (Iterator iterator1 = _children.entrySet().iterator(); iterator1.hasNext(); stringbuffer.append("\"").append(s1).append("\":").append(obj1).append(","))
            {
                obj1 = (java.util.Map.Entry)iterator1.next();
                s1 = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (Metadata)((java.util.Map.Entry) (obj1)).getValue();
            }

            stringbuffer.deleteCharAt(stringbuffer.length() - 1);
            stringbuffer.append("}");
        } else
        {
            stringbuffer.append("\"children\":null");
        }
        return stringbuffer.append("}").toString();
    }
}
