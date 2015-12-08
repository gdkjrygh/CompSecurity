// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

static final class lang.String extends String
{

    public final String a()
    {
        int i;
        if (c())
        {
            i = b;
        } else
        {
            int k = b;
            i = b;
            char c1 = a.charAt(b);
            int j = c1;
            if (c1 == '-')
            {
                j = j();
            }
            if (j >= 65 && j <= 90 || j >= 97 && j <= 122 || j == 95)
            {
                for (i = j(); i >= 65 && i <= 90 || i >= 97 && i <= 122 || i >= 48 && i <= 57 || i == 45 || i == 95; i = j()) { }
                i = b;
            }
            b = k;
        }
        if (i == b)
        {
            return null;
        } else
        {
            String s = a.substring(b, i);
            b = i;
            return s;
        }
    }

    public final boolean a(b b1)
    {
        int j;
        if (c())
        {
            return false;
        }
        j = b;
        if (b1.b()) goto _L2; else goto _L1
_L1:
        if (!a('>')) goto _L4; else goto _L3
_L3:
        byte byte0;
        d();
        byte0 = 2;
_L27:
        Object obj;
        Object obj3;
        if (a('*'))
        {
            obj = new <init>(byte0, null);
        } else
        {
            obj = a();
            Object obj2;
            String s;
            int i;
            byte byte1;
            if (obj != null)
            {
                obj = new <init>(byte0, ((String) (obj)));
                b1.b = b1.b + 1;
            } else
            {
                obj = null;
            }
        }
_L9:
        obj3 = obj;
        if (c()) goto _L6; else goto _L5
_L5:
        if (!a('.')) goto _L8; else goto _L7
_L4:
        if (a('+'))
        {
            d();
            byte0 = 3;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
_L7:
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = new <init>(byte0, null);
        }
        obj = a();
        if (obj == null)
        {
            throw new SAXException("Invalid \".class\" selector in <style> element");
        }
        ((lang.String) (obj1)).a("class", 2, ((String) (obj)));
        b1.c();
        obj = obj1;
          goto _L9
_L8:
        obj2 = obj;
        if (a('#'))
        {
            obj2 = obj;
            if (obj == null)
            {
                obj2 = new <init>(byte0, null);
            }
            obj = a();
            if (obj == null)
            {
                throw new SAXException("Invalid \"#id\" selector in <style> element");
            }
            ((lang.String) (obj2)).a("id", 2, ((String) (obj)));
            b1.b = b1.b + 10000;
        }
        obj3 = obj2;
        if (obj2 == null) goto _L6; else goto _L10
_L10:
        if (!a('[')) goto _L12; else goto _L11
_L11:
        d();
        s = a();
        if (s == null)
        {
            throw new SAXException("Invalid attribute selector in <style> element");
        }
        d();
        if (a('='))
        {
            i = 2;
        } else
        if (a("~="))
        {
            i = 3;
        } else
        if (a("|="))
        {
            i = 4;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L14; else goto _L13
_L13:
        d();
        if (!c()) goto _L16; else goto _L15
_L15:
        obj = null;
_L18:
        if (obj == null)
        {
            throw new SAXException("Invalid attribute selector in <style> element");
        }
        break; /* Loop/switch isn't completed */
_L16:
        obj3 = p();
        obj = obj3;
        if (obj3 == null)
        {
            obj = a();
        }
        if (true) goto _L18; else goto _L17
_L17:
        d();
_L25:
        if (!a(']'))
        {
            throw new SAXException("Invalid attribute selector in <style> element");
        }
        byte1 = i;
        if (i == 0)
        {
            byte1 = 1;
        }
        ((lang.String) (obj2)).a(s, byte1, ((String) (obj)));
        b1.c();
        obj = obj2;
          goto _L9
_L12:
        obj3 = obj2;
        if (!a(':')) goto _L6; else goto _L19
_L19:
        i = b;
        obj3 = obj2;
        if (a() == null) goto _L6; else goto _L20
_L20:
        if (!a('(')) goto _L22; else goto _L21
_L21:
        d();
        if (a() == null) goto _L22; else goto _L23
_L23:
        d();
        if (a(')')) goto _L22; else goto _L24
_L24:
        b = i - 1;
        obj3 = obj2;
_L6:
        if (obj3 != null)
        {
            if (b1.a == null)
            {
                b1.a = new ArrayList();
            }
            b1.a.add(obj3);
            return true;
        } else
        {
            b = j;
            return false;
        }
_L22:
        obj = a.substring(i, b);
        if (((b) (obj2)).d == null)
        {
            obj2.d = new ArrayList();
        }
        ((util.ArrayList) (obj2)).d.add(obj);
        b1.c();
        obj3 = obj2;
          goto _L6
_L14:
        obj = null;
          goto _L25
_L2:
        byte0 = 0;
        if (true) goto _L27; else goto _L26
_L26:
    }

    public final String b()
    {
        if (c())
        {
            return null;
        }
        int k = b;
        int j = b;
        int i = a.charAt(b);
        while (i != '\uFFFF' && i != ';' && i != '}' && i != '!') 
        {
            boolean flag;
            if (i == '\n' || i == '\r')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                break;
            }
            if (!a(i))
            {
                j = b + 1;
            }
            i = j();
        }
        if (b > k)
        {
            return a.substring(k, j);
        } else
        {
            b = k;
            return null;
        }
    }

    public >(String s)
    {
        super(s.replaceAll("(?s)/\\*.*?\\*/", ""));
    }
}
