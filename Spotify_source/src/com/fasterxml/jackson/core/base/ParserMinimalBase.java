// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;

public abstract class ParserMinimalBase extends JsonParser
{

    public JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    public ParserMinimalBase()
    {
    }

    public ParserMinimalBase(int i)
    {
        super(i);
    }

    public static final String _getCharDesc(int i)
    {
        char c = (char)i;
        if (Character.isISOControl(c))
        {
            return (new StringBuilder("(CTRL-CHAR, code ")).append(i).append(")").toString();
        }
        if (i > 255)
        {
            return (new StringBuilder("'")).append(c).append("' (code ").append(i).append(" / 0x").append(Integer.toHexString(i)).append(")").toString();
        } else
        {
            return (new StringBuilder("'")).append(c).append("' (code ").append(i).append(")").toString();
        }
    }

    protected final JsonParseException _constructError(String s, Throwable throwable)
    {
        return new JsonParseException(s, getCurrentLocation(), throwable);
    }

    public void _decodeBase64(String s, ByteArrayBuilder bytearraybuilder, Base64Variant base64variant)
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

    public abstract void _handleEOF();

    public char _handleUnrecognizedCharacterEscape(char c)
    {
        while (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) 
        {
            return c;
        }
        _reportError((new StringBuilder("Unrecognized character escape ")).append(_getCharDesc(c)).toString());
        return c;
    }

    protected boolean _hasTextualNull(String s)
    {
        return "null".equals(s);
    }

    public final void _reportError(String s)
    {
        throw _constructError(s);
    }

    protected void _reportInvalidEOF()
    {
        _reportInvalidEOF((new StringBuilder(" in ")).append(_currToken).toString());
    }

    public void _reportInvalidEOF(String s)
    {
        _reportError((new StringBuilder("Unexpected end-of-input")).append(s).toString());
    }

    public void _reportInvalidEOFInValue()
    {
        _reportInvalidEOF(" in a value");
    }

    public void _reportMissingRootWS(int i)
    {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
    }

    public void _reportUnexpectedChar(int i, String s)
    {
        if (i < 0)
        {
            _reportInvalidEOF();
        }
        String s2 = (new StringBuilder("Unexpected character (")).append(_getCharDesc(i)).append(")").toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(": ").append(s).toString();
        }
        _reportError(s1);
    }

    public final void _throwInternal()
    {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i)
    {
        i = (char)i;
        _reportError((new StringBuilder("Illegal character (")).append(_getCharDesc(i)).append("): only regular white space (\\r, \\n, \\t) is allowed between tokens").toString());
    }

    public void _throwUnquotedSpace(int i, String s)
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32)
        {
            i = (char)i;
            _reportError((new StringBuilder("Illegal unquoted character (")).append(_getCharDesc(i)).append("): has to be escaped using backslash to be included in ").append(s).toString());
        }
    }

    protected final void _wrapError(String s, Throwable throwable)
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

    public abstract String getText();

    public int getValueAsInt(int i)
    {
        JsonToken jsontoken = _currToken;
        if (jsontoken == null) goto _L2; else goto _L1
_L1:
        jsontoken.id();
        JVM INSTR tableswitch 6 12: default 56
    //                   6 58
    //                   7 79
    //                   8 79
    //                   9 84
    //                   10 86
    //                   11 88
    //                   12 90;
           goto _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L8
_L2:
        return i;
_L3:
        String s = getText();
        if (_hasTextualNull(s))
        {
            return 0;
        } else
        {
            return NumberInput.parseAsInt(s, i);
        }
_L4:
        return getIntValue();
_L5:
        return 1;
_L6:
        return 0;
_L7:
        return 0;
_L8:
        Object obj = getEmbeddedObject();
        if (obj instanceof Number)
        {
            return ((Number)obj).intValue();
        }
        if (true) goto _L2; else goto _L9
_L9:
    }

    public long getValueAsLong(long l)
    {
        JsonToken jsontoken = _currToken;
        if (jsontoken == null) goto _L2; else goto _L1
_L1:
        jsontoken.id();
        JVM INSTR tableswitch 6 12: default 56
    //                   6 58
    //                   7 79
    //                   8 79
    //                   9 84
    //                   10 86
    //                   11 86
    //                   12 88;
           goto _L2 _L3 _L4 _L4 _L5 _L6 _L6 _L7
_L2:
        return l;
_L3:
        String s = getText();
        if (_hasTextualNull(s))
        {
            return 0L;
        } else
        {
            return NumberInput.parseAsLong(s, l);
        }
_L4:
        return getLongValue();
_L5:
        return 1L;
_L6:
        return 0L;
_L7:
        Object obj = getEmbeddedObject();
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public String getValueAsString(String s)
    {
        if (_currToken != JsonToken.VALUE_STRING && (_currToken == null || _currToken == JsonToken.VALUE_NULL || !_currToken.isScalarValue()))
        {
            return s;
        } else
        {
            return getText();
        }
    }

    public boolean hasCurrentToken()
    {
        return _currToken != null;
    }

    public abstract JsonToken nextToken();

    public JsonToken nextValue()
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
