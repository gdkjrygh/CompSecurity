// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.security.cert.CertificateException;

public final class gcc
    implements dmx, dna
{

    private Context a;

    public gcc(Context context)
    {
        if (!context.getApplicationContext().equals(context))
        {
            throw new IllegalArgumentException("You must pass in the application context to this class. Not doing so implies risk of leaking memory.");
        } else
        {
            a = context;
            return;
        }
    }

    private gcb b()
    {
        ggu ggu1;
        try
        {
            ggu1 = new ggu(a);
        }
        catch (CertificateException certificateexception)
        {
            Logger.b(certificateexception, "Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", new Object[0]);
            Assertion.a("Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", certificateexception);
            return new gcb() {

                public final void a(Uri uri)
                {
                }

            };
        }
        return ggu1;
    }

    public final Object a()
    {
        return b();
    }
}
