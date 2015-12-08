// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import ezvcard.VCardDataType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package ezvcard.io.json:
//            JsonValue, JCardValue

public class JCardRawWriter
    implements Closeable, Flushable
{

    private boolean indent;
    private JsonGenerator jg;
    private boolean open;
    private final boolean wrapInArray;
    private final Writer writer;

    public JCardRawWriter(Writer writer1, boolean flag)
    {
        indent = false;
        open = false;
        writer = writer1;
        wrapInArray = flag;
    }

    private void indent(int i)
        throws IOException
    {
        if (indent)
        {
            jg.writeRaw(StringUtils.NEWLINE);
            int j = 0;
            while (j < i) 
            {
                jg.writeRaw(' ');
                j++;
            }
        }
    }

    private void init()
        throws IOException
    {
        JsonFactory jsonfactory = new JsonFactory();
        jsonfactory.configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        jg = jsonfactory.createJsonGenerator(writer);
        if (wrapInArray)
        {
            jg.writeStartArray();
            indent(0);
        }
    }

    private void writeValue(JsonValue jsonvalue)
        throws IOException
    {
        if (jsonvalue.isNull())
        {
            jg.writeNull();
        } else
        {
            Object obj = jsonvalue.getValue();
            if (obj != null)
            {
                if (obj instanceof Byte)
                {
                    jg.writeNumber(((Byte)obj).byteValue());
                    return;
                }
                if (obj instanceof Short)
                {
                    jg.writeNumber(((Short)obj).shortValue());
                    return;
                }
                if (obj instanceof Integer)
                {
                    jg.writeNumber(((Integer)obj).intValue());
                    return;
                }
                if (obj instanceof Long)
                {
                    jg.writeNumber(((Long)obj).longValue());
                    return;
                }
                if (obj instanceof Float)
                {
                    jg.writeNumber(((Float)obj).floatValue());
                    return;
                }
                if (obj instanceof Double)
                {
                    jg.writeNumber(((Double)obj).doubleValue());
                    return;
                }
                if (obj instanceof Boolean)
                {
                    jg.writeBoolean(((Boolean)obj).booleanValue());
                    return;
                } else
                {
                    jg.writeString(obj.toString());
                    return;
                }
            }
            obj = jsonvalue.getArray();
            if (obj != null)
            {
                jg.writeStartArray();
                for (jsonvalue = ((List) (obj)).iterator(); jsonvalue.hasNext(); writeValue((JsonValue)jsonvalue.next())) { }
                jg.writeEndArray();
                return;
            }
            jsonvalue = jsonvalue.getObject();
            if (jsonvalue != null)
            {
                jg.writeStartObject();
                java.util.Map.Entry entry;
                for (jsonvalue = jsonvalue.entrySet().iterator(); jsonvalue.hasNext(); writeValue((JsonValue)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)jsonvalue.next();
                    jg.writeFieldName((String)entry.getKey());
                }

                jg.writeEndObject();
                return;
            }
        }
    }

    public void close()
        throws IOException
    {
        if (jg == null)
        {
            return;
        } else
        {
            closeJsonStream();
            writer.close();
            return;
        }
    }

    public void closeJsonStream()
        throws IOException
    {
        if (jg == null)
        {
            return;
        }
        while (open) 
        {
            writeEndVCard();
        }
        if (wrapInArray)
        {
            indent(0);
            jg.writeEndArray();
        }
        jg.close();
    }

    public void flush()
        throws IOException
    {
        if (jg == null)
        {
            return;
        } else
        {
            jg.flush();
            return;
        }
    }

    public boolean isIndent()
    {
        return indent;
    }

    public void setIndent(boolean flag)
    {
        indent = flag;
    }

    public void writeEndVCard()
        throws IOException
    {
        if (!open)
        {
            throw new IllegalStateException("Call \"writeStartVCard\" first.");
        } else
        {
            jg.writeEndArray();
            jg.writeEndArray();
            open = false;
            return;
        }
    }

    public void writeProperty(String s, VCardDataType vcarddatatype, JCardValue jcardvalue)
        throws IOException
    {
        writeProperty(null, s, new VCardParameters(), vcarddatatype, jcardvalue);
    }

    public void writeProperty(String s, String s1, VCardParameters vcardparameters, VCardDataType vcarddatatype, JCardValue jcardvalue)
        throws IOException
    {
        if (!open)
        {
            throw new IllegalStateException("Call \"writeStartVCard\" first.");
        }
        jg.writeStartArray();
        indent(2);
        jg.writeString(s1);
        jg.writeStartObject();
        s1 = vcardparameters.iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)s1.next();
            vcardparameters = ((String)((java.util.Map.Entry) (obj)).getKey()).toLowerCase();
            obj = (List)((java.util.Map.Entry) (obj)).getValue();
            if (!((List) (obj)).isEmpty())
            {
                if (((List) (obj)).size() == 1)
                {
                    jg.writeStringField(vcardparameters, (String)((List) (obj)).get(0));
                } else
                {
                    jg.writeArrayFieldStart(vcardparameters);
                    for (vcardparameters = ((List) (obj)).iterator(); vcardparameters.hasNext(); jg.writeString(((String) (obj))))
                    {
                        obj = (String)vcardparameters.next();
                    }

                    jg.writeEndArray();
                }
            }
        } while (true);
        if (s != null)
        {
            jg.writeStringField("group", s);
        }
        jg.writeEndObject();
        s1 = jg;
        if (vcarddatatype == null)
        {
            s = "unknown";
        } else
        {
            s = vcarddatatype.getName().toLowerCase();
        }
        s1.writeString(s);
        if (jcardvalue.getValues().isEmpty())
        {
            jg.writeString("");
        } else
        {
            s = jcardvalue.getValues().iterator();
            while (s.hasNext()) 
            {
                writeValue((JsonValue)s.next());
            }
        }
        jg.writeEndArray();
    }

    public void writeStartVCard()
        throws IOException
    {
        if (jg == null)
        {
            init();
        }
        if (open)
        {
            writeEndVCard();
        }
        jg.writeStartArray();
        indent(0);
        jg.writeString("vcard");
        jg.writeStartArray();
        open = true;
    }
}
