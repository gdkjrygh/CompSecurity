// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.yume.android.sdk:
//            M, YuMeAdBlockType, aC, aB, 
//            YuMeSDKInterfaceImpl, aj, Q, U, 
//            av, aq, g, p, 
//            k, d, ay, au, 
//            aw, Z, aA, N, 
//            aD, ax, aF

final class az
{

    M a;
    aC b;
    int c;
    boolean d;
    boolean e;
    g f;
    Q g;
    int h;
    int i;
    int j;
    HashMap k;
    ArrayList l;
    String m;
    int n;
    int o;
    YuMeAdBlockType p;
    int q;
    private SAXParserFactory r;
    private SAXParser s;
    private XMLReader t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private Timer z;

    public az()
    {
        a = M.a();
        b = null;
        u = 1;
        v = 10;
        w = 5;
        x = 1;
        c = 0;
        d = false;
        e = false;
        f = null;
        g = null;
        h = -1;
        i = -1;
        j = -1;
        k = null;
        l = null;
        m = null;
        y = false;
        n = 0;
        o = 0;
        p = YuMeAdBlockType.NONE;
        q = 0;
        try
        {
            r = SAXParserFactory.newInstance();
            r.setNamespaceAware(true);
            s = r.newSAXParser();
            t = s.getXMLReader();
            b = new aC(this);
            t.setContentHandler(b);
            return;
        }
        catch (Exception exception)
        {
            a.c("Exception while creating SAX Parser instance.");
            exception.printStackTrace();
            return;
        }
    }

