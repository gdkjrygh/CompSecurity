// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.util.ErrorUtil;
import java.io.Serializable;
import java.util.Map;

public abstract class MetadataObject
    implements Serializable
{

    public static final String TAG = com/brightcove/player/model/MetadataObject.getSimpleName();
    protected Map a;

    public MetadataObject(Map map)
    {
        if (map == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("propertiesRequired"));
        } else
        {
            a = map;
            return;
        }
    }

    public Integer getIntegerProperty(String s)
    {
        if (!a.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj;
        int i;
        try
        {
            obj = a.get(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            (new StringBuilder("Error converting value of <")).append(a.get(s)).append("> for key '").append(s).append("'");
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (obj instanceof Integer)
        {
            return (Integer)obj;
        }
        i = Integer.parseInt(obj.toString());
        return Integer.valueOf(i);
        (new StringBuilder("Could not find property with name '")).append(s).append("'");
        return null;
    }

    public Map getProperties()
    {
        return a;
    }

    public String getStringProperty(String s)
    {
        if (a.containsKey(s))
        {
            s = ((String) (a.get(s)));
            if (s instanceof String)
            {
                return (String)s;
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MetadataObject");
        stringbuilder.append("{properties: ").append(a.size());
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
