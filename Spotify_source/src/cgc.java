// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.Map;

public final class cgc extends cgg
{

    final Map a;
    final Context b;

    public cgc(ckw ckw1, Map map)
    {
        super(ckw1, "storePicture");
        a = map;
        b = ckw1.e();
    }

    // Unreferenced inner class cgc$1

/* anonymous class */
    final class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        private String a;
        private String b;
        private cgc c;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = (DownloadManager)c.b.getSystemService("download");
            try
            {
                Object obj = a;
                String s = b;
                obj = new android.app.DownloadManager.Request(Uri.parse(((String) (obj))));
                ((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
                bkv.g().a(((android.app.DownloadManager.Request) (obj)));
                dialoginterface.enqueue(((android.app.DownloadManager.Request) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DialogInterface dialoginterface)
            {
                c.a("Could not store picture.");
            }
        }

            
            {
                c = cgc.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class cgc$2

/* anonymous class */
    final class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        private cgc a;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            a.a("User canceled the download.");
        }

            
            {
                a = cgc.this;
                super();
            }
    }

}
