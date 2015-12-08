// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

final class kvp
    implements android.content.DialogInterface.OnClickListener
{

    private String a;
    private String b;
    private kvo c;

    kvp(kvo kvo1, String s, String s1)
    {
        c = kvo1;
        a = s;
        b = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)c.b.getSystemService("download");
        try
        {
            Object obj = a;
            String s = b;
            obj = new android.app.DownloadManager.Request(Uri.parse(((String) (obj))));
            ((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
            jqc.e().a(((android.app.DownloadManager.Request) (obj)));
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
