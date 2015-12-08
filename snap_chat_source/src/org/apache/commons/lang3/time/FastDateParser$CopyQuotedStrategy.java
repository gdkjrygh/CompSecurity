// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateParser

static class formatField extends formatField
{

    private final String formatField;

    boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
    {
        FastDateParser.access$100(stringbuilder, formatField, true);
        return false;
    }

    boolean isNumber()
    {
        char c1 = formatField.charAt(0);
        char c = c1;
        if (c1 == '\'')
        {
            c = formatField.charAt(1);
        }
        return Character.isDigit(c);
    }

    (String s)
    {
        super(null);
        formatField = s;
    }
}
