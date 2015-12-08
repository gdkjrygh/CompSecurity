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
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gu, ll, bl, gr, 
//            gi, ga

public class dj
{

    private final Context mContext;
    private final gu mo;
    private final Map rd;

    public dj(gu gu1, Map map)
    {
        mo = gu1;
        rd = map;
        mContext = gu1.dI();
    }

    static Context a(dj dj1)
    {
        return dj1.mContext;
    }

    static gu b(dj dj1)
    {
        return dj1.mo;
    }

    String B(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    android.app.DownloadManager.Request b(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        if (ll.ig())
        {
            s.allowScanningByMediaScanner();
            s.setNotificationVisibility(1);
            return s;
        } else
        {
            s.setShowRunningNotification(true);
            return s;
        }
    }

    public void execute()
    {
        if (!(new bl(mContext)).bq())
        {
            gr.W("Store picture feature is not supported on this device.");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)rd.get("iurl")))
        {
            gr.W("Image url cannot be empty.");
            return;
        }
        String s = (String)rd.get("iurl");
        if (!URLUtil.isValidUrl(s))
        {
            gr.W((new StringBuilder()).append("Invalid image url:").append(s).toString());
            return;
        }
        String s1 = B(s);
        if (!gi.N(s1))
        {
            gr.W("Image type not recognized:");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
            builder.setTitle(ga.c(com.google.android.gms.R.string.store_picture_title, "Save image"));
            builder.setMessage(ga.c(com.google.android.gms.R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(ga.c(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String rp;
                final String rq;
                final dj rr;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)dj.a(rr).getSystemService("download");
                    try
                    {
                        dialoginterface.enqueue(rr.b(rp, rq));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        gr.U("Could not store picture.");
                    }
                }

            
            {
                rr = dj.this;
                rp = s;
                rq = s1;
                super();
            }
            });
            builder.setNegativeButton(ga.c(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dj rr;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dj.b(rr).b("onStorePictureCanceled", new JSONObject());
                }

            
            {
                rr = dj.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
