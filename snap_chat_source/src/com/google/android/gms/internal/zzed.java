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

// Referenced classes of package com.google.android.gms.internal:
//            zzeg, zzic, zzab, zzho, 
//            zzbu, zzhg, zzhp

public class zzed extends zzeg
{

    private final Context mContext;
    private final Map zzsZ;

    public zzed(zzic zzic1, Map map)
    {
        super(zzic1, "storePicture");
        zzsZ = map;
        mContext = zzic1.zzeD();
    }

    static Context zza(zzed zzed1)
    {
        return zzed1.mContext;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzH("Activity context is not available");
            return;
        }
        if (!zzab.zzaM().zzx(mContext).zzbR())
        {
            zzH("Feature is not supported by the device.");
            return;
        }
        String s = (String)zzsZ.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            zzH("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            zzH((new StringBuilder("Invalid image url: ")).append(s).toString());
            return;
        }
        String s1 = zzG(s);
        if (!zzab.zzaM().zzU(s1))
        {
            zzH((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzab.zzaM().zzw(mContext);
            builder.setTitle(zzab.zzaP().zzc(com.google.android.gms.R.string.store_picture_title, "Save image"));
            builder.setMessage(zzab.zzaP().zzc(com.google.android.gms.R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(zzab.zzaP().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String zztx;
                final String zzty;
                final zzed zztz;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)zzed.zza(zztz).getSystemService("download");
                    try
                    {
                        dialoginterface.enqueue(zztz.zzf(zztx, zzty));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        zztz.zzH("Could not store picture.");
                    }
                }

            
            {
                zztz = zzed.this;
                zztx = s;
                zzty = s1;
                super();
            }
            });
            builder.setNegativeButton(zzab.zzaP().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzed zztz;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zztz.zzH("User canceled the download.");
                }

            
            {
                zztz = zzed.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    String zzG(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    android.app.DownloadManager.Request zzf(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        zzab.zzaO().zza(s);
        return s;
    }
}
