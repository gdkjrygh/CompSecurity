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
//            gv, bl, gs, gj, 
//            gb

public class de
{

    private final Context mContext;
    private final gv md;
    private final Map qM;

    public de(gv gv1, Map map)
    {
        md = gv1;
        qM = map;
        mContext = gv1.dz();
    }

    static Context a(de de1)
    {
        return de1.mContext;
    }

    static gv b(de de1)
    {
        return de1.md;
    }

    String B(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    android.app.DownloadManager.Request b(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        s.allowScanningByMediaScanner();
        s.setNotificationVisibility(1);
        return s;
    }

    public void execute()
    {
        if (!(new bl(mContext)).bl())
        {
            gs.W("Store picture feature is not supported on this device.");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)qM.get("iurl")))
        {
            gs.W("Image url cannot be empty.");
            return;
        }
        String s = (String)qM.get("iurl");
        if (!URLUtil.isValidUrl(s))
        {
            gs.W((new StringBuilder()).append("Invalid image url:").append(s).toString());
            return;
        }
        String s1 = B(s);
        if (!gj.N(s1))
        {
            gs.W("Image type not recognized:");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
            builder.setTitle(gb.c(com.google.android.gms.R.string.store_picture_title, "Save image"));
            builder.setMessage(gb.c(com.google.android.gms.R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(gb.c(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String qY;
                final String qZ;
                final de ra;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)de.a(ra).getSystemService("download");
                    try
                    {
                        dialoginterface.enqueue(ra.b(qY, qZ));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        gs.U("Could not store picture.");
                    }
                }

            
            {
                ra = de.this;
                qY = s;
                qZ = s1;
                super();
            }
            });
            builder.setNegativeButton(gb.c(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final de ra;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    de.b(ra).b("onStorePictureCanceled", new JSONObject());
                }

            
            {
                ra = de.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
