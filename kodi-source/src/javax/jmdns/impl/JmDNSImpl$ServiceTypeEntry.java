// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package javax.jmdns.impl:
//            JmDNSImpl

public static class _type extends AbstractMap
    implements Cloneable
{
    private static class SubTypeEntry
        implements Serializable, Cloneable, java.util.Map.Entry
    {

        private final String _key;
        private final String _value;

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public SubTypeEntry clone()
        {
            return this;
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            boolean flag;
            if (getKey().equals(((java.util.Map.Entry)obj).getKey()) && getValue().equals(((java.util.Map.Entry)obj).getValue()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public volatile Object getKey()
        {
            return getKey();
        }

        public String getKey()
        {
            return _key;
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public String getValue()
        {
            return _value;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (_key == null)
            {
                i = 0;
            } else
            {
                i = _key.hashCode();
            }
            if (_value != null)
            {
                j = _value.hashCode();
            }
            return i ^ j;
        }

        public volatile Object setValue(Object obj)
        {
            return setValue((String)obj);
        }

        public String setValue(String s)
        {
            throw new UnsupportedOperationException();
        }

        public String toString()
        {
            return (new StringBuilder()).append(_key).append("=").append(_value).toString();
        }

        public SubTypeEntry(String s)
        {
            if (s == null)
            {
                s = "";
            }
            _value = s;
            _key = _value.toLowerCase();
        }
    }


    private final Set _entrySet = new HashSet();
    private final String _type;

    public boolean add(String s)
    {
        if (s == null || contains(s))
        {
            return false;
        } else
        {
            _entrySet.add(new SubTypeEntry(s));
            return true;
        }
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public clone clone()
    {
        clone clone1 = new <init>(getType());
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext(); clone1.add((String)((java.util.eEntry.add)iterator.next()).add())) { }
        return clone1;
    }

    public boolean contains(String s)
    {
        return s != null && containsKey(s.toLowerCase());
    }

    public Set entrySet()
    {
        return _entrySet;
    }

    public String getType()
    {
        return _type;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        if (isEmpty())
        {
            stringbuilder.append("empty");
        } else
        {
            for (Iterator iterator = values().iterator(); iterator.hasNext(); stringbuilder.append(", "))
            {
                stringbuilder.append((String)iterator.next());
            }

            stringbuilder.setLength(stringbuilder.length() - 2);
        }
        return stringbuilder.toString();
    }

    public SubTypeEntry._value(String s)
    {
        _type = s;
    }
}
