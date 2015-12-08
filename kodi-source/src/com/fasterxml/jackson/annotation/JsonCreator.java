// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonCreator
    extends Annotation
{
    public static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode DEFAULT;
        public static final Mode DELEGATING;
        public static final Mode DISABLED;
        public static final Mode PROPERTIES;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/fasterxml/jackson/annotation/JsonCreator$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new Mode("DEFAULT", 0);
            DELEGATING = new Mode("DELEGATING", 1);
            PROPERTIES = new Mode("PROPERTIES", 2);
            DISABLED = new Mode("DISABLED", 3);
            $VALUES = (new Mode[] {
                DEFAULT, DELEGATING, PROPERTIES, DISABLED
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Mode mode();
}
