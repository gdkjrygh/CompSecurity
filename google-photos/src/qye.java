// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.net.X509Util;

public final class qye extends BroadcastReceiver
{

    public qye()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("android.security.STORAGE_CHANGED"))
        {
            break MISSING_BLOCK_LABEL_15;
        }
        X509Util.b();
        return;
        context;
        Log.e("X509Util", "Unable to reload the default TrustManager", context);
        return;
        context;
        Log.e("X509Util", "Unable to reload the default TrustManager", context);
        return;
        context;
        Log.e("X509Util", "Unable to reload the default TrustManager", context);
        return;
    }
}
