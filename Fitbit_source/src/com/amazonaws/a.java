// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import com.amazonaws.auth.af;
import com.amazonaws.auth.al;
import com.amazonaws.auth.am;
import com.amazonaws.b.f;
import com.amazonaws.http.e;
import com.amazonaws.http.s;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.g;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.Classes;
import com.amazonaws.util.c;
import com.amazonaws.util.v;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws:
//            d, Protocol, ServiceNameFactory, f, 
//            b, g

public abstract class a
{

    public static final boolean a = true;
    private static final String g = "Amazon";
    private static final String h = "AWS";
    private static final Log i = LogFactory.getLog(com/amazonaws/a);
    protected volatile URI b;
    protected d c;
    protected com.amazonaws.http.a d;
    protected final List e;
    protected int f;
    private volatile String j;
    private volatile al k;
    private volatile String l;

    protected a(d d1)
    {
        this(d1, ((com.amazonaws.http.f) (new s(d1))));
    }

    protected a(d d1, com.amazonaws.http.f f1)
    {
        c = d1;
        d = new com.amazonaws.http.a(d1, f1);
        e = new CopyOnWriteArrayList();
    }

    protected a(d d1, com.amazonaws.http.f f1, g g1)
    {
        c = d1;
        d = new com.amazonaws.http.a(d1, f1, g1);
        e = new CopyOnWriteArrayList();
    }

    protected a(d d1, g g1)
    {
        this(d1, ((com.amazonaws.http.f) (new s(d1))), null);
    }

    private al a(String s1, String s2, String s3, boolean flag)
    {
        Object obj = c.q();
        if (obj == null)
        {
            s1 = am.a(s1, s2);
        } else
        {
            s1 = am.b(((String) (obj)), s1);
        }
        if (s1 instanceof af)
        {
            obj = (af)s1;
            if (s3 != null)
            {
                ((af) (obj)).b(s3);
            } else
            if (s2 != null && flag)
            {
                ((af) (obj)).b(s2);
                return s1;
            }
        }
        return s1;
    }

