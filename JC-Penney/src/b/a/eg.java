// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.location.Location;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;

// Referenced classes of package b.a:
//            bb, eh, dg, pj, 
//            aq, cy, pk, fc

public final class eg extends bb
{

    public long a;
    public long b;
    public boolean c;
    boolean d;
    eh e;
    public long f;
    public int g;
    public String h;
    public dg i;
    public pj j;
    public String k;
    public aq l;
    private boolean m;
    private String n;
    private long o;
    private boolean p;
    private boolean q;
    private double r[];

    public eg()
    {
        a = 0x7fffffffffffffffL;
        b = 0x7fffffffffffffffL;
        m = false;
        c = false;
        d = false;
        e = eh.a;
        o = 0L;
        f = 0L;
        p = false;
        q = false;
        g = 0;
        h = "";
        i = new dg(null);
        j = new pj();
        l = aq.a;
        n = cy.a.a();
    }

    public eg(String s)
    {
        a = 0x7fffffffffffffffL;
        b = 0x7fffffffffffffffL;
        m = false;
        c = false;
        d = false;
        e = eh.a;
        o = 0L;
        f = 0L;
        p = false;
        q = false;
        g = 0;
        h = "";
        i = new dg(null);
        j = new pj();
        l = aq.a;
        n = cy.a.a();
        if (s != null)
        {
            k = s;
        }
    }

    private long f()
    {
        long l2 = 0x7fffffffffffffffL;
        long l1 = l2;
        if (a != 0x7fffffffffffffffL)
        {
            l1 = l2;
            if (b != 0x7fffffffffffffffL)
            {
                l1 = b - a;
            }
        }
        return l1;
    }

    public final String a()
    {
        String s;
        String s1;
        boolean flag;
        flag = true;
        s1 = k;
        s = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        Object obj = j;
        String s2;
        String s3;
        String s4;
        String s5;
        int i1;
        if (((pj) (obj)).b != null)
        {
            s2 = ((pj) (obj)).b;
        } else
        if (((pj) (obj)).a != null)
        {
            s2 = ((pj) (obj)).a.getHostName();
        } else
        {
            s2 = "unknown-host";
        }
        if (!((pj) (obj)).f) goto _L4; else goto _L3
_L3:
        i1 = ((pj) (obj)).e;
        s = s2;
        if (i1 > 0)
        {
            s3 = (new StringBuilder(":")).append(i1).toString();
            s = s2;
            if (!s2.endsWith(s3))
            {
                s = (new StringBuilder()).append(s2).append(s3).toString();
            }
        }
_L12:
        k = s;
_L2:
        return s;
_L4:
        s3 = ((pj) (obj)).c;
        if (s3 == null) goto _L6; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
        if (s3.regionMatches(true, 0, "http:", 0, 5)) goto _L8; else goto _L7
_L7:
        if (!s3.regionMatches(true, 0, "https:", 0, 6)) goto _L6; else goto _L9
_L9:
        i1 = ((flag) ? 1 : 0);
_L8:
        if (!i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s3;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        if (true) goto _L8; else goto _L10
_L10:
label0:
        {
            if (((pj) (obj)).d != null)
            {
                s = (new StringBuilder()).append("").append(pk.a(((pj) (obj)).d)).append(":").toString();
            } else
            {
                s = "";
            }
            if (s3.startsWith("//"))
            {
                s = (new StringBuilder()).append(s).append(s3).toString();
                continue; /* Loop/switch isn't completed */
            }
            s5 = (new StringBuilder()).append(s).append("//").toString();
            if (s3.startsWith(s2))
            {
                s = (new StringBuilder()).append(s5).append(s3).toString();
                continue; /* Loop/switch isn't completed */
            }
            s4 = "";
            s = s4;
            if (((pj) (obj)).e <= 0)
            {
                break label0;
            }
            if (((pj) (obj)).d != null)
            {
                s = s4;
                if (pk.b(((pj) (obj)).d) == ((pj) (obj)).e)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder(":")).append(((pj) (obj)).e).toString();
            s = s4;
            if (!s2.endsWith(((String) (obj))))
            {
                s = ((String) (obj));
            }
        }
        s = (new StringBuilder()).append(s5).append(s2).append(s).append(s3).toString();
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void a(int i1)
    {
        pj pj1 = j;
        if (i1 > 0)
        {
            pj1.e = i1;
        }
    }

    public final void a(long l1)
    {
        p = true;
        o = l1;
    }

    public final void a(Location location)
    {
        r = (new double[] {
            location.getLatitude(), location.getLongitude()
        });
    }

    public final void a(pk pk1)
    {
        j.d = pk1;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(d().toString().getBytes());
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            k = s;
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        i = new dg(throwable);
    }

    public final void a(InetAddress inetaddress)
    {
        k = null;
        j.a = inetaddress;
    }

    public final void b()
    {
        if (!m && a == 0x7fffffffffffffffL)
        {
            a = System.currentTimeMillis();
        }
    }

    public final void b(long l1)
    {
        q = true;
        f = l1;
    }

    public final void b(String s)
    {
        k = null;
        j.b = s;
    }

    public final void c()
    {
        if (!c && b == 0x7fffffffffffffffL)
        {
            b = System.currentTimeMillis();
        }
    }

    public final void c(long l1)
    {
        a = l1;
        m = true;
    }

    public final JSONArray d()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonarray.put(h);
            jsonarray.put(a());
            jsonarray.put(fc.a.a(new Date(a)));
            jsonarray.put(f());
            jsonarray.put(l.a());
            jsonarray.put(o);
            jsonarray.put(f);
            jsonarray.put(g);
            jsonarray.put(i.a);
            jsonarray.put(i.b);
            if (r != null)
            {
                JSONArray jsonarray1 = new JSONArray();
                jsonarray1.put(r[0]);
                jsonarray1.put(r[1]);
                jsonarray.put(jsonarray1);
            }
        }
        catch (Exception exception)
        {
            System.out.println("Failed to create statsArray");
            exception.printStackTrace();
            return null;
        }
        return jsonarray;
    }

    public final void e()
    {
        j.f = true;
    }

    public final String j()
    {
        return n;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("").append("URI            : ").append(k).append("\n").toString();
        s = (new StringBuilder()).append(s).append("URI Builder    : ").append(j.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Logged by      : ").append(e.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error type:         : ").append(i.a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error code:         : ").append(i.b).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response time  : ").append(f()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Start time     : ").append(a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("End time       : ").append(b).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes out    : ").append(f).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes in     : ").append(o).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response code  : ").append(g).append("\n").toString();
        String s1 = (new StringBuilder()).append(s).append("Request method : ").append(h).append("\n").toString();
        s = s1;
        if (r != null)
        {
            s = (new StringBuilder()).append(s1).append("Location       : ").append(Arrays.toString(r)).append("\n").toString();
        }
        return s;
    }
}
