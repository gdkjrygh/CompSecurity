// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ck, fl, a, es, 
//            aj, ek, bz, ca

public final class by extends ck
{

    private final Map a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public by(fl fl1, Map map)
    {
        super(fl1, "createCalendarEvent");
        a = map;
        b = fl1.c();
        c = d("description");
        f = d("summary");
        d = e("start_ticks");
        e = e("end_ticks");
        g = d("location");
    }

    static Context a(by by1)
    {
        return by1.b;
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
        com.google.android.gms.internal.a.c();
        if (!es.c(b).d())
        {
            a("This feature is not available on the device.");
            return;
        } else
        {
            com.google.android.gms.internal.a.c();
            android.app.AlertDialog.Builder builder = com.google.android.gms.internal.es.b(b);
            builder.setTitle(com.google.android.gms.internal.a.f().a(b.y, "Create calendar event"));
            builder.setMessage(com.google.android.gms.internal.a.f().a(b.x, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(com.google.android.gms.internal.a.f().a(b.a, "Accept"), new bz(this));
            builder.setNegativeButton(com.google.android.gms.internal.a.f().a(b.z, "Decline"), new ca(this));
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
