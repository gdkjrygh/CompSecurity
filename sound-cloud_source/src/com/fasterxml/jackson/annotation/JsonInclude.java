// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonInclude
    extends Annotation
{
    public static final class Include extends Enum
    {

        private static final Include $VALUES[];
        public static final Include ALWAYS;
        public static final Include NON_DEFAULT;
        public static final Include NON_EMPTY;
        public static final Include NON_NULL;

        public static Include valueOf(String s)
        {
            return (Include)Enum.valueOf(com/fasterxml/jackson/annotation/JsonInclude$Include, s);
        }

        public static Include[] values()
        {
            return (Include[])$VALUES.clone();
        }

        static 
        {
            ALWAYS = new Include("ALWAYS", 0);
            NON_NULL = new Include("NON_NULL", 1);
            NON_DEFAULT = new Include("NON_DEFAULT", 2);
            NON_EMPTY = new Include("NON_EMPTY", 3);
            $VALUES = (new Include[] {
                ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY
            });
        }

        private Include(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Include value();
}
