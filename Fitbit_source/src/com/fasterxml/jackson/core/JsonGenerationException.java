// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonProcessingException, JsonLocation

public class JsonGenerationException extends JsonProcessingException
{

    private static final long serialVersionUID = 123L;

    public JsonGenerationException(String s)
    {
        super(s, (JsonLocation)null);
    }

    public JsonGenerationException(String s, Throwable throwable)
    {
        super(s, (JsonLocation)null, throwable);
    }

    public JsonGenerationException(Throwable throwable)
    {
        super(throwable);
    }
}
