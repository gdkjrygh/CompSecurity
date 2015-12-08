// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class aa extends d
{

    private static String a;

    public aa()
    {
        if (i.a(a) || "failed_to_get_signature".equals(a))
        {
            a = a(c.z);
        }
    }

    private String a(c c1)
    {
        Object obj;
        String s;
        int j;
        try
        {
            c1 = c1.s();
            c1 = c1.getPackageManager().getPackageInfo(c1.getPackageName(), 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            p.df.a.c("UserLoginAsyncTask", "Exception while getting signatures", c1);
            c1 = null;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        try
        {
            obj = CertificateFactory.getInstance("X509");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.c("UserLoginAsyncTask", "Exception while getting certificate factory", ((Throwable) (obj)));
            obj = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        try
        {
            c1 = (X509Certificate)((CertificateFactory) (obj)).generateCertificate(new ByteArrayInputStream(c1[0].toByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            p.df.a.c("UserLoginAsyncTask", "Exception while generating certificate", c1);
            c1 = null;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = new StringBuilder();
        c1 = MessageDigest.getInstance("SHA1").digest(c1.getPublicKey().getEncoded());
        j = 0;
_L2:
        if (j >= c1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s = Integer.toHexString(c1[j] & 0xff);
        if (s.length() == 1)
        {
            ((StringBuilder) (obj)).append("0");
        }
        ((StringBuilder) (obj)).append(s);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        c1 = ((StringBuilder) (obj)).toString();
        return c1;
        c1;
        p.df.a.c("UserLoginAsyncTask", "Exception while building certificate string", c1);
        return "failed_to_get_signature";
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        String s = (String)aobj[0];
        aobj = (String)aobj[1];
        x x1 = c.z.e();
        x1.a(s, ((String) (aobj)), a);
        x1.f();
        c.z.o().a(com.pandora.radio.util.k.k.f);
        x1.a(new Intent(new Intent()));
        return null;
    }
}
