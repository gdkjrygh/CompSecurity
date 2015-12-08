// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

public interface JsonSerialize
    extends Annotation
{
    public static final class Inclusion extends Enum
    {

        private static final Inclusion $VALUES[];
        public static final Inclusion ALWAYS;
        public static final Inclusion DEFAULT_INCLUSION;
        public static final Inclusion NON_DEFAULT;
        public static final Inclusion NON_EMPTY;
        public static final Inclusion NON_NULL;

        public static Inclusion valueOf(String s)
        {
            return (Inclusion)Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion, s);
        }

        public static Inclusion[] values()
        {
            return (Inclusion[])$VALUES.clone();
        }

        static 
        {
            ALWAYS = new Inclusion("ALWAYS", 0);
            NON_NULL = new Inclusion("NON_NULL", 1);
            NON_DEFAULT = new Inclusion("NON_DEFAULT", 2);
            NON_EMPTY = new Inclusion("NON_EMPTY", 3);
            DEFAULT_INCLUSION = new Inclusion("DEFAULT_INCLUSION", 4);
            $VALUES = (new Inclusion[] {
                ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY, DEFAULT_INCLUSION
            });
        }

        private Inclusion(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Typing extends Enum
    {

        private static final Typing $VALUES[];
        public static final Typing DEFAULT_TYPING;
        public static final Typing DYNAMIC;
        public static final Typing STATIC;

        public static Typing valueOf(String s)
        {
            return (Typing)Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing, s);
        }

        public static Typing[] values()
        {
            return (Typing[])$VALUES.clone();
        }

        static 
        {
            DYNAMIC = new Typing("DYNAMIC", 0);
            STATIC = new Typing("STATIC", 1);
            DEFAULT_TYPING = new Typing("DEFAULT_TYPING", 2);
            $VALUES = (new Typing[] {
                DYNAMIC, STATIC, DEFAULT_TYPING
            });
        }

        private Typing(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Class as();

    public abstract Class contentAs();

    public abstract Class contentConverter();

    public abstract Class contentUsing();

    public abstract Class converter();

    public abstract Inclusion include();

    public abstract Class keyAs();

    public abstract Class keyUsing();

    public abstract Class nullsUsing();

    public abstract Typing typing();

    public abstract Class using();
}
