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
_L15:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 7: default 281
    //                   8: 209
    //                   9: 257
    //                   10: 233
    //                   12: 221
    //                   13: 245
    //                   34: 174
    //                   92: 197;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L12:
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
            throw new RuntimeException("Impossible Exeption");
        }
          goto _L11
_L9:
        appendable.append("\\\"");
          goto _L11
_L10:
        appendable.append("\\\\");
          goto _L11
_L4:
        appendable.append("\\b");
          goto _L11
_L7:
        appendable.append("\\f");
          goto _L11
_L6:
        appendable.append("\\n");
          goto _L11
_L8:
        appendable.append("\\r");
          goto _L11
_L5:
        appendable.append("\\t");
          goto _L11
_L13:
        appendable.append(c);
          goto _L11
_L2:
        return;
_L3:
        if ((c < 0 || c > '\037') && (c < '\177' || c > '\237') && (c < '\u2000' || c > '\u20FF')) goto _L13; else goto _L12
_L11:
        i++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private Exception()
    {
    }

    Exception(byte byte0)
    {
        this();
    }
}
