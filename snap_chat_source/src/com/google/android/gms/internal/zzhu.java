// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzhx, zzab, zzho

public final class zzhu extends zzhl
{

    private final Context mContext;
    private final String zznf;
    private final String zzxX;
    private String zzyW;

    public zzhu(Context context, String s, String s1)
    {
        zzyW = null;
        mContext = context;
        zznf = s;
        zzxX = s1;
    }

    public zzhu(Context context, String s, String s1, String s2)
    {
        zzyW = null;
        mContext = context;
        zznf = s;
        zzxX = s1;
        zzyW = s2;
    }

    public final void onStop()
    {
    }

    public final void zzdw()
    {
        HttpURLConnection httpurlconnection;
        zzhx.zzab((new StringBuilder("Pinging URL: ")).append(zzxX).toString());
        httpurlconnection = (HttpURLConnection)(new URL(zzxX)).openConnection();
        if (!TextUtils.isEmpty(zzyW))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        zzab.zzaM().zza(mContext, zznf, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        zzhx.zzac((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(zzxX).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzhx.zzac((new StringBuilder("Error while parsing ping URL: ")).append(zzxX).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzhx.zzac((new StringBuilder("Error while pinging URL: ")).append(zzxX).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_222;
        zzab.zzaM().zza(mContext, zznf, true, httpurlconnection, zzyW);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
