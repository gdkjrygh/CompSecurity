// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ef;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, w, j, s, 
//            ac, c, h, ab, 
//            z

public final class u extends af
{

    private static final X500Principal d = new X500Principal("CN=Android Debug,O=Android,C=US");
    String a;
    String b;
    String c;
    private String e;
    private long f;
    private String g;

    u(ac ac)
    {
        super(ac);
    }

    private boolean p()
    {
        Object obj = super.i().getPackageManager().getPackageInfo(super.i().getPackageName(), 64);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        boolean flag;
        if (((PackageInfo) (obj)).signatures == null || ((PackageInfo) (obj)).signatures.length <= 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = ((PackageInfo) (obj)).signatures[0];
        flag = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(((Signature) (obj)).toByteArray()))).getSubjectX500Principal().equals(d);
        return flag;
        Object obj1;
        obj1;
        super.l().a.a("Error obtaining certificate", obj1);
_L2:
        return true;
        obj1;
        super.l().a.a("Package name not found", obj1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void a()
    {
        Object obj;
        String s1;
        String s2;
        PackageManager packagemanager;
        String s3;
        long l3;
        l3 = 0L;
        s2 = "Unknown";
        s1 = "Unknown";
        packagemanager = super.i().getPackageManager();
        s3 = super.i().getPackageName();
        obj = packagemanager.getInstallerPackageName(s3);
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj2 = "manual_install";
_L9:
        Object obj3 = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(super.i().getPackageName(), 0);
        obj = s1;
        obj3 = s2;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj3 = s1;
        CharSequence charsequence = packagemanager.getApplicationLabel(packageinfo.applicationInfo);
        obj = s1;
        obj3 = s1;
        if (TextUtils.isEmpty(charsequence))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj3 = s1;
        obj = charsequence.toString();
        obj3 = obj;
        s1 = packageinfo.versionName;
        obj3 = s1;
_L6:
        a = s3;
        c = ((String) (obj2));
        b = ((String) (obj3));
        e = ((String) (obj));
        obj = MessageDigest.getInstance("MD5");
        if (p())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = packagemanager.getPackageInfo(super.i().getPackageName(), 64);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((PackageInfo) (obj2)).signatures == null || ((PackageInfo) (obj2)).signatures.length <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((MessageDigest) (obj)).digest(((PackageInfo) (obj2)).signatures[0].toByteArray());
        com.google.android.gms.common.internal.u.a(obj);
        Object obj1;
        int i1;
        int j1;
        long l1;
        long l2;
        boolean flag;
        if (obj.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.u.a(flag);
        i1 = obj.length;
        j1 = 0;
        i1--;
        l1 = 0L;
_L4:
        l2 = l1;
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = l1;
        if (i1 < obj.length - 8)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = obj[i1];
        l1 += ((long)k1 & 255L) << j1;
        j1 += 8;
        i1--;
        if (true) goto _L4; else goto _L3
_L2:
        obj2 = obj;
        if ("com.android.vending".equals(obj))
        {
            obj2 = "";
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        super.l().a.a("Error retrieving package info: appName", obj3);
        obj1 = obj3;
        obj3 = s2;
        if (true) goto _L6; else goto _L5
_L5:
        l2 = 0L;
_L3:
        f = l2;
        return;
        obj1;
        super.l().a.a("Could not get MD5 instance", obj1);
        l2 = l3;
        continue; /* Loop/switch isn't completed */
        obj1;
        super.l().a.a("Package name not found", obj1);
        l2 = l3;
        if (true) goto _L3; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
    }

    final String b()
    {
        t();
        if (com.google.android.gms.measurement.internal.j.z())
        {
            return "";
        }
        if (g != null) goto _L2; else goto _L1
_L1:
        Object obj = s.a(super.i());
        if (obj == null || !((Status) (obj)).b()) goto _L4; else goto _L3
_L3:
        if (!s.b()) goto _L6; else goto _L5
_L5:
        String s1 = s.a();
        obj = s1;
        if (TextUtils.isEmpty(s1))
        {
            obj = "";
        }
        try
        {
            g = ((String) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g = "";
            super.l().a.a("getGoogleAppId or isMeasurementEnabled failed with exception", obj);
        }
_L2:
        return g;
_L6:
        g = "";
        continue; /* Loop/switch isn't completed */
_L4:
        g = "";
        w.a a1 = super.l().a;
        int i1;
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = ((Status) (obj)).g;
        }
        a1.a("getGoogleAppId failed with status", Integer.valueOf(i1));
        if (obj != null && ((Status) (obj)).h != null)
        {
            super.l().f.a(((Status) (obj)).h);
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }

    final long o()
    {
        t();
        return f;
    }

}
