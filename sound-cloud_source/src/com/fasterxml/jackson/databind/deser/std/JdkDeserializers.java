// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, StringDeserializer, ClassDeserializer, StdScalarDeserializer, 
//            FromStringDeserializer

public class JdkDeserializers
{
    public static class AtomicBooleanDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public AtomicBoolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return new AtomicBoolean(_parseBooleanPrimitive(jsonparser, deserializationcontext));
        }

        public AtomicBooleanDeserializer()
        {
            super(java/util/concurrent/atomic/AtomicBoolean);
        }
    }

    public static class AtomicReferenceDeserializer extends StdScalarDeserializer
        implements ContextualDeserializer
    {

        protected final JavaType _referencedType;
        protected final JsonDeserializer _valueDeserializer;

        public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
            throws JsonMappingException
        {
            if (_valueDeserializer != null)
            {
                return this;
            } else
            {
                return new AtomicReferenceDeserializer(_referencedType, deserializationcontext.findContextualValueDeserializer(_referencedType, beanproperty));
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public AtomicReference deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return new AtomicReference(_valueDeserializer.deserialize(jsonparser, deserializationcontext));
        }

        public AtomicReferenceDeserializer(JavaType javatype)
        {
            this(javatype, null);
        }

        public AtomicReferenceDeserializer(JavaType javatype, JsonDeserializer jsondeserializer)
        {
            super(java/util/concurrent/atomic/AtomicReference);
            _referencedType = javatype;
            _valueDeserializer = jsondeserializer;
        }
    }

    protected static class CharsetDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Charset _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return Charset.forName(s);
        }

        public CharsetDeserializer()
        {
            super(java/nio/charset/Charset);
        }
    }

    public static class CurrencyDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Currency _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return Currency.getInstance(s);
        }

        public CurrencyDeserializer()
        {
            super(java/util/Currency);
        }
    }

    protected static class InetAddressDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected InetAddress _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return InetAddress.getByName(s);
        }

        public InetAddressDeserializer()
        {
            super(java/net/InetAddress);
        }
    }

    protected static class LocaleDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Locale _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            int i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(s);
            }
            deserializationcontext = s.substring(0, i);
            s = s.substring(i + 1);
            i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(deserializationcontext, s);
            } else
            {
                return new Locale(deserializationcontext, s.substring(0, i), s.substring(i + 1));
            }
        }

        public LocaleDeserializer()
        {
            super(java/util/Locale);
        }
    }

    public static class PatternDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Pattern _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return Pattern.compile(s);
        }

        public PatternDeserializer()
        {
            super(java/util/regex/Pattern);
        }
    }

    public static class StackTraceElementDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.START_OBJECT)
            {
                obj = "";
                String s = "";
                String s1 = "";
                int i = -1;
                do
                {
                    JsonToken jsontoken = jsonparser.nextValue();
                    if (jsontoken == JsonToken.END_OBJECT)
                    {
                        break;
                    }
                    String s2 = jsonparser.getCurrentName();
                    if ("className".equals(s2))
                    {
                        obj = jsonparser.getText();
                    } else
                    if ("fileName".equals(s2))
                    {
                        s1 = jsonparser.getText();
                    } else
                    if ("lineNumber".equals(s2))
                    {
                        if (jsontoken.isNumeric())
                        {
                            i = jsonparser.getIntValue();
                        } else
                        {
                            throw JsonMappingException.from(jsonparser, (new StringBuilder("Non-numeric token (")).append(jsontoken).append(") for property 'lineNumber'").toString());
                        }
                    } else
                    if ("methodName".equals(s2))
                    {
                        s = jsonparser.getText();
                    } else
                    if (!"nativeMethod".equals(s2))
                    {
                        handleUnknownProperty(jsonparser, deserializationcontext, _valueClass, s2);
                    }
                } while (true);
                return new StackTraceElement(((String) (obj)), s, s1, i);
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }

        public StackTraceElementDeserializer()
        {
            super(java/lang/StackTraceElement);
        }
    }

    public static class URIDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URI _deserialize(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException
        {
            return URI.create(s);
        }

        public URIDeserializer()
        {
            super(java/net/URI);
        }
    }

    public static class URLDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URL _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException
        {
            return new URL(s);
        }

        public URLDeserializer()
        {
            super(java/net/URL);
        }
    }

    public static class UUIDDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserialize(s, deserializationcontext);
        }

        protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return UUID.fromString(s);
        }

        protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserializeEmbedded(obj, deserializationcontext);
        }

        protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (obj instanceof byte[])
            {
                obj = (byte[])(byte[])obj;
                if (obj.length != 16)
                {
                    deserializationcontext.mappingException((new StringBuilder("Can only construct UUIDs from 16 byte arrays; got ")).append(obj.length).append(" bytes").toString());
                }
                obj = new DataInputStream(new ByteArrayInputStream(((byte []) (obj))));
                return new UUID(((DataInputStream) (obj)).readLong(), ((DataInputStream) (obj)).readLong());
            } else
            {
                super._deserializeEmbedded(obj, deserializationcontext);
                return null;
            }
        }

        public UUIDDeserializer()
        {
            super(java/util/UUID);
        }
    }


    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new StringDeserializer(), new UUIDDeserializer(), new URLDeserializer(), new URIDeserializer(), new CurrencyDeserializer(), new PatternDeserializer(), new LocaleDeserializer(), new InetAddressDeserializer(), new CharsetDeserializer(), new AtomicBooleanDeserializer(), 
            new ClassDeserializer(), new StackTraceElementDeserializer()
        });
    }
}
