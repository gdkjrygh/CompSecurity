// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.show.model.Show;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

final class fja
    implements fjb
{

    private fio a;
    private boolean b;
    private boolean c;
    private boolean d;
    private fiz e;

    public fja(fiz fiz1, fio fio1)
    {
        e = fiz1;
        super();
        a = fio1;
    }

    public final fjb a()
    {
        c = true;
        return this;
    }

    public final fjb a(boolean flag)
    {
        b = flag;
        return this;
    }

    public final fjb b(boolean flag)
    {
        d = flag;
        return this;
    }

    public final String b()
    {
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTimeInMillis((long)a.n() * 1000L);
        Object obj1;
        if (b)
        {
            obj = e.a.format(((Calendar) (obj)).getTime()).toUpperCase(Locale.getDefault());
        } else
        {
            obj = a.o().a();
        }
        obj1 = a.l();
        if (c)
        {
            if (obj1 != null && ((Integer) (obj1)).intValue() == 0 || a.m())
            {
                obj = e.b.getString(0x7f080298);
            }
            return ((String) (obj));
        }
        if ((d || obj1 == null || a.k() == ((Integer) (obj1)).intValue()) && !a.m())
        {
            obj1 = fiz.a(a.k());
            return e.b.getString(0x7f080299, new Object[] {
                obj1, obj
            });
        }
        if (a.m() || ((Integer) (obj1)).intValue() == 0)
        {
            return e.b.getString(0x7f080297, new Object[] {
                obj
            });
        } else
        {
            obj1 = fiz.a(((Integer) (obj1)).intValue());
            return e.b.getString(0x7f080296, new Object[] {
                obj1, obj
            });
        }
    }
}
