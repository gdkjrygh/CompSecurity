// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.auth.al;
import com.amazonaws.c;
import com.amazonaws.c.b;
import com.amazonaws.d;
import com.amazonaws.f;
import com.amazonaws.g;
import com.amazonaws.h;
import com.amazonaws.i;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.k;
import com.amazonaws.util.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.http:
//            s, k, l, m, 
//            e, f, j

public class a
{

    static final Log a = LogFactory.getLog(com/amazonaws/http/a);
    private static final String d = "User-Agent";
    private static final Log e = LogFactory.getLog("com.amazonaws.request");
    final com.amazonaws.http.f b;
    final d c;
    private final com.amazonaws.metrics.g f;
    private final com.amazonaws.http.k g;

    public a(d d1)
    {
        this(d1, ((com.amazonaws.http.f) (new s(d1))));
    }

    public a(d d1, com.amazonaws.http.f f1)
    {
        g = new com.amazonaws.http.k();
        c = d1;
        b = f1;
        f = null;
    }

    public a(d d1, com.amazonaws.http.f f1, com.amazonaws.metrics.g g1)
    {
        g = new com.amazonaws.http.k();
        c = d1;
        b = f1;
        f = g1;
    }

    public a(d d1, com.amazonaws.metrics.g g1)
    {
        this(d1, ((com.amazonaws.http.f) (new s(d1))), g1);
    }

    private String a(String s1)
    {
        int j1 = s1.indexOf("(");
        int i1;
        if (s1.contains(" + 15"))
        {
            i1 = s1.indexOf(" + 15");
        } else
        {
            i1 = s1.indexOf(" - 15");
        }
        return s1.substring(j1 + 1, i1);
    }

