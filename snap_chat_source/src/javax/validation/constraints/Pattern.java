// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.constraints;

import java.lang.annotation.Annotation;

public interface Pattern
    extends Annotation
{
    public static final class Flag extends Enum
    {

        private static final Flag $VALUES[];
        private static Flag CANON_EQ;
        private static Flag CASE_INSENSITIVE;
        private static Flag COMMENTS;
        private static Flag DOTALL;
        private static Flag MULTILINE;
        private static Flag UNICODE_CASE;
        private static Flag UNIX_LINES;
        private final int value;

        private int getValue()
        {
            return value;
        }

        public static Flag valueOf(String s)
        {
            return (Flag)Enum.valueOf(javax/validation/constraints/Pattern$Flag, s);
        }

        public static Flag[] values()
        {
            return (Flag[])$VALUES.clone();
        }

        static 
        {
            UNIX_LINES = new Flag("UNIX_LINES", 0, 1);
            CASE_INSENSITIVE = new Flag("CASE_INSENSITIVE", 1, 2);
            COMMENTS = new Flag("COMMENTS", 2, 4);
            MULTILINE = new Flag("MULTILINE", 3, 8);
            DOTALL = new Flag("DOTALL", 4, 32);
            UNICODE_CASE = new Flag("UNICODE_CASE", 5, 64);
            CANON_EQ = new Flag("CANON_EQ", 6, 128);
            $VALUES = (new Flag[] {
                UNIX_LINES, CASE_INSENSITIVE, COMMENTS, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ
            });
        }

        private Flag(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    public static interface List
        extends Annotation
    {

        public abstract Pattern[] value();
    }


    public abstract Flag[] flags();

    public abstract Class[] groups();

    public abstract String message();

    public abstract Class[] payload();

    public abstract String regexp();
}
