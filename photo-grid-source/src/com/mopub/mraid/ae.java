// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.media.MediaScannerConnection;
import android.net.Uri;

final class ae
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    private final String a;
    private final String b;
    private MediaScannerConnection c;

    private ae(String s)
    {
        a = s;
        b = null;
    }

    ae(String s, byte byte0)
    {
        this(s);
    }

    static void a(ae ae1, MediaScannerConnection mediascannerconnection)
    {
        ae1.c = mediascannerconnection;
    }

    public final void onMediaScannerConnected()
    {
        if (c != null)
        {
            c.scanFile(a, b);
        }
    }

    public final void onScanCompleted(String s, Uri uri)
    {
        if (c != null)
        {
            c.disconnect();
        }
    }
}
