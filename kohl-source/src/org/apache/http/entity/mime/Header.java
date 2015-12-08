// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package org.apache.http.entity.mime:
//            MinimalField

public class Header
    implements Iterable
{

    private final Map fieldMap = new HashMap();
    private final List fields = new LinkedList();

    public Header()
    {
    }

    public void addField(MinimalField minimalfield)
    {
        if (minimalfield == null)
        {
            return;
        }
        String s = minimalfield.getName().toLowerCase(Locale.US);
        List list = (List)fieldMap.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new LinkedList();
            fieldMap.put(s, obj);
        }
        ((List) (obj)).add(minimalfield);
        fields.add(minimalfield);
    }

    public MinimalField getField(String s)
    {
        if (s != null)
        {
            s = s.toLowerCase(Locale.US);
            s = (List)fieldMap.get(s);
            if (s != null && !s.isEmpty())
            {
                return (MinimalField)s.get(0);
            }
        }
        return null;
    }

    public List getFields()
    {
        return new ArrayList(fields);
    }

    public List getFields(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = s.toLowerCase(Locale.US);
        s = (List)fieldMap.get(s);
        if (s == null || s.isEmpty())
        {
            return Collections.emptyList();
        } else
        {
            return new ArrayList(s);
        }
    }

    public Iterator iterator()
    {
        return Collections.unmodifiableList(fields).iterator();
    }

    public int removeFields(String s)
    {
        if (s != null)
        {
            s = s.toLowerCase(Locale.US);
            s = (List)fieldMap.remove(s);
            if (s != null && !s.isEmpty())
            {
                fields.removeAll(s);
                return s.size();
            }
        }
        return 0;
    }

    public void setField(MinimalField minimalfield)
    {
        if (minimalfield == null)
        {
            return;
        }
        Object obj = minimalfield.getName().toLowerCase(Locale.US);
        obj = (List)fieldMap.get(obj);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            addField(minimalfield);
            return;
        }
        ((List) (obj)).clear();
        ((List) (obj)).add(minimalfield);
        int j = -1;
        int i = 0;
        for (Iterator iterator1 = fields.iterator(); iterator1.hasNext();)
        {
            int k = j;
            if (((MinimalField)iterator1.next()).getName().equalsIgnoreCase(minimalfield.getName()))
            {
                iterator1.remove();
                k = j;
                if (j == -1)
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        fields.add(j, minimalfield);
    }

    public String toString()
    {
        return fields.toString();
    }
}
