// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;


// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, ClassDeserializer

public class JdkDeserializers
{

    public JdkDeserializers()
    {
    }

    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new StringDeserializer(), new UUIDDeserializer(), new URLDeserializer(), new URIDeserializer(), new CurrencyDeserializer(), new PatternDeserializer(), new LocaleDeserializer(), new InetAddressDeserializer(), new CharsetDeserializer(), new AtomicBooleanDeserializer(), 
            new ClassDeserializer(), new StackTraceElementDeserializer()
        });
    }

    private class StringDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public String deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                return jsonparser.getText();
            }
            if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
                if (jsonparser == null)
                {
                    return null;
                }
                if (jsonparser instanceof byte[])
                {
                    return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false);
                } else
                {
                    return jsonparser.toString();
                }
            }
            if (jsontoken.isScalarValue())
            {
                return jsonparser.getText();
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public String deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public StringDeserializer()
        {
            super(java/lang/String);
        }
    }


    private class UUIDDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return UUID.fromString(s);
        }

        protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        {
            return _deserializeEmbedded(obj, deserializationcontext);
        }

        protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        {
            if (obj instanceof byte[])
            {
                obj = (byte[])(byte[])obj;
                if (obj.length != 16)
                {
                    deserializationcontext.mappingException((new StringBuilder()).append("Can only construct UUIDs from 16 byte arrays; got ").append(obj.length).append(" bytes").toString());
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


    private class URLDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URL _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return new URL(s);
        }

        public URLDeserializer()
        {
            super(java/net/URL);
        }
    }


    private class URIDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected URI _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return URI.create(s);
        }

        public URIDeserializer()
        {
            super(java/net/URI);
        }
    }


    private class CurrencyDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Currency _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return Currency.getInstance(s);
        }

        public CurrencyDeserializer()
        {
            super(java/util/Currency);
        }
    }


    private class PatternDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Pattern _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return Pattern.compile(s);
        }

        public PatternDeserializer()
        {
            super(java/util/regex/Pattern);
        }
    }


    private class LocaleDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Locale _deserialize(String s, DeserializationContext deserializationcontext)
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


    private class InetAddressDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected InetAddress _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return InetAddress.getByName(s);
        }

        public InetAddressDeserializer()
        {
            super(java/net/InetAddress);
        }
    }


    private class CharsetDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected Charset _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return Charset.forName(s);
        }

        public CharsetDeserializer()
        {
            super(java/nio/charset/Charset);
        }
    }


    private class AtomicBooleanDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public AtomicBoolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return new AtomicBoolean(_parseBooleanPrimitive(jsonparser, deserializationcontext));
        }

        public AtomicBooleanDeserializer()
        {
            super(java/util/concurrent/atomic/AtomicBoolean);
        }
    }


    private class StackTraceElementDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
                            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Non-numeric token (").append(jsontoken).append(") for property 'lineNumber'").toString());
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

}
