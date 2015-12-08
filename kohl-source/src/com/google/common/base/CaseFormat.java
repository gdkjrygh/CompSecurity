// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Ascii

public final class CaseFormat extends Enum
{

    private static final CaseFormat $VALUES[];
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private CaseFormat(String s, int i, CharMatcher charmatcher, String s1)
    {
        super(s, i);
        wordBoundary = charmatcher;
        wordSeparator = s1;
    }

    private static String firstCharOnlyToUpper(String s)
    {
        int i = s.length();
        if (i == 0)
        {
            return s;
        } else
        {
            return (new StringBuilder(i)).append(Ascii.toUpperCase(s.charAt(0))).append(Ascii.toLowerCase(s.substring(1))).toString();
        }
    }

    private String normalizeFirstWord(String s)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$common$base$CaseFormat[];

            static 
            {
                $SwitchMap$com$google$common$base$CaseFormat = new int[CaseFormat.values().length];
                try
                {
                    $SwitchMap$com$google$common$base$CaseFormat[CaseFormat.LOWER_UNDERSCORE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$common$base$CaseFormat[CaseFormat.UPPER_UNDERSCORE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$common$base$CaseFormat[CaseFormat.LOWER_HYPHEN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$common$base$CaseFormat[CaseFormat.LOWER_CAMEL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$common$base$CaseFormat[CaseFormat.UPPER_CAMEL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.common.base.CaseFormat[ordinal()])
        {
        default:
            return normalizeWord(s);

        case 4: // '\004'
            return Ascii.toLowerCase(s);
        }
    }

    private String normalizeWord(String s)
    {
        switch (_cls1..SwitchMap.com.google.common.base.CaseFormat[ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder()).append("unknown case: ").append(this).toString());

        case 3: // '\003'
            return Ascii.toLowerCase(s);

        case 1: // '\001'
            return Ascii.toLowerCase(s);

        case 4: // '\004'
            return firstCharOnlyToUpper(s);

        case 5: // '\005'
            return firstCharOnlyToUpper(s);

        case 2: // '\002'
            return Ascii.toUpperCase(s);
        }
    }

    public static CaseFormat valueOf(String s)
    {
        return (CaseFormat)Enum.valueOf(com/google/common/base/CaseFormat, s);
    }

    public static CaseFormat[] values()
    {
        return (CaseFormat[])$VALUES.clone();
    }

    public String to(CaseFormat caseformat, String s)
    {
        if (caseformat == null)
        {
            throw new NullPointerException();
        }
        if (s == null)
        {
            throw new NullPointerException();
        }
        if (caseformat == this)
        {
            return s;
        }
        _cls1..SwitchMap.com.google.common.base.CaseFormat[ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 216
    //                   2 265
    //                   3 160;
           goto _L1 _L2 _L3 _L4
_L1:
        StringBuilder stringbuilder;
        int i;
        stringbuilder = null;
        i = 0;
        int j = -1;
        do
        {
            j = wordBoundary.indexIn(s, j + 1);
            if (j == -1)
            {
                break;
            }
            if (i == 0)
            {
                stringbuilder = new StringBuilder(s.length() + wordSeparator.length() * 4);
                stringbuilder.append(caseformat.normalizeFirstWord(s.substring(i, j)));
            } else
            {
                stringbuilder.append(caseformat.normalizeWord(s.substring(i, j)));
            }
            stringbuilder.append(caseformat.wordSeparator);
            i = j + wordSeparator.length();
        } while (true);
        break; /* Loop/switch isn't completed */
_L4:
        switch (_cls1..SwitchMap.com.google.common.base.CaseFormat[caseformat.ordinal()])
        {
        case 1: // '\001'
            return s.replace('-', '_');

        case 2: // '\002'
            return Ascii.toUpperCase(s.replace('-', '_'));
        }
          goto _L1
_L2:
        switch (_cls1..SwitchMap.com.google.common.base.CaseFormat[caseformat.ordinal()])
        {
        case 2: // '\002'
            return Ascii.toUpperCase(s);

        case 3: // '\003'
            return s.replace('_', '-');
        }
          goto _L1
_L3:
        switch (_cls1..SwitchMap.com.google.common.base.CaseFormat[caseformat.ordinal()])
        {
        case 1: // '\001'
            return Ascii.toLowerCase(s);

        case 3: // '\003'
            return Ascii.toLowerCase(s.replace('_', '-'));
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (i == 0)
        {
            return caseformat.normalizeFirstWord(s);
        } else
        {
            stringbuilder.append(caseformat.normalizeWord(s.substring(i)));
            return stringbuilder.toString();
        }
    }

    static 
    {
        LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, CharMatcher.is('-'), "-");
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, CharMatcher.is('_'), "_");
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), "");
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), "");
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.is('_'), "_");
        $VALUES = (new CaseFormat[] {
            LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE
        });
    }
}
