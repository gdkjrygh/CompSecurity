// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

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

        public static final OPTION[] values()
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


    private final EnumSet options;

    public transient NumericEntityUnescaper(OPTION aoption[])
    {
        if (aoption.length > 0)
        {
            options = EnumSet.copyOf(Arrays.asList(aoption));
            return;
        } else
        {
            options = EnumSet.copyOf(Arrays.asList(new OPTION[] {
                OPTION.semiColonRequired
            }));
            return;
        }
    }

    public boolean isSet(OPTION option)
    {
        if (options == null)
        {
            return false;
        } else
        {
            return options.contains(option);
        }
    }

    public int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
label0:
        {
            int l;
            int i1;
            int j1;
            {
                boolean flag;
label1:
                {
                    i1 = charsequence.length();
                    if (charsequence.charAt(i) != '&' || i >= i1 - 2 || charsequence.charAt(i + 1) != '#')
                    {
                        break MISSING_BLOCK_LABEL_387;
                    }
                    int j = i + 2;
                    flag = false;
                    char c = charsequence.charAt(j);
                    if (c != 'x')
                    {
                        i = j;
                        if (c != 'X')
                        {
                            break label1;
                        }
                    }
                    j++;
                    flag = true;
                    i = j;
                    if (j == i1)
                    {
                        return 0;
                    }
                }
                int k;
                for (k = i; k < i1 && (charsequence.charAt(k) >= '0' && charsequence.charAt(k) <= '9' || charsequence.charAt(k) >= 'a' && charsequence.charAt(k) <= 'f' || charsequence.charAt(k) >= 'A' && charsequence.charAt(k) <= 'F'); k++) { }
                boolean flag1;
                if (k != i1 && charsequence.charAt(k) == ';')
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag1)
                {
                    if (isSet(OPTION.semiColonRequired))
                    {
                        return 0;
                    }
                    if (isSet(OPTION.errorIfNoSemiColon))
                    {
                        throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                try
                {
                    j1 = Integer.parseInt(charsequence.subSequence(i, k).toString(), 16);
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    return 0;
                }
            }
            if (j1 > 65535)
            {
                charsequence = Character.toChars(j1);
                writer.write(charsequence[0]);
                writer.write(charsequence[1]);
            } else
            {
                writer.write(j1);
            }
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            if (flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return flag1 + (((k + 2) - i) + l);
        }
        j1 = Integer.parseInt(charsequence.subSequence(i, k).toString(), 10);
        break MISSING_BLOCK_LABEL_285;
        return 0;
    }
}
