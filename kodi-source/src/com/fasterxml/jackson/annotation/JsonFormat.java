// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.TimeZone;

public interface JsonFormat
    extends Annotation
{
    public static final class Shape extends Enum
    {

        private static final Shape $VALUES[];
        public static final Shape ANY;
        public static final Shape ARRAY;
        public static final Shape BOOLEAN;
        public static final Shape NUMBER;
        public static final Shape NUMBER_FLOAT;
        public static final Shape NUMBER_INT;
        public static final Shape OBJECT;
        public static final Shape SCALAR;
        public static final Shape STRING;

        public static Shape valueOf(String s)
        {
            return (Shape)Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Shape, s);
        }

        public static Shape[] values()
        {
            return (Shape[])$VALUES.clone();
        }

        public boolean isNumeric()
        {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        static 
        {
            ANY = new Shape("ANY", 0);
            SCALAR = new Shape("SCALAR", 1);
            ARRAY = new Shape("ARRAY", 2);
            OBJECT = new Shape("OBJECT", 3);
            NUMBER = new Shape("NUMBER", 4);
            NUMBER_FLOAT = new Shape("NUMBER_FLOAT", 5);
            NUMBER_INT = new Shape("NUMBER_INT", 6);
            STRING = new Shape("STRING", 7);
            BOOLEAN = new Shape("BOOLEAN", 8);
            $VALUES = (new Shape[] {
                ANY, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
            });
        }

        private Shape(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Value
    {

        private TimeZone _timezone;
        private final Locale locale;
        private final String pattern;
        private final Shape shape;
        private final String timezoneStr;

        public Locale getLocale()
        {
            return locale;
        }

        public String getPattern()
        {
            return pattern;
        }

        public Shape getShape()
        {
            return shape;
        }

        public TimeZone getTimeZone()
        {
            TimeZone timezone2 = _timezone;
            TimeZone timezone1 = timezone2;
            if (timezone2 == null)
            {
                if (timezoneStr == null)
                {
                    return null;
                }
                timezone1 = TimeZone.getTimeZone(timezoneStr);
                _timezone = timezone1;
            }
            return timezone1;
        }

        public boolean hasLocale()
        {
            return locale != null;
        }

        public boolean hasPattern()
        {
            return pattern != null && pattern.length() > 0;
        }

        public Value()
        {
            this("", Shape.ANY, "", "");
        }

        public Value(JsonFormat jsonformat)
        {
            this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone());
        }

        public Value(String s, Shape shape1, String s1, String s2)
        {
            if (s1 == null || s1.length() == 0 || "##default".equals(s1))
            {
                s1 = null;
            } else
            {
                s1 = new Locale(s1);
            }
            if (s2 == null || s2.length() == 0 || "##default".equals(s2))
            {
                s2 = null;
            }
            this(s, shape1, ((Locale) (s1)), s2, null);
        }

        public Value(String s, Shape shape1, Locale locale1, String s1, TimeZone timezone1)
        {
            pattern = s;
            s = shape1;
            if (shape1 == null)
            {
                s = Shape.ANY;
            }
            shape = s;
            locale = locale1;
            _timezone = timezone1;
            timezoneStr = s1;
        }
    }


    public abstract String locale();

    public abstract String pattern();

    public abstract Shape shape();

    public abstract String timezone();
}
