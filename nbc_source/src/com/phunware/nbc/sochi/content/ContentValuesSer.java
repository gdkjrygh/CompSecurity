// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;

import android.content.ContentValues;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ContentValuesSer
    implements Serializable
{

    private static final long serialVersionUID = 0xdf0a5bf3f2deceebL;
    Properties props;

    public ContentValuesSer(ContentValues contentvalues)
    {
        props = new Properties();
        if (contentvalues != null)
        {
            contentvalues = contentvalues.valueSet().iterator();
            do
            {
                if (!contentvalues.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)contentvalues.next();
                String s = (String)entry.getKey();
                if (s != null)
                {
                    props.put(s, entry.getValue().toString());
                }
            } while (true);
        }
    }

    public Properties get()
    {
        return props;
    }
}