    static String a(String s1, String s2)
    {
        if (s1.contains(s2))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1.trim()).append(" ").append(s2.trim()).toString();
        }
    }

    private Throwable a(Throwable throwable, AWSRequestMetrics awsrequestmetrics)
    {
        awsrequestmetrics.c(com.amazonaws.util.AWSRequestMetrics.Field.f);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.f, throwable);
        return throwable;
    }

    private void a(com.amazonaws.b b1, AmazonClientException amazonclientexception, int i1, b b2)
    {
        i1 = i1 - 1 - 1;
        long l1 = b2.b().a(b1, amazonclientexception, i1);
        if (a.isDebugEnabled())
        {
            a.debug((new StringBuilder()).append("Retriable error detected, will retry in ").append(l1).append("ms, attempt number: ").append(i1).toString());
        }
        try
        {
            Thread.sleep(l1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.amazonaws.b b1)
        {
            Thread.currentThread().interrupt();
        }
        throw new AmazonClientException(b1.getMessage(), b1);
    }

    private void a(f f1)
    {
        Object obj = c.c();
        String s1 = ((String) (obj));
        if (!((String) (obj)).equals(d.d))
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append(", ").append(d.d).toString();
        }
        if (s1 != null)
        {
            f1.a("User-Agent", s1);
        }
        obj = f1.a();
        if (obj != null)
        {
            obj = ((com.amazonaws.b) (obj)).d();
            if (obj != null)
            {
                obj = ((RequestClientOptions) (obj)).a(com.amazonaws.RequestClientOptions.Marker.a);
                if (obj != null)
                {
                    f1.a("User-Agent", a(s1, ((String) (obj))));
                }
            }
        }
    }

    private boolean a(com.amazonaws.b b1, InputStream inputstream, AmazonClientException amazonclientexception, int i1, b b2)
    {
        int j1 = i1 - 1;
        i1 = c.l();
        if (i1 < 0 || !b2.d())
        {
            i1 = b2.c();
        }
        if (j1 < i1)
        {
            if (inputstream != null && !inputstream.markSupported())
            {
                if (a.isDebugEnabled())
                {
                    a.debug("Content not repeatable");
                    return false;
                }
            } else
            {
                return b2.a().a(b1, amazonclientexception, j1);
            }
        }
        return false;
    }

    private static boolean a(l l1)
    {
        int i1 = l1.e();
        l1 = (String)l1.a().get("Location");
        return i1 == 307 && l1 != null && !l1.isEmpty();
    }

    private boolean b(l l1)
    {
        int i1 = l1.e();
        return i1 >= 200 && i1 < 300;
    }

    int a(l l1, AmazonServiceException amazonserviceexception)
    {
        String s1;
        Object obj;
        Date date;
        date = new Date();
        obj = null;
        s1 = (String)l1.a().get("Date");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        l1 = obj;
        if (!s1.isEmpty()) goto _L3; else goto _L2
_L2:
        l1 = obj;
        amazonserviceexception = a(amazonserviceexception.getMessage());
        l1 = amazonserviceexception;
        amazonserviceexception = k.c(amazonserviceexception);
        l1 = amazonserviceexception;
_L5:
        return (int)((date.getTime() - l1.getTime()) / 1000L);
_L3:
        l1 = k.b(s1);
        if (true) goto _L5; else goto _L4
_L4:
        amazonserviceexception;
_L7:
        a.warn((new StringBuilder()).append("Unable to parse clock skew offset from response: ").append(l1).toString(), amazonserviceexception);
        return 0;
        amazonserviceexception;
        l1 = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    AmazonServiceException a(f f1, m m1, l l1)
        throws IOException
    {
        int i1 = l1.e();
        m1 = (AmazonServiceException)m1.b(l1);
        e.debug((new StringBuilder()).append("Received error response: ").append(m1.toString()).toString());
_L2:
        m1.setStatusCode(i1);
        m1.setServiceName(f1.g());
        m1.fillInStackTrace();
        return m1;
        m1;
        if (i1 == 413)
        {
            m1 = new AmazonServiceException("Request entity too large");
            m1.setServiceName(f1.g());
            m1.setStatusCode(413);
            m1.setErrorType(com.amazonaws.AmazonServiceException.ErrorType.a);
            m1.setErrorCode("Request entity too large");
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != 503 || !"Service Unavailable".equalsIgnoreCase(l1.d()))
        {
            break; /* Loop/switch isn't completed */
        }
        m1 = new AmazonServiceException("Service unavailable");
        m1.setServiceName(f1.g());
        m1.setStatusCode(503);
        m1.setErrorType(com.amazonaws.AmazonServiceException.ErrorType.b);
        m1.setErrorCode("Service unavailable");
        if (true) goto _L2; else goto _L1
_L1:
        if (m1 instanceof IOException)
        {
            throw (IOException)m1;
        } else
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to unmarshall error response (").append(m1.getMessage()).append("). Response Code: ").append(i1).append(", Response Text: ").append(l1.d()).toString(), m1);
        }
    }

    public g a(f f1, m m1, m m2, e e1)
        throws AmazonClientException, AmazonServiceException
    {
        if (e1 == null)
        {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
        List list = a(f1, e1);
        AWSRequestMetrics awsrequestmetrics = e1.c();
        m m3 = null;
        try
        {
            m1 = b(f1, m1, m2, e1);
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            a(f1, ((g) (m3)), list, ((AmazonClientException) (m1)));
            throw m1;
        }
        m3 = m1;
        a(f1, list, ((g) (m1)), awsrequestmetrics.a().q());
        return m1;
    }

    public h a(com.amazonaws.b b1)
    {
        return null;
    }

    Object a(f f1, m m1, l l1, e e1)
        throws IOException
    {
        try
        {
            f1 = e1.c();
            f1.a(com.amazonaws.util.AWSRequestMetrics.Field.k);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw f1;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw f1;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to unmarshall response (").append(f1.getMessage()).append("). Response Code: ").append(l1.e()).append(", Response Text: ").append(l1.d()).toString(), f1);
        }
        m1 = (c)m1.b(l1);
        f1.b(com.amazonaws.util.AWSRequestMetrics.Field.k);
        if (m1 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        throw new RuntimeException((new StringBuilder()).append("Unable to unmarshall response metadata. Response Code: ").append(l1.e()).append(", Response Text: ").append(l1.d()).toString());
        m1;
        f1.b(com.amazonaws.util.AWSRequestMetrics.Field.k);
        throw m1;
        if (e.isDebugEnabled())
        {
            e.debug((new StringBuilder()).append("Received successful response: ").append(l1.e()).append(", AWS Request ID: ").append(m1.c()).toString());
        }
        f1.a(com.amazonaws.util.AWSRequestMetrics.Field.b, m1.c());
        f1 = ((f) (m1.a()));
        return f1;
    }

    List a(f f1, e e1)
    {
        List list = e1.b();
        if (list == null)
        {
            return Collections.emptyList();
        }
        com.amazonaws.b.f f2;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); f2.a(f1))
        {
            f2 = (com.amazonaws.b.f)iterator.next();
            if (f2 instanceof com.amazonaws.b.c)
            {
                ((com.amazonaws.b.c)f2).a(e1.d());
            }
        }

        return list;
    }

    public void a()
    {
        b.a();
    }

    void a(f f1, g g1, List list, AmazonClientException amazonclientexception)
    {
        for (list = list.iterator(); list.hasNext(); ((com.amazonaws.b.f)list.next()).a(f1, g1, amazonclientexception)) { }
    }

    void a(f f1, Exception exception)
        throws AmazonClientException
    {
        if (f1.h() == null)
        {
            return;
        }
        if (!f1.h().markSupported())
        {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exception);
        }
        try
        {
            f1.h().reset();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exception);
        }
    }

    void a(f f1, List list, g g1, v v1)
    {
        for (list = list.iterator(); list.hasNext(); ((com.amazonaws.b.f)list.next()).a(f1, g1)) { }
    }

    g b(f f1, m m1, m m2, e e1)
        throws AmazonClientException, AmazonServiceException
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        AWSRequestMetrics awsrequestmetrics;
        LinkedHashMap linkedhashmap;
        HashMap hashmap;
        com.amazonaws.auth.g g1;
        int i1;
        boolean flag;
        awsrequestmetrics = e1.c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.v, f1.g());
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.u, f1.f());
        a(f1);
        i1 = 0;
        obj5 = null;
        linkedhashmap = new LinkedHashMap();
        linkedhashmap.putAll(f1.d());
        hashmap = new HashMap();
        hashmap.putAll(f1.b());
        g1 = e1.d();
        obj2 = null;
        obj = null;
        obj3 = null;
        obj4 = null;
        flag = false;
