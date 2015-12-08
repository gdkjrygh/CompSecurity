// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.res.Resources;
import android.text.TextUtils;
import com.fitbit.data.domain.Length;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.runtrack:
//            Duration

public class b
{

    private Duration a;
    private Length b;
    private Duration c;
    private Duration d;
    private int e;
    private final EnumSet f;
    private com.fitbit.data.domain.Length.LengthUnits g;

    public b(EnumSet enumset)
    {
        f = EnumSet.copyOf(enumset);
    }

    private String a(Resources resources, Length length)
    {
        int i = 0x7f0b0019;
        if (length.a() == com.fitbit.data.domain.Length.LengthUnits.KM)
        {
            i = 0x7f0b0018;
        }
        BigDecimal bigdecimal = new BigDecimal(length.b(), new MathContext(2, RoundingMode.HALF_EVEN));
        return resources.getQuantityString(i, (int)Math.ceil(length.b()), new Object[] {
            bigdecimal
        });
    }

    private String a(Resources resources, Duration duration)
    {
        ArrayList arraylist = new ArrayList();
        if (duration.c() > 0)
        {
            arraylist.add(resources.getQuantityString(0x7f0b001a, duration.c(), new Object[] {
                Integer.valueOf(duration.c())
            }));
        }
        if (duration.d() > 0)
        {
            arraylist.add(resources.getQuantityString(0x7f0b001b, duration.d(), new Object[] {
                Integer.valueOf(duration.d())
            }));
        }
        if (duration.f() > 0)
        {
            arraylist.add(resources.getQuantityString(0x7f0b001c, duration.f(), new Object[] {
                Integer.valueOf(duration.f())
            }));
        }
        return TextUtils.join(" ", arraylist);
    }

    public String a(Resources resources)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (f.containsAll(EnumSet.of(com.fitbit.savedstate.MobileRunSavedState.AudioCue.b, com.fitbit.savedstate.MobileRunSavedState.AudioCue.a)) && b != null)
        {
            stringbuilder.append(resources.getString(0x7f0804e0, new Object[] {
                a(resources, b), a(resources, a)
            }));
        } else
        if (f.contains(com.fitbit.savedstate.MobileRunSavedState.AudioCue.b))
        {
            stringbuilder.append(resources.getString(0x7f0804e2, new Object[] {
                a(resources, a)
            }));
        } else
        if (f.contains(com.fitbit.savedstate.MobileRunSavedState.AudioCue.a) && b != null)
        {
            stringbuilder.append(resources.getString(0x7f0804e2, new Object[] {
                a(resources, b)
            }));
        }
        if (f.contains(com.fitbit.savedstate.MobileRunSavedState.AudioCue.c) && c != null)
        {
            if (g == null)
            {
                g = com.fitbit.data.domain.Length.LengthUnits.MILES;
            }
            int i;
            if (g == com.fitbit.data.domain.Length.LengthUnits.KM)
            {
                i = 0x7f0804dd;
            } else
            {
                i = 0x7f0804de;
            }
            stringbuilder.append(resources.getString(i, new Object[] {
                a(resources, c)
            }));
        }
        if (f.contains(com.fitbit.savedstate.MobileRunSavedState.AudioCue.d) && d != null)
        {
            stringbuilder.append(resources.getString(0x7f0804e1, new Object[] {
                a(resources, d)
            }));
        }
        if (f.contains(com.fitbit.savedstate.MobileRunSavedState.AudioCue.e))
        {
            stringbuilder.append(resources.getQuantityString(0x7f0b0017, e, new Object[] {
                Integer.valueOf(e)
            }));
        }
        return stringbuilder.toString();
    }

    public void a(int i)
    {
        e = i;
    }

    public void a(com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        g = lengthunits;
    }

    public void a(Length length)
    {
        b = length;
    }

    public void a(Duration duration)
    {
        a = duration;
    }

    public void b(Duration duration)
    {
        c = duration;
    }

    public void c(Duration duration)
    {
        d = duration;
    }
}
