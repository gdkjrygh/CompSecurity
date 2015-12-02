// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

public final class afa extends afh
{

    private final Map a;
    private final Context b;
    private String c;
    private long d;
    private long e;
    private String f;
    private String g;

    public afa(akk akk1, Map map)
    {
        super(akk1, "createCalendarEvent");
        a = map;
        b = akk1.d();
        c();
    }

    static Context a(afa afa1)
    {
        return afa1.b;
    }

    private void c()
    {
        c = d("description");
        f = d("summary");
        d = e("start_ticks");
        e = e("end_ticks");
        g = d("location");
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
        ot.e();
        if (!ajc.e(b).d())
        {
            a("This feature is not available on the device.");
            return;
        } else
        {
            ot.e();
            android.app.AlertDialog.Builder builder = ajc.d(b);
            builder.setTitle(ot.h().a(kf.create_calendar_title, "Create calendar event"));
            builder.setMessage(ot.h().a(kf.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(ot.h().a(kf.accept, "Accept"), new _cls1());
            builder.setNegativeButton(ot.h().a(kf.decline, "Decline"), new _cls2());
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

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
