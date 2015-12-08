// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public final class pp
    implements oQ
{

    private static final int CACHE_SIZE = 0x100000;
    private static final String ENABLE_GZIP = "ENABLE_GZIP";
    private static final String GZIP_TEST = "GZIP";
    private static final String TAG = "SnapchatOkHttpClientFactory";
    private static final Bm mStudySettings = Bm.a();
    private static Xw sChatClient;
    private static final Object sChatMutex = new Object();
    private static Xw sNonCertClient;
    private static final Object sNonCertMutex = new Object();
    private static Xw sSnapchatCertClient;
    private static final Object sSnapchatCertMutex = new Object();
    private final LA mDeveloperSettings;

    public pp()
    {
        this(LA.a());
    }

    private pp(LA la)
    {
        mDeveloperSettings = la;
    }

    public static Xw a()
    {
        Xw xw = new Xw();
        lY ly = new lY();
        xw.a(10000L, TimeUnit.MILLISECONDS);
        xw.b(ly.a(), TimeUnit.MILLISECONDS);
        try
        {
            xw.a(new Xf(Kl.sInternalCacheDirectory, 0x100000L));
        }
        catch (Exception exception)
        {
            Timber.e("SnapchatOkHttpClientFactory", (new StringBuilder("Unable to set http cache")).append(exception.getMessage()).toString(), new Object[0]);
        }
        xw.h.add(new pE());
        xw.i.add(new pD());
        if (mStudySettings.a("GZIP", "ENABLE_GZIP", false))
        {
            xw.h.add(new pF());
        }
        return xw;
    }

    private static Xw a(Xw xw)
    {
        SSLSocketFactory sslsocketfactory = b();
        if (sslsocketfactory != null)
        {
            xw.n = sslsocketfactory;
            return xw;
        } else
        {
            throw new IOException("Required Socket factory could not be created.");
        }
    }

    private Xw b(String s)
    {
        Object obj = sChatMutex;
        obj;
        JVM INSTR monitorenter ;
        Xw xw;
        if (sChatClient == null)
        {
            xw = a();
            ov ov1 = new ov();
            xw.a(10000L, TimeUnit.MILLISECONDS);
            xw.b(ov1.a(), TimeUnit.MILLISECONDS);
            if (!s.startsWith("https://app.snapchat.com") || mDeveloperSettings.d())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            sChatClient = a(xw);
        }
_L1:
        s = sChatClient;
        return s;
        sChatClient = xw;
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static SSLSocketFactory b()
    {
        Object obj;
        try
        {
            Timber.b("SnapchatOkHttpClientFactory", "Creating Snapchat Certificates Pinned Socket Factory.", new Object[0]);
            obj = DX.a();
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustmanagerfactory.init(((java.security.KeyStore) (obj)));
            sslcontext.init(null, trustmanagerfactory.getTrustManagers(), null);
            Timber.b("SnapchatOkHttpClientFactory", "Created Snapchat Certificates Pinned Socket Factory.", new Object[0]);
            obj = sslcontext.getSocketFactory();
        }
        catch (Exception exception)
        {
            Timber.e("SnapchatOkHttpClientFactory", "Certificate Pinned SSLSocketFactory could not be obtained", new Object[0]);
            throw new IOException(exception);
        }
        return ((SSLSocketFactory) (obj));
    }

    private Xw c(String s)
    {
        if (s.startsWith("https://app.snapchat.com") && !mDeveloperSettings.d())
        {
            Xw xw;
            synchronized (sSnapchatCertMutex)
            {
                if (sSnapchatCertClient == null)
                {
                    sSnapchatCertClient = a(a());
                }
                xw = sSnapchatCertClient;
            }
            return xw;
        }
        break MISSING_BLOCK_LABEL_53;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        Xw xw1;
        synchronized (sNonCertMutex)
        {
            if (sNonCertClient == null)
            {
                sNonCertClient = a();
            }
            xw1 = sNonCertClient;
        }
        return xw1;
        exception1;
        s;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final Xw a(String s)
    {
        try
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Empty URL");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid URL: ")).append(s.getMessage()).toString());
        }
        URI uri;
        uri = new URI(s);
        if (uri.getHost() == null)
        {
            throw new IllegalArgumentException(String.format("Invalid URL - host should not be null - %s", new Object[] {
                s
            }));
        }
        if (uri.getScheme() == null)
        {
            throw new IllegalArgumentException(String.format("Invalid URL - scheme should not be null - %s", new Object[] {
                s
            }));
        }
        s = uri.toString();
        if (s.contains("/bq/chat_typing"))
        {
            return b(s);
        } else
        {
            return c(s);
        }
    }

}
