// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Log;

public final class ClipboardInterface
{

    private static final String TAG = com/google/zxing/client/android/clipboard/ClipboardInterface.getSimpleName();

    private ClipboardInterface()
    {
    }

    private static ClipboardManager getManager(Context context)
    {
        return (ClipboardManager)context.getSystemService("clipboard");
    }

    public static CharSequence getText(Context context)
    {
        ClipData clipdata = getManager(context).getPrimaryClip();
        if (hasText(context))
        {
            return clipdata.getItemAt(0).coerceToText(context);
        } else
        {
            return null;
        }
    }

    public static boolean hasText(Context context)
    {
        context = getManager(context).getPrimaryClip();
        return context != null && context.getItemCount() > 0;
    }

    public static void setText(CharSequence charsequence, Context context)
    {
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        getManager(context).setPrimaryClip(ClipData.newPlainText(null, charsequence));
        return;
        charsequence;
        Log.w(TAG, "Clipboard bug", charsequence);
        return;
        charsequence;
        Log.w(TAG, "Clipboard bug", charsequence);
        return;
    }

}
