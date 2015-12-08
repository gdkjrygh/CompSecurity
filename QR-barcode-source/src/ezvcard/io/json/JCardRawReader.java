// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import ezvcard.VCardDataType;
import ezvcard.parameter.VCardParameters;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package ezvcard.io.json:
//            JCardParseException, JCardValue, JsonValue

public class JCardRawReader
    implements Closeable
{
    public static interface JCardDataStreamListener
    {

        public abstract void beginVCard();

        public abstract void readProperty(String s, String s1, VCardParameters vcardparameters, VCardDataType vcarddatatype, JCardValue jcardvalue);
    }


    private boolean eof;
    private JsonParser jp;
    private JCardDataStreamListener listener;
    private final Reader reader;

    public JCardRawReader(Reader reader1)
    {
        eof = false;
        reader = reader1;
    }

    private VCardParameters parseParameters()
        throws IOException
    {
        if (jp.nextToken() != JsonToken.START_OBJECT)
        {
            throw new JCardParseException(JsonToken.START_OBJECT, jp.getCurrentToken());
        }
        VCardParameters vcardparameters = new VCardParameters();
        while (jp.nextToken() != JsonToken.END_OBJECT) 
        {
            String s = jp.getText();
            if (jp.nextToken() == JsonToken.START_ARRAY)
            {
                while (jp.nextToken() != JsonToken.END_ARRAY) 
                {
                    vcardparameters.put(s, jp.getText());
                }
            } else
            {
                vcardparameters.put(s, jp.getValueAsString());
            }
        }
        return vcardparameters;
    }

    private void parseProperties()
        throws IOException
    {
        if (jp.nextToken() != JsonToken.START_ARRAY)
        {
            throw new JCardParseException(JsonToken.START_ARRAY, jp.getCurrentToken());
        }
_L3:
        if (jp.nextToken() != JsonToken.END_ARRAY)
        {
            if (jp.getCurrentToken() != JsonToken.START_ARRAY)
            {
                throw new JCardParseException(JsonToken.START_ARRAY, jp.getCurrentToken());
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        jp.nextToken();
        parseProperty();
        if (true) goto _L3; else goto _L1
_L1:
    }

    private void parseProperty()
        throws IOException
    {
        if (jp.getCurrentToken() != JsonToken.VALUE_STRING)
        {
            throw new JCardParseException(JsonToken.VALUE_STRING, jp.getCurrentToken());
        }
        String s = jp.getValueAsString().toLowerCase();
        VCardParameters vcardparameters = parseParameters();
        Object obj = vcardparameters.removeAll("group");
        if (((List) (obj)).isEmpty())
        {
            obj = null;
        } else
        {
            obj = (String)((List) (obj)).get(0);
        }
        if (jp.nextToken() != JsonToken.VALUE_STRING)
        {
            throw new JCardParseException(JsonToken.VALUE_STRING, jp.getCurrentToken());
        }
        Object obj1 = jp.getText().toLowerCase();
        JCardValue jcardvalue;
        if ("unknown".equals(obj1))
        {
            obj1 = null;
        } else
        {
            obj1 = VCardDataType.get(((String) (obj1)));
        }
        jcardvalue = new JCardValue(parseValues());
        listener.readProperty(((String) (obj)), s, vcardparameters, ((VCardDataType) (obj1)), jcardvalue);
    }

    private JsonValue parseValue()
        throws IOException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jp.getCurrentToken().ordinal()])
        {
        default:
            return new JsonValue(parseValueElement());

        case 6: // '\006'
            return new JsonValue(parseValueArray());

        case 7: // '\007'
            return new JsonValue(parseValueObject());
        }
    }

    private List parseValueArray()
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        for (; jp.nextToken() != JsonToken.END_ARRAY; arraylist.add(parseValue())) { }
        return arraylist;
    }

    private Object parseValueElement()
        throws IOException
    {
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jp.getCurrentToken().ordinal()])
        {
        default:
            return jp.getText();

        case 1: // '\001'
        case 2: // '\002'
            return Boolean.valueOf(jp.getBooleanValue());

        case 3: // '\003'
            return Double.valueOf(jp.getDoubleValue());

        case 4: // '\004'
            return Long.valueOf(jp.getLongValue());

        case 5: // '\005'
            return null;
        }
    }

    private Map parseValueObject()
        throws IOException
    {
        HashMap hashmap = new HashMap();
        jp.nextToken();
        for (; jp.getCurrentToken() != JsonToken.END_OBJECT; jp.nextToken())
        {
            if (jp.getCurrentToken() != JsonToken.FIELD_NAME)
            {
                throw new JCardParseException(JsonToken.FIELD_NAME, jp.getCurrentToken());
            }
            String s = jp.getText();
            jp.nextToken();
            hashmap.put(s, parseValue());
        }

        return hashmap;
    }

    private List parseValues()
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        for (; jp.nextToken() != JsonToken.END_ARRAY; arraylist.add(parseValue())) { }
        return arraylist;
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public boolean eof()
    {
        return eof;
    }

    public int getLineNum()
    {
        if (jp == null)
        {
            return 0;
        } else
        {
            return jp.getCurrentLocation().getLineNr();
        }
    }

    public void readNext(JCardDataStreamListener jcarddatastreamlistener)
        throws IOException
    {
        JsonToken jsontoken;
        if (jp == null)
        {
            jp = (new JsonFactory()).createJsonParser(reader);
        } else
        if (jp.isClosed())
        {
            return;
        }
        listener = jcarddatastreamlistener;
        jsontoken = null;
        do
        {
            JsonToken jsontoken1 = jp.nextToken();
            if (jsontoken1 == null || jsontoken == JsonToken.START_ARRAY && jsontoken1 == JsonToken.VALUE_STRING && "vcard".equals(jp.getValueAsString()))
            {
                if (jsontoken1 == null)
                {
                    eof = true;
                    return;
                } else
                {
                    jcarddatastreamlistener.beginVCard();
                    parseProperties();
                    return;
                }
            }
            jsontoken = jsontoken1;
        } while (true);
    }
}
