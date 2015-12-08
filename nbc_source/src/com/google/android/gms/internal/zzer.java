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
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzeu, zzid, zzhl, zzbq, 
//            zzhc, zzhm

public class zzer extends zzeu
{

    private final Context mContext;
    private final Map zzyn;

    public zzer(zzid zzid1, Map map)
    {
        super(zzid1, "storePicture");
        zzyn = map;
        mContext = zzid1.zzgB();
    }

    static Context zza(zzer zzer1)
    {
        return zzer1.mContext;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzae("Activity context is not available");
            return;
        }
        if (!zzo.zzbv().zzK(mContext).zzcS())
        {
            zzae("Feature is not supported by the device.");
            return;
        }
        String s = (String)zzyn.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            zzae("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            zzae((new StringBuilder()).append("Invalid image url: ").append(s).toString());
            return;
        }
        String s1 = zzad(s);
        if (!zzo.zzbv().zzav(s1))
        {
            zzae((new StringBuilder()).append("Image type not recognized: ").append(s1).toString());
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzo.zzbv().zzJ(mContext);
            builder.setTitle(zzo.zzby().zzc(com.google.android.gms.R.string.store_picture_title, "Save image"));
            builder.setMessage(zzo.zzby().zzc(com.google.android.gms.R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(zzo.zzby().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String zzyL;
                final String zzyM;
                final zzer zzyN;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)zzer.zza(zzyN).getSystemService("download");
                    try
                    {
                        dialoginterface.enqueue(zzyN.zzf(zzyL, zzyM));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        zzyN.zzae("Could not store picture.");
                    }
                }

            
            {
                zzyN = zzer.this;
                zzyL = s;
                zzyM = s1;
                super();
            }
            });
            builder.setNegativeButton(zzo.zzby().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzer zzyN;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzyN.zzae("User canceled the download.");
                }

            
            {
                zzyN = zzer.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    String zzad(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    android.app.DownloadManager.Request zzf(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        zzo.zzbx().zza(s);
        return s;
    }
}
