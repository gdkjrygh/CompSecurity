// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.yume.android.sdk:
//            M, e, l, b, 
//            i, g, d, as, 
//            Z, aG, q, Q

final class aF
{

    static int a = 300;
    static int b = 900;
    static int c = 10;
    static int d = 5;
    static int e = 0;
    static int f = 0;
    private M g;
    private XmlPullParserFactory h;
    private XmlPullParser i;
    private e j;
    private l k;
    private b l;
    private i m;
    private as n;

    public aF()
    {
        g = M.a();
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        try
        {
            h = XmlPullParserFactory.newInstance();
        }
        catch (XmlPullParserException xmlpullparserexception)
        {
            g.c("XmlPullParserException while creating Pull Parser Factory instance.");
            xmlpullparserexception.printStackTrace();
        }
        h.setNamespaceAware(true);
        try
        {
            i = h.newPullParser();
        }
        catch (XmlPullParserException xmlpullparserexception1)
        {
            g.c("XmlPullParserException while creating Pull Parser instance.");
            xmlpullparserexception1.printStackTrace();
        }
        j = new e();
        k = new l();
        l = new b();
        m = new i();
    }

    private g a(boolean flag)
    {
        Object obj;
        boolean flag1;
        boolean flag3;
        flag3 = false;
        obj = new g();
        obj.l = false;
        int i1 = e + 1;
        e = i1;
        obj.a = i1;
        flag1 = false;
_L9:
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (flag1)
        {
            if (obj != null)
            {
                obj.i = flag3;
            }
            return ((g) (obj));
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        int j1 = i.getEventType();
        if (j1 != 2) goto _L2; else goto _L1
_L1:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        String s = i.getName();
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (((g) (obj)).b != null) goto _L4; else goto _L3
_L3:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (j == null) goto _L6; else goto _L5
_L5:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        obj.b = j.a(i);
_L10:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (((g) (obj)).b.c() > 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        g.b((new StringBuilder("Setting default Ad Expiration Time: ")).append(a).toString());
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        ((g) (obj)).b.b(a);
_L14:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        boolean flag4 = s.equals("slates");
        if (!flag4) goto _L8; else goto _L7
_L7:
        n = new as();
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_1125;
        }
        a();
        obj.f = n.a(i);
        boolean flag2;
        flag4 = true;
        flag2 = flag1;
_L16:
        flag5 = flag4;
        flag6 = flag4;
        flag7 = flag4;
        i.next();
        flag1 = flag2;
        flag3 = flag4;
          goto _L9
        obj;
        flag3 = flag5;
_L22:
        g.c("XmlPullParserException while parsing Ad Info.");
        ((XmlPullParserException) (obj)).printStackTrace();
        obj = null;
        flag1 = true;
          goto _L9
_L6:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        g.c("Invalid Ad General Info Parser.");
          goto _L10
        obj;
        flag3 = flag6;
_L21:
        g.c("IOException while parsing Ad Info.");
        ((IOException) (obj)).printStackTrace();
        obj = null;
        flag1 = true;
          goto _L9
_L4:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("ad_guid")) goto _L12; else goto _L11
_L11:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (((g) (obj)).b.d() != null) goto _L14; else goto _L13
_L13:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        ((g) (obj)).b.a(i.nextText());
          goto _L14
        obj;
        flag3 = flag7;
_L20:
        ((Exception) (obj)).printStackTrace();
        obj = null;
        flag1 = true;
          goto _L9
_L12:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("display_more_info"))
        {
            break MISSING_BLOCK_LABEL_605;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        d d1 = ((g) (obj)).b;
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        i.nextText();
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        d1.a = true;
          goto _L14
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("display_timer")) goto _L14; else goto _L15
_L15:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        d1 = ((g) (obj)).b;
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        i.nextText();
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        d1.a = true;
          goto _L14
_L8:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("urls"))
        {
            break MISSING_BLOCK_LABEL_797;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_765;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        obj.c = k.a(i);
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        g.c("Invalid Ad URL Info Parser.");
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("customizations"))
        {
            break MISSING_BLOCK_LABEL_907;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_875;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        obj.d = l.a(i);
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        g.c("Invalid Ad Custom Info Parser.");
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
        flag2 = flag1;
        flag4 = flag3;
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (!s.equals("tracking")) goto _L16; else goto _L17
_L17:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_993;
        }
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        obj.e = m.a(i);
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        g.c("Invalid Ad Tracking Info Parser.");
        flag2 = flag1;
        flag4 = flag3;
          goto _L16
_L2:
        flag2 = flag1;
        flag4 = flag3;
        if (j1 == 4) goto _L16; else goto _L18
_L18:
        flag2 = flag1;
        flag4 = flag3;
        if (j1 != 3) goto _L16; else goto _L19
