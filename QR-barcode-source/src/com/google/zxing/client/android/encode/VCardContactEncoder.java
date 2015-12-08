// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.encode;

import android.telephony.PhoneNumberUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.encode:
//            ContactEncoder, Formatter

final class VCardContactEncoder extends ContactEncoder
{

    private static final Pattern NEWLINE = Pattern.compile("\\n");
    private static final Pattern RESERVED_VCARD_CHARS = Pattern.compile("([\\\\,;])");
    private static final char TERMINATOR = 10;
    private static final Formatter VCARD_FIELD_FORMATTER = new Formatter() {

        public String format(String s)
        {
            return VCardContactEncoder.NEWLINE.matcher(VCardContactEncoder.RESERVED_VCARD_CHARS.matcher(s).replaceAll("\\\\$1")).replaceAll("");
        }

    };

    VCardContactEncoder()
    {
    }

    private static void append(StringBuilder stringbuilder, StringBuilder stringbuilder1, String s, String s1)
    {
        doAppend(stringbuilder, stringbuilder1, s, s1, VCARD_FIELD_FORMATTER, '\n');
    }

    private static void appendUpToUnique(StringBuilder stringbuilder, StringBuilder stringbuilder1, String s, Iterable iterable, int i, Formatter formatter)
    {
        doAppendUpToUnique(stringbuilder, stringbuilder1, s, iterable, i, formatter, VCARD_FIELD_FORMATTER, '\n');
    }

    public String[] encode(Iterable iterable, String s, Iterable iterable1, Iterable iterable2, Iterable iterable3, Iterable iterable4, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append("BEGIN:VCARD").append('\n');
        stringbuilder.append("VERSION:3.0").append('\n');
        StringBuilder stringbuilder1 = new StringBuilder(100);
        appendUpToUnique(stringbuilder, stringbuilder1, "N", iterable, 1, null);
        append(stringbuilder, stringbuilder1, "ORG", s);
        appendUpToUnique(stringbuilder, stringbuilder1, "ADR", iterable1, 1, null);
        appendUpToUnique(stringbuilder, stringbuilder1, "TEL", iterable2, 0x7fffffff, new Formatter() {

            final VCardContactEncoder this$0;

            public String format(String s2)
            {
                return PhoneNumberUtils.formatNumber(s2);
            }

            
            {
                this$0 = VCardContactEncoder.this;
                super();
            }
        });
        appendUpToUnique(stringbuilder, stringbuilder1, "EMAIL", iterable3, 0x7fffffff, null);
        appendUpToUnique(stringbuilder, stringbuilder1, "URL", iterable4, 0x7fffffff, null);
        append(stringbuilder, stringbuilder1, "NOTE", s1);
        stringbuilder.append("END:VCARD").append('\n');
        return (new String[] {
            stringbuilder.toString(), stringbuilder1.toString()
        });
    }



}
