// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.a.b.a;
import com.nuance.a.a.a.c.a.c.d;
import com.nuance.a.a.a.c.a.c.e;
import com.nuance.a.a.a.c.a.c.g;
import com.nuance.a.a.a.c.a.c.i;
import com.nuance.a.a.a.c.a.c.j;
import com.nuance.a.a.a.c.a.c.k;
import com.nuance.a.a.a.c.c.b;
import com.nuance.a.a.a.c.c.c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            e, ac, u, c, 
//            x

class f
    implements com.nuance.dragon.toolkit.a.e
{

    static final boolean a;
    private final com.nuance.a.a.a.c.a.b.e b;
    private final com.nuance.dragon.toolkit.a.c c;
    private final k d = new ac(this);
    private final j e = new u(this);
    private d f;
    private e g;
    private String h;
    private final x i;
    private final Map j = new HashMap();
    private final Handler k = new Handler();

    public f(com.nuance.a.a.a.c.a.b.e e1, com.nuance.dragon.toolkit.a.c c1, x x)
    {
        b = e1;
        c = c1;
        i = x;
        h = "no_cmd_yet";
    }

    static String a(f f1)
    {
        return f1.h;
    }

    private void a(i l)
    {
        g.a(l);
    }

    static x b(f f1)
    {
        return f1.i;
    }

    static Handler c(f f1)
    {
        return f1.k;
    }

    public final void a()
    {
        if (f != null)
        {
            try
            {
                f.d();
            }
            catch (a a1) { }
            f = null;
        }
    }

    public final void a(String s)
    {
label0:
        {
            if (g != null)
            {
                if (j.containsKey(s))
                {
                    break label0;
                }
                g g1 = f.a(s);
                j.put(s, g1);
                a(((i) (g1)));
            }
            return;
        }
        com.nuance.dragon.toolkit.d.e.c(this, (new StringBuilder("This Audio Param [")).append(s).append("] has already been sent, it will ignored").toString());
    }

    public final void a(String s, com.nuance.dragon.toolkit.audio.g g1, boolean flag)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        if (!j.containsKey(s))
        {
            a(s);
        }
        s = (g)j.get(s);
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (g1.b == null) goto _L4; else goto _L3
_L3:
        (new StringBuilder("[LATCHK] calling addAudioBuf() vocoded audio:")).append(g1);
        s.a(g1.b, 0, g1.b.length, flag);
_L2:
        return;
_L4:
        if (g1.c == null) goto _L2; else goto _L5
_L5:
        byte abyte0[] = new byte[g1.c.length * 2];
        for (int l = 0; l < g1.c.length; l++)
        {
            abyte0[l * 2] = (byte)g1.c[l];
            abyte0[l * 2 + 1] = (byte)(g1.c[l] >> 8);
        }

        (new StringBuilder("[LATCHK] calling addAudioBuf() pcm audio:")).append(g1);
        s.a(abyte0, 0, abyte0.length, flag);
        return;
        if (!a && !flag)
        {
            throw new AssertionError();
        } else
        {
            s.a(null, 0, 0, flag);
            (new StringBuilder("stream audio last buffer [")).append(flag).append("]");
            return;
        }
    }

    public final void a(String s, com.nuance.dragon.toolkit.b.e e1)
    {
        if (g != null)
        {
            e1 = com.nuance.dragon.toolkit.b.a.a.a(e1, f);
            a(f.a(s, e1));
        }
    }

    public final void a(String s, com.nuance.dragon.toolkit.b.e e1, int l)
    {
        String s2;
        h = s;
        s = new Vector();
        s.add(new c("Disable_Bluetooth", "TRUE".getBytes(), com.nuance.a.a.a.c.c.d.a));
        f = com.nuance.a.a.a.c.a.c.c.a(b, d, s);
        s2 = h;
        if (f == null) goto _L2; else goto _L1
_L1:
        String s1;
        com.nuance.a.a.a.c.b.b.a a1;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        if (e1 != null)
        {
            a1 = com.nuance.dragon.toolkit.b.a.a.a(e1, f);
        } else
        {
            a1 = f.b();
        }
        s3 = c.f();
        s4 = com.nuance.a.a.a.c.c.b.a();
        s5 = (new StringBuilder()).append(com.nuance.a.a.a.c.c.b.b()).append(" ").append(com.nuance.a.a.a.c.c.b.c()).toString();
        s = Locale.getDefault();
        if (s == null) goto _L4; else goto _L3
_L3:
        s1 = s.getCountry();
        if (s1 == null || s1.length() <= 0) goto _L4; else goto _L5
_L5:
        s6 = c.g();
        s7 = c.a();
        s8 = c.b();
        s = Locale.getDefault();
        if (s == null)
        {
            s = null;
        } else
        {
            e1 = s.getLanguage();
            Object obj = s.getCountry();
            if (e1 == null || e1.length() != 2 || obj == null || ((String) (obj)).length() != 2)
            {
                s = null;
            } else
            {
                if (e1.equals("de"))
                {
                    s = (new StringBuilder()).append("").append("deu").toString();
                } else
                if (e1.equals("en"))
                {
                    s = (new StringBuilder()).append("").append("eng").toString();
                } else
                if (e1.equals("es"))
                {
                    s = (new StringBuilder()).append("").append("spa").toString();
                } else
                if (e1.equals("fr"))
                {
                    s = (new StringBuilder()).append("").append("fra").toString();
                } else
                if (e1.equals("it"))
                {
                    s = (new StringBuilder()).append("").append("ita").toString();
                } else
                if (e1.equals("ja"))
                {
                    s = (new StringBuilder()).append("").append("jpn").toString();
                } else
                if (e1.equals("ko"))
                {
                    s = (new StringBuilder()).append("").append("kor").toString();
                } else
                if (e1.equals("zh"))
                {
                    if (((String) (obj)).equals("CT") || ((String) (obj)).equals("GD") || ((String) (obj)).equals("HK"))
                    {
                        s = (new StringBuilder()).append("").append("yue").toString();
                    } else
                    {
                        s = (new StringBuilder()).append("").append("cmn").toString();
                    }
                } else
                if (e1.equals("tr"))
                {
                    s = (new StringBuilder()).append("").append("tur").toString();
                } else
                if (e1.equals("no"))
                {
                    s = (new StringBuilder()).append("").append("nor").toString();
                } else
                if (e1.equals("sv"))
                {
                    s = (new StringBuilder()).append("").append("swe").toString();
                } else
                if (e1.equals("pl"))
                {
                    s = (new StringBuilder()).append("").append("pol").toString();
                } else
                if (e1.equals("pt"))
                {
                    s = (new StringBuilder()).append("").append("por").toString();
                } else
                if (e1.equals("fi"))
                {
                    s = (new StringBuilder()).append("").append("fin").toString();
                } else
                if (e1.equals("da"))
                {
                    s = (new StringBuilder()).append("").append("dan").toString();
                } else
                if (e1.equals("nl"))
                {
                    s = (new StringBuilder()).append("").append("nld").toString();
                } else
                if (e1.equals("uk"))
                {
                    s = (new StringBuilder()).append("").append("ukr").toString();
                } else
                if (e1.equals("el"))
                {
                    s = (new StringBuilder()).append("").append("ell").toString();
                } else
                {
label0:
                    {
                        if (!e1.equals("ru"))
                        {
                            break label0;
                        }
                        s = (new StringBuilder()).append("").append("rus").toString();
                    }
                }
                s = (new StringBuilder()).append(s).append("-").toString();
                if (((String) (obj)).equals("CA"))
                {
                    s = (new StringBuilder()).append(s).append("CAN").toString();
                } else
                if (((String) (obj)).equals("CN"))
                {
                    s = (new StringBuilder()).append(s).append("CHN").toString();
                } else
                if (((String) (obj)).equals("DE"))
                {
                    s = (new StringBuilder()).append(s).append("DEU").toString();
                } else
                if (((String) (obj)).equals("ES"))
                {
                    s = (new StringBuilder()).append(s).append("ESP").toString();
                } else
                if (((String) (obj)).equals("FR"))
                {
                    s = (new StringBuilder()).append(s).append("FRA").toString();
                } else
                if (((String) (obj)).equals("GB"))
                {
                    s = (new StringBuilder()).append(s).append("GBR").toString();
                } else
                if (((String) (obj)).equals("IT"))
                {
                    s = (new StringBuilder()).append(s).append("ITA").toString();
                } else
                if (((String) (obj)).equals("JP"))
                {
                    s = (new StringBuilder()).append(s).append("JPN").toString();
                } else
                if (((String) (obj)).equals("KR"))
                {
                    s = (new StringBuilder()).append(s).append("KOR").toString();
                } else
                if (((String) (obj)).equals("TW"))
                {
                    s = (new StringBuilder()).append(s).append("TWN").toString();
                } else
                if (((String) (obj)).equals("US"))
                {
                    obj = (new StringBuilder()).append(s);
                    if (e1.equals("es"))
                    {
                        s = "XLA";
                    } else
                    {
                        s = "USA";
                    }
                    s = ((StringBuilder) (obj)).append(s).toString();
                } else
                if (((String) (obj)).equals("TR"))
                {
                    s = (new StringBuilder()).append(s).append("TUR").toString();
                } else
                if (((String) (obj)).equals("NO"))
                {
                    s = (new StringBuilder()).append(s).append("NOR").toString();
                } else
                if (((String) (obj)).equals("SE"))
                {
                    s = (new StringBuilder()).append(s).append("SWE").toString();
                } else
                if (((String) (obj)).equals("AU"))
                {
                    s = (new StringBuilder()).append(s).append("AUS").toString();
                } else
                if (((String) (obj)).equals("PL"))
                {
                    s = (new StringBuilder()).append(s).append("POL").toString();
                } else
                if (((String) (obj)).equals("BR"))
                {
                    s = (new StringBuilder()).append(s).append("BRA").toString();
                } else
                if (((String) (obj)).equals("PT"))
                {
                    s = (new StringBuilder()).append(s).append("PRT").toString();
                } else
                if (((String) (obj)).equals("FI"))
                {
                    s = (new StringBuilder()).append(s).append("FIN").toString();
                } else
                if (((String) (obj)).equals("DK"))
                {
                    s = (new StringBuilder()).append(s).append("DNK").toString();
                } else
                if (((String) (obj)).equals("NL"))
                {
                    s = (new StringBuilder()).append(s).append("NLD").toString();
                } else
                if (((String) (obj)).equals("UA"))
                {
                    s = (new StringBuilder()).append(s).append("UKR").toString();
                } else
                if (((String) (obj)).equals("GR"))
                {
                    s = (new StringBuilder()).append(s).append("GRC").toString();
                } else
                if (((String) (obj)).equals("RU"))
                {
                    s = (new StringBuilder()).append(s).append("RUS").toString();
                } else
                if (((String) (obj)).equals("CT") || ((String) (obj)).equals("GD"))
                {
                    s = (new StringBuilder()).append(s).append("CHS").toString();
                } else
                if (((String) (obj)).equals("HK"))
                {
                    s = (new StringBuilder()).append(s).append("CHN").toString();
                } else
                {
                    s = null;
                }
            }
        }
_L6:
        e1 = s;
        if (s == null)
        {
            e1 = "xxx-XXX";
        }
        if (a1.a("dictation_language"))
        {
            s = a1.h("dictation_language");
        } else
        {
            s = e1;
        }
        if (!a1.a("ui_language"))
        {
            a1.b("ui_language", s.substring(0, 2).toLowerCase(Locale.getDefault()));
        }
        if (!a1.a("phone_submodel"))
        {
            a1.b("phone_submodel", s4);
        }
        if (!a1.a("phone_OS"))
        {
            a1.b("phone_OS", s5);
        }
        if (!a1.a("locale"))
        {
            a1.b("locale", s1);
        }
        if (!a1.a("nmaid"))
        {
            a1.b("nmaid", s8);
        }
        if (!a1.a("network_type"))
        {
            a1.b("network_type", s6);
        }
        if (!a1.a("application_name"))
        {
            a1.b("application_name", s7);
        }
        g = f.a(e, s2, "1.6.3-B007", s, s3, s4, a1, l);
_L2:
        return;
_L4:
        s1 = "xxx-XXX";
          goto _L5
        s = null;
          goto _L6
    }

    public final void a(String s, com.nuance.dragon.toolkit.b.e e1, com.nuance.a.a.a.c.c.f f1)
    {
        if (g != null)
        {
            e1 = com.nuance.dragon.toolkit.b.a.a.a(e1, f);
            a(f.a(s, e1, f1));
        }
    }

    public final void a(String s, String s1)
    {
        if (g != null)
        {
            a(f.a(s, s1));
        }
    }

    public final void b()
    {
        if (g != null)
        {
            g.a();
        }
    }

    protected final com.nuance.dragon.toolkit.a.c c()
    {
        return c;
    }

    static 
    {
        boolean flag;
        if (!com/nuance/dragon/toolkit/a/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
