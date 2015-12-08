// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import com.fasterxml.jackson.core.JsonToken;
import ezvcard.VCardException;

public class JCardParseException extends VCardException
{

    private final JsonToken actual;
    private final JsonToken expected;

    public JCardParseException(JsonToken jsontoken, JsonToken jsontoken1)
    {
        super((new StringBuilder()).append("Expected ").append(jsontoken).append(" but was ").append(jsontoken1).append(".").toString());
        expected = jsontoken;
        actual = jsontoken1;
    }

    public JsonToken getActualToken()
    {
        return actual;
    }

    public JsonToken getExpectedToken()
    {
        return expected;
    }
}
