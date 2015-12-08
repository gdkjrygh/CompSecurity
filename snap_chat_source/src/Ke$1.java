// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.snapchat.android.Timber;

static final class >
    implements android.media.ScannerConnection.OnScanCompletedListener
{

    public final void onScanCompleted(String s, Uri uri)
    {
        if (uri == null)
        {
            Timber.e("FileUtils", (new StringBuilder("MediaScanner failed to scan file: ")).append(s.toString()).toString(), new Object[0]);
            return;
        } else
        {
            Timber.c("FileUtils", (new StringBuilder("MediaScanner scanned file: ")).append(s.toString()).toString(), new Object[0]);
            return;
        }
    }

    >()
    {
    }
}
