// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            b

public class f
    implements b
{

    private static final Pattern a = Pattern.compile("<([^<> ]+)([^<>]*)>([^<>]+)</\\1[^>]*>");
    private final String b;
    private final String c[];

    public transient f(String s, String as[])
    {
        b = s;
        c = as;
    }

    private boolean a(String s)
    {
        String as[] = c;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (as[i].equalsIgnoreCase(s))
            {
                return true;
            }
        }

        return false;
    }

    public final String a()
    {
        Matcher matcher;
        StringBuffer stringbuffer;
        matcher = a.matcher(b);
        stringbuffer = new StringBuffer();
_L2:
        if (!matcher.find())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(matcher.group(1)))
        {
            continue; /* Loop/switch isn't completed */
        }
        StringBuilder stringbuilder = new StringBuilder("<$1$2>");
        String s = matcher.group(3);
        g.a a1 = g.a.c;
        if (s == null)
        {
            s = "(null)";
        } else
        if (s.isEmpty())
        {
            s = "";
        } else
        {
            switch (g._cls1.a[a1.ordinal()])
            {
            default:
                s = "***";
                break;

            case 1: // '\001'
                s = String.format(Locale.getDefault(), "*(%d)*", new Object[] {
                    Integer.valueOf(s.length())
                });
                break;

            case 2: // '\002'
                s = "***";
                break;

            case 3: // '\003'
                s = String.format(Locale.getDefault(), "*(%d)*", new Object[] {
                    Integer.valueOf(s.length())
                });
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        matcher.appendReplacement(stringbuffer, stringbuilder.append(s).append("</$1>").toString());
        if (true) goto _L2; else goto _L1
_L1:
        matcher.appendTail(stringbuffer);
        return stringbuffer.toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String b()
    {
        return b;
    }

}
