// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.HttpMethod;
import com.amazonaws.a;
import com.amazonaws.a.c;
import com.amazonaws.auth.am;
import com.amazonaws.auth.x;
import com.amazonaws.g;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.e;
import com.amazonaws.http.s;
import com.amazonaws.internal.h;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.ac;
import com.amazonaws.services.s3.internal.ae;
import com.amazonaws.services.s3.internal.ag;
import com.amazonaws.services.s3.internal.ah;
import com.amazonaws.services.s3.internal.i;
import com.amazonaws.services.s3.internal.j;
import com.amazonaws.services.s3.internal.r;
import com.amazonaws.services.s3.internal.u;
import com.amazonaws.services.s3.internal.v;
import com.amazonaws.services.s3.internal.w;
import com.amazonaws.services.s3.internal.y;
import com.amazonaws.services.s3.internal.z;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.a.d;
import com.amazonaws.services.s3.model.a.f;
import com.amazonaws.services.s3.model.aa;
import com.amazonaws.services.s3.model.ab;
import com.amazonaws.services.s3.model.aj;
import com.amazonaws.services.s3.model.ak;
import com.amazonaws.services.s3.model.al;
import com.amazonaws.services.s3.model.an;
import com.amazonaws.services.s3.model.ao;
import com.amazonaws.services.s3.model.ap;
import com.amazonaws.services.s3.model.aq;
import com.amazonaws.services.s3.model.ar;
import com.amazonaws.services.s3.model.as;
import com.amazonaws.services.s3.model.at;
import com.amazonaws.services.s3.model.au;
import com.amazonaws.services.s3.model.av;
import com.amazonaws.services.s3.model.aw;
import com.amazonaws.services.s3.model.ay;
import com.amazonaws.services.s3.model.az;
import com.amazonaws.services.s3.model.ba;
import com.amazonaws.services.s3.model.bb;
import com.amazonaws.services.s3.model.bc;
import com.amazonaws.services.s3.model.be;
import com.amazonaws.services.s3.model.bg;
import com.amazonaws.services.s3.model.bh;
import com.amazonaws.services.s3.model.bi;
import com.amazonaws.services.s3.model.bk;
import com.amazonaws.services.s3.model.bo;
import com.amazonaws.services.s3.model.bp;
import com.amazonaws.services.s3.model.br;
import com.amazonaws.services.s3.model.bs;
import com.amazonaws.services.s3.model.bv;
import com.amazonaws.services.s3.model.bw;
import com.amazonaws.services.s3.model.bz;
import com.amazonaws.services.s3.model.ca;
import com.amazonaws.services.s3.model.cb;
import com.amazonaws.services.s3.model.cc;
import com.amazonaws.services.s3.model.cd;
import com.amazonaws.services.s3.model.ce;
import com.amazonaws.services.s3.model.cf;
import com.amazonaws.services.s3.model.cg;
import com.amazonaws.services.s3.model.ch;
import com.amazonaws.services.s3.model.ci;
import com.amazonaws.services.s3.model.cj;
import com.amazonaws.services.s3.model.cm;
import com.amazonaws.services.s3.model.cn;
import com.amazonaws.services.s3.model.co;
import com.amazonaws.services.s3.model.l;
import com.amazonaws.services.s3.model.m;
import com.amazonaws.services.s3.model.n;
import com.amazonaws.services.s3.model.o;
import com.amazonaws.services.s3.model.p;
import com.amazonaws.services.s3.model.t;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.Base64;
import com.amazonaws.util.k;
import com.amazonaws.util.q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.services.s3:
//            a, f, g

