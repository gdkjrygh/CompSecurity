// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonLocation

public class JsonProcessingException extends IOException
{

    static final long serialVersionUID = 123L;
    protected JsonLocation _location;

    protected JsonProcessingException(String s)
    {
        super(s);
    }

    protected JsonProcessingException(String s, JsonLocation jsonlocation)
    {
        this(s, jsonlocation, null);
    }

    protected JsonProcessingException(String s, JsonLocation jsonlocation, Throwable throwable)
    {
        super(s);
        if (throwable != null)
        {
            initCause(throwable);
        }
        _location = jsonlocation;
    }

    protected JsonProcessingException(String s, Throwable throwable)
    {
        this(s, null, throwable);
    }

    protected JsonProcessingException(Throwable throwable)
    {
        this(null, null, throwable);
    }

    public JsonLocation getLocation()
    {
        return _location;
    }

    public String getMessage()
    {
        Object obj;
label0:
        {
            obj = super.getMessage();
            String s = ((String) (obj));
            if (obj == null)
            {
                s = "N/A";
            }
            JsonLocation jsonlocation = getLocation();
            String s1 = getMessageSuffix();
            if (jsonlocation == null)
            {
                obj = s;
                if (s1 == null)
                {
                    break label0;
                }
            }
            obj = new StringBuilder(100);
            ((StringBuilder) (obj)).append(s);
            if (s1 != null)
            {
                ((StringBuilder) (obj)).append(s1);
            }
            if (jsonlocation != null)
            {
                ((StringBuilder) (obj)).append('\n');
                ((StringBuilder) (obj)).append(" at ");
                ((StringBuilder) (obj)).append(jsonlocation.toString());
            }
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }

    protected String getMessageSuffix()
    {
        return null;
    }

    public String getOriginalMessage()
    {
        return super.getMessage();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append(": ").append(getMessage()).toString();
    }
}
