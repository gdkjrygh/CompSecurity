// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;

public abstract class ParserMinimalBase extends JsonParser
{

    public JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    protected ParserMinimalBase()
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
        throws IOException, JsonParseException
    {
        int i;
        int k;
        k = s.length();
        i = 0;
_L8:
        if (i >= k) goto _L2; else goto _L1
_L1:
        char c;
        int j;
        j = i + 1;
        c = s.charAt(i);
        if (j >= k) goto _L2; else goto _L3
_L3:
        int l;
        if (c <= ' ')
        {
            break MISSING_BLOCK_LABEL_376;
        }
        l = base64variant.decodeBase64Char(c);
        if (l < 0)
        {
            _reportInvalidBase64(base64variant, c, 0, null);
        }
        if (j >= k)
        {
            _reportBase64EOF();
        }
        i = j + 1;
        c = s.charAt(j);
        j = base64variant.decodeBase64Char(c);
        if (j < 0)
        {
            _reportInvalidBase64(base64variant, c, 1, null);
        }
        l = l << 6 | j;
        if (i < k) goto _L5; else goto _L4
_L4:
        if (base64variant.usesPadding()) goto _L7; else goto _L6
_L6:
        bytearraybuilder.append(l >> 4);
_L2:
        return;
_L7:
        _reportBase64EOF();
_L5:
        j = i + 1;
        char c1 = s.charAt(i);
        i = base64variant.decodeBase64Char(c1);
        if (i < 0)
        {
            if (i != -2)
            {
                _reportInvalidBase64(base64variant, c1, 2, null);
            }
            if (j >= k)
            {
                _reportBase64EOF();
            }
            i = j + 1;
            c1 = s.charAt(j);
            if (!base64variant.usesPaddingChar(c1))
            {
                _reportInvalidBase64(base64variant, c1, 3, (new StringBuilder("expected padding character '")).append(base64variant.getPaddingChar()).append("'").toString());
            }
            bytearraybuilder.append(l >> 4);
        } else
        {
            l = l << 6 | i;
            if (j >= k)
            {
                if (!base64variant.usesPadding())
                {
                    bytearraybuilder.appendTwoBytes(l >> 2);
                    return;
                }
                _reportBase64EOF();
            }
            i = j + 1;
            char c2 = s.charAt(j);
            j = base64variant.decodeBase64Char(c2);
            if (j < 0)
            {
                if (j != -2)
                {
                    _reportInvalidBase64(base64variant, c2, 3, null);
                }
                bytearraybuilder.appendTwoBytes(l >> 2);
            } else
            {
                bytearraybuilder.appendThreeBytes(l << 6 | j);
            }
        }
          goto _L8
        i = j;
          goto _L1
    }

    public abstract void _handleEOF()
        throws JsonParseException;

    public char _handleUnrecognizedCharacterEscape(char c)
        throws JsonProcessingException
    {
        while (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) 
        {
            return c;
        }
        _reportError((new StringBuilder("Unrecognized character escape ")).append(_getCharDesc(c)).toString());
        return c;
    }

    protected void _reportBase64EOF()
        throws JsonParseException
    {
        throw _constructError("Unexpected end-of-String in base64 content");
    }

    public final void _reportError(String s)
        throws JsonParseException
    {
        throw _constructError(s);
    }

    protected void _reportInvalidBase64(Base64Variant base64variant, char c, int i, String s)
        throws JsonParseException
    {
        Object obj;
        if (c <= ' ')
        {
            base64variant = (new StringBuilder("Illegal white space character (code 0x")).append(Integer.toHexString(c)).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (base64variant.usesPaddingChar(c))
        {
            base64variant = (new StringBuilder("Unexpected padding character ('")).append(base64variant.getPaddingChar()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(c) || Character.isISOControl(c))
        {
            base64variant = (new StringBuilder("Illegal character (code 0x")).append(Integer.toHexString(c)).append(") in base64 content").toString();
        } else
        {
            base64variant = (new StringBuilder("Illegal character '")).append(c).append("' (code 0x").append(Integer.toHexString(c)).append(") in base64 content").toString();
        }
        obj = base64variant;
        if (s != null)
        {
            obj = (new StringBuilder()).append(base64variant).append(": ").append(s).toString();
        }
        throw _constructError(((String) (obj)));
    }

    protected void _reportInvalidEOF()
        throws JsonParseException
    {
        _reportInvalidEOF((new StringBuilder(" in ")).append(_currToken).toString());
    }

    public void _reportInvalidEOF(String s)
        throws JsonParseException
    {
        _reportError((new StringBuilder("Unexpected end-of-input")).append(s).toString());
    }

    public void _reportInvalidEOFInValue()
        throws JsonParseException
    {
        _reportInvalidEOF(" in a value");
    }

    public void _reportUnexpectedChar(int i, String s)
        throws JsonParseException
    {
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
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public void _throwInvalidSpace(int i)
        throws JsonParseException
    {
        i = (char)i;
        _reportError((new StringBuilder("Illegal character (")).append(_getCharDesc(i)).append("): only regular white space (\\r, \\n, \\t) is allowed between tokens").toString());
    }

    public void _throwUnquotedSpace(int i, String s)
        throws JsonParseException
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32)
        {
            i = (char)i;
            _reportError((new StringBuilder("Illegal unquoted character (")).append(_getCharDesc(i)).append("): has to be escaped using backslash to be included in ").append(s).toString());
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

    public abstract String getText()
        throws IOException, JsonParseException;

    public int getValueAsInt(int i)
        throws IOException, JsonParseException
    {
        if (_currToken == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 5 11: default 60
    //                   5 62
    //                   6 67
    //                   7 69
    //                   8 69
    //                   9 80
    //                   10 71
    //                   11 62;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L3
_L2:
        return i;
_L3:
        return getIntValue();
_L4:
        return 1;
_L5:
        return 0;
_L7:
        return NumberInput.parseAsInt(getText(), i);
_L6:
        Object obj = getEmbeddedObject();
        if (obj instanceof Number)
        {
            return ((Number)obj).intValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public long getValueAsLong(long l)
        throws IOException, JsonParseException
    {
        if (_currToken == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 5 11: default 60
    //                   5 62
    //                   6 67
    //                   7 69
    //                   8 69
    //                   9 80
    //                   10 71
    //                   11 62;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L3
_L2:
        return l;
_L3:
        return getLongValue();
_L4:
        return 1L;
_L5:
        return 0L;
_L7:
        return NumberInput.parseAsLong(getText(), l);
_L6:
        Object obj = getEmbeddedObject();
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public String getValueAsString(String s)
        throws IOException, JsonParseException
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

    public abstract JsonToken nextToken()
        throws IOException, JsonParseException;

    public JsonToken nextValue()
        throws IOException, JsonParseException
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
        throws IOException, JsonParseException
    {
        if (_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
        {
            return this;
        }
        int i = 1;
        int j;
        do
        {
label0:
            do
            {
                JsonToken jsontoken = nextToken();
                if (jsontoken == null)
                {
                    _handleEOF();
                    return this;
                }
                switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
                {
                default:
                    break;

                case 1: // '\001'
                case 2: // '\002'
                    i++;
                    break;

                case 3: // '\003'
                case 4: // '\004'
                    j = i - 1;
                    break label0;
                }
            } while (true);
            i = j;
        } while (j != 0);
        return this;
    }
}
