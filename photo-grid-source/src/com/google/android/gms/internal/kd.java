// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.d;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            kp, ry, qa, cm, 
//            pe, ke, kf

public final class kd extends kp
{

    private final Map a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public kd(ry ry1, Map map)
    {
        super(ry1, "createCalendarEvent");
        a = map;
        b = ry1.e();
        c = d("description");
        f = d("summary");
        d = e("start_ticks");
        e = e("end_ticks");
        g = d("location");
    }

    static Context a(kd kd1)
    {
        return kd1.b;
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
        zzp.zzbv();
        if (!qa.e(b).d())
        {
            a("This feature is not available on the device.");
            return;
        } else
        {
            zzp.zzbv();
            android.app.AlertDialog.Builder builder = com.google.android.gms.internal.qa.d(b);
            builder.setTitle(zzp.zzby().a(d.F, "Create calendar event"));
            builder.setMessage(zzp.zzby().a(d.E, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzp.zzby().a(d.a, "Accept"), new ke(this));
            builder.setNegativeButton(zzp.zzby().a(d.G, "Decline"), new kf(this));
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