_L19:
        flag5 = flag3;
        flag6 = flag3;
        flag7 = flag3;
        boolean flag8 = i.getName().equals("ad");
        flag2 = flag1;
        flag4 = flag3;
        if (flag8)
        {
            flag2 = true;
            flag4 = flag3;
        }
          goto _L16
        obj;
        flag3 = true;
          goto _L20
        obj;
        flag3 = true;
          goto _L21
        obj;
        flag3 = true;
          goto _L22
        flag4 = true;
        flag2 = flag1;
          goto _L16
    }

    private static void a()
    {
        e = Z.a;
        f = Z.b;
    }

    private void a(Q q1)
    {
        Object obj;
        boolean flag;
        obj = aG.a;
        flag = false;
_L3:
        aG ag = ((aG) (obj));
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = i.next();
        if (i1 != 2)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        String s;
label0:
        {
            s = i.getName();
            if (!s.equals("creative_retry_interval"))
            {
                break label0;
            }
            obj = aG.b;
        }
          goto _L3
label1:
        {
            if (!s.equals("creative_retry_attempts"))
            {
                break label1;
            }
            obj = aG.c;
        }
          goto _L3
label2:
        {
            if (!s.equals("filled"))
            {
                break label2;
            }
            obj = aG.d;
        }
          goto _L3
        try
        {
label3:
            {
                if (!s.equals("unfilled"))
                {
                    break label3;
                }
                obj = aG.e;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g.c("XmlPullParserException while parsing PF Specific Info.");
            ((XmlPullParserException) (obj)).printStackTrace();
            flag = true;
            obj = ag;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g.c("IOException while parsing PF Specific Info.");
            ((IOException) (obj)).printStackTrace();
            flag = true;
            obj = ag;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            flag = true;
            obj = ag;
        }
          goto _L3
        obj = ag;
        if (!s.equals("pre_fetch_call_back_interval")) goto _L3; else goto _L4
_L4:
        obj = aG.f;
          goto _L3
        if (i1 != 4)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        obj = i.getText().trim();
        if (ag != aG.b) goto _L6; else goto _L5
_L5:
        if (((String) (obj)).length() > 0)
        {
            q1.a(q.c(((String) (obj))));
        }
_L7:
        obj = aG.a;
          goto _L3
_L6:
        if (ag != aG.c)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (((String) (obj)).length() > 0)
        {
            q1.b(q.c(((String) (obj))));
        }
          goto _L7
        if (ag != aG.d)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        q1.a(((String) (obj)));
          goto _L7
        if (ag != aG.e) goto _L9; else goto _L8
_L8:
        q1.b(((String) (obj)));
          goto _L7
_L9:
        if (ag != aG.f || ((String) (obj)).length() <= 0) goto _L7; else goto _L10
_L10:
        q1.c(q.c(((String) (obj))));
          goto _L7
        obj = ag;
        if (i1 != 3) goto _L3; else goto _L11
_L11:
        obj = i.getName();
        if (((String) (obj)).equals("register_ad_request_url") || ((String) (obj)).equals("ads")) goto _L1; else goto _L12
_L12:
        obj = aG.a;
          goto _L3
    }

    private String b()
    {
        String s = "";
        String s1 = i.getNamespace();
        int i1 = s1.lastIndexOf("/");
        if (i1 != -1)
        {
            s = s1.substring(i1 + 1);
        }
        return s;
    }

    public final g a(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (h == null || i == null)
        {
            g.c("Playlist Parsing failed.");
            return null;
        }
        a();
        g.b("parsePlaylist - Start.");
        int j1;
        s = new StringReader(s);
        i.setInput(s);
        j1 = i.getEventType();
        boolean flag;
        boolean flag1;
        flag1 = false;
        s = null;
        flag = true;
_L5:
        String s1;
        int i1;
        i1 = ((flag) ? 1 : 0);
        s1 = s;
        if (flag1) goto _L2; else goto _L1
_L1:
        if (j1 != 1) goto _L4; else goto _L3
_L3:
        s1 = s;
        i1 = ((flag) ? 1 : 0);
_L2:
        g.b("parsePlaylist - End.");
        boolean flag2;
        if (i1 != 0)
        {
            g.c("Empty Playlist received.");
        } else
        if (s1 == null)
        {
            g.c("Invalid Playlist received.");
        } else
        {
            g.b("Valid Playlist received.");
            if (((g) (s1)).b != null)
            {
                g.b((new StringBuilder("Placement: ")).append(((g) (s1)).b.e()).toString());
            }
        }
        return s1;
_L4:
        if (j1 == 0 || j1 != 2)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s1 = i.getName();
        if (s1.equals("ads"))
        {
            b();
        }
        flag2 = s1.equals("ad");
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s = a(false);
        flag1 = true;
        flag = false;
        i1 = i.next();
        j1 = i1;
          goto _L5
        s;
        flag = true;
_L7:
        g.c("XmlPullParserException while parsing playlist.");
        s.printStackTrace();
        s1 = null;
        i1 = ((flag) ? 1 : 0);
          goto _L2
        s;
        flag = true;
_L6:
        g.c("IOException while parsing playlist.");
        s.printStackTrace();
        s1 = null;
        i1 = ((flag) ? 1 : 0);
          goto _L2
        s;
          goto _L6
        s;
          goto _L6
        s;
        flag = false;
          goto _L6
        s;
          goto _L7
        s;
          goto _L7
        s;
        flag = false;
          goto _L7
    }

    public final Q b(String s)
    {
        Q q1;
        if (s == null)
        {
            return null;
        }
        if (h == null || i == null)
        {
            g.c("PF Playlist Parsing failed.");
            return null;
        }
        a();
        q1 = new Q();
        int j1;
        s = new StringReader(s);
        i.setInput(s);
        j1 = i.getEventType();
        int i1;
        boolean flag;
        boolean flag2;
        flag = false;
        flag2 = false;
        i1 = 1;
        s = null;
_L7:
        String s1;
        boolean flag1;
        s1 = s;
        flag1 = i1;
        if (flag2) goto _L2; else goto _L1
_L1:
        if (j1 != 1) goto _L4; else goto _L3
_L3:
        flag1 = i1;
        s1 = s;
          goto _L2
_L4:
        boolean flag3;
        flag3 = flag;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        if (j1 != 2) goto _L6; else goto _L5
_L5:
        flag3 = i1;
        j1 = i1;
        s1 = i.getName();
        flag3 = i1;
        j1 = i1;
        if (!s1.equals("ads"))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        flag3 = i1;
        j1 = i1;
        b();
        flag1 = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        flag3 = i1;
        j1 = i1;
        a(q1);
        flag1 = true;
        flag3 = i1;
        j1 = i1;
        flag4 = s1.equals("ad");
        flag3 = flag1;
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        s = a(true);
        i1 = 0;
        flag2 = true;
        flag = flag1;
        flag1 = flag2;
_L8:
        flag3 = i1;
        j1 = i1;
        k1 = i.next();
        flag2 = flag1;
        j1 = k1;
          goto _L7
_L6:
        flag3 = flag;
        if (j1 != 3)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        flag3 = i1;
        j1 = i1;
        flag4 = i.getName().equals("ads");
        flag3 = flag;
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        flag1 = true;
          goto _L8
        s;
        i1 = 1;
_L14:
        g.c("XmlPullParserException while parsing PF playlist.");
        s.printStackTrace();
        s1 = null;
        flag1 = i1;
          goto _L2
        s;
        i1 = 1;
_L13:
        g.c("IOException while parsing PF playlist.");
        s.printStackTrace();
        s1 = null;
        flag1 = i1;
_L2:
        int k1;
        boolean flag4;
        if (!flag1)
        {
            if (q1.c() == null || q1.d() == null)
            {
                g.c("Invalid Filled Playlist Received (Prefetch specific Tags not present).");
                return null;
            }
        } else
        if (q1.d() == null)
        {
            g.c("Invalid Empty Playlist Received (Prefetch specific Tags not present).");
            return null;
        }
        q1.a(s1);
        if (!flag1) goto _L10; else goto _L9
_L9:
        g.c("Empty PF Playlist received.");
        s = q1;
        if (q1.e() <= 0)
        {
            g.b((new StringBuilder("Setting default PF Callback Interval: ")).append(b).toString());
            q1.c(b);
            s = q1;
        }
_L12:
        return s;
_L10:
        if (s1 == null)
        {
            g.c("Invalid PF Playlist received.");
            s = null;
        } else
        {
            g.b("Valid PF Playlist received.");
            if (((g) (s1)).b != null)
            {
                g.b((new StringBuilder("Placement: ")).append(((g) (s1)).b.e()).toString());
            }
            if (q1.a() <= 0)
            {
                g.b((new StringBuilder("Setting default Creative Retry Interval: ")).append(c).toString());
                q1.a(c);
            }
            s = q1;
            if (q1.b() <= 0)
            {
                g.b((new StringBuilder("Setting default Creative Retry Count: ")).append(d).toString());
                q1.b(d);
                s = q1;
            }
        }
        if (true) goto _L12; else goto _L11
_L11:
        s;
        i1 = ((flag3) ? 1 : 0);
          goto _L13
        s;
        i1 = 0;
          goto _L13
        s;
        i1 = j1;
          goto _L14
        s;
        i1 = 0;
          goto _L14
        flag1 = flag2;
        flag = flag3;
          goto _L8
    }

}