_L15:
        i1++;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.l, i1);
        if (i1 > 1)
        {
            f1.b(linkedhashmap);
            f1.a(hashmap);
        }
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        Object obj1 = e1.a(f1.f());
_L23:
        if (obj1 == null || g1 == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.j);
        ((al) (obj1)).a(f1, g1);
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.j);
        if (e.isDebugEnabled())
        {
            e.debug((new StringBuilder()).append("Sending Request: ").append(f1.toString()).toString());
        }
        obj2 = g.a(f1, c, e1);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        ((j) (obj2)).a(((URI) (obj4)));
        if (i1 <= 1)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.t);
        a(f1.a(), ((AmazonClientException) (obj5)), i1, c.k());
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.t);
        obj3 = ((j) (obj2)).d();
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        if (i1 <= 1) goto _L6; else goto _L5
_L5:
        if (((InputStream) (obj3)).markSupported())
        {
            ((InputStream) (obj3)).reset();
            ((InputStream) (obj3)).mark(-1);
        }
_L4:
        Object obj8 = null;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.g);
        obj3 = b.a(((j) (obj2)));
        boolean flag1;
        boolean flag2;
        boolean flag3;
        obj = obj3;
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.g);
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        if (!b(((l) (obj)))) goto _L8; else goto _L7
_L7:
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.w, Integer.valueOf(((l) (obj)).e()));
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        boolean flag4 = m1.a();
        flag = flag4;
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = new g(a(f1, m1, ((l) (obj)), e1), ((l) (obj)));
        Object obj10;
        if (!flag && obj != null)
        {
            try
            {
                if (((l) (obj)).c() != null)
                {
                    ((l) (obj)).c().close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                a.warn("Cannot close the response content.", f1);
                return ((g) (obj5));
            }
        }
        return ((g) (obj5));
        obj2;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.j);
        throw obj2;
        obj5;
        obj2 = obj3;
        obj3 = obj5;
_L22:
        if (a.isInfoEnabled())
        {
            a.info((new StringBuilder()).append("Unable to execute HTTP request: ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        }
        awsrequestmetrics.c(com.amazonaws.util.AWSRequestMetrics.Field.f);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.f, obj3);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.b, null);
        obj10 = new AmazonClientException((new StringBuilder()).append("Unable to execute HTTP request: ").append(((IOException) (obj3)).getMessage()).toString(), ((Throwable) (obj3)));
        if (!a(f1.a(), ((j) (obj2)).d(), ((AmazonClientException) (obj10)), i1, c.k()))
        {
            throw obj10;
        }
          goto _L9
        f1;
_L10:
        boolean flag5;
        if (!flag && obj != null)
        {
            try
            {
                if (((l) (obj)).c() != null)
                {
                    ((l) (obj)).c().close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (m m1)
            {
                a.warn("Cannot close the response content.", m1);
            }
        }
        throw f1;
        obj3;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.t);
        throw obj3;
_L6:
        if (((InputStream) (obj3)).markSupported())
        {
            ((InputStream) (obj3)).mark(-1);
        }
          goto _L4
        f1;
_L21:
        flag1 = flag;
        obj3 = obj;
        throw (RuntimeException)a(f1, awsrequestmetrics);
        f1;
        flag = flag1;
        obj = obj3;
          goto _L10
        obj3;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.g);
        throw obj3;
        f1;
_L20:
        flag1 = flag;
        obj3 = obj;
        throw (Error)a(f1, awsrequestmetrics);
_L8:
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        if (!a(((l) (obj)))) goto _L12; else goto _L11
_L11:
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        obj10 = (String)((l) (obj)).a().get("Location");
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        a.debug((new StringBuilder()).append("Redirecting to: ").append(((String) (obj10))).toString());
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        obj4 = URI.create(((String) (obj10)));
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.w, Integer.valueOf(((l) (obj)).e()));
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.h, obj10);
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.b, null);
        obj3 = obj4;
        obj4 = obj8;
