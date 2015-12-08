// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.util.i;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.t;
import p.df.a;

public class d
{

    private static String a = "<!-- xplatformAdSlotSize=";
    private static String b = "xplatformAdSlotSize=300x250";
    private static String c = "xplatformAdSlotSize=320x50";
    private static String d = "<!-- xplatformAdHeight=";
    private static String e = "<!-- xplatformAdBorder";
    private static String f = "<body style='padding:0px;margin:0px;background-color:transparent;'><table width='320' border='0' cellspacing='0' cellpadding='0'><tr><td colspan='3'><img src='http://www.pandora.com/static/ads/mobile_300x250_template/shell300x250_01_top.png'                     width='320' height='11'/></td></tr><tr><td width='10'><img src='http://www.pandora.com/static/ads/mobile_300x250_template/shell300x250_02_left.png'                    width='10' height='250'/></td><td> %s </td><td width='10'><img src='http://www.pandora.com/static/ads/mobile_300x250_template/shell300x250_04_rght.png'                    width='10' height='250'/></td></tr><tr><td colspan='3'><img src='http://www.pandora.com/static/ads/mobile_300x250_template/shell300x250_05_bttm.png'                     width='320' height='11'/></td></tr></table></body>";

    public static com.pandora.radio.data.a a(String s1, com.pandora.radio.util.a.a a1)
    {
        try
        {
            s1 = a(b.a.b().p().b(s1), "DART", a1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("BANNER AD", "Exception in DART request", s1);
            return null;
        }
        return s1;
    }

    static com.pandora.radio.data.a a(String s1, String s2, com.pandora.radio.util.a.a a1)
    {
        if (!i.a(s1)) goto _L2; else goto _L1
_L1:
        p.df.a.c("BANNER AD", String.format("Empty response from %s", new Object[] {
            s2
        }));
        s2 = String.format("Empty %s Response", new Object[] {
            s2
        });
_L8:
        if (s2 != null)
        {
            a(s1, s2);
        }
_L6:
        s2 = null;
_L4:
        return s2;
_L2:
        if (!b(s1))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        a1 = b(s1, a1);
        s2 = a1;
        if (false)
        {
            a(s1, ((String) (null)));
            return a1;
        }
        continue; /* Loop/switch isn't completed */
        if (!c(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = c(s1, a1);
        s2 = a1;
        if (false)
        {
            a(s1, ((String) (null)));
            return a1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            p.df.a.c("BANNER AD", String.format("Unknown %s Response: %s", new Object[] {
                s2, s1
            }));
            s2 = String.format("Unknown %s Response", new Object[] {
                s2
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s2) { }
        finally
        {
            if (false)
            {
                a(s1, ((String) (null)));
            }
            throw s2;
        }
        p.df.a.c("BANNER AD", "Exception in ad request", s2);
        s2 = String.format("Exception in ad request: %s", new Object[] {
            s2.getCause()
        });
        if (s2 != null)
        {
            a(s1, s2);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(String s1)
    {
        af af1 = b.a.d();
        if (af1 != null && !af1.a())
        {
            p.df.a.c("BANNER AD", "Pandora One user, no ads");
            return null;
        }
        if (i.a(s1)) goto _L2; else goto _L1
_L1:
        c c1 = b.a.b();
        String s2 = c1.p().b(s1);
        s1 = s2;
        if (!i.a(null))
        {
            try
            {
                c1.p().a("Station Creation Banner", s2, null);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                p.df.a.c("BANNER AD", (new StringBuilder()).append("Failed to record broken station creation ad: ").append(s1.getMessage()).toString());
                s1 = s2;
                continue; /* Loop/switch isn't completed */
            }
            s1 = s2;
        }
_L4:
        return s1;
        s1;
        p.df.a.c("BANNER AD", "Exception on ad html request");
        s1 = (new StringBuilder()).append("Exception in ad request: ").append(s1.getCause()).toString();
        if (!i.a(s1))
        {
            try
            {
                c1.p().a("Station Creation Banner", null, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                p.df.a.c("BANNER AD", (new StringBuilder()).append("Failed to record broken station creation ad: ").append(s1.getMessage()).toString());
                s1 = null;
                continue; /* Loop/switch isn't completed */
            }
            s1 = null;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        s1;
        if (!i.a(null))
        {
            try
            {
                c1.p().a("Station Creation Banner", null, null);
            }
            catch (Exception exception)
            {
                p.df.a.c("BANNER AD", (new StringBuilder()).append("Failed to record broken station creation ad: ").append(exception.getMessage()).toString());
            }
        }
        throw s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(String s1, String s2)
    {
        try
        {
            b.a.b().p().a("Mobile Banner", s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("BANNER AD", (new StringBuilder()).append("Failed to record broken mobile ad: ").append(s1.getMessage()).toString());
        }
    }

    private static com.pandora.radio.data.a b(String s1, com.pandora.radio.util.a.a a1)
    {
        int j = 1;
        if (s1.indexOf(a) < 0)
        {
            p.df.a.c("BANNER AD", "xplatformAdSlotSize not found in ad content");
            a(s1, "xplatformAdSlotSize not found in ad content");
            return null;
        }
        String s2;
        char c1;
        int k;
        int l;
        if (s1.indexOf(b) >= 0)
        {
            if (s1.indexOf(e) >= 0)
            {
                s2 = s1.replace("<body style=", "<div style=").replace("</body>", "</div>");
                s1 = String.format(f, new Object[] {
                    s2
                });
                c1 = '\u0110';
            } else
            {
                j = 0;
                c1 = '\372';
                s2 = s1;
            }
        } else
        if (s1.indexOf(c) >= 0)
        {
            s2 = s1;
            j = 0;
            c1 = '2';
        } else
        {
            a(s1, "Unknown xplatformAdSlotSize");
            return null;
        }
        l = s2.indexOf(d);
        k = c1;
        if (j == 0)
        {
            k = c1;
            if (l >= 0)
            {
                j = s2.indexOf("-->", d.length() + l);
                s2 = s2.substring(l + d.length(), j).trim();
                try
                {
                    k = Integer.valueOf(s2).intValue();
                }
                catch (NumberFormatException numberformatexception)
                {
                    p.df.a.c("BANNER AD", (new StringBuilder()).append("ad height NumberFormatException: ").append(s2).toString());
                    k = c1;
                }
            }
        }
        p.df.a.c("BANNER AD", "xplatform HTML ad found");
        return (new com.pandora.radio.data.a.b(d(s1, a1), k, com.pandora.radio.data.a.a.a)).a();
    }

    private static boolean b(String s1)
    {
        return s1.indexOf(a) >= 0;
    }

    private static com.pandora.radio.data.a c(String s1, com.pandora.radio.util.a.a a1)
        throws JSONException
    {
        int j = s1.indexOf("{");
        if (j < 0)
        {
            return null;
        } else
        {
            s1 = d(s1.substring(j, s1.length()), a1);
            p.df.a.c("BANNER AD", "processJSONAd - JSON banner ad found");
            s1 = (new com.pandora.radio.data.a.b(new JSONObject(s1), false, b.a.b())).a();
            return (new com.pandora.radio.data.a.b(s1.L(), s1.M(), com.pandora.radio.data.a.a.a)).a(s1.O()).b(s1.P()).a();
        }
    }

    private static boolean c(String s1)
    {
        int j = s1.indexOf("{");
        int k = s1.indexOf("}");
        return j >= 0 && k > j;
    }

    private static String d(String s1, com.pandora.radio.util.a.a a1)
    {
        while (s1 == null || s1.indexOf("__GAID__") == -1) 
        {
            return s1;
        }
        if (a1 != null)
        {
            a1 = a1.a();
        } else
        {
            a1 = "";
        }
        return s1.replace("__GAID__", s.b(a1));
    }

}
