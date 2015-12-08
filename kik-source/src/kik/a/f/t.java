// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import com.kik.f.a.a.a;
import com.kik.f.a.a.c;
import com.kik.m.e;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.v;
import kik.a.h.i;

// Referenced classes of package kik.a.f:
//            n, o

public final class t
{

    private static String a(String s, String s1, String s2, String s3)
    {
        RSAPrivateKey rsaprivatekey = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(e.a("MIIBVgIBADANBgkqhkiG9w0BAQEFAASCAUAwggE8AgEAAkEA0RZQQg2pXUo0btiJ\n70ZIzy3vlm91N6pPuQ4XjSS8Mcin8Le1fZtw2AtOcYWzzIDabanuEqgUujGHri9n\nHl9nKQIDAQABAkBP+ELWILeIcNtBEh0foTgz1ZPva83fbopzcwpa95PrTexQBYWV\noRrlPzQYGI/+pe309oOglZx0oevtGoOr7yehAiEA+HmFpNIa7QwWzRiItEuqKslZ\ndrhA+bhbmfPlUYpdoq0CIQDXa2lSWTLEkG64oLKQhBuJRccTDMVhswcrkT+4aQWh\n7QIhALq5iAc+pWFybkgeoczr96tDuOmQubNwKdZeBPzsAEXZAiEAjOt/IpenVl8F\nj1HQfiltugcji5q3JIpxDlceUAyj2qECIQDjfO4gySclIbBrbMu3/cWZWe4IicPo\n66fl1txieqtomg==")));
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(s3).append(':').append(s2).append(':').append(s1).append(':').append(s);
        s = Signature.getInstance("SHA256withRSA");
        s1 = stringbuffer.toString().getBytes("UTF-8");
        s.initSign(rsaprivatekey);
        s.update(s1);
        s = e.b(s.sign());
        return s;
        s;
        s.printStackTrace();
_L2:
        return null;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(String s, String s1, String s2, String s3, String s4, String s5, int l, String s6, 
            String s7)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        String s8 = s5;
        if (i.a(s5))
        {
            s8 = "unknown";
        }
        s5 = a(s, s4, s6, s2);
        if (s5 != null)
        {
            linkedhashmap.put("signed", s5);
        }
        linkedhashmap.put("lang", s7);
        linkedhashmap.put("sid", s);
        linkedhashmap.put("anon", "1");
        linkedhashmap.put("ts", s4);
        linkedhashmap.put("v", s6);
        linkedhashmap.put("cv", s3);
        linkedhashmap.put("conn", s8);
        linkedhashmap.put("dev", (new StringBuilder()).append(s1).append(s2).toString());
        if (l > 0)
        {
            linkedhashmap.put("n", Integer.toString(l));
        }
        return a(((Map) (linkedhashmap)));
    }

    public static String a(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            int l, String s8, String s9)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        String s10 = s7;
        if (i.a(s7))
        {
            s10 = "unknown";
        }
        s7 = a(s, s6, s8, (new StringBuilder()).append(s1).append("@").append(s2).toString());
        if (s7 != null)
        {
            linkedhashmap.put("signed", s7);
        }
        linkedhashmap.put("lang", s9);
        linkedhashmap.put("sid", s);
        linkedhashmap.put("to", s2);
        linkedhashmap.put("from", (new StringBuilder()).append(s1).append('@').append(s2).append('/').append(s3).toString());
        linkedhashmap.put("p", s4);
        linkedhashmap.put("ts", s6);
        linkedhashmap.put("v", s8);
        linkedhashmap.put("cv", s5);
        linkedhashmap.put("conn", s10);
        if (l > 0)
        {
            linkedhashmap.put("n", Integer.toString(l));
        }
        return a(((Map) (linkedhashmap)));
    }

    private static String a(Map map)
    {
        Object obj = new LinkedHashMap(map);
        map = new StringBuilder();
        obj = new v(((Map) (obj)), kik.a.d.v.a.a);
        int i1 = ((Map) (obj)).hashCode() % 29;
        int l = i1;
        if (i1 < 0)
        {
            l = i1 + 29;
        }
        char ac[] = new char[l];
        Arrays.fill(ac, ' ');
        map.append(new String(ac));
        obj = new v(((Map) (obj)), kik.a.d.v.a.b);
        map.append("<k ").append(obj.toString()).append(">");
        return map.toString();
    }

    public static k a(kik.a.f.n n1, boolean flag)
    {
        Object obj;
        Object obj1;
        byte abyte0[];
        Object obj2;
        String s;
        c c1;
        String s4;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        obj = null;
        obj1 = null;
        s = "0";
        obj2 = null;
        c1 = new c();
        flag1 = false;
        flag2 = false;
        abyte0 = null;
        flag3 = false;
        n1.a(null, "item");
        s4 = n1.getAttributeValue(null, "jid");
_L2:
        if (n1.b("item"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3;
        boolean flag5;
        if (n1.a("username"))
        {
            String s1 = n1.nextText();
            boolean flag4 = flag3;
            obj = abyte0;
            abyte0 = s1;
            flag3 = flag1;
            flag1 = flag4;
        } else
        if (n1.a("display-name"))
        {
            String s2 = n1.nextText();
            obj1 = abyte0;
            abyte0 = ((byte []) (obj));
            boolean flag6 = flag1;
            flag1 = flag3;
            obj = obj1;
            flag3 = flag6;
            obj1 = s2;
        } else
        if (n1.a("pic"))
        {
            s = n1.getAttributeValue(null, "ts");
            String s3 = n1.nextText();
            obj2 = abyte0;
            abyte0 = ((byte []) (obj));
            boolean flag7 = flag1;
            flag1 = flag3;
            obj = obj2;
            flag3 = flag7;
            obj2 = s3;
        } else
        if (n1.a("pubkey"))
        {
            Object obj4;
            boolean flag8;
            if (n1.b("pubkey"))
            {
                abyte0 = null;
            } else
            {
                abyte0 = e.a(n1.nextText(), 16);
            }
            flag8 = true;
            obj4 = obj;
            flag3 = flag1;
            flag1 = flag8;
            obj = abyte0;
            abyte0 = ((byte []) (obj4));
        } else
        if (n1.a("blocked"))
        {
            Object obj5 = abyte0;
            flag1 = flag3;
            abyte0 = ((byte []) (obj));
            flag3 = true;
            obj = obj5;
        } else
        if (n1.a("verified"))
        {
            Object obj6 = abyte0;
            boolean flag9 = true;
            flag2 = flag3;
            abyte0 = ((byte []) (obj));
            flag3 = flag1;
            flag1 = flag2;
            obj = obj6;
            flag2 = flag9;
        } else
        {
            if (n1.a("links"))
            {
                while (!n1.b("links")) 
                {
                    if (n1.a("link"))
                    {
                        a a1 = new a(n1.getAttributeValue(null, "href"), n1.getAttributeValue(null, "app-name"));
                        if (n1.getAttributeValue(null, "platform") != null)
                        {
                            a1.a(n1.getAttributeValue(null, "platform"));
                        }
                        if (n1.getAttributeValue(null, "type") != null)
                        {
                            a1.b(n1.getAttributeValue(null, "type"));
                        } else
                        {
                            a1.b("native");
                        }
                        if (n1.getAttributeValue(null, "byline") != null)
                        {
                            a1.c(n1.getAttributeValue(null, "byline"));
                        }
                        if (n1.getAttributeValue(null, "icon") != null)
                        {
                            a1.d(n1.getAttributeValue(null, "icon"));
                        }
                        if (n1.getAttributeValue(null, "file-content-type") != null)
                        {
                            a1.e(n1.getAttributeValue(null, "file-content-type"));
                        }
                        c1.a(a1);
                    }
                    n1.next();
                }
            }
            break MISSING_BLOCK_LABEL_629;
        }
_L7:
        n1.next();
        obj3 = obj;
        flag5 = flag3;
        obj = abyte0;
        flag3 = flag1;
        abyte0 = ((byte []) (obj3));
        flag1 = flag5;
        if (true) goto _L2; else goto _L1
_L1:
        if (s4 != null && obj != null && obj1 != null) goto _L4; else goto _L3
_L3:
        n1 = null;
_L6:
        return n1;
_L4:
        obj = new k(j.a(s4), ((String) (obj1)), ((String) (obj)), flag, s, ((String) (obj2)));
        ((k) (obj)).e(flag1);
        ((k) (obj)).g(flag1);
        ((k) (obj)).b(flag2);
        ((k) (obj)).a(abyte0);
        ((k) (obj)).c(flag3);
        n1 = ((kik.a.f.n) (obj));
        if (!flag2) goto _L6; else goto _L5
_L5:
        ((k) (obj)).a(c1);
        return ((k) (obj));
        byte abyte1[] = abyte0;
        abyte0 = ((byte []) (obj));
        boolean flag10 = flag1;
        flag1 = flag3;
        obj = abyte1;
        flag3 = flag10;
          goto _L7
    }

    public static n a(kik.a.f.n n1, String s)
    {
        kik.a.d.n.a a1 = new kik.a.d.n.a();
        String s4 = "0";
        n1.a(null, "g");
        String s8 = n1.getAttributeValue(null, "jid");
        boolean flag2 = "1".equals(n1.getAttributeValue(null, "ack-needed"));
        boolean flag1 = false;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        while (!n1.b("g")) 
        {
            String s5;
            String s6;
            String s7;
            boolean flag;
            if (n1.a("n"))
            {
                s5 = n1.nextText();
                s7 = s2;
                s6 = s4;
                flag = flag1;
            } else
            if (n1.a("m"))
            {
                if (n1.getAttributeValue(null, "a") != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s5 = n1.nextText();
                if (s != null && s.equalsIgnoreCase(s5))
                {
                    s5 = s3;
                    s6 = s4;
                    s7 = s2;
                } else
                if (flag)
                {
                    a1.b(s5);
                    s5 = s3;
                    flag = flag1;
                    s6 = s4;
                    s7 = s2;
                } else
                {
                    a1.a(s5);
                    s5 = s3;
                    flag = flag1;
                    s6 = s4;
                    s7 = s2;
                }
            } else
            if (n1.a("b"))
            {
                a1.f(n1.nextText());
                s5 = s3;
                flag = flag1;
                s6 = s4;
                s7 = s2;
            } else
            if (n1.a("pic"))
            {
                s6 = n1.getAttributeValue(null, "ts");
                s7 = n1.nextText();
                s5 = s3;
                flag = flag1;
            } else
            {
                s5 = s3;
                flag = flag1;
                s6 = s4;
                s7 = s2;
                if (n1.a("code"))
                {
                    s1 = n1.nextText();
                    s5 = s3;
                    flag = flag1;
                    s6 = s4;
                    s7 = s2;
                }
            }
            n1.next();
            s3 = s5;
            flag1 = flag;
            s4 = s6;
            s2 = s7;
        }
        if (s8 == null)
        {
            return null;
        } else
        {
            return new n(j.a(s8), s3, a1, flag2, true, flag1, s4, s2, s1);
        }
    }

    public static void a(o o1, boolean flag, boolean flag1, long l)
    {
        o1.a("kik");
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        o1.a("push", s);
        if (flag1)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        o1.a("qos", s);
        if (l != -1L)
        {
            o1.a("timestamp", Long.toString(l));
        }
        o1.b("kik");
    }
}
