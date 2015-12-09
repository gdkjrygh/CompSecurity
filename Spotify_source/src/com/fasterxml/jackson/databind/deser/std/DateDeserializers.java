// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class DateDeserializers
{

    private static final HashSet _classNames;

    public static JsonDeserializer find(Class class1, String s)
    {
        if (_classNames.contains(s))
        {
            if (class1 == java/util/Calendar)
            {
                return new CalendarDeserializer();
            }
            if (class1 == java/util/Date)
            {
                return DateDeserializer.instance;
            }
            if (class1 == java/sql/Date)
            {
                return new SqlDateDeserializer();
            }
            if (class1 == java/sql/Timestamp)
            {
                return new TimestampDeserializer();
            }
            if (class1 == java/util/GregorianCalendar)
            {
                return new CalendarDeserializer(java/util/GregorianCalendar);
            }
        }
        return null;
    }

    static 
    {
        int i = 0;
        _classNames = new HashSet();
        for (; i < 5; i++)
        {
            Class class1 = (new Class[] {
                java/util/Calendar, java/util/GregorianCalendar, java/sql/Date, java/util/Date, java/sql/Timestamp
            })[i];
            _classNames.add(class1.getName());
        }

    }

    private class CalendarDeserializer extends DateBasedDeserializer
    {
        private class DateBasedDeserializer extends StdScalarDeserializer
            implements ContextualDeserializer
        {

            protected final DateFormat _customFormat;
            protected final String _formatString;

            protected java.util.Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
            {
                Object obj;
                if (_customFormat == null)
                {
                    break MISSING_BLOCK_LABEL_168;
                }
                obj = jsonparser.getCurrentToken();
                if (obj != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
                deserializationcontext = jsonparser.getText().trim();
                if (deserializationcontext.length() != 0) goto _L4; else goto _L3
_L3:
                obj = (java.util.Date)getEmptyValue();
_L6:
                return ((java.util.Date) (obj));
                JVM INSTR monitorenter ;
_L4:
                synchronized (_customFormat)
                {
                    obj = _customFormat.parse(deserializationcontext);
                }
                return ((java.util.Date) (obj));
                deserializationcontext;
                jsonparser;
                JVM INSTR monitorexit ;
                throw deserializationcontext;
                obj;
                throw new IllegalArgumentException((new StringBuilder("Failed to parse Date value '")).append(deserializationcontext).append("' (format: \"").append(_formatString).append("\"): ").append(((ParseException) (obj)).getMessage()).toString());
_L2:
                if (obj != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
                {
                    break MISSING_BLOCK_LABEL_168;
                }
                jsonparser.nextToken();
                obj = _parseDate(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() == JsonToken.END_ARRAY) goto _L6; else goto _L5
_L5:
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
                return super._parseDate(jsonparser, deserializationcontext);
            }

            public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
            {
                Object obj = this;
                if (beanproperty != null)
                {
                    com.fasterxml.jackson.annotation.JsonFormat.Value value = deserializationcontext.getAnnotationIntrospector().findFormat(beanproperty.getMember());
                    obj = this;
                    if (value != null)
                    {
                        java.util.TimeZone timezone = value.getTimeZone();
                        if (value.hasPattern())
                        {
                            obj = value.getPattern();
                            if (value.hasLocale())
                            {
                                beanproperty = value.getLocale();
                            } else
                            {
                                beanproperty = deserializationcontext.getLocale();
                            }
                            beanproperty = new SimpleDateFormat(((String) (obj)), beanproperty);
                            if (timezone == null)
                            {
                                deserializationcontext = deserializationcontext.getTimeZone();
                            } else
                            {
                                deserializationcontext = timezone;
                            }
                            beanproperty.setTimeZone(deserializationcontext);
                            obj = withDateFormat(beanproperty, ((String) (obj)));
                        } else
                        {
                            obj = this;
                            if (timezone != null)
                            {
                                beanproperty = deserializationcontext.getConfig().getDateFormat();
                                if (beanproperty.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                                {
                                    if (value.hasLocale())
                                    {
                                        deserializationcontext = value.getLocale();
                                    } else
                                    {
                                        deserializationcontext = deserializationcontext.getLocale();
                                    }
                                    deserializationcontext = ((StdDateFormat)beanproperty).withTimeZone(timezone).withLocale(deserializationcontext);
                                } else
                                {
                                    deserializationcontext = (DateFormat)beanproperty.clone();
                                    deserializationcontext.setTimeZone(timezone);
                                }
                                return withDateFormat(deserializationcontext, _formatString);
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
            if (jsonparser != null) goto _L2; else goto _L1
_L1:
            jsonparser = null;
_L4:
            return jsonparser;
_L2:
            if (_calendarClass == null)
            {
                return deserializationcontext.constructCalendar(jsonparser);
            }
            Calendar calendar;
            java.util.TimeZone timezone;
            try
            {
                calendar = (Calendar)_calendarClass.newInstance();
                calendar.setTimeInMillis(jsonparser.getTime());
                timezone = deserializationcontext.getTimeZone();
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.instantiationException(_calendarClass, jsonparser);
            }
            jsonparser = calendar;
            if (timezone == null) goto _L4; else goto _L3
_L3:
            calendar.setTimeZone(timezone);
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

        public static final DateDeserializer instance = new DateDeserializer();

        public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        {
            return super.createContextual(deserializationcontext, beanproperty);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public java.util.Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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

        public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            jsonparser = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser == null)
            {
                return null;
            } else
            {
                return new Date(jsonparser.getTime());
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

}
