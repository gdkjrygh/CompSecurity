// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

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
        String s = minimalfield.getName().toLowerCase(Locale.ENGLISH);
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
        if (s == null)
        {
            return null;
        }
        s = s.toLowerCase(Locale.ENGLISH);
        s = (List)fieldMap.get(s);
        if (s != null && !s.isEmpty())
        {
            return (MinimalField)s.get(0);
        } else
        {
            return null;
        }
    }

    public Iterator iterator()
    {
        return Collections.unmodifiableList(fields).iterator();
    }

    public String toString()
    {
        return fields.toString();
    }
}
