// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.p;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ec, hi, gm, aq, 
//            gd, gn

public final class dy extends ec
{

    private final Map a;
    private final Context b;

    public dy(hi hi1, Map map)
    {
        super(hi1, "storePicture");
        a = map;
        b = hi1.d();
    }

    static Context a(dy dy1)
    {
        return dy1.b;
    }

    public final void a()
    {
        if (b == null)
        {
            a("Activity context is not available");
            return;
        }
        p.e();
        if (!gm.e(b).c())
        {
            a("Feature is not supported by the device.");
            return;
        }
        String s = (String)a.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            a((new StringBuilder("Invalid image url: ")).append(s).toString());
            return;
        }
        String s1 = Uri.parse(s).getLastPathSegment();
        p.e();
        if (!gm.c(s1))
        {
            a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            p.e();
            android.app.AlertDialog.Builder builder = gm.d(b);
            builder.setTitle(p.h().a(com.google.android.gms.a.c.store_picture_title, "Save image"));
            builder.setMessage(p.h().a(com.google.android.gms.a.c.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(p.h().a(com.google.android.gms.a.c.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String a;
                final String b;
                final dy c;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)dy.a(c).getSystemService("download");
                    try
                    {
                        Object obj = a;
                        String s2 = b;
                        obj = new android.app.DownloadManager.Request(Uri.parse(((String) (obj))));
                        ((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s2);
                        p.g().a(((android.app.DownloadManager.Request) (obj)));
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
                c = dy.this;
                a = s;
                b = s1;
                super();
            }
            });
            builder.setNegativeButton(p.h().a(com.google.android.gms.a.c.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dy a;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    a.a("User canceled the download.");
                }

            
            {
                a = dy.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
