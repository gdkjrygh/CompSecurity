// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import java.util.Collections;

final class dwx
    implements duh
{

    private final Context a;
    private final dus b;
    private final fay c;
    private final ics d;
    private final ContentResolver e;
    private final icp f;

    dwx(Context context)
    {
        a = context;
        b = (dus)olm.a(context, dus);
        c = (fay)olm.a(context, fay);
        d = (ics)olm.a(context, ics);
        f = (icp)olm.a(context, icp);
        e = context.getContentResolver();
    }

    private void a(dur dur1)
    {
        if (dur1.b() != null)
        {
            e.notifyChange(dur1.b(), null);
        }
    }

    private static String d(dui dui1)
    {
        String s = String.valueOf(dui1.c());
        dui1 = String.valueOf(dui1.b());
        if (dui1.length() != 0)
        {
            return s.concat(dui1);
        } else
        {
            return new String(s);
        }
    }

    public final void a(dui dui1)
    {
        dur dur1 = (dur)b.a(dui1.c());
        if (dur1.b(dui1) == dut.a)
        {
            Object obj = dur1.a(dui1);
            if (obj != null && ((duu) (obj)).c == dut.a)
            {
                int i = ((duu) (obj)).d;
                obj = (new cn(a)).a(((duu) (obj)).a).b(((duu) (obj)).b);
                int j = dui1.a();
                Object obj1 = c.a(j, faz.a);
                f.a(((android.content.Intent) (obj1)), Collections.singletonList(Integer.valueOf(i)));
                obj.d = PendingIntent.getActivity(a, 0, ((android.content.Intent) (obj1)), 0x8000000);
                ((cn) (obj)).a_(16, true);
                obj = ((cn) (obj)).a(System.currentTimeMillis()).a(b.ku);
                obj1 = d;
                j = dui1.a();
                String s = d(dui1);
                if (((ics) (obj1)).a(j))
                {
                    ((ics) (obj1)).a(j, ((cn) (obj)));
                    ((ics) (obj1)).b.notify(s, 0, ((cn) (obj)).a());
                }
                f.a(a, dui1.a(), Collections.singletonList(Integer.valueOf(i)));
            }
        }
        a(dur1);
    }

    public final void b(dui dui1)
    {
        a((dur)b.a(dui1.c()));
    }

    public final void c(dui dui1)
    {
        ics ics1 = d;
        String s = d(dui1);
        ics1.b.cancel(s, 0);
        a((dur)b.a(dui1.c()));
    }
}
