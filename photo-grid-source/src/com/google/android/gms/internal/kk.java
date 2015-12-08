// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            kj, qd

final class kk
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final String b;
    final kj c;

    kk(kj kj1, String s, String s1)
    {
        c = kj1;
        a = s;
        b = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)kj.a(c).getSystemService("download");
        try
        {
            Object obj = a;
            String s = b;
            obj = new android.app.DownloadManager.Request(Uri.parse(((String) (obj))));
            ((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
            zzp.zzbx().a(((android.app.DownloadManager.Request) (obj)));
            dialoginterface.enqueue(((android.app.DownloadManager.Request) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            c.a("Could not store picture.");
        }
    }
}
