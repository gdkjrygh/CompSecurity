// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;


// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CharSequenceTranslator

public class NumericEntityUnescaper extends CharSequenceTranslator
{
    public static final class OPTION extends Enum
    {

        private static final OPTION $VALUES[];
        public static final OPTION errorIfNoSemiColon;
        public static final OPTION semiColonOptional;
        public static final OPTION semiColonRequired;

        public static OPTION valueOf(String s)
        {
            return (OPTION)Enum.valueOf(org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION, s);
        }

        public static OPTION[] values()
        {
            return (OPTION[])$VALUES.clone();
        }

        static 
        {
            semiColonRequired = new OPTION("semiColonRequired", 0);
            semiColonOptional = new OPTION("semiColonOptional", 1);
            errorIfNoSemiColon = new OPTION("errorIfNoSemiColon", 2);
            $VALUES = (new OPTION[] {
                semiColonRequired, semiColonOptional, errorIfNoSemiColon
            });
        }

        private OPTION(String s, int i)
        {
            super(s, i);
        }
    }

}