    private al a(URI uri, String s1, boolean flag)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        } else
        {
            String s2 = j();
            return a(s2, com.amazonaws.util.c.a(uri.getHost(), s2), s1, flag);
        }
    }

    private URI d(String s1)
        throws IllegalArgumentException
    {
        String s2 = s1;
        if (!s1.contains("://"))
        {
            s2 = (new StringBuilder()).append(c.a().toString()).append("://").append(s1).toString();
        }
        try
        {
            s1 = new URI(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalArgumentException(s1);
        }
        return s1;
    }

    protected static boolean d()
    {
        return System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null;
    }

    private boolean l()
    {
        g g1 = g();
        return g1 != null && g1.a();
    }

    private String m()
    {
        String s1 = Classes.a(com/amazonaws/a, this).getSimpleName();
        String s2 = ServiceNameFactory.a(s1);
        if (s2 != null)
        {
            return s2;
        }
        int j1 = s1.indexOf("JavaClient");
        int i1 = j1;
        if (j1 == -1)
        {
            j1 = s1.indexOf("Client");
            i1 = j1;
            if (j1 == -1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Unrecognized suffix for the AWS http client class name ").append(s1).toString());
            }
        }
        int k1 = s1.indexOf("Amazon");
        if (k1 == -1)
        {
            k1 = s1.indexOf("AWS");
            if (k1 == -1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Unrecognized prefix for the AWS http client class name ").append(s1).toString());
            }
            j1 = "AWS".length();
        } else
        {
            j1 = "Amazon".length();
        }
        if (k1 >= i1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unrecognized AWS http client class name ").append(s1).toString());
        } else
        {
            return s1.substring(j1 + k1, i1).toLowerCase();
        }
    }

    protected e a(b b1)
    {
        boolean flag;
        if (b_(b1) || d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new e(e, flag, this);
    }

    protected final e a(com.amazonaws.f f1)
    {
        return a(f1.a());
    }

    public void a(int i1)
    {
        f = i1;
    }

    public void a(com.amazonaws.b.e e1)
    {
        e.add(com.amazonaws.b.f.a(e1));
    }

    public void a(f f1)
    {
        e.add(f1);
    }

    public void a(d d1)
    {
        com.amazonaws.http.a a1 = d;
        g g1 = null;
        if (a1 != null)
        {
            g1 = a1.b();
            a1.a();
        }
        c = d1;
        d = new com.amazonaws.http.a(d1, g1);
    }

    public void a(com.amazonaws.regions.a a1)
        throws IllegalArgumentException
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("No region provided");
        }
        String s2 = j();
        Object obj;
        if (a1.b(s2))
        {
            String s1 = a1.a(s2);
            int i1 = s1.indexOf("://");
            obj = s1;
            if (i1 >= 0)
            {
                obj = s1.substring(i1 + "://".length());
            }
        } else
        {
            obj = String.format("%s.%s.%s", new Object[] {
                s2, a1.a(), a1.b()
            });
            i.info((new StringBuilder()).append("{").append(s2).append(", ").append(a1.a()).append("} was not ").append("found in region metadata, trying to construct an ").append("endpoint using the standard pattern for this region: '").append(((String) (obj))).append("'.").toString());
        }
        obj = d(((String) (obj)));
        a1 = a(s2, a1.a(), j, false);
        this;
        JVM INSTR monitorenter ;
        b = ((URI) (obj));
        k = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    protected final void a(AWSRequestMetrics awsrequestmetrics, com.amazonaws.f f1, com.amazonaws.g g1)
    {
        a(awsrequestmetrics, f1, g1, false);
    }

    protected final void a(AWSRequestMetrics awsrequestmetrics, com.amazonaws.f f1, com.amazonaws.g g1, boolean flag)
    {
        if (f1 != null)
        {
            awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.d);
            awsrequestmetrics.a().q();
            b(f1).a(f1, g1);
        }
        if (flag)
        {
            awsrequestmetrics.c();
        }
    }

    public void a(String s1)
        throws IllegalArgumentException
    {
        s1 = d(s1);
        al al = a(((URI) (s1)), j, false);
        this;
        JVM INSTR monitorenter ;
        b = s1;
        k = al;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    protected void a(String s1, String s2)
    {
    }

    public void a(String s1, String s2, String s3)
    {
        s1 = d(s1);
        s2 = a(s2, s3, s3, true);
        this;
        JVM INSTR monitorenter ;
        k = s2;
        b = s1;
        j = s3;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    protected void a(URI uri)
    {
    }

    protected al a_()
    {
        return k;
    }

    public final void a_(String s1)
    {
        l = s1;
    }

    public a b(int i1)
    {
        a(i1);
        return this;
    }

    public al b(URI uri)
    {
        return a(uri, j, true);
    }

    protected final g b(com.amazonaws.f f1)
    {
        f1 = f1.a().e();
        if (f1 == null)
        {
            g g1 = f();
            f1 = g1;
            if (g1 == null)
            {
                return AwsSdkMetrics.a();
            }
        }
        return f1;
    }

    public void b(com.amazonaws.b.e e1)
    {
        e.remove(com.amazonaws.b.f.a(e1));
    }

    public void b(f f1)
    {
        e.remove(f1);
    }

    public void b_()
    {
        d.a();
    }

    public final void b_(String s1)
    {
        al al = a(b, s1, true);
        this;
        JVM INSTR monitorenter ;
        k = al;
        j = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    protected final boolean b_(b b1)
    {
        b1 = b1.e();
        if (b1 != null && b1.a())
        {
            return true;
        } else
        {
            return l();
        }
    }

    protected final e c()
    {
        boolean flag;
        if (l() || d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new e(e, flag, this);
    }

    public int e()
    {
        return f;
    }

    public g f()
    {
        return d.b();
    }

    protected g g()
    {
        g g2 = d.b();
        g g1 = g2;
        if (g2 == null)
        {
            g1 = AwsSdkMetrics.a();
        }
        return g1;
    }

    protected String h()
    {
        return j();
    }

    public String i()
    {
        return j();
    }

    protected String j()
    {
        if (l != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (l != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        s1 = m();
        l = s1;
        this;
        JVM INSTR monitorexit ;
        return s1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return l;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String k()
    {
        return j;
    }

}
