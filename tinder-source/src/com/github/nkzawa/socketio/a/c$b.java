// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.a;

import com.github.nkzawa.b.a;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONTokener;

// Referenced classes of package com.github.nkzawa.socketio.a:
//            c, b

public static final class c extends a
{

    public static String b = "decoded";
    public ue c;

    public static b a(String s)
    {
        b b1 = new b();
        int l = s.length();
        b1.a = Character.getNumericValue(s.charAt(0));
        if (b1.a < 0 || b1.a > c.b.length - 1)
        {
            return com.github.nkzawa.socketio.a.c.b();
        }
        char c2;
        StringBuilder stringbuilder2;
        int i;
        int k;
        if (5 == b1.a || 6 == b1.a)
        {
            if (!s.contains("-") || l <= 1)
            {
                return com.github.nkzawa.socketio.a.c.b();
            }
            StringBuilder stringbuilder = new StringBuilder();
            i = 0;
            do
            {
                i++;
                if (s.charAt(i) == '-')
                {
                    break;
                }
                stringbuilder.append(s.charAt(i));
            } while (true);
            b1.e = Integer.parseInt(stringbuilder.toString());
        } else
        {
            i = 0;
        }
        if (l > i + 1 && '/' == s.charAt(i + 1))
        {
            StringBuilder stringbuilder1 = new StringBuilder();
            int j;
            do
            {
                j = i + 1;
                char c1 = s.charAt(j);
                if (',' == c1)
                {
                    break;
                }
                stringbuilder1.append(c1);
                i = j;
            } while (j + 1 != l);
            b1.c = stringbuilder1.toString();
            i = j;
        } else
        {
            b1.c = "/";
        }
        k = i;
        if (l <= i + 1) goto _L2; else goto _L1
_L1:
        k = i;
        if (Character.getNumericValue(Character.valueOf(s.charAt(i + 1)).charValue()) < 0) goto _L2; else goto _L3
_L3:
        stringbuilder2 = new StringBuilder();
_L7:
        k = i + 1;
        c2 = s.charAt(k);
        if (Character.getNumericValue(c2) >= 0) goto _L5; else goto _L4
_L4:
        i = k - 1;
_L8:
        try
        {
            b1.b = Integer.parseInt(stringbuilder2.toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return com.github.nkzawa.socketio.a.c.b();
        }
        k = i;
_L2:
        if (l > k + 1)
        {
            i = k + 1;
            try
            {
                s.charAt(i);
                b1.d = (new JSONTokener(s.substring(i))).nextValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return com.github.nkzawa.socketio.a.c.b();
            }
        }
        com.github.nkzawa.socketio.a.c.a().fine(String.format("decoded %s as %s", new Object[] {
            s, b1
        }));
        return b1;
_L5:
        stringbuilder2.append(c2);
        i = k;
        if (k + 1 != l) goto _L7; else goto _L6
_L6:
        i = k;
          goto _L8
    }


    public ()
    {
        c = null;
    }
}
