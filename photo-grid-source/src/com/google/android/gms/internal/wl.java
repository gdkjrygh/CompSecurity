// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class wl
{

    private static final Pattern a = Pattern.compile("\\\\.");
    private static final Pattern b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer;
        Matcher matcher;
        matcher = b.matcher(s);
        stringbuffer = null;
_L5:
        if (matcher.find())
        {
            StringBuffer stringbuffer1 = stringbuffer;
            if (stringbuffer == null)
            {
                stringbuffer1 = new StringBuffer();
            }
            switch (matcher.group().charAt(0))
            {
            default:
                stringbuffer = stringbuffer1;
                break;

            case 8: // '\b'
                matcher.appendReplacement(stringbuffer1, "\\\\b");
                stringbuffer = stringbuffer1;
                break;

            case 34: // '"'
                matcher.appendReplacement(stringbuffer1, "\\\\\\\"");
                stringbuffer = stringbuffer1;
                break;

            case 92: // '\\'
                matcher.appendReplacement(stringbuffer1, "\\\\\\\\");
                stringbuffer = stringbuffer1;
                break;

            case 47: // '/'
                matcher.appendReplacement(stringbuffer1, "\\\\/");
                stringbuffer = stringbuffer1;
                break;

            case 12: // '\f'
                matcher.appendReplacement(stringbuffer1, "\\\\f");
                stringbuffer = stringbuffer1;
                break;

            case 10: // '\n'
                matcher.appendReplacement(stringbuffer1, "\\\\n");
                stringbuffer = stringbuffer1;
                break;

            case 13: // '\r'
                matcher.appendReplacement(stringbuffer1, "\\\\r");
                stringbuffer = stringbuffer1;
                break;

            case 9: // '\t'
                matcher.appendReplacement(stringbuffer1, "\\\\t");
                stringbuffer = stringbuffer1;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (stringbuffer != null) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        matcher.appendTail(stringbuffer);
        return stringbuffer.toString();
        if (true) goto _L5; else goto _L4
_L4:
    }

}
