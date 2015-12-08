// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            bn, cm

final class b
    implements android.content.gInterface.OnClickListener
{

    final String a;
    final String b;
    final bn c;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)c.b.getSystemService("download");
        try
        {
            Object obj = a;
            String s = b;
            obj = new android.app.oadManager.Request(Uri.parse(((String) (obj))));
            ((android.app.oadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
            d.e().a(((android.app.oadManager.Request) (obj)));
            dialoginterface.enqueue(((android.app.oadManager.Request) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            c.a("Could not store picture.");
        }
    }

    (bn bn1, String s, String s1)
    {
        c = bn1;
        a = s;
        b = s1;
        super();
    }
}
