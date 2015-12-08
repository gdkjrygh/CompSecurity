// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestContext;
import org.chromium.net.UrlRequestContextConfig;

public final class fhc extends mtf
{

    private static final long a;
    private final Uri b;

    public fhc(Uri uri)
    {
        super("com.google.android.apps.photos.envelope.GetEnvelopeInfoFromUriTask");
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must provide non-empty Uri");
        b = uri;
    }

    protected final mue a(Context context)
    {
        if (!fhi.a().a(b))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        Object obj;
        obj = b;
        Object obj1 = (UrlRequestContextConfig)olm.a(context, org/chromium/net/UrlRequestContextConfig);
        obj1 = ((eqz)olm.a(context, eqz)).a(context, ((UrlRequestContextConfig) (obj1)));
        context = new fhd();
        String s = ((Uri) (obj)).buildUpon().scheme("https").build().toString();
        obj = Executors.newSingleThreadExecutor();
        obj1 = ((UrlRequestContext) (obj1)).a(s, context, ((java.util.concurrent.Executor) (obj)));
        ((UrlRequest) (obj1)).a("HEAD");
        ((UrlRequest) (obj1)).a();
        if (!fhd.a(context).block(a))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        ((ExecutorService) (obj)).shutdown();
_L1:
        if (fhd.b(context) != null)
        {
            throw fhd.b(context);
        }
        break MISSING_BLOCK_LABEL_150;
        try
        {
            ((ExecutorService) (obj)).shutdownNow();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
          goto _L1
        if (TextUtils.isEmpty(fhd.c(context)))
        {
            throw new IOException("Location header was empty in response");
        }
        context = Uri.parse(fhd.c(context));
_L2:
        if (!fhi.b().a(context))
        {
            return new mue(0, new IllegalArgumentException("Uri is not allowed"), null);
        } else
        {
            context = fgv.a(context);
            mue mue1 = new mue(true);
            mue1.a().putParcelable("envelope_info", context);
            return mue1;
        }
        context = b;
          goto _L2
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }
}
