// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;

import java.io.IOException;

// Referenced classes of package c.a.a:
//            j

private static final class <init>
    implements Object
{

    public final void a(String s, Appendable appendable)
    {
        int i = 0;
_L16:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 8: default 301
    //                   8: 217
    //                   9: 265
    //                   10: 241
    //                   12: 229
    //                   13: 253
    //                   34: 182
    //                   47: 277
    //                   92: 205;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L13:
        try
        {
            appendable.append("\\u");
            appendable.append("0123456789ABCDEF".charAt(c >> 12 & 0xf));
            appendable.append("0123456789ABCDEF".charAt(c >> 8 & 0xf));
            appendable.append("0123456789ABCDEF".charAt(c >> 4 & 0xf));
            appendable.append("0123456789ABCDEF".charAt(c >> 0 & 0xf));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Impossible Error");
        }
          goto _L12
_L9:
        appendable.append("\\\"");
          goto _L12
_L11:
        appendable.append("\\\\");
          goto _L12
_L4:
        appendable.append("\\b");
          goto _L12
_L7:
        appendable.append("\\f");
          goto _L12
_L6:
        appendable.append("\\n");
          goto _L12
_L8:
        appendable.append("\\r");
          goto _L12
_L5:
        appendable.append("\\t");
          goto _L12
_L10:
        appendable.append("\\/");
          goto _L12
_L14:
        appendable.append(c);
          goto _L12
_L2:
        return;
_L3:
        if ((c < 0 || c > '\037') && (c < '\177' || c > '\237') && (c < '\u2000' || c > '\u20FF')) goto _L14; else goto _L13
_L12:
        i++;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private Exception()
    {
    }

    Exception(byte byte0)
    {
        this();
    }
}
