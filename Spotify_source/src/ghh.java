// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import com.google.common.base.Optional;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class ghh
    implements dmx
{

    private final Resources a;
    private Optional b;

    public ghh(Resources resources)
    {
        b = Optional.e();
        a = resources;
    }

    public final Optional a()
    {
        if (!b.b())
        {
            try
            {
                b = Optional.b(((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(a.openRawResource(0x7f070001))).getPublicKey());
            }
            catch (CertificateException certificateexception) { }
        }
        return b;
    }
}
