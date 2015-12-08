// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Throwables;
import java.io.IOException;

// Referenced classes of package com.google.api.client.json:
//            JsonFactory

public class GenericJson extends GenericData
    implements Cloneable
{

    private JsonFactory jsonFactory;

    public GenericJson()
    {
    }

    public GenericJson clone()
    {
        return (GenericJson)super.clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final JsonFactory getFactory()
    {
        return jsonFactory;
    }

    public GenericJson set(String s, Object obj)
    {
        return (GenericJson)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public final void setFactory(JsonFactory jsonfactory)
    {
        jsonFactory = jsonfactory;
    }

    public String toPrettyString()
        throws IOException
    {
        if (jsonFactory != null)
        {
            return jsonFactory.toPrettyString(this);
        } else
        {
            return super.toString();
        }
    }

    public String toString()
    {
        if (jsonFactory != null)
        {
            String s;
            try
            {
                s = jsonFactory.toString(this);
            }
            catch (IOException ioexception)
            {
                throw Throwables.propagate(ioexception);
            }
            return s;
        } else
        {
            return super.toString();
        }
    }
}
