// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;

public final class fey extends mtf
{

    private final String a;
    private final String b;

    public fey(String s, String s1)
    {
        super("PhotoDownloadTask");
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "No download url");
        a = s;
        b = s1;
    }

    protected final mue a(Context context)
    {
        DownloadManager downloadmanager = (DownloadManager)context.getSystemService("download");
        context = (new android.app.DownloadManager.Request(Uri.parse(a))).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, b).setDescription(context.getString(b.nP)).setNotificationVisibility(1);
        context.allowScanningByMediaScanner();
        downloadmanager.enqueue(context);
        return new mue(true);
    }
}
