// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import android.util.Log;
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
            break MISSING_BLOCK_LABEL_113;
        }
        Object obj;
        int i;
        try
        {
            obj = a.get(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e(TAG, (new StringBuilder()).append("Error converting value of <").append(a.get(s)).append("> for key '").append(s).append("'").toString());
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!(obj instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = (Integer)obj;
        s = ((String) (obj));
        break MISSING_BLOCK_LABEL_148;
        i = Integer.parseInt(obj.toString());
        s = Integer.valueOf(i);
        break MISSING_BLOCK_LABEL_148;
        Log.w(TAG, (new StringBuilder()).append("Could not find property with name '").append(s).append("'").toString());
        return null;
        s = null;
        return s;
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