_L16:
        if (flag || obj == null) goto _L14; else goto _L13
_L13:
        if (((l) (obj)).c() != null)
        {
            ((l) (obj)).c().close();
        }
        obj5 = obj2;
        obj2 = obj1;
        obj1 = obj;
        obj = obj5;
_L17:
        obj8 = obj3;
        obj3 = obj;
        obj = obj1;
        obj5 = obj4;
        obj4 = obj8;
          goto _L15
_L12:
        flag1 = flag;
        obj3 = obj;
        flag2 = flag;
        flag3 = flag;
        obj5 = obj4;
        flag5 = m2.a();
        flag = flag5;
        obj5 = a(f1, m2, ((l) (obj)));
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.b, ((AmazonServiceException) (obj5)).getRequestId());
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.a, ((AmazonServiceException) (obj5)).getErrorCode());
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.w, Integer.valueOf(((AmazonServiceException) (obj5)).getStatusCode()));
        if (!a(f1.a(), ((j) (obj2)).d(), ((AmazonClientException) (obj5)), i1, c.k()))
        {
            throw obj5;
        }
        if (com.amazonaws.c.c.c(((AmazonServiceException) (obj5))))
        {
            i.a(a(((l) (obj)), ((AmazonServiceException) (obj5))));
        }
        a(f1, ((Exception) (obj5)));
        obj3 = obj4;
        obj4 = obj5;
          goto _L16
        obj5;
        a.warn("Cannot close the response content.", ((Throwable) (obj5)));
        obj5 = obj1;
        obj1 = obj;
        obj = obj2;
        obj2 = obj5;
          goto _L17
_L9:
        a(f1, ((Exception) (obj3)));
        if (flag || obj == null) goto _L19; else goto _L18
_L18:
        if (((l) (obj)).c() != null)
        {
            ((l) (obj)).c().close();
        }
        obj5 = obj;
        obj8 = obj1;
        obj3 = obj4;
        obj = obj2;
        obj1 = obj5;
        obj2 = obj8;
        obj4 = obj10;
          goto _L17
        obj3;
        a.warn("Cannot close the response content.", ((Throwable) (obj3)));
        obj5 = obj;
        obj8 = obj1;
        obj3 = obj4;
        obj = obj2;
        obj1 = obj5;
        obj2 = obj8;
        obj4 = obj10;
          goto _L17
        f1;
          goto _L10
        f1;
          goto _L10
        f1;
        flag = flag2;
          goto _L20
        f1;
          goto _L20
        f1;
        flag = flag3;
          goto _L21
        f1;
          goto _L21
        obj3;
        obj4 = obj5;
          goto _L22
        IOException ioexception;
        ioexception;
        obj1 = obj2;
        obj2 = obj3;
        obj3 = ioexception;
          goto _L22
        obj3;
          goto _L22
_L2:
        obj1 = obj2;
          goto _L23
_L19:
        Object obj6 = obj;
        Object obj9 = obj1;
        obj3 = obj4;
        obj = obj2;
        obj1 = obj6;
        obj2 = obj9;
        obj4 = obj10;
          goto _L17
_L14:
        Object obj7 = obj1;
        obj1 = obj;
        obj = obj2;
        obj2 = obj7;
          goto _L17
        obj3;
          goto _L22
        obj3;
          goto _L22
    }

    public com.amazonaws.metrics.g b()
    {
        return f;
    }

    protected void finalize()
        throws Throwable
    {
        a();
        super.finalize();
    }

}
