// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.common.util:
//            UnicodeUtils

public final class JsonUtils
{

    private static final Pattern sEscapedJsonCharacterPattern = Pattern.compile("\\\\.");
    private static final Pattern sUnescapedJsonCharacterPattern = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String escapeString(String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer;
        Matcher matcher;
        matcher = sUnescapedJsonCharacterPattern.matcher(s);
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

    public static String unescapeString(String s)
    {
        String s1;
        Matcher matcher;
        if (!TextUtils.isEmpty(s))
        {
            s1 = UnicodeUtils.unescape(s);
            matcher = sEscapedJsonCharacterPattern.matcher(s1);
            s = null;
        } else
        {
            return s;
        }
        do
        {
            if (matcher.find())
            {
                Object obj = s;
                if (s == null)
                {
                    obj = new StringBuffer();
                }
                switch (matcher.group().charAt(1))
                {
                default:
                    throw new IllegalStateException("Found an escaped character that should never be.");

                case 34: // '"'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\"");
                    s = ((String) (obj));
                    break;

                case 92: // '\\'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\\\\");
                    s = ((String) (obj));
                    break;

                case 47: // '/'
                    matcher.appendReplacement(((StringBuffer) (obj)), "/");
                    s = ((String) (obj));
                    break;

                case 98: // 'b'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\b");
                    s = ((String) (obj));
                    break;

                case 102: // 'f'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\f");
                    s = ((String) (obj));
                    break;

                case 110: // 'n'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\n");
                    s = ((String) (obj));
                    break;

                case 114: // 'r'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\r");
                    s = ((String) (obj));
                    break;

                case 116: // 't'
                    matcher.appendReplacement(((StringBuffer) (obj)), "\t");
                    s = ((String) (obj));
                    break;
                }
            } else
            if (s == null)
            {
                return s1;
            } else
            {
                matcher.appendTail(s);
                return s.toString();
            }
        } while (true);
    }

}
