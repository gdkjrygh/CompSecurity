// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NodeCursor, POJONode, BinaryNode

public class TreeTraversingParser extends ParserMinimalBase
{

    protected boolean _closed;
    protected JsonToken _nextToken;
    protected NodeCursor _nodeCursor;
    protected ObjectCodec _objectCodec;
    protected boolean _startContainer;

    public TreeTraversingParser(JsonNode jsonnode, ObjectCodec objectcodec)
    {
        super(0);
        _objectCodec = objectcodec;
        if (jsonnode.isArray())
        {
            _nextToken = JsonToken.START_ARRAY;
            _nodeCursor = new NodeCursor.Array(jsonnode, null);
            return;
        }
        if (jsonnode.isObject())
        {
            _nextToken = JsonToken.START_OBJECT;
            _nodeCursor = new NodeCursor.Object(jsonnode, null);
            return;
        } else
        {
            _nodeCursor = new NodeCursor.RootValue(jsonnode, null);
            return;
        }
    }

    protected void _handleEOF()
    {
        _throwInternal();
    }

    public void close()
    {
        if (!_closed)
        {
            _closed = true;
            _nodeCursor = null;
            _currToken = null;
        }
    }

    protected JsonNode currentNode()
    {
        if (_closed || _nodeCursor == null)
        {
            return null;
        } else
        {
            return _nodeCursor.currentNode();
        }
    }

    protected JsonNode currentNumericNode()
    {
        Object obj = currentNode();
        if (obj == null || !((JsonNode) (obj)).isNumber())
        {
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((JsonNode) (obj)).asToken();
            }
            throw _constructError((new StringBuilder("Current token (")).append(obj).append(") not numeric, can not use numeric value accessors").toString());
        } else
        {
            return ((JsonNode) (obj));
        }
    }

    public BigInteger getBigIntegerValue()
    {
        return currentNumericNode().bigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        base64variant = currentNode();
        if (base64variant != null)
        {
            byte abyte0[] = base64variant.binaryValue();
            if (abyte0 != null)
            {
                return abyte0;
            }
            if (base64variant.isPojo())
            {
                base64variant = ((Base64Variant) (((POJONode)base64variant).getPojo()));
                if (base64variant instanceof byte[])
                {
                    return (byte[])base64variant;
                }
            }
        }
        return null;
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public JsonLocation getCurrentLocation()
    {
        return JsonLocation.NA;
    }

    public String getCurrentName()
    {
        if (_nodeCursor == null)
        {
            return null;
        } else
        {
            return _nodeCursor.getCurrentName();
        }
    }

    public BigDecimal getDecimalValue()
    {
        return currentNumericNode().decimalValue();
    }

    public double getDoubleValue()
    {
        return currentNumericNode().doubleValue();
    }

    public Object getEmbeddedObject()
    {
        if (!_closed)
        {
            JsonNode jsonnode = currentNode();
            if (jsonnode != null)
            {
                if (jsonnode.isPojo())
                {
                    return ((POJONode)jsonnode).getPojo();
                }
                if (jsonnode.isBinary())
                {
                    return ((BinaryNode)jsonnode).binaryValue();
                }
            }
        }
        return null;
    }

    public float getFloatValue()
    {
        return (float)currentNumericNode().doubleValue();
    }

    public int getIntValue()
    {
        return currentNumericNode().intValue();
    }

    public long getLongValue()
    {
        return currentNumericNode().longValue();
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
    {
        JsonNode jsonnode = currentNumericNode();
        if (jsonnode == null)
        {
            return null;
        } else
        {
            return jsonnode.numberType();
        }
    }

    public Number getNumberValue()
    {
        return currentNumericNode().numberValue();
    }

    public String getText()
    {
        if (!_closed) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 71
    //                   2 79
    //                   3 87
    //                   4 87
    //                   5 98;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        if (_currToken != null)
        {
            return _currToken.asString();
        }
          goto _L8
_L4:
        return _nodeCursor.getCurrentName();
_L5:
        return currentNode().textValue();
_L6:
        return String.valueOf(currentNode().numberValue());
_L7:
        JsonNode jsonnode = currentNode();
        if (jsonnode != null && jsonnode.isBinary())
        {
            return jsonnode.asText();
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (true) goto _L1; else goto _L9
_L9:
    }

    public char[] getTextCharacters()
    {
        return getText().toCharArray();
    }

    public int getTextLength()
    {
        return getText().length();
    }

    public int getTextOffset()
    {
        return 0;
    }

    public JsonLocation getTokenLocation()
    {
        return JsonLocation.NA;
    }

    public boolean hasTextCharacters()
    {
        return false;
    }

    public JsonToken nextToken()
    {
        if (_nextToken != null)
        {
            _currToken = _nextToken;
            _nextToken = null;
            return _currToken;
        }
        if (_startContainer)
        {
            _startContainer = false;
            if (!_nodeCursor.currentHasChildren())
            {
                JsonToken jsontoken;
                if (_currToken == JsonToken.START_OBJECT)
                {
                    jsontoken = JsonToken.END_OBJECT;
                } else
                {
                    jsontoken = JsonToken.END_ARRAY;
                }
                _currToken = jsontoken;
                return _currToken;
            }
            _nodeCursor = _nodeCursor.iterateChildren();
            _currToken = _nodeCursor.nextToken();
            if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
            {
                _startContainer = true;
            }
            return _currToken;
        }
        if (_nodeCursor == null)
        {
            _closed = true;
            return null;
        }
        _currToken = _nodeCursor.nextToken();
        if (_currToken != null)
        {
            if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
            {
                _startContainer = true;
            }
            return _currToken;
        } else
        {
            _currToken = _nodeCursor.endToken();
            _nodeCursor = _nodeCursor.getParent();
            return _currToken;
        }
    }

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
    {
        int i = 0;
        base64variant = getBinaryValue(base64variant);
        if (base64variant != null)
        {
            outputstream.write(base64variant, 0, base64variant.length);
            i = base64variant.length;
        }
        return i;
    }

    public JsonParser skipChildren()
    {
        if (_currToken == JsonToken.START_OBJECT)
        {
            _startContainer = false;
            _currToken = JsonToken.END_OBJECT;
        } else
        if (_currToken == JsonToken.START_ARRAY)
        {
            _startContainer = false;
            _currToken = JsonToken.END_ARRAY;
            return this;
        }
        return this;
    }
}
