// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            NamespaceMap, OutputNode

class PrefixResolver extends LinkedHashMap
    implements NamespaceMap
{

    private final OutputNode source;

    public PrefixResolver(OutputNode outputnode)
    {
        source = outputnode;
    }

    private String resolvePrefix(String s)
    {
        NamespaceMap namespacemap = source.getNamespaces();
        if (namespacemap != null)
        {
            s = namespacemap.getPrefix(s);
            if (!containsValue(s))
            {
                return s;
            }
        }
        return null;
    }

    private String resolveReference(String s)
    {
        NamespaceMap namespacemap = source.getNamespaces();
        if (namespacemap != null)
        {
            return namespacemap.getReference(s);
        } else
        {
            return null;
        }
    }

    public String getPrefix(String s)
    {
        if (size() > 0)
        {
            String s1 = (String)get(s);
            if (s1 != null)
            {
                return s1;
            }
        }
        return resolvePrefix(s);
    }

    public String getReference(String s)
    {
label0:
        {
            if (!containsValue(s))
            {
                break label0;
            }
            Iterator iterator1 = iterator();
            String s1;
            String s2;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                s1 = (String)iterator1.next();
                s2 = (String)get(s1);
            } while (s2 == null || !s2.equals(s));
            return s1;
        }
        return resolveReference(s);
    }

    public Iterator iterator()
    {
        return keySet().iterator();
    }

    public String setReference(String s, String s1)
    {
        if (resolvePrefix(s) != null)
        {
            return null;
        } else
        {
            return (String)put(s, s1);
        }
    }
}
