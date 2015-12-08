// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.au;

import com.comscore.utils.c;
import com.comscore.utils.e;
import com.comscore.utils.h;
import com.comscore.utils.k;
import com.comscore.utils.l;
import com.comscore.utils.n;
import com.comscore.utils.o;
import com.comscore.utils.p;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;

// Referenced classes of package p.au:
//            c

public class b
{

    public static final boolean a;
    protected URL b;
    protected Proxy c;
    private p.at.b d;
    private p.aq.b e;
    private n f;

    public b(p.aq.b b1, p.at.b b2)
    {
        e = b1;
        f = b1.r();
        d = b2;
        b = a();
    }

    private static Proxy b(String s)
    {
        int i = s.indexOf(':');
        if (i != -1)
        {
            String s1 = s.substring(0, i);
            i = Integer.parseInt(s.substring(i + 1));
            s = s1;
        } else
        {
            i = 80;
        }
        return new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, i));
    }

    private boolean f()
    {
        g();
        boolean flag = c();
        if (!flag)
        {
            h();
        }
        return flag;
    }

    private void g()
    {
        o o1 = e.ae();
        if (o1 == o.a || o1 == o.c && com.comscore.utils.e.b(e.P()) || o1 == o.d)
        {
            e.p().f();
        }
    }

    private void h()
    {
        com.comscore.utils.c.b(this, (new StringBuilder()).append("Measurement was not transmitted: ").append(d.a(e.ai())).toString());
        e.p().a(d);
    }

    protected HttpURLConnection a(URL url)
    {
        if (c != null)
        {
            url = (HttpURLConnection)url.openConnection(c);
        } else
        {
            url = (HttpURLConnection)url.openConnection();
        }
        url.setRequestProperty("Connection", "Close");
        return url;
    }

    public URL a()
    {
        return a(d.c());
    }

    public URL a(String s)
    {
        d();
        String s1 = s.concat(d.a(e.ai()));
        if (s1.length() > 4096 && s1.indexOf("&") > 0)
        {
            int i = s1.substring(0, 4088).lastIndexOf("&");
            try
            {
                s = URLEncoder.encode(s1.substring(i + 1), "UTF-8").replace("+", "%20");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = "0";
            }
            s = (new StringBuilder()).append(s1.substring(0, i)).append("&ns_cut=").append(s).toString();
        } else
        {
            s = s1;
        }
        if (s.length() > 4096)
        {
            s = s.substring(0, 4096);
        }
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    protected URL a(URL url, int i, String s)
    {
        switch (i)
        {
        case 304: 
        default:
            return null;

        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 305: 
            break;
        }
        if (s == null)
        {
            return null;
        }
        if (i == 305)
        {
            i = 0;
            if (s.startsWith((new StringBuilder()).append(url.getProtocol()).append(':').toString()))
            {
                i = url.getProtocol().length() + 1;
            }
            int j = i;
            if (s.startsWith("//", i))
            {
                j = i + 2;
            }
            c = b(s.substring(j));
            return url;
        }
        s = new URL(url, s);
        if (!url.getProtocol().equals(s.getProtocol()))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public boolean b()
    {
        android.content.Context context = e.P();
        boolean flag = l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
        o o1 = e.ad();
        f.a("lastMeasurementProcessedTimestamp", String.valueOf(com.comscore.utils.h.a()));
        switch (c.a[o1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            h();
            return false;

        case 2: // '\002'
            h();
            return false;

        case 3: // '\003'
            if (!flag || d().booleanValue())
            {
                return f();
            } else
            {
                h();
                return false;
            }

        case 4: // '\004'
            if (!flag || com.comscore.utils.e.b() || com.comscore.utils.e.b(context) || com.comscore.utils.e.d(context))
            {
                return f();
            } else
            {
                h();
                return false;
            }

        case 5: // '\005'
            break;
        }
        if (!flag || com.comscore.utils.e.b() || com.comscore.utils.e.b(context) || com.comscore.utils.e.f(context))
        {
            return f();
        } else
        {
            h();
            return false;
        }
    }

    protected boolean c()
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        obj2 = null;
        obj1 = null;
        obj = obj2;
        Object obj4 = b;
        obj = obj2;
        if (!e()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj2 = a(((URL) (obj4)));
        boolean flag;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        int i1 = ((HttpURLConnection) (obj2)).getResponseCode();
_L4:
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        obj4 = ((HttpURLConnection) (obj2)).getHeaderField("Content-Type");
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        String s = ((HttpURLConnection) (obj2)).getHeaderField("Content-Length");
        if (i1 != 200)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!p.f(((String) (obj4))))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (((String) (obj4)).indexOf("image/") != 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!p.f(s))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (Integer.parseInt(s) > 0)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        boolean flag1;
        flag1 = flag2;
        if (i1 != 204)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        flag1 = flag2;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!p.f(s))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        flag1 = flag2;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (Integer.parseInt(s) != 0)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        flag = true;
        flag1 = true;
        obj = obj2;
        obj1 = obj2;
        e.u().b();
        flag = flag1;
        flag1 = flag;
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
            flag1 = flag;
        }
_L8:
        return flag1;
_L2:
        int i;
        int j;
        j = 0;
        i = 0;
_L6:
        i1 = i;
        obj2 = obj1;
        if (obj4 == null) goto _L4; else goto _L3
_L3:
        i1 = i;
        obj2 = obj1;
        if (j >= 5) goto _L4; else goto _L5
_L5:
        obj = obj1;
        flag = flag3;
        obj2 = a(((URL) (obj4)));
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        ((HttpURLConnection) (obj2)).setInstanceFollowRedirects(false);
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        i = ((HttpURLConnection) (obj2)).getResponseCode();
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        obj4 = a(((URL) (obj4)), i, ((HttpURLConnection) (obj2)).getHeaderField("Location"));
        j++;
        obj1 = obj2;
          goto _L6
        obj1;
        flag = false;
        obj = null;
_L11:
        com.comscore.utils.c.b(this, (new StringBuilder()).append("Exception sending measurement:").append(((Exception) (obj1)).getLocalizedMessage()).toString());
        com.comscore.utils.c.a(((Exception) (obj1)));
        flag1 = flag;
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((HttpURLConnection) (obj)).disconnect();
        return flag;
        Object obj3;
        obj3;
        obj1 = obj;
        obj = obj3;
_L10:
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L10; else goto _L9
_L9:
        obj3;
        obj = obj1;
        obj1 = obj3;
          goto _L11
    }

    public Boolean d()
    {
        Object obj;
        boolean flag;
        try
        {
            obj = e.P();
        }
        catch (NullPointerException nullpointerexception)
        {
            return Boolean.valueOf(false);
        }
        flag = true;
        if (!com.comscore.utils.e.b()) goto _L2; else goto _L1
_L1:
        obj = "emu";
_L4:
        d.a("ns_radio", ((String) (obj)));
        return Boolean.valueOf(flag);
_L2:
        if (com.comscore.utils.e.b(((android.content.Context) (obj))))
        {
            obj = "wifi";
            continue; /* Loop/switch isn't completed */
        }
        if (com.comscore.utils.e.c(((android.content.Context) (obj))))
        {
            obj = "wwan";
            continue; /* Loop/switch isn't completed */
        }
        if (com.comscore.utils.e.e(((android.content.Context) (obj))))
        {
            obj = "bth";
            continue; /* Loop/switch isn't completed */
        }
        if (com.comscore.utils.e.d(((android.content.Context) (obj))))
        {
            obj = "eth";
        } else
        {
            obj = "unknown";
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean e()
    {
        return a;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        boolean flag;
        if (i < 11 || i > 13)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
