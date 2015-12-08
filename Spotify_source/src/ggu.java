// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Base64;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Set;

public final class ggu
    implements gcb
{

    private PublicKey a;
    private WeakReference b;

    public ggu(Context context)
    {
        a = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(0x7f070001))).getPublicKey();
        b = new WeakReference(context);
    }

    static WeakReference a(ggu ggu1)
    {
        return ggu1.b;
    }

    private boolean a(Uri uri, long l)
    {
        boolean flag;
        Logger.a("WebsiteAutologinUtility: Validating Request: %s", new Object[] {
            uri.toString()
        });
        String s = uri.getQueryParameter("signature");
        Object obj = Uri.parse(uri.getQueryParameter("returnUrl"));
        uri = uri.getQueryParameter("signatureExpiry");
        byte abyte0[];
        long l1;
        try
        {
            l1 = Long.parseLong(uri);
        }
        catch (NumberFormatException numberformatexception)
        {
            l1 = 0L;
        }
        uri = (new StringBuilder()).append(obj).append(uri).toString();
        Logger.a("WebsiteAutologinUtility: url encoded signature: %s", new Object[] {
            s
        });
        abyte0 = Base64.decode(s.getBytes(), 0);
        obj = Signature.getInstance("SHA1withRSA");
        ((Signature) (obj)).initVerify(a);
        ((Signature) (obj)).update(uri.getBytes("UTF-8"));
        flag = ((Signature) (obj)).verify(abyte0);
        if (flag && l1 > l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        Logger.a("WebsiteAutologinUtility: Autologin Signature isValid: %s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
        uri;
        Logger.b(uri, "WebsiteAutologinUtility failed to get a signature", new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
        uri;
        Logger.b(uri, "WebsiteAutologinUtility failed to update/verify a signature", new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
        uri;
        Logger.b(uri, "WebsiteAutologinUtility failed to init verify a signature", new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
        uri;
        throw new AssertionError();
        uri;
        Logger.b(uri, "WebsiteAutologinUtility illegal argument exception", new Object[0]);
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static boolean a(ggu ggu1, Uri uri, long l)
    {
        return ggu1.a(uri, l);
    }

    static Uri b(Uri uri)
    {
        Set set = uri.getQueryParameterNames();
        if (set.contains("returnUrl") && set.contains("signature") && set.contains("signatureExpiry"))
        {
            return uri;
        } else
        {
            return Uri.parse(uri.toString().replaceAll("%26", "&"));
        }
    }

    public final void a(Uri uri)
    {
        boolean flag;
        if (uri != null && "spotify".equals(uri.getScheme()) && "autologin".equals(uri.getHost()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        while (!flag || (Context)b.get() == null) 
        {
            return;
        }
        ((gff)dmz.a(gff)).a(new gfh(uri) {

            private Uri a;
            private ggu b;

            public final void a(long l)
            {
                Uri uri1 = ggu.b(a);
                Context context;
                if (ggu.a(b, uri1, l))
                {
                    if ((context = (Context)ggu.a(b).get()) != null)
                    {
                        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.URL_OPEN").setData(Uri.parse(uri1.getQueryParameter("returnUrl"))));
                        return;
                    }
                }
            }

            
            {
                b = ggu.this;
                a = uri;
                super();
            }
        });
    }
}
