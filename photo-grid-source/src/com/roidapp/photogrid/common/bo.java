// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

public final class bo
{

    private static bo a = null;

    private bo()
    {
    }

    public static bo a()
    {
        if (a == null)
        {
            a = new bo();
        }
        return a;
    }

    public static String a(Uri uri)
    {
        return DocumentsContract.getDocumentId(uri);
    }

    public static boolean a(Context context, Uri uri)
    {
        return android.os.Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri);
    }

}
