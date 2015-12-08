// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;

import android.content.Context;
import android.content.res.Resources;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Enumeration;

public final class NccpKeyStore
{

    private static final String TAG = "nf_nccp";
    private static KeyStore nccpKeyStore;

    public NccpKeyStore()
    {
    }

    private static void dump()
    {
        if (nccpKeyStore != null) goto _L2; else goto _L1
_L1:
        Log.e("nf_nccp", "Key store is empty!");
_L4:
        return;
_L2:
        try
        {
            Enumeration enumeration = nccpKeyStore.aliases();
            while (enumeration.hasMoreElements()) 
            {
                String s = (String)enumeration.nextElement();
                Log.d("nf_nccp", (new StringBuilder()).append("Alias ").append(s).toString());
            }
        }
        catch (Throwable throwable)
        {
            Log.e("nf_nccp", "Failed to list aliases", throwable);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static KeyStore getInstance()
    {
        return nccpKeyStore;
    }

    public static void init(Context context)
    {
        Context context1;
        Context context2;
        Object obj;
        Object obj1;
        if (AndroidUtils.getAndroidVersion() < 18)
        {
            Log.d("nf_nccp", "Do NOT load NCCP trust store on pre JB MR2 devices.");
            return;
        }
        Log.d("nf_nccp", "Load NCCP trust store...");
        obj1 = null;
        obj = null;
        context2 = obj;
        context1 = obj1;
        nccpKeyStore = KeyStore.getInstance("BKS");
        context2 = obj;
        context1 = obj1;
        context = context.getResources().openRawResource(0x7f060000);
        context2 = context;
        context1 = context;
        nccpKeyStore.load(context, "spyder".toCharArray());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (Log.isLoggable("nf_nccp", 3))
        {
            dump();
        }
        Log.d("nf_nccp", "Load NCCP trust store done.");
        return;
        context;
        context1 = context2;
        Log.e("nf_nccp", "We failed to load NCCP trust store from res/raw", context);
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_82;
        }
        context;
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            catch (IOException ioexception) { }
        }
        throw context;
    }
}
