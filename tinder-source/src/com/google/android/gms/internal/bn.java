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
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bq, cw, cm

public final class bn extends bq
{

    final Map a;
    final Context b;

    public bn(cw cw1, Map map)
    {
        super(cw1, "storePicture");
        a = map;
        b = cw1.c();
    }

    // Unreferenced inner class com/google/android/gms/internal/bn$1

/* anonymous class */
    final class _cls1
        implements android.content.DialogInterface.OnClickListener
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
                obj = new android.app.DownloadManager.Request(Uri.parse(((String) (obj))));
                ((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
                d.e().a(((android.app.DownloadManager.Request) (obj)));
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
                c = bn.this;
                a = s;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/bn$2

/* anonymous class */
    final class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final bn a;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            a.a("User canceled the download.");
        }

            
            {
                a = bn.this;
                super();
            }
    }

}