public class b extends a
    implements com.amazonaws.services.s3.a
{

    public static final String g = "s3";
    private static final String h = "S3SignerType";
    private static final String i = "AWSS3V4SignerType";
    private static Log j = LogFactory.getLog(com/amazonaws/services/s3/b);
    private static final d m = new d();
    private static final f n = new f();
    private final u k;
    private final ac l;
    private com.amazonaws.services.s3.f o;
    private final com.amazonaws.auth.h p;
    private boolean q;

    public b()
    {
        this(((com.amazonaws.auth.h) (new x())));
    }

    public b(com.amazonaws.auth.g g1)
    {
        this(g1, new com.amazonaws.d());
    }

    public b(com.amazonaws.auth.g g1, com.amazonaws.d d1)
    {
        this(((com.amazonaws.auth.h) (new h(g1))), d1);
    }

    public b(com.amazonaws.auth.h h1)
    {
        this(h1, new com.amazonaws.d());
    }

    public b(com.amazonaws.auth.h h1, com.amazonaws.d d1)
    {
        this(h1, d1, ((com.amazonaws.http.f) (new s(d1))));
    }

    public b(com.amazonaws.auth.h h1, com.amazonaws.d d1, com.amazonaws.http.f f1)
    {
        super(d1, f1);
        k = new u();
        l = new ac(null);
        o = new com.amazonaws.services.s3.f();
        p = h1;
        m();
    }

    public b(com.amazonaws.auth.h h1, com.amazonaws.d d1, com.amazonaws.metrics.g g1)
    {
        super(d1, new s(d1), g1);
        k = new u();
        l = new ac(null);
        o = new com.amazonaws.services.s3.f();
        p = h1;
        m();
    }

    public b(com.amazonaws.d d1)
    {
        this(((com.amazonaws.auth.h) (new x())), d1);
    }

    private long a(InputStream inputstream)
    {
        long l1 = 0L;
        byte abyte0[] = new byte[8192];
        inputstream.mark(-1);
        do
        {
label0:
            {
                int i1;
                try
                {
                    i1 = inputstream.read(abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream)
                {
                    throw new AmazonClientException("Could not calculate content length.", inputstream);
                }
                if (i1 == -1)
                {
                    break label0;
                }
                l1 += i1;
            }
        } while (true);
        inputstream.reset();
        return l1;
    }

    private AccessControlList a(String s1, String s2, String s3, com.amazonaws.b b1)
    {
        Object obj = b1;
        if (b1 == null)
        {
            obj = new ak(s1);
        }
        b1 = a(s1, s2, ((com.amazonaws.b) (obj)), HttpMethodName.a);
        b1.b("acl", null);
        if (s3 != null)
        {
            b1.b("versionId", s3);
        }
        return (AccessControlList)a(((com.amazonaws.f) (b1)), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.a())), s1, s2);
    }

    private RequestPaymentConfiguration a(ar ar1)
    {
        String s1 = ar1.f();
        a(s1, "The bucket name parameter must be specified while getting the Request Payment Configuration.");
        ar1 = a(s1, ((String) (null)), ((com.amazonaws.b) (ar1)), HttpMethodName.a);
        ar1.b("requestPayment", null);
        ar1.a("Content-Type", "application/xml");
        return (RequestPaymentConfiguration)a(((com.amazonaws.f) (ar1)), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.t())), s1, ((String) (null)));
    }

    private Object a(com.amazonaws.f f1, com.amazonaws.d.m m1, String s1, String s2)
    {
        return a(f1, ((com.amazonaws.http.m) (new ac(m1))), s1, s2);
    }

    private Object a(com.amazonaws.f f1, com.amazonaws.http.m m1, String s1, String s2)
    {
        AWSRequestMetrics awsrequestmetrics;
        e e1;
        com.amazonaws.b b1;
        b1 = f1.a();
        e1 = a(b1);
        awsrequestmetrics = e1.c();
        f1.a(awsrequestmetrics);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        java.util.Map.Entry entry;
        for (Iterator iterator = f1.a().c().entrySet().iterator(); iterator.hasNext(); f1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

          goto _L1
        s1;
        m1 = null;
_L3:
        a(awsrequestmetrics, f1, ((g) (m1)));
        throw s1;
_L1:
        f1.a(f);
        if (!f1.b().containsKey("Content-Type"))
        {
            f1.a("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        }
        com.amazonaws.auth.g g1 = p.a();
        if (b1.b() != null)
        {
            g1 = b1.b();
        }
        e1.a(a(f1, s1, s2));
        e1.a(g1);
        m1 = d.a(f1, m1, k, e1);
        s1 = ((String) (m1.a()));
        a(awsrequestmetrics, f1, ((g) (m1)));
        return s1;
        s1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void a(c c1, int i1)
    {
        if (c1 == null)
        {
            return;
        } else
        {
            com.amazonaws.a.a a1 = new com.amazonaws.a.a(0L);
            a1.a(i1);
            c1.a(a1);
            return;
        }
    }

    private static void a(com.amazonaws.f f1, AccessControlList accesscontrollist)
    {
        Object obj = accesscontrollist.b();
        accesscontrollist = new HashMap();
        as as1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Collection)accesscontrollist.get(as1.b())).add(as1.a()))
        {
            as1 = (as)((Iterator) (obj)).next();
            if (!accesscontrollist.containsKey(as1.b()))
            {
                accesscontrollist.put(as1.b(), new LinkedList());
            }
        }

        Permission apermission[] = Permission.values();
        int j1 = apermission.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Permission permission = apermission[i1];
            if (!accesscontrollist.containsKey(permission))
            {
                continue;
            }
            Object obj1 = (Collection)accesscontrollist.get(permission);
            StringBuilder stringbuilder = new StringBuilder();
            obj1 = ((Collection) (obj1)).iterator();
            boolean flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                at at1 = (at)((Iterator) (obj1)).next();
                if (!flag)
                {
                    flag = true;
                } else
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(at1.a()).append("=").append("\"").append(at1.b()).append("\"");
            }
            f1.a(permission.a(), stringbuilder.toString());
        }

    }

    private void a(com.amazonaws.f f1, be be1)
    {
        if (be1 == null)
        {
            return;
        }
        String s1 = f1.f().toString();
        if (s1.startsWith("http://"))
        {
            f1.a(URI.create(s1.replace("http://", "https://")));
            j.info("Overriding current endpoint to use HTTPS as required by S3 for requests containing an MFA header");
        }
        f1.a("x-amz-mfa", (new StringBuilder()).append(be1.a()).append(" ").append(be1.b()).toString());
    }

    protected static void a(com.amazonaws.f f1, bi bi1)
    {
        Object obj = bi1.g();
        if (obj != null)
        {
            java.util.Map.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); f1.a((String)entry.getKey(), entry.getValue().toString()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

        }
        obj = bi1.s();
        if (obj != null)
        {
            f1.a("Expires", com.amazonaws.util.k.b(((Date) (obj))));
        }
        bi1 = bi1.f();
        if (bi1 != null)
        {
            String s1;
            for (Iterator iterator = bi1.entrySet().iterator(); iterator.hasNext(); f1.a((new StringBuilder()).append("x-amz-meta-").append(bi1).toString(), s1))
            {
                bi1 = (java.util.Map.Entry)iterator.next();
                s1 = (String)bi1.getKey();
                String s2 = (String)bi1.getValue();
                bi1 = s1;
                if (s1 != null)
                {
                    bi1 = s1.trim();
                }
                s1 = s2;
                if (s2 != null)
                {
                    s1 = s2.trim();
                }
            }

        }
    }

    private static void a(com.amazonaws.f f1, br br1)
    {
        if (br1 != null)
        {
            if (br1.i() != null)
            {
                f1.b("response-cache-control", br1.i());
            }
            if (br1.j() != null)
            {
                f1.b("response-content-disposition", br1.j());
            }
            if (br1.k() != null)
            {
                f1.b("response-content-encoding", br1.k());
            }
            if (br1.g() != null)
            {
                f1.b("response-content-language", br1.g());
            }
            if (br1.f() != null)
            {
                f1.b("response-content-type", br1.f());
            }
            if (br1.h() != null)
            {
                f1.b("response-expires", br1.h());
            }
        }
    }

    private static void a(com.amazonaws.f f1, bz bz1)
    {
        if (bz1 != null)
        {
            b(f1, "x-amz-server-side-encryption-customer-algorithm", bz1.b());
            b(f1, "x-amz-server-side-encryption-customer-key", bz1.a());
            b(f1, "x-amz-server-side-encryption-customer-key-MD5", bz1.c());
            if (bz1.a() != null && bz1.c() == null)
            {
                f1.a("x-amz-server-side-encryption-customer-key-MD5", com.amazonaws.util.q.b(Base64.a(bz1.a())));
                return;
            }
        }
    }

    private static void a(com.amazonaws.f f1, n n1)
    {
        String s2 = (new StringBuilder()).append("/").append(com.amazonaws.util.n.a(n1.f(), true)).append("/").append(com.amazonaws.util.n.a(n1.g(), true)).toString();
        String s1 = s2;
        if (n1.h() != null)
        {
            s1 = (new StringBuilder()).append(s2).append("?versionId=").append(n1.h()).toString();
        }
        f1.a("x-amz-copy-source", s1);
        a(f1, "x-amz-copy-source-if-modified-since", n1.r());
        a(f1, "x-amz-copy-source-if-unmodified-since", n1.q());
        a(f1, "x-amz-copy-source-if-match", n1.o());
        a(f1, "x-amz-copy-source-if-none-match", n1.p());
        if (n1.m() == null) goto _L2; else goto _L1
_L1:
        a(f1, n1.m());
_L4:
        if (n1.k() != null)
        {
            f1.a("x-amz-storage-class", n1.k());
        }
        if (n1.s() != null)
        {
            f1.a("x-amz-website-redirect-location", n1.s());
        }
        bi bi1 = n1.n();
        if (bi1 != null)
        {
            f1.a("x-amz-metadata-directive", "REPLACE");
            a(f1, bi1);
        }
        b(f1, n1.t());
        a(f1, n1.u());
        return;
_L2:
        if (n1.l() != null)
        {
            f1.a("x-amz-acl", n1.l().toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(com.amazonaws.f f1, p p1)
    {
        String s2 = (new StringBuilder()).append("/").append(com.amazonaws.util.n.a(p1.h(), true)).append("/").append(com.amazonaws.util.n.a(p1.i(), true)).toString();
        String s1 = s2;
        if (p1.j() != null)
        {
            s1 = (new StringBuilder()).append(s2).append("?versionId=").append(p1.j()).toString();
        }
        f1.a("x-amz-copy-source", s1);
        a(f1, "x-amz-copy-source-if-modified-since", p1.r());
        a(f1, "x-amz-copy-source-if-unmodified-since", p1.q());
        a(f1, "x-amz-copy-source-if-match", p1.o());
        a(f1, "x-amz-copy-source-if-none-match", p1.p());
        if (p1.m() != null && p1.n() != null)
        {
            f1.a("x-amz-copy-source-range", (new StringBuilder()).append("bytes=").append(p1.m()).append("-").append(p1.n()).toString());
        }
        b(f1, p1.s());
        a(f1, p1.t());
    }

    private static void a(com.amazonaws.f f1, String s1, Date date)
    {
        if (date != null)
        {
            f1.a(s1, ag.b(date));
        }
    }

    private static void a(com.amazonaws.f f1, String s1, List list)
    {
        if (list != null && !list.isEmpty())
        {
            f1.a(s1, ag.a(list));
        }
    }

    private void a(au au1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = au1.f();
        a(s1, "The bucketName parameter must be specified.");
        a(a(s1, ((String) (null)), ((com.amazonaws.b) (au1)), HttpMethodName.e), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    private void a(cj cj1)
    {
        String s1 = cj1.g();
        RequestPaymentConfiguration requestpaymentconfiguration = cj1.f();
        a(s1, "The bucket name parameter must be specified while setting the Requester Pays.");
        a(requestpaymentconfiguration, "The request payment configuration parameter must be specified when setting the Requester Pays.");
        cj1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cj1)), HttpMethodName.c);
        cj1.b("requestPayment", null);
        cj1.a("Content-Type", "application/xml");
        byte abyte0[] = n.a(requestpaymentconfiguration);
        cj1.a("Content-Length", String.valueOf(abyte0.length));
        cj1.a(new ByteArrayInputStream(abyte0));
        a(((com.amazonaws.f) (cj1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    private void a(Object obj, String s1)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            return;
        }
    }

    private void a(String s1, String s2, String s3, AccessControlList accesscontrollist, com.amazonaws.b b1)
    {
        Object obj = b1;
        if (b1 == null)
        {
            obj = new ak(s1);
        }
        b1 = a(s1, s2, ((com.amazonaws.b) (obj)), HttpMethodName.c);
        b1.b("acl", null);
        if (s3 != null)
        {
            b1.b("versionId", s3);
        }
        s3 = (new com.amazonaws.services.s3.model.a.c()).a(accesscontrollist);
        b1.a("Content-Type", "text/plain");
        b1.a("Content-Length", String.valueOf(s3.length));
        b1.a(new ByteArrayInputStream(s3));
        a(((com.amazonaws.f) (b1)), ((com.amazonaws.http.m) (l)), s1, s2);
    }

    private void a(String s1, String s2, String s3, CannedAccessControlList cannedaccesscontrollist, com.amazonaws.b b1)
    {
        Object obj = b1;
        if (b1 == null)
        {
            obj = new ak(s1);
        }
        b1 = a(s1, s2, ((com.amazonaws.b) (obj)), HttpMethodName.c);
        b1.b("acl", null);
        b1.a("x-amz-acl", cannedaccesscontrollist.toString());
        if (s3 != null)
        {
            b1.b("versionId", s3);
        }
        a(((com.amazonaws.f) (b1)), ((com.amazonaws.http.m) (l)), s1, s2);
    }

    private ByteArrayInputStream b(InputStream inputstream)
    {
        byte abyte0[];
        int j1;
        int i1 = 0x40000;
        abyte0 = new byte[0x40000];
        j1 = 0;
        do
        {
            if (i1 <= 0)
            {
                break;
            }
            int k1;
            try
            {
                k1 = inputstream.read(abyte0, j1, i1);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new AmazonClientException("Failed to read from inputstream", inputstream);
            }
            if (k1 == -1)
            {
                break;
            }
            j1 += k1;
            i1 -= k1;
        } while (true);
        if (inputstream.read() != -1)
        {
            throw new AmazonClientException("Input stream exceeds 256k buffer.");
        }
        inputstream.close();
        return new ByteArrayInputStream(abyte0, 0, j1);
    }

    private static void b(com.amazonaws.f f1, bz bz1)
    {
        if (bz1 != null)
        {
            b(f1, "x-amz-copy-source-server-side-encryption-customer-algorithm", bz1.b());
            b(f1, "x-amz-copy-source-server-side-encryption-customer-key", bz1.a());
            b(f1, "x-amz-copy-source-server-side-encryption-customer-key-MD5", bz1.c());
            if (bz1.a() != null && bz1.c() == null)
            {
                f1.a("x-amz-copy-source-server-side-encryption-customer-key-MD5", com.amazonaws.util.q.b(Base64.a(bz1.a())));
                return;
            }
        }
    }

    private static void b(com.amazonaws.f f1, String s1, String s2)
    {
        if (s2 != null)
        {
            f1.a(s1, s2);
        }
    }

    private void b(String s1, AccessControlList accesscontrollist, com.amazonaws.metrics.g g1)
    {
        a(s1, "The bucket name parameter must be specified when setting a bucket's ACL");
        a(accesscontrollist, "The ACL parameter must be specified when setting a bucket's ACL");
        a(s1, null, null, accesscontrollist, (new ak(s1)).b(g1));
    }

    private void b(String s1, CannedAccessControlList cannedaccesscontrollist, com.amazonaws.metrics.g g1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when setting a bucket's ACL");
        a(cannedaccesscontrollist, "The ACL parameter must be specified when setting a bucket's ACL");
        a(s1, null, null, cannedaccesscontrollist, (new ak(s1)).b(g1));
    }

    private void b(String s1, String s2, String s3, AccessControlList accesscontrollist, com.amazonaws.metrics.g g1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when setting an object's ACL");
        a(s2, "The key parameter must be specified when setting an object's ACL");
        a(accesscontrollist, "The ACL parameter must be specified when setting an object's ACL");
        a(s1, s2, s3, accesscontrollist, (new ak(s1)).b(g1));
    }

    private void b(String s1, String s2, String s3, CannedAccessControlList cannedaccesscontrollist, com.amazonaws.metrics.g g1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when setting an object's ACL");
        a(s2, "The key parameter must be specified when setting an object's ACL");
        a(cannedaccesscontrollist, "The ACL parameter must be specified when setting an object's ACL");
        a(s1, s2, s3, cannedaccesscontrollist, (new ak(s1)).b(g1));
    }

    private void c(com.amazonaws.f f1)
    {
        if (e != null)
        {
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((com.amazonaws.b.f)iterator.next()).a(f1)) { }
        }
    }

    private void c(com.amazonaws.f f1, String s1, String s2)
    {
        if (!o.a() && BucketNameUtils.c(s1) && !y(b.getHost()))
        {
            f1.a(x(s1));
            s1 = s2;
            if (s2 != null)
            {
                s1 = s2;
                if (s2.startsWith("/"))
                {
                    s1 = (new StringBuilder()).append("/").append(s2).toString();
                }
            }
            f1.a(s1);
        } else
        {
            f1.a(b);
            if (s1 != null)
            {
                s1 = (new StringBuilder()).append(s1).append("/");
                if (s2 == null)
                {
                    s2 = "";
                }
                f1.a(s1.append(s2).toString());
                return;
            }
        }
    }

    static boolean c(com.amazonaws.b b1)
    {
        return d(b1);
    }

    private void d(com.amazonaws.f f1)
    {
        f1.a("Content-Length", String.valueOf(0));
    }

    private static boolean d(com.amazonaws.b b1)
    {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") == null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(b1 instanceof aq)) goto _L4; else goto _L3
_L3:
        if ((b1 = (aq)b1).i() != null || b1.r() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return false;
_L4:
        if (!(b1 instanceof bo))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((bo)b1).p() == null)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        if (!(b1 instanceof cm)) goto _L6; else goto _L5
_L5:
        if (((cm)b1).s() == null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void m()
    {
        a(com.amazonaws.services.s3.internal.d.a);
        com.amazonaws.b.d d1 = new com.amazonaws.b.d();
        e.addAll(d1.a("/com/amazonaws/services/s3/request.handlers"));
        e.addAll(d1.b("/com/amazonaws/services/s3/request.handler2s"));
    }

    private boolean n()
    {
        while (System.getProperty("com.amazonaws.services.s3.enforceV4") != null || System.getProperty("com.amazonaws.services.s3.enableV4") != null && !b.getHost().endsWith(com.amazonaws.services.s3.internal.d.a)) 
        {
            return true;
        }
        return false;
    }

    private URI x(String s1)
    {
        URI uri;
        try
        {
            uri = new URI((new StringBuilder()).append(b.getScheme()).append("://").append(s1).append(".").append(b.getAuthority()).toString());
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid bucket name: ").append(s1).toString(), urisyntaxexception);
        }
        return uri;
    }

    private boolean y(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((s1 = s1.split("\\.")).length != 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1 = s1.length;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 >= j1)
                {
                    break label0;
                }
                String s2 = s1[i1];
                int k1;
                try
                {
                    k1 = Integer.parseInt(s2);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return false;
                }
                if (k1 < 0 || k1 > 255)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    protected com.amazonaws.auth.al a(com.amazonaws.f f1, String s1, String s2)
    {
        com.amazonaws.auth.al al1 = a_();
        Object obj;
        if (n() && !(al1 instanceof com.amazonaws.services.s3.internal.a))
        {
            obj = new com.amazonaws.services.s3.internal.a();
            ((com.amazonaws.services.s3.internal.a) (obj)).a(j());
            f1 = k();
            if (f1 == null)
            {
                if (!q)
                {
                    throw new AmazonClientException("Signature Version 4 requires knowing the region of the bucket you're trying to access. You can configure a region by calling AmazonS3Client.setRegion(Region) or AmazonS3Client.setEndpoint(String) with a region-specific endpoint such as \"s3-us-west-2.amazonaws.com\".");
                }
            } else
            {
                ((com.amazonaws.services.s3.internal.a) (obj)).b(f1);
            }
        } else
        {
            obj = al1;
            if (al1 instanceof z)
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("/");
                if (s1 != null)
                {
                    s1 = (new StringBuilder()).append(s1).append("/").toString();
                } else
                {
                    s1 = "";
                }
                s1 = stringbuilder.append(s1);
                if (s2 == null)
                {
                    s2 = "";
                }
                s1 = s1.append(s2).toString();
                return new z(f1.e().toString(), s1);
            }
        }
        return ((com.amazonaws.auth.al) (obj));
    }

    protected com.amazonaws.f a(String s1, String s2, com.amazonaws.b b1, HttpMethodName httpmethodname)
    {
        b1 = new com.amazonaws.e(b1, com.amazonaws.services.s3.internal.d.b);
        b1.a(httpmethodname);
        c(b1, s1, s2);
        return b1;
    }

    protected final e a(com.amazonaws.b b1)
    {
        boolean flag;
        if (b_(b1) || d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new v(e, flag, this);
    }

    public AccessControlList a(al al1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = al1.f();
        a(s1, "The bucket name parameter must be specified when requesting a bucket's ACL");
        return a(s1, ((String) (null)), ((String) (null)), ((com.amazonaws.b) (al1)));
    }

    public Owner a()
        throws AmazonClientException, AmazonServiceException
    {
        return (Owner)a(a(((String) (null)), ((String) (null)), ((com.amazonaws.b) (new ay())), HttpMethodName.a), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.o())), ((String) (null)), ((String) (null)));
    }

    public ab a(aa aa1)
    {
        com.amazonaws.f f1 = a(aa1.f(), ((String) (null)), ((com.amazonaws.b) (aa1)), HttpMethodName.b);
        f1.b("delete", null);
        if (aa1.g() != null)
        {
            a(f1, aa1.g());
        }
        byte abyte0[] = (new com.amazonaws.services.s3.model.a.e()).a(aa1);
        f1.a("Content-Length", String.valueOf(abyte0.length));
        f1.a("Content-Type", "application/xml");
        f1.a(new ByteArrayInputStream(abyte0));
        try
        {
            f1.a("Content-MD5", com.amazonaws.util.g.b(com.amazonaws.util.q.a(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            throw new AmazonClientException("Couldn't compute md5 sum", aa1);
        }
        aa1 = (com.amazonaws.services.s3.internal.e)a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.l())), aa1.f(), ((String) (null)));
        if (!aa1.b().isEmpty())
        {
            throw new MultiObjectDeleteException(aa1.b(), aa1.a());
        } else
        {
            return new ab(aa1.a());
        }
    }

    public aw a(av av1)
        throws AmazonClientException, AmazonServiceException
    {
        com.amazonaws.f f1;
        a(av1, "The request parameter must be specified when initiating a multipart upload");
        a(av1.g(), "The bucket name parameter must be specified when initiating a multipart upload");
        a(av1.h(), "The key parameter must be specified when initiating a multipart upload");
        f1 = a(av1.g(), av1.h(), ((com.amazonaws.b) (av1)), HttpMethodName.b);
        f1.b("uploads", null);
        if (av1.k() != null)
        {
            f1.a("x-amz-storage-class", av1.k().toString());
        }
        if (av1.m() != null)
        {
            f1.a("x-amz-website-redirect-location", av1.m());
        }
        if (av1.j() == null) goto _L2; else goto _L1
_L1:
        a(f1, av1.j());
_L4:
        if (av1.a != null)
        {
            a(f1, av1.a);
        }
        a(f1, av1.n());
        d(f1);
        f1.a(new ByteArrayInputStream(new byte[0]));
        return (aw)a(f1, ((com.amazonaws.http.m) (new r(new com.amazonaws.services.s3.model.a.h.m(), new com.amazonaws.services.s3.internal.g[] {
            new ae()
        }))), av1.g(), av1.h());
_L2:
        if (av1.i() != null)
        {
            f1.a("x-amz-acl", av1.i().toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public com.amazonaws.services.s3.model.b a(com.amazonaws.services.s3.model.r r1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1;
        Object obj;
        Object obj1;
        a(r1, "The CreateBucketRequest parameter must be specified when creating a bucket");
        obj1 = r1.f();
        obj = r1.g();
        a(obj1, "The bucket name parameter must be specified when creating a bucket");
        s1 = ((String) (obj1));
        if (obj1 != null)
        {
            s1 = ((String) (obj1)).trim();
        }
        BucketNameUtils.a(s1);
        obj1 = a(s1, ((String) (null)), ((com.amazonaws.b) (r1)), HttpMethodName.c);
        if (r1.i() == null) goto _L2; else goto _L1
_L1:
        a(((com.amazonaws.f) (obj1)), r1.i());
_L4:
label0:
        {
            r1 = ((com.amazonaws.services.s3.model.r) (obj));
            if (b.getHost().equals(com.amazonaws.services.s3.internal.d.a))
            {
                break label0;
            }
            if (obj != null)
            {
                r1 = ((com.amazonaws.services.s3.model.r) (obj));
                if (!((String) (obj)).isEmpty())
                {
                    break label0;
                }
            }
            try
            {
                r1 = com.amazonaws.regions.e.c(b.getHost()).a();
            }
            // Misplaced declaration of an exception variable
            catch (com.amazonaws.services.s3.model.r r1)
            {
                r1 = ((com.amazonaws.services.s3.model.r) (obj));
            }
        }
        if (r1 != null && !r1.toUpperCase().equals(Region.a.toString()))
        {
            obj = new ah();
            ((ah) (obj)).a("CreateBucketConfiguration", "xmlns", "http://s3.amazonaws.com/doc/2006-03-01/");
            ((ah) (obj)).a("LocationConstraint").b(r1).a();
            ((ah) (obj)).a();
            r1 = ((ah) (obj)).b();
            ((com.amazonaws.f) (obj1)).a("Content-Length", String.valueOf(r1.length));
            ((com.amazonaws.f) (obj1)).a(new ByteArrayInputStream(r1));
        }
        a(((com.amazonaws.f) (obj1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
        return new com.amazonaws.services.s3.model.b(s1);
_L2:
        if (r1.h() != null)
        {
            ((com.amazonaws.f) (obj1)).a("x-amz-acl", r1.h().toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public com.amazonaws.services.s3.model.b a(String s1, Region region)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new com.amazonaws.services.s3.model.r(s1, region));
    }

    public bg a(az az1)
        throws AmazonClientException, AmazonServiceException
    {
        a(az1, "The request parameter must be specified when listing multipart uploads");
        a(az1.f(), "The bucket name parameter must be specified when listing multipart uploads");
        com.amazonaws.f f1 = a(az1.f(), ((String) (null)), ((com.amazonaws.b) (az1)), HttpMethodName.a);
        f1.b("uploads", null);
        if (az1.h() != null)
        {
            f1.b("key-marker", az1.h());
        }
        if (az1.g() != null)
        {
            f1.b("max-uploads", az1.g().toString());
        }
        if (az1.i() != null)
        {
            f1.b("upload-id-marker", az1.i());
        }
        if (az1.j() != null)
        {
            f1.b("delimiter", az1.j());
        }
        if (az1.k() != null)
        {
            f1.b("prefix", az1.k());
        }
        if (az1.l() != null)
        {
            f1.b("encoding-type", az1.l());
        }
        return (bg)a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.q())), az1.f(), ((String) (null)));
    }

    public bh a(ba ba1)
        throws AmazonClientException, AmazonServiceException
    {
        a(ba1.f(), "The bucket name parameter must be specified when listing objects in a bucket");
        com.amazonaws.f f1 = a(ba1.f(), ((String) (null)), ((com.amazonaws.b) (ba1)), HttpMethodName.a);
        if (ba1.g() != null)
        {
            f1.b("prefix", ba1.g());
        }
        if (ba1.h() != null)
        {
            f1.b("marker", ba1.h());
        }
        if (ba1.i() != null)
        {
            f1.b("delimiter", ba1.i());
        }
        if (ba1.j() != null && ba1.j().intValue() >= 0)
        {
            f1.b("max-keys", ba1.j().toString());
        }
        if (ba1.k() != null)
        {
            f1.b("encoding-type", ba1.k());
        }
        return (bh)a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.r())), ba1.f(), ((String) (null)));
    }

    public bh a(bh bh1)
        throws AmazonClientException, AmazonServiceException
    {
        a(bh1, "The previous object listing parameter must be specified when listing the next batch of objects in a bucket");
        if (!bh1.i())
        {
            bh bh2 = new bh();
            bh2.b(bh1.d());
            bh2.e(bh1.h());
            bh2.d(bh1.c());
            bh2.a(bh1.g());
            bh2.c(bh1.e());
            bh2.f(bh1.j());
            bh2.a(false);
            return bh2;
        } else
        {
            return a((new ba(bh1.d(), bh1.e(), bh1.c(), bh1.h(), new Integer(bh1.g()))).k(bh1.j()));
        }
    }

    public bi a(ap ap1)
        throws AmazonClientException, AmazonServiceException
    {
        a(ap1, "The GetObjectMetadataRequest parameter must be specified when requesting an object's metadata");
        String s1 = ap1.f();
        String s2 = ap1.g();
        String s3 = ap1.h();
        a(s1, "The bucket name parameter must be specified when requesting an object's metadata");
        a(s2, "The key parameter must be specified when requesting an object's metadata");
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (ap1)), HttpMethodName.e);
        if (s3 != null)
        {
            f1.b("versionId", s3);
        }
        a(f1, ap1.i());
        return (bi)a(f1, ((com.amazonaws.http.m) (new w())), s1, s2);
    }

    public bi a(aq aq1, File file)
        throws AmazonClientException, AmazonServiceException
    {
        boolean flag1 = false;
        a(file, "The destination file parameter must be specified when downloading an object directly to a file");
        boolean flag = flag1;
        if (aq1.i() != null)
        {
            flag = flag1;
            if (aq1.i()[0] > 0L)
            {
                flag = true;
            }
        }
        aq1 = ag.a(file, new _cls1(aq1), flag);
        if (aq1 == null)
        {
            return null;
        } else
        {
            return aq1.a();
        }
    }

    public bk a(bb bb1)
        throws AmazonClientException, AmazonServiceException
    {
        a(bb1, "The request parameter must be specified when listing parts");
        a(bb1.f(), "The bucket name parameter must be specified when listing parts");
        a(bb1.g(), "The key parameter must be specified when listing parts");
        a(bb1.h(), "The upload ID parameter must be specified when listing parts");
        com.amazonaws.f f1 = a(bb1.f(), bb1.g(), ((com.amazonaws.b) (bb1)), HttpMethodName.a);
        f1.b("uploadId", bb1.h());
        if (bb1.i() != null)
        {
            f1.b("max-parts", bb1.i().toString());
        }
        if (bb1.j() != null)
        {
            f1.b("part-number-marker", bb1.j().toString());
        }
        if (bb1.k() != null)
        {
            f1.b("encoding-type", bb1.k());
        }
        return (bk)a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.s())), bb1.f(), bb1.g());
    }

    public bp a(bo bo1)
        throws AmazonClientException, AmazonServiceException
    {
        Object obj;
        c c1;
        com.amazonaws.f f1;
        a(bo1, "The PutObjectRequest parameter must be specified when uploading an object");
        String s1 = bo1.g();
        String s2 = bo1.h();
        bi bi1 = bo1.k();
        obj = bo1.n();
        c1 = com.amazonaws.a.c.a(bo1.r());
        if (bi1 == null)
        {
            bi1 = new bi();
        }
        a(s1, "The bucket name parameter must be specified when uploading an object");
        a(s2, "The key parameter must be specified when uploading an object");
        boolean flag1 = d(bo1);
        if (bo1.j() != null)
        {
            obj = bo1.j();
            bi1.a(((File) (obj)).length());
            boolean flag;
            if (bi1.n() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (bi1.k() == null)
            {
                bi1.f(com.amazonaws.services.s3.internal.j.a().a(((File) (obj))));
            }
            if (flag && !flag1)
            {
                try
                {
                    bi1.i(com.amazonaws.util.q.b(((File) (obj))));
                }
                // Misplaced declaration of an exception variable
                catch (bo bo1)
                {
                    throw new AmazonClientException((new StringBuilder()).append("Unable to calculate MD5 hash: ").append(bo1.getMessage()).toString(), bo1);
                }
            }
            try
            {
                obj = new com.amazonaws.services.s3.internal.q(((File) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (bo bo1)
            {
                throw new AmazonClientException("Unable to find file to upload", bo1);
            }
        }
        f1 = a(s1, s2, ((com.amazonaws.b) (bo1)), HttpMethodName.c);
        if (bo1.m() == null) goto _L2; else goto _L1
_L1:
        a(f1, bo1.m());
_L4:
        if (bo1.i() != null)
        {
            f1.a("x-amz-storage-class", bo1.i());
        }
        if (bo1.o() != null)
        {
            f1.a("x-amz-website-redirect-location", bo1.o());
            if (obj == null)
            {
                d(f1);
                obj = new ByteArrayInputStream(new byte[0]);
            }
        }
        a(f1, bo1.p());
        Object obj1 = (Long)bi1.e("Content-Length");
        if (obj1 == null)
        {
            if (!((InputStream) (obj)).markSupported())
            {
                j.warn("No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors.");
                bo1 = b(((InputStream) (obj)));
                f1.a("Content-Length", String.valueOf(bo1.available()));
            } else
            {
                f1.a("Content-Length", String.valueOf(a(((InputStream) (obj)))));
                bo1 = ((bo) (obj));
            }
        } else
        {
            long l1 = ((Long) (obj1)).longValue();
            bo1 = ((bo) (obj));
            if (l1 >= 0L)
            {
                bo1 = new com.amazonaws.util.p(((InputStream) (obj)), l1, false);
                f1.a("Content-Length", ((Long) (obj1)).toString());
            }
        }
        if (c1 != null)
        {
            bo1 = new com.amazonaws.a.e(bo1, c1);
            a(c1, 2);
        }
        obj1 = null;
        if (bi1.n() == null && !flag1)
        {
            bo1 = new i(bo1);
            obj = bo1;
        } else
        {
            obj = bo1;
            bo1 = ((bo) (obj1));
        }
        if (bi1.k() == null)
        {
            bi1.f("application/octet-stream");
        }
        a(f1, bi1);
        f1.a(((InputStream) (obj)));
        f1.a("Expect", "100-continue");
        obj1 = (bi)a(f1, ((com.amazonaws.http.m) (new w())), s1, s2);
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            j.debug((new StringBuilder()).append("Unable to cleanly close input stream: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        obj = bi1.n();
        if (bo1 != null)
        {
            obj = com.amazonaws.util.g.b(bo1.a());
        }
        if (obj1 != null && obj != null && !flag1 && !Arrays.equals(com.amazonaws.util.g.b(((String) (obj))), com.amazonaws.util.g.a(((bi) (obj1)).p())))
        {
            a(c1, 8);
            throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
        } else
        {
            a(c1, 4);
            bo1 = new bp();
            bo1.f(((bi) (obj1)).p());
            bo1.e(((bi) (obj1)).q());
            bo1.b(((bi) (obj1)).c_());
            bo1.c(((bi) (obj1)).d_());
            bo1.d(((bi) (obj1)).e());
            bo1.a(((bi) (obj1)).a());
            bo1.a(((bi) (obj1)).b());
            bo1.g(((String) (obj)));
            return bo1;
        }
_L2:
        if (bo1.l() != null)
        {
            f1.a("x-amz-acl", bo1.l().toString());
        }
        continue; /* Loop/switch isn't completed */
        bo1;
        a(c1, 8);
        throw bo1;
        bo1;
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            j.debug((new StringBuilder()).append("Unable to cleanly close input stream: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        throw bo1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public bp a(String s1, String s2, File file)
        throws AmazonClientException, AmazonServiceException
    {
        return a((new bo(s1, s2, file)).b(new bi()));
    }

    public bp a(String s1, String s2, InputStream inputstream, bi bi1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new bo(s1, s2, inputstream, bi1));
    }

    public bv a(aq aq1)
        throws AmazonClientException, AmazonServiceException
    {
        Object obj;
        a(aq1, "The GetObjectRequest parameter must be specified when requesting an object");
        a(aq1.f(), "The bucket name parameter must be specified when requesting an object");
        a(aq1.g(), "The key parameter must be specified when requesting an object");
        obj = a(aq1.f(), aq1.g(), ((com.amazonaws.b) (aq1)), HttpMethodName.a);
        if (aq1.h() != null)
        {
            ((com.amazonaws.f) (obj)).b("versionId", aq1.h());
        }
        long al1[] = aq1.i();
        if (al1 != null)
        {
            ((com.amazonaws.f) (obj)).a("Range", (new StringBuilder()).append("bytes=").append(Long.toString(al1[0])).append("-").append(Long.toString(al1[1])).toString());
        }
        if (aq1.q())
        {
            ((com.amazonaws.f) (obj)).a("x-amz-request-payer", "requester");
        }
        a(((com.amazonaws.f) (obj)), aq1.n());
        a(((com.amazonaws.f) (obj)), "If-Modified-Since", aq1.m());
        a(((com.amazonaws.f) (obj)), "If-Unmodified-Since", aq1.l());
        a(((com.amazonaws.f) (obj)), "If-Match", aq1.j());
        a(((com.amazonaws.f) (obj)), "If-None-Match", aq1.k());
        a(((com.amazonaws.f) (obj)), aq1.r());
        c c1 = com.amazonaws.a.c.a(aq1.p());
        bv bv1;
        try
        {
            bv1 = (bv)a(((com.amazonaws.f) (obj)), ((com.amazonaws.http.m) (new com.amazonaws.services.s3.internal.x())), aq1.f(), aq1.g());
            bv1.a(aq1.f());
            bv1.b(aq1.g());
            obj = new com.amazonaws.util.s(bv1.b(), this);
        }
        // Misplaced declaration of an exception variable
        catch (aq aq1)
        {
            if (aq1.getStatusCode() == 412 || aq1.getStatusCode() == 304)
            {
                a(c1, 16);
                return null;
            } else
            {
                a(c1, 8);
                throw aq1;
            }
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        obj = new com.amazonaws.a.e(((InputStream) (obj)), c1);
        ((com.amazonaws.a.e) (obj)).a(true);
        a(c1, 2);
        if (d(aq1)) goto _L2; else goto _L1
_L1:
        aq1 = bv1.a().p();
        if (aq1 == null)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        if (ag.c(aq1))
        {
            break MISSING_BLOCK_LABEL_443;
        }
        aq1 = com.amazonaws.util.g.a(bv1.a().p());
        aq1 = new com.amazonaws.services.s3.internal.f(((InputStream) (obj)), MessageDigest.getInstance("MD5"), aq1);
_L3:
        bv1.a(new bw(aq1));
        return bv1;
        aq1;
        j.warn("No MD5 digest algorithm available.  Unable to calculate checksum and verify data integrity.", aq1);
        break MISSING_BLOCK_LABEL_443;
_L2:
        aq1 = new com.amazonaws.util.p(((InputStream) (obj)), bv1.a().i(), true);
          goto _L3
        aq1 = ((aq) (obj));
          goto _L3
    }

    public cn a(cm cm1)
        throws AmazonClientException, AmazonServiceException
    {
        a(cm1, "The request parameter must be specified when uploading a part");
        String s1 = cm1.i();
        String s2 = cm1.j();
        Object obj = cm1.k();
        int i1 = cm1.l();
        long l1 = cm1.m();
        a(s1, "The bucket name parameter must be specified when uploading a part");
        a(s2, "The key parameter must be specified when uploading a part");
        a(obj, "The upload ID parameter must be specified when uploading a part");
        a(Integer.valueOf(i1), "The part number parameter must be specified when uploading a part");
        a(Long.valueOf(l1), "The part size parameter must be specified when uploading a part");
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (cm1)), HttpMethodName.c);
        f1.b("uploadId", ((String) (obj)));
        f1.b("partNumber", Integer.toString(i1));
        b(f1, "Content-MD5", cm1.n());
        f1.a("Content-Length", Long.toString(l1));
        f1.a("Expect", "100-continue");
        a(f1, cm1.s());
        Object obj1;
        Object obj2;
        Object obj3;
        if (cm1.h() != null)
        {
            obj1 = cm1.h();
        } else
        if (cm1.o() != null)
        {
            try
            {
                obj1 = new com.amazonaws.services.s3.internal.h(new com.amazonaws.services.s3.internal.q(cm1.o()), cm1.p(), l1, true);
            }
            // Misplaced declaration of an exception variable
            catch (cm cm1)
            {
                throw new IllegalArgumentException("The specified file doesn't exist", cm1);
            }
        } else
        {
            throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
        }
        obj3 = null;
        obj = obj1;
        obj2 = obj3;
        if (cm1.n() == null)
        {
            obj = obj1;
            obj2 = obj3;
            if (!d(cm1))
            {
                obj2 = new i(((InputStream) (obj1)));
                obj = obj2;
            }
        }
        obj1 = com.amazonaws.a.c.a(cm1.t());
        if (obj1 != null)
        {
            cm1 = new com.amazonaws.a.e(((InputStream) (obj)), ((c) (obj1)));
            a(((c) (obj1)), 1024);
        } else
        {
            cm1 = ((cm) (obj));
        }
        f1.a(cm1);
        obj = (bi)a(f1, ((com.amazonaws.http.m) (new w())), s1, s2);
label0:
        {
            if (obj == null || obj2 == null)
            {
                break label0;
            }
            try
            {
                if (!Arrays.equals(((i) (obj2)).a(), com.amazonaws.util.g.a(((bi) (obj)).p())))
                {
                    throw new AmazonClientException("Unable to verify integrity of data upload.  Client calculated content hash didn't match hash calculated by Amazon S3.  You may need to delete the data stored in Amazon S3.");
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                if (cm1 != null)
                {
                    try
                    {
                        cm1.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (cm cm1) { }
                }
                throw obj;
            }
        }
        a(((c) (obj1)), 4096);
        throw obj;
        a(((c) (obj1)), 2048);
        obj2 = new cn();
        ((cn) (obj2)).a(((bi) (obj)).p());
        ((cn) (obj2)).a(i1);
        ((cn) (obj2)).b(((bi) (obj)).c_());
        ((cn) (obj2)).c(((bi) (obj)).d_());
        ((cn) (obj2)).d(((bi) (obj)).e());
        if (cm1 != null)
        {
            try
            {
                cm1.close();
            }
            // Misplaced declaration of an exception variable
            catch (cm cm1)
            {
                return ((cn) (obj2));
            }
        }
        return ((cn) (obj2));
    }

    public co a(bc bc1)
        throws AmazonClientException, AmazonServiceException
    {
        a(bc1.f(), "The bucket name parameter must be specified when listing versions in a bucket");
        com.amazonaws.f f1 = a(bc1.f(), ((String) (null)), ((com.amazonaws.b) (bc1)), HttpMethodName.a);
        f1.b("versions", null);
        if (bc1.g() != null)
        {
            f1.b("prefix", bc1.g());
        }
        if (bc1.h() != null)
        {
            f1.b("key-marker", bc1.h());
        }
        if (bc1.i() != null)
        {
            f1.b("version-id-marker", bc1.i());
        }
        if (bc1.j() != null)
        {
            f1.b("delimiter", bc1.j());
        }
        if (bc1.k() != null && bc1.k().intValue() >= 0)
        {
            f1.b("max-keys", bc1.k().toString());
        }
        if (bc1.l() != null)
        {
            f1.b("encoding-type", bc1.l());
        }
        return (co)a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.u())), bc1.f(), ((String) (null)));
    }

    public co a(co co1)
        throws AmazonClientException, AmazonServiceException
    {
        a(co1, "The previous version listing parameter must be specified when listing the next batch of versions in a bucket");
        if (!co1.k())
        {
            co co2 = new co();
            co2.a(co1.c());
            co2.e(co1.h());
            co2.c(co1.i());
            co2.d(co1.j());
            co2.a(co1.g());
            co2.b(co1.d());
            co2.h(co1.l());
            co2.a(false);
            return co2;
        } else
        {
            return a((new bc(co1.c(), co1.d(), co1.i(), co1.j(), co1.h(), new Integer(co1.g()))).m(co1.l()));
        }
    }

    public co a(String s1, String s2, String s3, String s4, String s5, Integer integer)
        throws AmazonClientException, AmazonServiceException
    {
        return a((new bc()).c(s1).e(s2).k(s5).g(s3).i(s4).b(integer));
    }

    public com.amazonaws.services.s3.model.g a(an an1)
        throws AmazonClientException, AmazonServiceException
    {
        a(an1, "The request object must be specified when getting a bucket policy");
        String s1 = an1.f();
        a(s1, "The bucket name must be specified when getting a bucket policy");
        com.amazonaws.f f1 = a(s1, ((String) (null)), ((com.amazonaws.b) (an1)), HttpMethodName.a);
        f1.b("policy", null);
        an1 = new com.amazonaws.services.s3.model.g();
        try
        {
            an1.a((String)a(f1, ((com.amazonaws.http.m) (new com.amazonaws.services.s3.internal.aa())), s1, ((String) (null))));
        }
        catch (AmazonServiceException amazonserviceexception)
        {
            if (amazonserviceexception.getErrorCode().equals("NoSuchBucketPolicy"))
            {
                return an1;
            } else
            {
                throw amazonserviceexception;
            }
        }
        return an1;
    }

    public com.amazonaws.services.s3.model.j a(ao ao1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = ao1.f();
        a(s1, "The bucket name parameter must be specified when requesting a bucket's website configuration");
        ao1 = a(s1, ((String) (null)), ((com.amazonaws.b) (ao1)), HttpMethodName.a);
        ao1.b("website", null);
        ao1.a("Content-Type", "application/xml");
        try
        {
            ao1 = (com.amazonaws.services.s3.model.j)a(((com.amazonaws.f) (ao1)), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.i())), s1, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (ao ao1)
        {
            if (ao1.getStatusCode() == 404)
            {
                return null;
            } else
            {
                throw ao1;
            }
        }
        return ao1;
    }

    public m a(l l1)
        throws AmazonClientException, AmazonServiceException
    {
        a(l1, "The request parameter must be specified when completing a multipart upload");
        Object obj = l1.f();
        String s1 = l1.g();
        String s2 = l1.h();
        a(obj, "The bucket name parameter must be specified when completing a multipart upload");
        a(s1, "The key parameter must be specified when completing a multipart upload");
        a(s2, "The upload ID parameter must be specified when completing a multipart upload");
        a(l1.i(), "The part ETags parameter must be specified when completing a multipart upload");
        com.amazonaws.f f1 = a(((String) (obj)), s1, ((com.amazonaws.b) (l1)), HttpMethodName.b);
        f1.b("uploadId", s2);
        l1 = com.amazonaws.services.s3.model.a.g.a(l1.i());
        f1.a("Content-Type", "text/plain");
        f1.a("Content-Length", String.valueOf(l1.length));
        f1.a(new ByteArrayInputStream(l1));
        l1 = new r(new com.amazonaws.services.s3.model.a.h.j(), new com.amazonaws.services.s3.internal.g[] {
            new ae(), new com.amazonaws.services.s3.internal.k()
        });
        obj = (com.amazonaws.services.s3.model.a.i.j)a(f1, ((com.amazonaws.http.m) (l1)), ((String) (obj)), s1);
        if (((com.amazonaws.services.s3.model.a.i.j) (obj)).i() != null)
        {
            l1 = (String)l1.b().get("x-amz-version-id");
            ((com.amazonaws.services.s3.model.a.i.j) (obj)).i().i(l1);
            return ((com.amazonaws.services.s3.model.a.i.j) (obj)).i();
        } else
        {
            throw ((com.amazonaws.services.s3.model.a.i.j) (obj)).j();
        }
    }

    public o a(n n1)
        throws AmazonClientException, AmazonServiceException
    {
        a(n1.f(), "The source bucket name must be specified when copying an object");
        a(n1.g(), "The source object key must be specified when copying an object");
        a(n1.i(), "The destination bucket name must be specified when copying an object");
        a(n1.j(), "The destination object key must be specified when copying an object");
        String s1 = n1.j();
        Object obj = n1.i();
        com.amazonaws.f f1 = a(((String) (obj)), s1, ((com.amazonaws.b) (n1)), HttpMethodName.c);
        a(f1, n1);
        d(f1);
        try
        {
            obj = (com.amazonaws.services.s3.model.a.i.k)a(f1, ((com.amazonaws.http.m) (new r(new com.amazonaws.services.s3.model.a.h.k(), new com.amazonaws.services.s3.internal.g[] {
                new ae(), new com.amazonaws.services.s3.internal.ab(), new com.amazonaws.services.s3.internal.k()
            }))), ((String) (obj)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            if (n1.getStatusCode() == 412)
            {
                return null;
            } else
            {
                throw n1;
            }
        }
        if (((com.amazonaws.services.s3.model.a.i.k) (obj)).l() != null)
        {
            n1 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).l();
            Object obj1 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).n();
            String s2 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).o();
            obj = ((com.amazonaws.services.s3.model.a.i.k) (obj)).m();
            obj1 = new AmazonS3Exception(((String) (obj1)));
            ((AmazonS3Exception) (obj1)).setErrorCode(n1);
            ((AmazonS3Exception) (obj1)).setErrorType(com.amazonaws.AmazonServiceException.ErrorType.b);
            ((AmazonS3Exception) (obj1)).setRequestId(s2);
            ((AmazonS3Exception) (obj1)).setExtendedRequestId(((String) (obj)));
            ((AmazonS3Exception) (obj1)).setServiceName(f1.g());
            ((AmazonS3Exception) (obj1)).setStatusCode(200);
            throw obj1;
        } else
        {
            n1 = new o();
            n1.e(((com.amazonaws.services.s3.model.a.i.k) (obj)).k());
            n1.b(((com.amazonaws.services.s3.model.a.i.k) (obj)).i());
            n1.f(((com.amazonaws.services.s3.model.a.i.k) (obj)).j());
            n1.b(((com.amazonaws.services.s3.model.a.i.k) (obj)).c_());
            n1.c(((com.amazonaws.services.s3.model.a.i.k) (obj)).d_());
            n1.d(((com.amazonaws.services.s3.model.a.i.k) (obj)).e());
            n1.a(((com.amazonaws.services.s3.model.a.i.k) (obj)).a());
            n1.a(((com.amazonaws.services.s3.model.a.i.k) (obj)).b());
            return n1;
        }
    }

    public o a(String s1, String s2, String s3, String s4)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new n(s1, s2, s3, s4));
    }

    public com.amazonaws.services.s3.model.q a(p p1)
    {
        a(p1.h(), "The source bucket name must be specified when copying a part");
        a(p1.i(), "The source object key must be specified when copying a part");
        a(p1.k(), "The destination bucket name must be specified when copying a part");
        a(p1.f(), "The upload id must be specified when copying a part");
        a(p1.l(), "The destination object key must be specified when copying a part");
        a(Integer.valueOf(p1.g()), "The part number must be specified when copying a part");
        Object obj = p1.l();
        String s1 = p1.k();
        com.amazonaws.f f1 = a(s1, ((String) (obj)), ((com.amazonaws.b) (p1)), HttpMethodName.c);
        a(f1, p1);
        f1.b("uploadId", p1.f());
        f1.b("partNumber", Integer.toString(p1.g()));
        d(f1);
        try
        {
            obj = (com.amazonaws.services.s3.model.a.i.k)a(f1, ((com.amazonaws.http.m) (new r(new com.amazonaws.services.s3.model.a.h.k(), new com.amazonaws.services.s3.internal.g[] {
                new ae(), new com.amazonaws.services.s3.internal.ab()
            }))), s1, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            if (p1.getStatusCode() == 412)
            {
                return null;
            } else
            {
                throw p1;
            }
        }
        if (((com.amazonaws.services.s3.model.a.i.k) (obj)).l() != null)
        {
            p1 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).l();
            Object obj1 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).n();
            String s2 = ((com.amazonaws.services.s3.model.a.i.k) (obj)).o();
            obj = ((com.amazonaws.services.s3.model.a.i.k) (obj)).m();
            obj1 = new AmazonS3Exception(((String) (obj1)));
            ((AmazonS3Exception) (obj1)).setErrorCode(p1);
            ((AmazonS3Exception) (obj1)).setErrorType(com.amazonaws.AmazonServiceException.ErrorType.b);
            ((AmazonS3Exception) (obj1)).setRequestId(s2);
            ((AmazonS3Exception) (obj1)).setExtendedRequestId(((String) (obj)));
            ((AmazonS3Exception) (obj1)).setServiceName(f1.g());
            ((AmazonS3Exception) (obj1)).setStatusCode(200);
            throw obj1;
        } else
        {
            com.amazonaws.services.s3.model.q q1 = new com.amazonaws.services.s3.model.q();
            q1.a(((com.amazonaws.services.s3.model.a.i.k) (obj)).k());
            q1.a(p1.g());
            q1.a(((com.amazonaws.services.s3.model.a.i.k) (obj)).i());
            q1.e(((com.amazonaws.services.s3.model.a.i.k) (obj)).j());
            q1.b(((com.amazonaws.services.s3.model.a.i.k) (obj)).c_());
            q1.c(((com.amazonaws.services.s3.model.a.i.k) (obj)).d_());
            q1.d(((com.amazonaws.services.s3.model.a.i.k) (obj)).e());
            return q1;
        }
    }

    public String a(com.amazonaws.services.s3.model.am am1)
        throws AmazonClientException, AmazonServiceException
    {
        a(am1, "The request parameter must be specified when requesting a bucket's location");
        String s1 = am1.f();
        a(s1, "The bucket name parameter must be specified when requesting a bucket's location");
        am1 = a(s1, ((String) (null)), ((com.amazonaws.b) (am1)), HttpMethodName.a);
        am1.b("location", null);
        return (String)a(((com.amazonaws.f) (am1)), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.d())), s1, ((String) (null)));
    }

    public URL a(aj aj1)
        throws AmazonClientException
    {
        a(aj1, "The request parameter must be specified when generating a pre-signed URL");
        String s1 = aj1.g();
        String s2 = aj1.h();
        a(s1, "The bucket name parameter must be specified when generating a pre-signed URL");
        a(aj1.f(), "The HTTP method request parameter must be specified when generating a pre-signed URL");
        if (aj1.i() == null)
        {
            aj1.a(new Date(System.currentTimeMillis() + 0xdbba0L));
        }
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (aj1)), HttpMethodName.valueOf(aj1.f().toString()));
        java.util.Map.Entry entry;
        for (Iterator iterator = aj1.j().entrySet().iterator(); iterator.hasNext(); f1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (aj1.l() != null)
        {
            f1.a("Content-Type", aj1.l());
        }
        if (aj1.m() != null)
        {
            f1.a("Content-MD5", aj1.m());
        }
        a(f1, aj1.n());
        a(f1, aj1.k());
        com.amazonaws.auth.al al1 = a(f1, s1, s2);
        if (al1 instanceof com.amazonaws.auth.ab)
        {
            ((com.amazonaws.auth.ab)al1).a(f1, p.a(), aj1.i());
        } else
        {
            a(f1, aj1.f(), s1, s2, aj1.i(), ((String) (null)));
        }
        return ag.a(f1, true);
    }

    public URL a(String s1, String s2, Date date)
        throws AmazonClientException
    {
        return a(s1, s2, date, HttpMethod.a);
    }

    public URL a(String s1, String s2, Date date, HttpMethod httpmethod)
        throws AmazonClientException
    {
        s1 = new aj(s1, s2, httpmethod);
        s1.a(date);
        return a(((aj) (s1)));
    }

    public List a(ay ay1)
        throws AmazonClientException, AmazonServiceException
    {
        return (List)a(a(((String) (null)), ((String) (null)), ((com.amazonaws.b) (ay1)), HttpMethodName.a), ((com.amazonaws.d.m) (new com.amazonaws.services.s3.model.a.h.p())), ((String) (null)), ((String) (null)));
    }

    protected void a(com.amazonaws.f f1, HttpMethod httpmethod, String s1, String s2, Date date, String s3)
    {
        c(f1);
        Object obj = (new StringBuilder()).append("/");
        if (s1 != null)
        {
            s1 = (new StringBuilder()).append(s1).append("/").toString();
        } else
        {
            s1 = "";
        }
        obj = ((StringBuilder) (obj)).append(s1);
        if (s2 != null)
        {
            s1 = com.amazonaws.util.n.a(s2, true);
        } else
        {
            s1 = "";
        }
        s2 = ((StringBuilder) (obj)).append(s1);
        if (s3 != null)
        {
            s1 = (new StringBuilder()).append("?").append(s3).toString();
        } else
        {
            s1 = "";
        }
        s3 = s2.append(s1).toString().replaceAll("(?<=/)/", "%2F");
        s2 = p.a();
        obj = f1.a();
        s1 = s2;
        if (obj != null)
        {
            s1 = s2;
            if (((com.amazonaws.b) (obj)).b() != null)
            {
                s1 = ((com.amazonaws.b) (obj)).b();
            }
        }
        (new y(httpmethod.toString(), s3, date)).a(f1, s1);
        if (f1.b().containsKey("x-amz-security-token"))
        {
            f1.b("x-amz-security-token", (String)f1.b().get("x-amz-security-token"));
            f1.b().remove("x-amz-security-token");
        }
    }

    public void a(com.amazonaws.regions.a a1)
    {
        q = true;
        super.a(a1);
    }

    public void a(com.amazonaws.services.s3.f f1)
    {
        o = new com.amazonaws.services.s3.f(f1);
    }

    public void a(com.amazonaws.services.s3.model.a a1)
        throws AmazonClientException, AmazonServiceException
    {
        a(a1, "The request parameter must be specified when aborting a multipart upload");
        a(a1.(), "The bucket name parameter must be specified when aborting a multipart upload");
        a(a1.g(), "The key parameter must be specified when aborting a multipart upload");
        a(a1.h(), "The upload ID parameter must be specified when aborting a multipart upload");
        String s1 = a1.();
        String s2 = a1.g();
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (a1)), HttpMethodName.d);
        f1.b("uploadId", a1.h());
        a(f1, ((com.amazonaws.http.m) (l)), s1, s2);
    }

    public void a(com.amazonaws.services.s3.model.ac ac1)
        throws AmazonClientException, AmazonServiceException
    {
        a(ac1, "The delete version request object must be specified when deleting a version");
        String s1 = ac1.f();
        String s2 = ac1.g();
        String s3 = ac1.h();
        a(s1, "The bucket name must be specified when deleting a version");
        a(s2, "The key must be specified when deleting a version");
        a(s3, "The version ID must be specified when deleting a version");
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (ac1)), HttpMethodName.d);
        if (s3 != null)
        {
            f1.b("versionId", s3);
        }
        if (ac1.i() != null)
        {
            a(f1, ac1.i());
        }
        a(f1, ((com.amazonaws.http.m) (l)), s1, s2);
    }

    public void a(bs bs1)
        throws AmazonServiceException
    {
        String s1 = bs1.f();
        String s2 = bs1.g();
        String s3 = bs1.h();
        int i1 = bs1.i();
        a(s1, "The bucket name parameter must be specified when copying a glacier object");
        a(s2, "The key parameter must be specified when copying a glacier object");
        if (i1 == -1)
        {
            throw new IllegalArgumentException("The expiration in days parameter must be specified when copying a glacier object");
        }
        com.amazonaws.f f1 = a(s1, s2, ((com.amazonaws.b) (bs1)), HttpMethodName.b);
        f1.b("restore", null);
        if (s3 != null)
        {
            f1.b("versionId", s3);
        }
        bs1 = com.amazonaws.services.s3.model.a.g.a(bs1);
        f1.a("Content-Length", String.valueOf(bs1.length));
        f1.a("Content-Type", "application/xml");
        f1.a(new ByteArrayInputStream(bs1));
        try
        {
            f1.a("Content-MD5", com.amazonaws.util.g.b(com.amazonaws.util.q.a(bs1)));
        }
        // Misplaced declaration of an exception variable
        catch (bs bs1)
        {
            throw new AmazonClientException("Couldn't compute md5 sum", bs1);
        }
        a(f1, ((com.amazonaws.http.m) (l)), s1, s2);
    }

    public void a(ca ca1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = ca1.f();
        AccessControlList accesscontrollist = ca1.g();
        CannedAccessControlList cannedaccesscontrollist = ca1.h();
        a(s1, "The bucket name parameter must be specified when setting a bucket's ACL");
        if (accesscontrollist != null)
        {
            a(s1, null, null, accesscontrollist, ((com.amazonaws.b) (ca1)));
            return;
        }
        if (cannedaccesscontrollist != null)
        {
            a(s1, null, null, cannedaccesscontrollist, ((com.amazonaws.b) (ca1)));
            return;
        } else
        {
            a(null, "The ACL parameter must be specified when setting a bucket's ACL");
            return;
        }
    }

    public void a(cb cb1)
    {
        a(cb1, "The set bucket cross origin configuration request object must be specified.");
        String s1 = cb1.f();
        com.amazonaws.services.s3.model.c c1 = cb1.g();
        a(s1, "The bucket name parameter must be specified when setting bucket cross origin configuration.");
        a(c1, "The cross origin configuration parameter must be specified when setting bucket cross origin configuration.");
        cb1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cb1)), HttpMethodName.c);
        cb1.b("cors", null);
        byte abyte0[] = (new d()).a(c1);
        cb1.a("Content-Length", String.valueOf(abyte0.length));
        cb1.a("Content-Type", "application/xml");
        cb1.a(new ByteArrayInputStream(abyte0));
        try
        {
            cb1.a("Content-MD5", com.amazonaws.util.g.b(com.amazonaws.util.q.a(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (cb cb1)
        {
            throw new AmazonClientException("Couldn't compute md5 sum", cb1);
        }
        a(((com.amazonaws.f) (cb1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(cc cc1)
    {
        a(cc1, "The set bucket lifecycle configuration request object must be specified.");
        String s1 = cc1.f();
        com.amazonaws.services.s3.model.d d1 = cc1.g();
        a(s1, "The bucket name parameter must be specified when setting bucket lifecycle configuration.");
        a(d1, "The lifecycle configuration parameter must be specified when setting bucket lifecycle configuration.");
        cc1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cc1)), HttpMethodName.c);
        cc1.b("lifecycle", null);
        byte abyte0[] = (new d()).a(d1);
        cc1.a("Content-Length", String.valueOf(abyte0.length));
        cc1.a("Content-Type", "application/xml");
        cc1.a(new ByteArrayInputStream(abyte0));
        try
        {
            cc1.a("Content-MD5", com.amazonaws.util.g.b(com.amazonaws.util.q.a(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (cc cc1)
        {
            throw new AmazonClientException("Couldn't compute md5 sum", cc1);
        }
        a(((com.amazonaws.f) (cc1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(cd cd1)
        throws AmazonClientException, AmazonServiceException
    {
        a(cd1, "The set bucket logging configuration request object must be specified when enabling server access logging");
        String s1 = cd1.f();
        com.amazonaws.services.s3.model.e e1 = cd1.g();
        a(s1, "The bucket name parameter must be specified when enabling server access logging");
        a(e1, "The logging configuration parameter must be specified when enabling server access logging");
        cd1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cd1)), HttpMethodName.c);
        cd1.b("logging", null);
        byte abyte0[] = m.a(e1);
        cd1.a("Content-Length", String.valueOf(abyte0.length));
        cd1.a(new ByteArrayInputStream(abyte0));
        a(((com.amazonaws.f) (cd1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(ce ce1)
        throws AmazonClientException, AmazonServiceException
    {
        a(ce1, "The set bucket notification configuration request object must be specified.");
        String s1 = ce1.i();
        com.amazonaws.services.s3.model.f f1 = ce1.g();
        a(s1, "The bucket name parameter must be specified when setting bucket notification configuration.");
        a(f1, "The notification configuration parameter must be specified when setting bucket notification configuration.");
        ce1 = a(s1, ((String) (null)), ((com.amazonaws.b) (ce1)), HttpMethodName.c);
        ce1.b("notification", null);
        byte abyte0[] = m.a(f1);
        ce1.a("Content-Length", String.valueOf(abyte0.length));
        ce1.a(new ByteArrayInputStream(abyte0));
        a(((com.amazonaws.f) (ce1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(cf cf1)
        throws AmazonClientException, AmazonServiceException
    {
        a(cf1, "The request object must be specified when setting a bucket policy");
        String s1 = cf1.f();
        String s2 = cf1.g();
        a(s1, "The bucket name must be specified when setting a bucket policy");
        a(s2, "The policy text must be specified when setting a bucket policy");
        cf1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cf1)), HttpMethodName.c);
        cf1.b("policy", null);
        byte abyte0[] = ag.d(s2);
        cf1.a("Content-Length", String.valueOf(abyte0.length));
        cf1.a(new ByteArrayInputStream(abyte0));
        a(((com.amazonaws.f) (cf1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(cg cg1)
    {
        a(cg1, "The set bucket tagging configuration request object must be specified.");
        String s1 = cg1.f();
        com.amazonaws.services.s3.model.h h1 = cg1.g();
        a(s1, "The bucket name parameter must be specified when setting bucket tagging configuration.");
        a(h1, "The tagging configuration parameter must be specified when setting bucket tagging configuration.");
        cg1 = a(s1, ((String) (null)), ((com.amazonaws.b) (cg1)), HttpMethodName.c);
        cg1.b("tagging", null);
        byte abyte0[] = (new d()).a(h1);
        cg1.a("Content-Length", String.valueOf(abyte0.length));
        cg1.a("Content-Type", "application/xml");
        cg1.a(new ByteArrayInputStream(abyte0));
        try
        {
            cg1.a("Content-MD5", com.amazonaws.util.g.b(com.amazonaws.util.q.a(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (cg cg1)
        {
            throw new AmazonClientException("Couldn't compute md5 sum", cg1);
        }
        a(((com.amazonaws.f) (cg1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(ch ch1)
        throws AmazonClientException, AmazonServiceException
    {
        a(ch1, "The SetBucketVersioningConfigurationRequest object must be specified when setting versioning configuration");
        String s1 = ch1.f();
        com.amazonaws.services.s3.model.i i1 = ch1.g();
        a(s1, "The bucket name parameter must be specified when setting versioning configuration");
        a(i1, "The bucket versioning parameter must be specified when setting versioning configuration");
        if (i1.b() != null)
        {
            a(ch1.h(), "The MFA parameter must be specified when changing MFA Delete status in the versioning configuration");
        }
        com.amazonaws.f f1 = a(s1, ((String) (null)), ((com.amazonaws.b) (ch1)), HttpMethodName.c);
        f1.b("versioning", null);
        if (i1.b() != null && ch1.h() != null)
        {
            a(f1, ch1.h());
        }
        ch1 = m.a(i1);
        f1.a("Content-Length", String.valueOf(ch1.length));
        f1.a(new ByteArrayInputStream(ch1));
        a(f1, ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(ci ci1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = ci1.f();
        com.amazonaws.services.s3.model.j j1 = ci1.g();
        a(s1, "The bucket name parameter must be specified when setting a bucket's website configuration");
        a(j1, "The bucket website configuration parameter must be specified when setting a bucket's website configuration");
        if (j1.c() == null)
        {
            a(j1.a(), "The bucket website configuration parameter must specify the index document suffix when setting a bucket's website configuration");
        }
        ci1 = a(s1, ((String) (null)), ((com.amazonaws.b) (ci1)), HttpMethodName.c);
        ci1.b("website", null);
        ci1.a("Content-Type", "application/xml");
        byte abyte0[] = m.a(j1);
        ci1.a("Content-Length", String.valueOf(abyte0.length));
        ci1.a(new ByteArrayInputStream(abyte0));
        a(((com.amazonaws.f) (ci1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(t t1)
    {
        a(t1, "The delete bucket cross origin configuration request object must be specified.");
        String s1 = t1.g();
        a(s1, "The bucket name parameter must be specified when deleting bucket cross origin configuration.");
        t1 = a(s1, ((String) (null)), ((com.amazonaws.b) (t1)), HttpMethodName.d);
        t1.b("cors", null);
        a(((com.amazonaws.f) (t1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.u u1)
    {
        a(u1, "The delete bucket lifecycle configuration request object must be specified.");
        String s1 = u1.g();
        a(s1, "The bucket name parameter must be specified when deleting bucket lifecycle configuration.");
        u1 = a(s1, ((String) (null)), ((com.amazonaws.b) (u1)), HttpMethodName.d);
        u1.b("lifecycle", null);
        a(((com.amazonaws.f) (u1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.v v1)
        throws AmazonClientException, AmazonServiceException
    {
        a(v1, "The request object must be specified when deleting a bucket policy");
        String s1 = v1.f();
        a(s1, "The bucket name must be specified when deleting a bucket policy");
        v1 = a(s1, ((String) (null)), ((com.amazonaws.b) (v1)), HttpMethodName.d);
        v1.b("policy", null);
        a(((com.amazonaws.f) (v1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.w w1)
        throws AmazonClientException, AmazonServiceException
    {
        a(w1, "The DeleteBucketRequest parameter must be specified when deleting a bucket");
        String s1 = w1.f();
        a(s1, "The bucket name parameter must be specified when deleting a bucket");
        a(a(s1, ((String) (null)), ((com.amazonaws.b) (w1)), HttpMethodName.d), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.x x1)
    {
        a(x1, "The delete bucket tagging configuration request object must be specified.");
        String s1 = x1.g();
        a(s1, "The bucket name parameter must be specified when deleting bucket tagging configuration.");
        x1 = a(s1, ((String) (null)), ((com.amazonaws.b) (x1)), HttpMethodName.d);
        x1.b("tagging", null);
        a(((com.amazonaws.f) (x1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.y y1)
        throws AmazonClientException, AmazonServiceException
    {
        String s1 = y1.g();
        a(s1, "The bucket name parameter must be specified when deleting a bucket's website configuration");
        y1 = a(s1, ((String) (null)), ((com.amazonaws.b) (y1)), HttpMethodName.d);
        y1.b("website", null);
        y1.a("Content-Type", "application/xml");
        a(((com.amazonaws.f) (y1)), ((com.amazonaws.http.m) (l)), s1, ((String) (null)));
    }

    public void a(com.amazonaws.services.s3.model.z z1)
        throws AmazonClientException, AmazonServiceException
    {
        a(z1, "The delete object request must be specified when deleting an object");
        a(z1.f(), "The bucket name must be specified when deleting an object");
        a(z1.g(), "The key must be specified when deleting an object");
        a(a(z1.f(), z1.g(), ((com.amazonaws.b) (z1)), HttpMethodName.d), ((com.amazonaws.http.m) (l)), z1.f(), z1.g());
    }

    public void a(String s1)
    {
        boolean flag;
        if (!com.amazonaws.services.s3.internal.d.a.equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        super.a(s1);
    }

    public void a(String s1, AccessControlList accesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, accesscontrollist, ((com.amazonaws.metrics.g) (null)));
    }

    public void a(String s1, AccessControlList accesscontrollist, com.amazonaws.metrics.g g1)
    {
        b(s1, accesscontrollist, g1);
    }

    public void a(String s1, CannedAccessControlList cannedaccesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, cannedaccesscontrollist, ((com.amazonaws.metrics.g) (null)));
    }

    public void a(String s1, CannedAccessControlList cannedaccesscontrollist, com.amazonaws.metrics.g g1)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, cannedaccesscontrollist, g1);
    }

    public void a(String s1, com.amazonaws.services.s3.model.c c1)
    {
        a(new cb(s1, c1));
    }

    public void a(String s1, com.amazonaws.services.s3.model.d d1)
    {
        a(new cc(s1, d1));
    }

    public void a(String s1, com.amazonaws.services.s3.model.f f1)
        throws AmazonClientException, AmazonServiceException
    {
        a(new ce(s1, f1));
    }

    public void a(String s1, com.amazonaws.services.s3.model.h h1)
    {
        a(new cg(s1, h1));
    }

    public void a(String s1, com.amazonaws.services.s3.model.j j1)
        throws AmazonClientException, AmazonServiceException
    {
        a(new ci(s1, j1));
    }

    public void a(String s1, String s2, int i1)
        throws AmazonServiceException
    {
        a(new bs(s1, s2, i1));
    }

    public void a(String s1, String s2, AccessControlList accesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, s2, ((String) (null)), accesscontrollist);
    }

    public void a(String s1, String s2, CannedAccessControlList cannedaccesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, s2, ((String) (null)), cannedaccesscontrollist);
    }

    public void a(String s1, String s2, StorageClass storageclass)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucketName parameter must be specified when changing an object's storage class");
        a(s2, "The key parameter must be specified when changing an object's storage class");
        a(storageclass, "The newStorageClass parameter must be specified when changing an object's storage class");
        a((new n(s1, s2, s1, s2)).m(storageclass.toString()));
    }

    public void a(String s1, String s2, String s3, AccessControlList accesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, s2, s3, accesscontrollist, null);
    }

    public void a(String s1, String s2, String s3, AccessControlList accesscontrollist, com.amazonaws.metrics.g g1)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, s2, s3, accesscontrollist, g1);
    }

    public void a(String s1, String s2, String s3, CannedAccessControlList cannedaccesscontrollist)
        throws AmazonClientException, AmazonServiceException
    {
        b(s1, s2, s3, cannedaccesscontrollist, null);
    }

    public void a(String s1, String s2, String s3, CannedAccessControlList cannedaccesscontrollist, com.amazonaws.metrics.g g1)
    {
        b(s1, s2, s3, cannedaccesscontrollist, g1);
    }

    public bh a_(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new ba(s1, s2, null, null, null));
    }

    public void a_(String s1, String s2, String s3)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucketName parameter must be specified when changing an object's storage class");
        a(s2, "The key parameter must be specified when changing an object's storage class");
        a(s3, "The newStorageClass parameter must be specified when changing an object's storage class");
        a((new n(s1, s2, s1, s2)).q(s3));
    }

    public com.amazonaws.services.s3.g b(com.amazonaws.b b1)
    {
        return (com.amazonaws.services.s3.g)d.a(b1);
    }

    public AccessControlList b(String s1, String s2, String s3)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when requesting an object's ACL");
        a(s2, "The key parameter must be specified when requesting an object's ACL");
        return a(s1, s2, s3, ((com.amazonaws.b) (null)));
    }

    public bh b(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new ba(s1, null, null, null, null));
    }

    public co b(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new bc(s1, s2, null, null, null, null));
    }

    public List b()
        throws AmazonClientException, AmazonServiceException
    {
        return a(new ay());
    }

    public com.amazonaws.services.s3.model.b c(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new com.amazonaws.services.s3.model.r(s1, s2));
    }

    public void c(String s1, String s2, String s3)
        throws AmazonClientException, AmazonServiceException
    {
        a(new com.amazonaws.services.s3.model.ac(s1, s2, s3));
    }

    public boolean c(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        try
        {
            a(new au(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (s1.getStatusCode() != 301 && s1.getStatusCode() != 403)
            {
                if (s1.getStatusCode() == 404)
                {
                    return false;
                } else
                {
                    throw s1;
                }
            }
        }
        return true;
    }

    public AccessControlList d(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return b(s1, s2, ((String) (null)));
    }

    public String d(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new com.amazonaws.services.s3.model.am(s1));
    }

    public com.amazonaws.services.s3.model.b e(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new com.amazonaws.services.s3.model.r(s1));
    }

    public bi e(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new ap(s1, s2));
    }

    public AccessControlList f(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when requesting a bucket's ACL");
        return a(s1, ((String) (null)), ((String) (null)), ((com.amazonaws.b) (null)));
    }

    public bv f(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new aq(s1, s2));
    }

    public void g(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(new com.amazonaws.services.s3.model.w(s1));
    }

    public void g(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        a(new com.amazonaws.services.s3.model.z(s1, s2));
    }

    public com.amazonaws.services.s3.model.e h(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when requesting a bucket's logging status");
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("logging", null);
        return (com.amazonaws.services.s3.model.e)a(f1, new com.amazonaws.services.s3.model.a.h.e(), s1, ((String) (null)));
    }

    public void h(String s1, String s2)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name must be specified when setting a bucket policy");
        a(s2, "The policy text must be specified when setting a bucket policy");
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.c);
        f1.b("policy", null);
        s2 = ag.d(s2);
        f1.a("Content-Length", String.valueOf(s2.length));
        f1.a(new ByteArrayInputStream(s2));
        a(f1, l, s1, ((String) (null)));
    }

    public com.amazonaws.services.s3.model.i i(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when querying versioning configuration");
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("versioning", null);
        return (com.amazonaws.services.s3.model.i)a(f1, new com.amazonaws.services.s3.model.a.h.h(), s1, ((String) (null)));
    }

    public String i(String s1, String s2)
    {
        try
        {
            s1 = j(s1, s2).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    public com.amazonaws.services.s3.model.d j(String s1)
    {
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("lifecycle", null);
        try
        {
            s1 = (com.amazonaws.services.s3.model.d)a(f1, new com.amazonaws.services.s3.model.a.h.c(), s1, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            switch (s1.getStatusCode())
            {
            default:
                throw s1;

            case 404: 
                return null;
            }
        }
        return s1;
    }

    public URL j(String s1, String s2)
    {
        com.amazonaws.e e1 = new com.amazonaws.e(com.amazonaws.services.s3.internal.d.b);
        c(e1, s1, s2);
        return ag.a(e1);
    }

    public void k(String s1)
    {
        a(new com.amazonaws.services.s3.model.u(s1));
    }

    public Region l()
    {
        Object obj = super.b.getAuthority();
        if (com.amazonaws.services.s3.internal.d.a.equals(obj))
        {
            return Region.a;
        }
        obj = Region.l.matcher(((CharSequence) (obj)));
        if (((Matcher) (obj)).matches())
        {
            return Region.a(((Matcher) (obj)).group(1));
        } else
        {
            throw new IllegalStateException("S3 client with invalid S3 endpoint configured");
        }
    }

    public com.amazonaws.services.s3.model.c l(String s1)
    {
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("cors", null);
        try
        {
            s1 = (com.amazonaws.services.s3.model.c)a(f1, new com.amazonaws.services.s3.model.a.h.b(), s1, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            switch (s1.getStatusCode())
            {
            default:
                throw s1;

            case 404: 
                return null;
            }
        }
        return s1;
    }

    public void m(String s1)
    {
        a(new t(s1));
    }

    public com.amazonaws.services.s3.model.h n(String s1)
    {
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("tagging", null);
        try
        {
            s1 = (com.amazonaws.services.s3.model.h)a(f1, new com.amazonaws.services.s3.model.a.h.g(), s1, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            switch (s1.getStatusCode())
            {
            default:
                throw s1;

            case 404: 
                return null;
            }
        }
        return s1;
    }

    public void o(String s1)
    {
        a(new com.amazonaws.services.s3.model.x(s1));
    }

    public com.amazonaws.services.s3.model.f p(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(s1, "The bucket name parameter must be specified when querying notification configuration");
        com.amazonaws.f f1 = a(s1, ((String) (null)), new ak(s1), HttpMethodName.a);
        f1.b("notification", null);
        return (com.amazonaws.services.s3.model.f)a(f1, new com.amazonaws.services.s3.model.a.h.f(), s1, ((String) (null)));
    }

    public com.amazonaws.services.s3.model.j q(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new ao(s1));
    }

    public void r(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(new com.amazonaws.services.s3.model.y(s1));
    }

    public com.amazonaws.services.s3.model.g s(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        return a(new an(s1));
    }

    public void t(String s1)
        throws AmazonClientException, AmazonServiceException
    {
        a(new com.amazonaws.services.s3.model.v(s1));
    }

    public void u(String s1)
    {
        a(new cj(s1, new RequestPaymentConfiguration(com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer.a)));
    }

    public void v(String s1)
    {
        a(new cj(s1, new RequestPaymentConfiguration(com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer.b)));
    }

    public boolean w(String s1)
    {
        return a(new ar(s1)).a() == com.amazonaws.services.s3.model.RequestPaymentConfiguration.Payer.a;
    }

    static 
    {
        AwsSdkMetrics.a(Arrays.asList(com.amazonaws.services.s3.b.a.c()));
        am.a("S3SignerType", com/amazonaws/services/s3/internal/z);
        am.a("AWSS3V4SignerType", com/amazonaws/services/s3/internal/a);
    }

    /* member class not found */
    class _cls1 {}

}
