// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ec, hi, gm, aq, 
//            gd

public final class dv extends ec
{

    private final Map a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public dv(hi hi1, Map map)
    {
        super(hi1, "createCalendarEvent");
        a = map;
        b = hi1.d();
        c = d("description");
        f = d("summary");
        d = e("start_ticks");
        e = e("end_ticks");
        g = d("location");
    }

    static Context a(dv dv1)
    {
        return dv1.b;
    }

    private String d(String s)
    {
        if (TextUtils.isEmpty((CharSequence)a.get(s)))
        {
            return "";
        } else
        {
            return (String)a.get(s);
        }
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

    public final void a()
    {
        if (b == null)
        {
            a("Activity context is not available.");
            return;
        }
        p.e();
        if (!gm.e(b).d())
        {
            a("This feature is not available on the device.");
            return;
        } else
        {
            p.e();
            android.app.AlertDialog.Builder builder = gm.d(b);
            builder.setTitle(p.h().a(com.google.android.gms.a.c.create_calendar_title, "Create calendar event"));
            builder.setMessage(p.h().a(com.google.android.gms.a.c.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(p.h().a(com.google.android.gms.a.c.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final dv a;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = a.b();
                    dv.a(a).startActivity(dialoginterface);
                }

            
            {
                a = dv.this;
                super();
            }
            });
            builder.setNegativeButton(p.h().a(com.google.android.gms.a.c.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dv a;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    a.a("Operation denied by user.");
                }

            
            {
                a = dv.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    final Intent b()
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