    private aB a(boolean flag)
    {
        if (k == null) goto _L2; else goto _L1
_L1:
        Integer integer = Integer.valueOf(-1);
        if (!flag) goto _L4; else goto _L3
_L3:
        integer = Integer.valueOf(-1);
        if (l != null)
        {
            if (l.size() > 1)
            {
                Collections.sort(l);
            }
            integer = (Integer)l.get(0);
        }
_L5:
        if (integer.intValue() != -1)
        {
            return (aB)k.get(integer);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (l != null)
        {
            integer = (Integer)l.get(0);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    private void a(Q q1, g g1)
    {
        if (!d)
        {
            YuMeSDKInterfaceImpl.g.a(g1);
            return;
        }
        if (q1 != null)
        {
            q1.a(g1);
        }
        YuMeSDKInterfaceImpl.i.a(q1);
    }

    static void a(aB ab)
    {
        while (ab == null || ab.d != null) 
        {
            return;
        }
        ab.d = new av();
    }

    static void a(aq aq1)
    {
        while (aq1 == null || aq1.b != null) 
        {
            return;
        }
        aq1.b = new av();
    }

    private void a(ay ay1)
    {
        a("Invalid", true);
        if (f == null || f.e == null) goto _L2; else goto _L1
_L1:
        YuMeSDKInterfaceImpl.k.a(ay1, f.e);
_L4:
        f = null;
        g = null;
        a(((Q) (null)), ((g) (null)));
        return;
_L2:
        if (m != null)
        {
            YuMeSDKInterfaceImpl.k.a(ay1, m);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(g g1)
    {
        while (g1 == null || g1.e != null) 
        {
            return;
        }
        g1.e = new av();
    }

    private void a(String s1, boolean flag)
    {
        String s2 = "";
        if (b.d)
        {
            s2 = " (Wrapper).";
        } else
        if (b.c)
        {
            s2 = " (Inline).";
        }
        if (!d)
        {
            s1 = (new StringBuilder(String.valueOf(s1))).append(" ").append("VAST Playlist received").append(s2).toString();
        } else
        {
            s1 = (new StringBuilder(String.valueOf(s1))).append(" PF ").append("VAST Playlist received").append(s2).toString();
        }
        if (flag)
        {
            a.c(s1);
            return;
        } else
        {
            a.b(s1);
            return;
        }
    }

    private void b()
    {
        g = null;
        f = null;
        a(((Q) (null)), ((g) (null)));
    }

    static void b(aB ab)
    {
        while (ab == null || ab.c != null) 
        {
            return;
        }
        ab.c = new k();
    }

    static void b(g g1)
    {
        while (g1 == null || g1.b != null) 
        {
            return;
        }
        g1.b = new d();
    }

    private boolean c()
    {
        if (e && b.c)
        {
            return true;
        }
        if (b.d && c >= i + 1)
        {
            a.c((new StringBuilder("Wrapper Count exceeded max limit of ")).append(i).toString());
            a(ay.f);
            c = 0;
            return false;
        }
        if (f == null) goto _L2; else goto _L1
_L1:
        av av1 = f.e;
        if (av1 == null) goto _L2; else goto _L3
_L3:
        ArrayList arraylist1;
        int i1;
        int l1;
        arraylist1 = new ArrayList();
        Collections.addAll(arraylist1, new au[] {
            au.d, au.e, au.f, au.g, au.h, au.i, au.j, au.k, au.l, au.m
        });
        l1 = arraylist1.size();
        i1 = 0;
_L6:
        if (i1 < l1) goto _L4; else goto _L2
_L2:
        return true;
_L4:
        au au1 = (au)arraylist1.get(i1);
        aw aw1 = av1.a(au1);
        ArrayList arraylist = null;
        if (aw1 != null)
        {
            arraylist = aw1.a();
        }
        if (arraylist != null)
        {
            int k1 = arraylist.size();
            int j1 = k1;
            if (au1 == au.e)
            {
                j1 = k1;
                if (av1.d() != null)
                {
                    j1 = k1 + 1;
                }
            }
            if (j1 > h)
            {
                a.c((new StringBuilder("\"")).append(au1).append("\" Tracker Count exceeded max limit of ").append(h).toString());
                a(ay.e);
                return false;
            }
        }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void a()
    {
        n = Z.a;
        o = Z.b;
    }

    public final void a(int i1)
    {
        if (j > 0 && q < j)
        {
            z = null;
            if (z == null)
            {
                i1 = u;
                z = new Timer();
                z.schedule(new aA(this), i1 * 1000);
            }
            return;
        }
        z = null;
        q = 0;
        if (i1 <= 0)
        {
            a(ay.m);
            return;
        } else
        {
            a(ay.c);
            return;
        }
    }

    public final void a(String s1, boolean flag, YuMeAdBlockType yumeadblocktype)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        b();
_L16:
        return;
_L2:
        if (r == null || s == null)
        {
            a.c("Error parsing VAST Playlist.");
            b();
            return;
        }
        a.b("parseVASTPlaylist - Start.");
        e = flag;
        p = yumeadblocktype;
        if (e)
        {
            a();
            f = null;
            g = null;
            h = -1;
            i = -1;
            j = -1;
            c = 0;
            N.b();
            m = null;
            y = false;
            k = null;
            l = null;
            z = null;
            q = 0;
        }
        try
        {
            if (t != null)
            {
                t.parse(new InputSource(new StringReader(s1)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (!(s1 instanceof aD))
            {
                a.c("SAXException while parsing playlist.");
                s1.printStackTrace();
                a(ay.j);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.c("IOException while parsing playlist.");
            s1.printStackTrace();
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.c("Exception while parsing playlist.");
            s1.printStackTrace();
            b();
            return;
        }
        a.b("parseVASTPlaylist - End.");
        if (!b.a)
        {
            a.c("<VAST> node not found.");
            a(ay.g);
            return;
        }
        if (!e && !b.q.equals("2.0") && !b.q.equals("2.0.1"))
        {
            a.c((new StringBuilder("Unsupported VAST Playlist Version: ")).append(b.q).toString());
            a(ay.g);
            return;
        }
        if (!b.b && (b.c || b.d))
        {
            a.c("<Ad> node not found.");
            a(ay.b);
            return;
        }
        if (!b.b && !b.c && !b.d)
        {
            if (e)
            {
                if (!d)
                {
                    a.c("Empty VAST Playlist received.");
                    a(((Q) (null)), ((g) (null)));
                    return;
                } else
                {
                    a.c("XML Feed Empty (1).");
                    a(ay.a);
                    return;
                }
            } else
            {
                a.c("XML Feed Empty (2).");
                a(ay.a);
                return;
            }
        }
        if (!b.c && !b.d)
        {
            a.c("Neither <Inline> nor <Wrapper> tags received.");
            a(ay.g);
            return;
        }
        if (!b.f)
        {
            a.c("No <Creatives> tag found.");
            a(ay.d);
            return;
        }
        if (b.c && !b.g)
        {
            a.c("No <Creative> tag found.");
            a(ay.d);
            return;
        }
        if (b.b && b.d && b.e == null)
        {
            a.c("Invalid VASTAdTagURI received.");
            a(ay.g);
            return;
        }
        if (k == null && b.i && !b.j)
        {
            a.c("Non-Linear ad received.");
            a(ay.l);
            return;
        }
        if (!f.i && b.c && !b.h)
        {
            a.c("No <MediaFile> tag found.");
            a(ay.d);
            return;
        }
        if (b.c && !b.j)
        {
            a.c("No Linear Ad received.");
            a(ay.g);
            return;
        }
        Object obj;
        String s2;
        int i1;
        int j1;
        if (b.c)
        {
            s1 = a(true);
        } else
        if (b.d)
        {
            s1 = a(false);
        } else
        {
            s1 = null;
        }
        if (b.c && (k == null || s1 == null) && !b.n)
        {
            a.c("No supported ad formats received.");
            a(ay.h);
            return;
        }
        if (f == null || f.i) goto _L4; else goto _L3
_L3:
        if (!b.p.equals(""))
        {
            if (!b.p.equalsIgnoreCase("application") && !b.p.equalsIgnoreCase("video"))
            {
                break MISSING_BLOCK_LABEL_2360;
            }
            i1 = 1;
        } else
        {
            if (b.o.equals(""))
            {
                break MISSING_BLOCK_LABEL_2360;
            }
            s2 = b.o;
            obj = "";
            i1 = s2.indexOf("ref=");
            yumeadblocktype = ((YuMeAdBlockType) (obj));
            if (i1 != -1)
            {
                j1 = s2.indexOf("&", i1);
                yumeadblocktype = ((YuMeAdBlockType) (obj));
                if (j1 != -1)
                {
                    yumeadblocktype = s2.substring(i1 + 4, j1);
                }
            }
            if (!yumeadblocktype.equals(""))
            {
                if (!yumeadblocktype.contains(".mp4") && !yumeadblocktype.contains(".wmv") && !yumeadblocktype.contains(".3gp") && !yumeadblocktype.contains(".mov") && !yumeadblocktype.contains("app_id"))
                {
                    break MISSING_BLOCK_LABEL_2360;
                }
                i1 = 1;
            } else
            {
                if (!s2.contains(".mp4") && !s2.contains(".wmv") && !s2.contains(".3gp") && !s2.contains(".mov") && !s2.contains("app_id"))
                {
                    break MISSING_BLOCK_LABEL_2360;
                }
                i1 = 1;
            }
        }
_L24:
        if (i1 != 0)
        {
            a.c("Unsupported Playlist received.");
            a(ay.g);
            return;
        }
_L4:
        if (s1 != null)
        {
            if (f == null)
            {
                i1 = 0;
            } else
            if (s1 == null)
            {
                i1 = 0;
            } else
            {
                if (((aB) (s1)).b != null)
                {
                    b(f);
                    f.b.a(((aB) (s1)).b.b());
                }
                yumeadblocktype = ((aB) (s1)).d;
                if (yumeadblocktype != null)
                {
                    a(f);
                    obj = f.e;
                    ((av) (obj)).a(au.i, yumeadblocktype.a(au.i));
                    ((av) (obj)).a(au.j, yumeadblocktype.a(au.j));
                    ((av) (obj)).a(au.k, yumeadblocktype.a(au.k));
                    ((av) (obj)).a(au.l, yumeadblocktype.a(au.l));
                    ((av) (obj)).a(au.m, yumeadblocktype.a(au.m));
                    ((av) (obj)).a(au.g, yumeadblocktype.a(au.g));
                    ((av) (obj)).a(au.h, yumeadblocktype.a(au.h));
                    ((av) (obj)).a(yumeadblocktype.b());
                }
                if (((aB) (s1)).c != null)
                {
                    f.c = ((aB) (s1)).c;
                }
                k = null;
                l = null;
                i1 = 1;
            }
            if (i1 == 0)
            {
                a.c("Error in processing playlist response.");
                b();
                return;
            }
        }
        if (!d) goto _L6; else goto _L5
_L5:
        if (g == null || f == null || !b.m.equals("") || f.i)
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        s1 = f.c;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        s1 = s1.a();
        if (s1 == null || s1.size() != 1)
        {
            break MISSING_BLOCK_LABEL_2355;
        }
        s1 = (ax)s1.get(0);
        if (s1 == null)
        {
            flag = false;
        } else
        {
            yumeadblocktype = s1.c();
            if (!s1.a().contains("image") || s1.e() != 1 || s1.f() != 1 || yumeadblocktype != null && !yumeadblocktype.equals(""))
            {
                break MISSING_BLOCK_LABEL_2355;
            }
            flag = true;
        }
_L23:
        y = flag;
_L6:
        if (e && !y && !f.i && b.r == 0)
        {
            a.c("Invalid Impression Tracker received.");
            a(ay.g);
            return;
        }
        if (!d) goto _L8; else goto _L7
_L7:
        if (g == null || !e) goto _L10; else goto _L9
_L9:
        if (!y) goto _L12; else goto _L11
_L11:
        if (g.d() != null) goto _L10; else goto _L13
_L13:
        a.c("Invalid / Missing Prefetch-specific Tags (Empty).");
        i1 = 0;
_L14:
        if (i1 == 0)
        {
            a(ay.i);
            return;
        }
        break; /* Loop/switch isn't completed */
_L12:
        if (g.c() == null || g.d() == null)
        {
            a.c("Invalid / Missing Prefetch-specific Tags (Filled).");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
_L10:
        i1 = 1;
        if (true) goto _L14; else goto _L8
_L8:
        if (e && b.d)
        {
            if (h <= 0)
            {
                h = v;
            }
            if (i <= 0)
            {
                i = w;
            }
            if (j <= 0)
            {
                j = x;
            }
            a.b((new StringBuilder("Max Tracker Count: ")).append(h).toString());
            a.b((new StringBuilder("Max Wrapper Count: ")).append(i).toString());
            a.b((new StringBuilder("Max Wrapper Retry Count: ")).append(j).toString());
        }
        if (!c()) goto _L16; else goto _L15
_L15:
        if (d && g != null)
        {
            if (y)
            {
                if (g.e() <= 0)
                {
                    g.c(aF.b);
                }
                a.b((new StringBuilder("PF Callback Interval: ")).append(g.e()).toString());
            } else
            {
                if (g.a() <= 0)
                {
                    g.a(aF.c);
                }
                if (g.b() <= 0)
                {
                    g.b(aF.d);
                }
                if (f != null && f.b != null)
                {
                    if (f.b.c() <= 0)
                    {
                        f.b.b(aF.a);
                    }
                    a.b((new StringBuilder("Ad Expiration Time: ")).append(f.b.c()).toString());
                }
                a.b((new StringBuilder("Creative Retry Interval: ")).append(g.a()).toString());
                a.b((new StringBuilder("Creative Retry Count: ")).append(g.b()).toString());
            }
        }
        if (f == null) goto _L18; else goto _L17
_L17:
        if (!f.i) goto _L20; else goto _L19
_L19:
        f.k = false;
_L18:
        if (b.d)
        {
            a("Valid", false);
            N.a = f.l;
            YuMeSDKInterfaceImpl.k.a(b.e, null, p, d, true);
            return;
        }
        break; /* Loop/switch isn't completed */
_L20:
        if (b.l)
        {
            f.k = false;
        } else
        if (b.k)
        {
            f.k = true;
        }
        if (true) goto _L18; else goto _L21
_L21:
        if (!b.c) goto _L16; else goto _L22
_L22:
        if (d && y)
        {
            a.c("Empty PF VAST Playlist received.");
            f = null;
            a(g, ((g) (null)));
            return;
        }
        a("Valid", false);
        if (f != null)
        {
            if (f.b != null)
            {
                a.b((new StringBuilder("Ad Id: ")).append(f.b.e()).toString());
            }
            a(g, f);
            return;
        } else
        {
            a(((Q) (null)), ((g) (null)));
            return;
        }
        flag = false;
          goto _L23
        i1 = 0;
          goto _L24
    }
}
