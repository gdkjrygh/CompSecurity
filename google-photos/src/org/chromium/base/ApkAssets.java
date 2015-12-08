// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;

public class ApkAssets
{

    public ApkAssets()
    {
    }

    public static long[] open(Context context, String s)
    {
        Context context1;
        Context context2;
        context2 = null;
        context1 = null;
        context = context.getAssets().openNonAssetFd(s);
        context1 = context;
        context2 = context;
        long al[] = new long[3];
        context1 = context;
        context2 = context;
        al[0] = context.getParcelFileDescriptor().detachFd();
        context1 = context;
        context2 = context;
        al[1] = context.getStartOffset();
        context1 = context;
        context2 = context;
        al[2] = context.getLength();
        s = al;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("ApkAssets", "Unable to close AssetFileDescriptor", context);
                return al;
            }
            s = al;
        }
_L2:
        return s;
        context;
        context2 = context1;
        Log.e("ApkAssets", (new StringBuilder("Error while loading asset ")).append(s).append(": ").append(context).toString());
        context2 = context1;
        context = new long[3];
        context;
        context[0] = -1L;
        context[1] = -1L;
        context[2] = -1L;
        s = context;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ApkAssets", "Unable to close AssetFileDescriptor", s);
            return context;
        }
        return context;
        context;
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("ApkAssets", "Unable to close AssetFileDescriptor", s);
            }
        }
        throw context;
    }
}
