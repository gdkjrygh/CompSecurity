// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package au.com.bytecode.opencsv.bean:
//            HeaderColumnNameMappingStrategy

public class HeaderColumnNameTranslateMappingStrategy extends HeaderColumnNameMappingStrategy
{

    private Map columnMapping;

    public HeaderColumnNameTranslateMappingStrategy()
    {
        columnMapping = new HashMap();
    }

    public Map getColumnMapping()
    {
        return columnMapping;
    }

    protected String getColumnName(int i)
    {
        if (i < header.length)
        {
            return (String)columnMapping.get(header[i].toUpperCase());
        } else
        {
            return null;
        }
    }

    public void setColumnMapping(Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); columnMapping.put(s.toUpperCase(), map.get(s)))
        {
            s = (String)iterator.next();
        }

    }
}
