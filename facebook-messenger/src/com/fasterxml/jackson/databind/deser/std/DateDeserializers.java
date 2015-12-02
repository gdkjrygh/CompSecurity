// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import java.util.GregorianCalendar;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class DateDeserializers
{

    public DateDeserializers()
    {
    }

    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new CalendarDeserializer(), new DateDeserializer(), new CalendarDeserializer(java/util/GregorianCalendar), new SqlDateDeserializer(), new TimestampDeserializer(), new TimeZoneDeserializer()
        });
    }

    private class CalendarDeserializer extends DateBasedDeserializer
    {
        private class DateBasedDeserializer extends StdScalarDeserializer
            implements ContextualDeserializer
        {

            protected final DateFormat _customFormat;
            protected final String _formatString;

            protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
            {
                if (_customFormat == null || jsonparser.getCurrentToken() != JsonToken.VALUE_STRING)
                {
                    break MISSING_BLOCK_LABEL_117;
                }
                deserializationcontext = jsonparser.getText().trim();
                if (deserializationcontext.length() == 0)
                {
                    return (Date)getEmptyValue();
                }
                if (true) goto _L2; else goto _L1
_L1:
                jsonparser;
                JVM INSTR monitorenter ;
_L2:
                Date date;
                synchronized (_customFormat)
                {
                    date = _customFormat.parse(deserializationcontext);
                }
                return date;
                deserializationcontext;
                jsonparser;
                JVM INSTR monitorexit ;
                throw deserializationcontext;
                ParseException parseexception;
                parseexception;
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse Date value '").append(deserializationcontext).append("' (format: \"").append(_formatString).append("\"): ").append(parseexception.getMessage()).toString());
                return super._parseDate(jsonparser, deserializationcontext);
            }

            public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
            {
                Object obj = this;
                if (beanproperty != null)
                {
                    beanproperty = deserializationcontext.getAnnotationIntrospector().findFormat(beanproperty.getMember());
                    obj = this;
                    if (beanproperty != null)
                    {
                        TimeZone timezone = beanproperty.getTimeZone();
                        String s = beanproperty.getPattern();
                        if (s.length() > 0)
                        {
                            obj = beanproperty.getLocale();
                            beanproperty = ((BeanProperty) (obj));
                            if (obj == null)
                            {
                                beanproperty = deserializationcontext.getLocale();
                            }
                            beanproperty = new SimpleDateFormat(s, beanproperty);
                            if (timezone == null)
                            {
                                deserializationcontext = deserializationcontext.getTimeZone();
                            } else
                            {
                                deserializationcontext = timezone;
                            }
                            beanproperty.setTimeZone(deserializationcontext);
                            obj = withDateFormat(beanproperty, s);
                        } else
                        {
                            obj = this;
                            if (timezone != null)
                            {
                                deserializationcontext = deserializationcontext.getConfig().getDateFormat();
                                if (deserializationcontext.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                                {
                                    deserializationcontext = ((StdDateFormat)deserializationcontext).withTimeZone(timezone);
                                } else
                                {
                                    deserializationcontext = (DateFormat)deserializationcontext.clone();
                                    deserializationcontext.setTimeZone(timezone);
                                }
                                return withDateFormat(deserializationcontext, s);
                            }
                        }
                    }
                }
                return ((JsonDeserializer) (obj));
            }

            protected abstract DateBasedDeserializer withDateFormat(DateFormat dateformat, String s);

            protected DateBasedDeserializer(DateBasedDeserializer datebaseddeserializer, DateFormat dateformat, String s)
            {
                super(datebaseddeserializer._valueClass);
                _customFormat = dateformat;
                _formatString = s;
            }

            protected DateBasedDeserializer(Class class1)
            {
                super(class1);
                _customFormat = null;
                _formatString = null;
            }
        }


        protected final Class _calendarClass;

        public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        {
            return super.createContextual(deserializationcontext, beanproperty);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Calendar deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            jsonparser = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser == null)
            {
                return null;
            }
            if (_calendarClass == null)
            {
                return deserializationcontext.constructCalendar(jsonparser);
            }
            Calendar calendar;
            try
            {
                calendar = (Calendar)_calendarClass.newInstance();
                calendar.setTimeInMillis(jsonparser.getTime());
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.instantiationException(_calendarClass, jsonparser);
            }
            return calendar;
        }

        protected CalendarDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return new CalendarDeserializer(this, dateformat, s);
        }

        protected volatile DateBasedDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return withDateFormat(dateformat, s);
        }

        public CalendarDeserializer()
        {
            super(java/util/Calendar);
            _calendarClass = null;
        }

        public CalendarDeserializer(CalendarDeserializer calendardeserializer, DateFormat dateformat, String s)
        {
            super(calendardeserializer, dateformat, s);
            _calendarClass = calendardeserializer._calendarClass;
        }

        public CalendarDeserializer(Class class1)
        {
            super(class1);
            _calendarClass = class1;
        }
    }


    private class DateDeserializer extends DateBasedDeserializer
    {

        public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        {
            return super.createContextual(deserializationcontext, beanproperty);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseDate(jsonparser, deserializationcontext);
        }

        protected volatile DateBasedDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return withDateFormat(dateformat, s);
        }

        protected DateDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return new DateDeserializer(this, dateformat, s);
        }

        public DateDeserializer()
        {
            super(java/util/Date);
        }

        public DateDeserializer(DateDeserializer datedeserializer, DateFormat dateformat, String s)
        {
            super(datedeserializer, dateformat, s);
        }
    }


    private class SqlDateDeserializer extends DateBasedDeserializer
    {

        public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        {
            return super.createContextual(deserializationcontext, beanproperty);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public java.sql.Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            jsonparser = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser == null)
            {
                return null;
            } else
            {
                return new java.sql.Date(jsonparser.getTime());
            }
        }

        protected volatile DateBasedDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return withDateFormat(dateformat, s);
        }

        protected SqlDateDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return new SqlDateDeserializer(this, dateformat, s);
        }

        public SqlDateDeserializer()
        {
            super(java/sql/Date);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqldatedeserializer, DateFormat dateformat, String s)
        {
            super(sqldatedeserializer, dateformat, s);
        }
    }


    private class TimestampDeserializer extends DateBasedDeserializer
    {

        public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        {
            return super.createContextual(deserializationcontext, beanproperty);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Timestamp deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return new Timestamp(_parseDate(jsonparser, deserializationcontext).getTime());
        }

        protected volatile DateBasedDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return withDateFormat(dateformat, s);
        }

        protected TimestampDeserializer withDateFormat(DateFormat dateformat, String s)
        {
            return new TimestampDeserializer(this, dateformat, s);
        }

        public TimestampDeserializer()
        {
            super(java/sql/Timestamp);
        }

        public TimestampDeserializer(TimestampDeserializer timestampdeserializer, DateFormat dateformat, String s)
        {
            super(timestampdeserializer, dateformat, s);
        }
    }


    private class TimeZoneDeserializer extends FromStringDeserializer
    {

        protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return _deserialize(s, deserializationcontext);
        }

        protected TimeZone _deserialize(String s, DeserializationContext deserializationcontext)
        {
            return TimeZone.getTimeZone(s);
        }

        public TimeZoneDeserializer()
        {
            super(java/util/TimeZone);
        }
    }

}
