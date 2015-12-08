// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            TextUtilsCompat, ICUCompat

private static class <init>
{

    private static int getLayoutDirectionFromFirstChar(Locale locale)
    {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return 1;
        }
    }

    public int getLayoutDirectionFromLocale(Locale locale)
    {
        if (locale != null && !locale.equals(TextUtilsCompat.ROOT))
        {
            String s = ICUCompat.maximizeAndGetScript(locale);
            if (s == null)
            {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (s.equalsIgnoreCase(TextUtilsCompat.access$000()) || s.equalsIgnoreCase(TextUtilsCompat.access$100()))
            {
                return 1;
            }
        }
        return 0;
    }

    public String htmlEncode(String s)
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        i = 0;
_L8:
        char c;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 5: default 80
    //                   34: 135
    //                   38: 115
    //                   39: 125
    //                   60: 95
    //                   62: 105;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break MISSING_BLOCK_LABEL_135;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c);
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        stringbuilder.append("&lt;");
          goto _L9
_L6:
        stringbuilder.append("&gt;");
          goto _L9
_L3:
        stringbuilder.append("&amp;");
          goto _L9
_L4:
        stringbuilder.append("&#39;");
          goto _L9
        stringbuilder.append("&quot;");
          goto _L9
        return stringbuilder.toString();
    }

    private A()
    {
    }

    A(A a)
    {
        this();
    }
}
