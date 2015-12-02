// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.d;

import android_src.mms.a.b.a.b;
import android_src.mms.a.b.e;
import android_src.mms.d;
import android_src.mms.e.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.a.a.b.f;
import org.a.a.b.g;
import org.a.a.b.h;
import org.a.a.b.i;
import org.a.a.b.j;
import org.xml.sax.SAXException;

public class a
{

    private a()
    {
    }

    public static String a(String s1)
    {
        return s1.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;");
    }

    public static f a(android_src.mms.e.j j1)
    {
        Object obj = b(j1);
        f f1 = null;
        if (obj != null)
        {
            f1 = a(((s) (obj)));
        }
        obj = f1;
        if (f1 == null)
        {
            obj = c(j1);
        }
        return ((f) (obj));
    }

    private static f a(s s1)
    {
        s1 = s1.a();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        s1 = new ByteArrayInputStream(s1);
        s1 = b((new b()).a(s1));
        return s1;
        s1;
        com.facebook.debug.log.b.d("fb-mms:Mms/smil", "Failed to parse SMIL document.", s1);
_L2:
        return null;
        s1;
        com.facebook.debug.log.b.d("fb-mms:Mms/smil", "Failed to parse SMIL document.", s1);
        continue; /* Loop/switch isn't completed */
        s1;
        com.facebook.debug.log.b.d("fb-mms:Mms/smil", "Failed to parse SMIL document.", s1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static i a(String s1, f f1, String s2)
    {
        s1 = (i)f1.createElement(s1);
        s1.a(a(s2));
        return s1;
    }

    public static j a(f f1)
    {
        j j1 = (j)f1.createElement("par");
        j1.a(8F);
        f1.c().appendChild(j1);
        return j1;
    }

    private static s b(android_src.mms.e.j j1)
    {
        int l = j1.b();
        for (int k = 0; k < l; k++)
        {
            s s1 = j1.a(k);
            if (Arrays.equals(s1.g(), "application/smil".getBytes()))
            {
                return s1;
            }
        }

        return null;
    }

    private static f b(f f1)
    {
        return f1;
    }

    private static f c(android_src.mms.e.j j1)
    {
        e e1 = new e();
        g g1 = (g)e1.createElement("smil");
        g1.setAttribute("xmlns", "http://www.w3.org/2001/SMIL20/Language");
        e1.appendChild(g1);
        Object obj = (g)e1.createElement("head");
        g1.appendChild(((org.w3c.dom.Node) (obj)));
        ((g) (obj)).appendChild((h)e1.createElement("layout"));
        g1.appendChild((g)e1.createElement("body"));
        obj = a(e1);
        int l = j1.b();
        if (l == 0)
        {
            return e1;
        }
        int k = 0;
        boolean flag = false;
        boolean flag2 = false;
        do
        {
label0:
            {
                j j2;
                boolean flag1;
                boolean flag3;
label1:
                {
                    if (k >= l)
                    {
                        break label0;
                    }
                    if (obj != null)
                    {
                        flag3 = flag;
                        flag1 = flag2;
                        j2 = ((j) (obj));
                        if (!flag)
                        {
                            break label1;
                        }
                        flag3 = flag;
                        flag1 = flag2;
                        j2 = ((j) (obj));
                        if (!flag2)
                        {
                            break label1;
                        }
                    }
                    j2 = a(e1);
                    flag1 = false;
                    flag3 = false;
                }
                s s2 = j1.a(k);
                String s1 = new String(s2.g());
                obj = s1;
                if (android_src.mms.a.e(s1))
                {
                    try
                    {
                        obj = (new android_src.mms.b.a(s1, s2.b(), s2.a())).b();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.facebook.debug.log.b.d("fb-mms:Mms/smil", ((android_src.drm.mobile1.b) (obj)).getMessage(), ((Throwable) (obj)));
                        obj = s1;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.facebook.debug.log.b.d("fb-mms:Mms/smil", ((IOException) (obj)).getMessage(), ((Throwable) (obj)));
                        obj = s1;
                    }
                }
                if (((String) (obj)).equals("text/plain") || ((String) (obj)).equalsIgnoreCase("application/vnd.wap.xhtml+xml") || ((String) (obj)).equals("text/html"))
                {
                    j2.appendChild(a("text", e1, s2.k()));
                    flag1 = true;
                    flag = flag3;
                } else
                if (android_src.mms.a.b(((String) (obj))))
                {
                    j2.appendChild(a("img", e1, s2.k()));
                    flag = true;
                } else
                if (android_src.mms.a.d(((String) (obj))))
                {
                    j2.appendChild(a("video", e1, s2.k()));
                    flag = true;
                } else
                if (android_src.mms.a.c(((String) (obj))))
                {
                    j2.appendChild(a("audio", e1, s2.k()));
                    flag = true;
                } else
                {
                    com.facebook.debug.log.b.d("fb-mms:Mms/smil", "unsupport media type");
                    flag = flag3;
                }
                k++;
                flag2 = flag1;
                obj = j2;
                continue;
            }
            return e1;
        } while (true);
    }
}
