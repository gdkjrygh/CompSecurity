// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzeg, zzic, zzab, zzho, 
//            zzbu, zzhg

public class zzea extends zzeg
{

    private final Context mContext;
    private final Map zzsZ;
    private String zzta;
    private long zztb;
    private long zztc;
    private String zztd;
    private String zzte;

    public zzea(zzic zzic1, Map map)
    {
        super(zzic1, "createCalendarEvent");
        zzsZ = map;
        mContext = zzic1.zzeD();
        zzcM();
    }

    private String zzE(String s)
    {
        if (TextUtils.isEmpty((CharSequence)zzsZ.get(s)))
        {
            return "";
        } else
        {
            return (String)zzsZ.get(s);
        }
    }

    private long zzF(String s)
    {
        s = (String)zzsZ.get(s);
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    static Context zza(zzea zzea1)
    {
        return zzea1.mContext;
    }

    private void zzcM()
    {
        zzta = zzE("description");
        zztd = zzE("summary");
        zztb = zzF("start_ticks");
        zztc = zzF("end_ticks");
        zzte = zzE("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", zzta);
        intent.putExtra("eventLocation", zzte);
        intent.putExtra("description", zztd);
        if (zztb > -1L)
        {
            intent.putExtra("beginTime", zztb);
        }
        if (zztc > -1L)
        {
            intent.putExtra("endTime", zztc);
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzH("Activity context is not available.");
            return;
        }
        if (!zzab.zzaM().zzx(mContext).zzbU())
        {
            zzH("This feature is not available on the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzab.zzaM().zzw(mContext);
            builder.setTitle(zzab.zzaP().zzc(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(zzab.zzaP().zzc(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzab.zzaP().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final zzea zztf;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = zztf.createIntent();
                    zzea.zza(zztf).startActivity(dialoginterface);
                }

            
            {
                zztf = zzea.this;
                super();
            }
            });
            builder.setNegativeButton(zzab.zzaP().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzea zztf;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zztf.zzH("Operation denied by user.");
                }

            
            {
                zztf = zzea.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
