// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

public abstract class ParserMinimalBase extends JsonParser
{

    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    protected ParserMinimalBase()
    {
    }

    protected ParserMinimalBase(int i)
    {
        super(i);
    }

    protected static final String _getCharDesc(int i)
    {
        char c = (char)i;
        if (Character.isISOControl(c))
        {
            return (new StringBuilder()).append("(CTRL-CHAR, code ").append(i).append(")").toString();
        }
        if (i > 255)
        {
            return (new StringBuilder()).append("'").append(c).append("' (code ").append(i).append(" / 0x").append(Integer.toHexString(i)).append(")").toString();
        } else
        {
            return (new StringBuilder()).append("'").append(c).append("' (code ").append(i).append(")").toString();
        }
    }

    protected final JsonParseException _constructError(String s, Throwable throwable)
    {
        return new JsonParseException(s, getCurrentLocation(), throwable);
    }

    protected void _decodeBase64(String s, ByteArrayBuilder bytearraybuilder, Base64Variant base64variant)
        throws IOException
    {
        try
        {
            base64variant.decode(s, bytearraybuilder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            _reportError(s.getMessage());
        }
    }

    protected abstract void _handleEOF()
        throws JsonParseException;

    protected char _handleUnrecognizedCharacterEscape(char c)
        throws JsonProcessingException
    {
        while (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) 
        {
            return c;
        }
        _reportError((new StringBuilder()).append("Unrecognized character escape ").append(_getCharDesc(c)).toString());
        return c;
    }

    protected final void _reportError(String s)
        throws JsonParseException
    {
        throw _constructError(s);
    }

    protected void _reportInvalidEOF()
        throws JsonParseException
    {
        _reportInvalidEOF((new StringBuilder()).append(" in ").append(_currToken).toString());
    }

    protected void _reportInvalidEOF(String s)
        throws JsonParseException
    {
        _reportError((new StringBuilder()).append("Unexpected end-of-input").append(s).toString());
    }

    protected void _reportInvalidEOFInValue()
        throws JsonParseException
    {
        _reportInvalidEOF(" in a value");
    }

    protected void _reportMissingRootWS(int i)
        throws JsonParseException
    {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
    }

    protected void _reportUnexpectedChar(int i, String s)
        throws JsonParseException
    {
        if (i < 0)
        {
            _reportInvalidEOF();
        }
        String s2 = (new StringBuilder()).append("Unexpected character (").append(_getCharDesc(i)).append(")").toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(": ").append(s).toString();
        }
        _reportError(s1);
    }

    protected final void _throwInternal()
    {
        VersionUtil.throwInternal();
    }

    protected void _throwInvalidSpace(int i)
        throws JsonParseException
    {
        i = (char)i;
        _reportError((new StringBuilder()).append("Illegal character (").append(_getCharDesc(i)).append("): only regular white space (\\r, \\n, \\t) is allowed between tokens").toString());
    }

    protected void _throwUnquotedSpace(int i, String s)
        throws JsonParseException
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32)
        {
            i = (char)i;
            _reportError((new StringBuilder()).append("Illegal unquoted character (").append(_getCharDesc(i)).append("): has to be escaped using backslash to be included in ").append(s).toString());
        }
    }

    protected final void _wrapError(String s, Throwable throwable)
        throws JsonParseException
    {
        throw _constructError(s, throwable);
    }

    public void clearCurrentToken()
    {
        if (_currToken != null)
        {
            _lastClearedToken = _currToken;
            _currToken = null;
        }
    }

    public JsonToken getCurrentToken()
    {
        return _currToken;
    }

    public final int getCurrentTokenId()
    {
        JsonToken jsontoken = _currToken;
        if (jsontoken == null)
        {
            return 0;
        } else
        {
            return jsontoken.id();
        }
    }

    public abstract String getText()
        throws IOException;

    public String getValueAsString(String s)
        throws IOException
    {
        if (_currToken != JsonToken.VALUE_STRING && (_currToken == null || _currToken == JsonToken.VALUE_NULL || !_currToken.isScalarValue()))
        {
            return s;
        } else
        {
            return getText();
        }
    }

    public boolean isExpectedStartArrayToken()
    {
        return _currToken == JsonToken.START_ARRAY;
    }

    public abstract JsonToken nextToken()
        throws IOException;

    public JsonToken nextValue()
        throws IOException
    {
        JsonToken jsontoken1 = nextToken();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == JsonToken.FIELD_NAME)
        {
            jsontoken = nextToken();
        }
        return jsontoken;
    }

    public JsonParser skipChildren()
        throws IOException
    {
        if (_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
        {
            return this;
        }
        int i = 1;
        int j;
        do
        {
            JsonToken jsontoken;
            do
            {
                do
                {
                    jsontoken = nextToken();
                    if (jsontoken == null)
                    {
                        _handleEOF();
                        return this;
                    }
                    if (!jsontoken.isStructStart())
                    {
                        break;
                    }
                    i++;
                } while (true);
            } while (!jsontoken.isStructEnd());
            j = i - 1;
            i = j;
        } while (j != 0);
        return this;
    }
}
