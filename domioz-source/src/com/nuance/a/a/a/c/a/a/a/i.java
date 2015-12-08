// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.b.b;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.a.b.c;
import com.nuance.a.a.a.c.b.a.b.h;
import com.nuance.a.a.a.c.b.b.a;
import java.util.Enumeration;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            l

public class i extends l
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/a/a/i);

    public i(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            b b1, String s7, short word0, short word1, String s8, String s9, String s10, 
            String s11, byte abyte0[], String s12, String s13, a a1)
    {
        super((short)514);
        a.b();
        a("uid", s, (short)193);
        a("pdx_version", s1, (short)193);
        a("sdk_version", s2, (short)193);
        a("client_version", s3, (short)193);
        a("script_version", s4, (short)193);
        a("language", s5, (short)193);
        a("region", s6, (short)193);
        a("device_codec", b1.a());
        a("dictation_language", s7, (short)193);
        a("lcd_width", word0);
        a("lcd_height", word1);
        if (s8 == null)
        {
            a("carrier", new byte[0], (short)5);
        } else
        {
            a("carrier", s8, (short)193);
        }
        a("phone_model", s9, (short)193);
        a("phone_number", s10, (short)193);
        a("original_session_id", s11, (short)22);
        if (abyte0 != null)
        {
            a("new_session_id", c.a(abyte0), (short)193);
        }
        a("application", s12, (short)22);
        a("nmaid", s12, (short)22);
        a("command", s13, (short)22);
        if (a1 != null)
        {
            s = a1.h();
            do
            {
                if (!s.hasMoreElements())
                {
                    break;
                }
                s1 = (String)s.nextElement();
                switch (((h)a1).b(s1).g())
                {
                case 4: // '\004'
                    a(s1, a1.g(s1), (short)4);
                    break;

                case 7: // '\007'
                    a(s1, a1.d(s1));
                    break;

                case 6: // '\006'
                    a(s1, a1.e(s1));
                    break;

                case 22: // '\026'
                    a(s1, a1.i(s1), (short)22);
                    break;

                case 192: 
                    a(s1, a1.f(s1));
                    break;

                case 193: 
                    a(s1, a1.h(s1), (short)193);
                    break;

                case 5: // '\005'
                    a(s1, null, (short)5);
                    break;

                case 224: 
                    a(s1, a1.j(s1));
                    break;

                case 16: // '\020'
                    a(s1, a1.k(s1));
                    break;
                }
            } while (true);
        }
    }

}
