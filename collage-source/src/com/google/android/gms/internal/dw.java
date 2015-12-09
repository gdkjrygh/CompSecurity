// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ed, hs, gw, aq, 
//            gn

public class dw extends ed
{

    private final Map a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public dw(hs hs1, Map map)
    {
        super(hs1, "createCalendarEvent");
        a = map;
        b = hs1.c();
        c();
    }

    static Context a(dw dw1)
    {
        return dw1.b;
    }

    private String a(String s)
    {
        if (TextUtils.isEmpty((CharSequence)a.get(s)))
        {
            return "";
        } else
        {
            return (String)a.get(s);
        }
    }

    private void c()
    {
        c = a("description");
        f = a("summary");
        d = e("start_ticks");
        e = e("end_ticks");
        g = a("location");
    }

    private long e(String s)
    {
        s = (String)a.get(s);
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

    public void a()
    {
        if (b == null)
        {
            b("Activity context is not available.");
            return;
        }
        if (!zzp.zzbx().e(b).f())
        {
            b("This feature is not available on the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzp.zzbx().d(b);
            builder.setTitle(zzp.zzbA().a(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(zzp.zzbA().a(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzp.zzbA().a(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final dw a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = a.b();
                    dw.a(a).startActivity(dialoginterface);
                }

            
            {
                a = dw.this;
                super();
            }
            });
            builder.setNegativeButton(zzp.zzbA().a(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dw a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.b("Operation denied by user.");
                }

            
            {
                a = dw.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    Intent b()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", c);
        intent.putExtra("eventLocation", g);
        intent.putExtra("description", f);
        if (d > -1L)
        {
            intent.putExtra("beginTime", d);
        }
        if (e > -1L)
        {
            intent.putExtra("endTime", e);
        }
        intent.setFlags(0x10000000);
        return intent;
    }
}
