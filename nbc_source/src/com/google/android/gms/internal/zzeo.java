// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzeu, zzid, zzhl, zzbq, 
//            zzhc

public class zzeo extends zzeu
{

    private final Context mContext;
    private final Map zzyn;
    private String zzyo;
    private long zzyp;
    private long zzyq;
    private String zzyr;
    private String zzys;

    public zzeo(zzid zzid1, Map map)
    {
        super(zzid1, "createCalendarEvent");
        zzyn = map;
        mContext = zzid1.zzgB();
        zzeb();
    }

    static Context zza(zzeo zzeo1)
    {
        return zzeo1.mContext;
    }

    private String zzab(String s)
    {
        if (TextUtils.isEmpty((CharSequence)zzyn.get(s)))
        {
            return "";
        } else
        {
            return (String)zzyn.get(s);
        }
    }

    private long zzac(String s)
    {
        s = (String)zzyn.get(s);
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

    private void zzeb()
    {
        zzyo = zzab("description");
        zzyr = zzab("summary");
        zzyp = zzac("start_ticks");
        zzyq = zzac("end_ticks");
        zzys = zzab("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", zzyo);
        intent.putExtra("eventLocation", zzys);
        intent.putExtra("description", zzyr);
        if (zzyp > -1L)
        {
            intent.putExtra("beginTime", zzyp);
        }
        if (zzyq > -1L)
        {
            intent.putExtra("endTime", zzyq);
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzae("Activity context is not available.");
            return;
        }
        if (!zzo.zzbv().zzK(mContext).zzcV())
        {
            zzae("This feature is not available on the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzo.zzbv().zzJ(mContext);
            builder.setTitle(zzo.zzby().zzc(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(zzo.zzby().zzc(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzo.zzby().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final zzeo zzyt;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = zzyt.createIntent();
                    zzeo.zza(zzyt).startActivity(dialoginterface);
                }

            
            {
                zzyt = zzeo.this;
                super();
            }
            });
            builder.setNegativeButton(zzo.zzby().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzeo zzyt;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzyt.zzae("Operation denied by user.");
                }

            
            {
                zzyt = zzeo.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
