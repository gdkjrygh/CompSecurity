// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

final class gvd extends gvb
{

    private static final List b = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(90), Integer.valueOf(180), Integer.valueOf(270)
    });

    gvd()
    {
        super(euv.b);
    }

    public final gvb a(double d, double d1)
    {
        a.put("latitude", Double.valueOf(d));
        a.put("longitude", Double.valueOf(d1));
        return this;
    }

    public final gvb a(int i)
    {
        p.a(b.contains(Integer.valueOf(i)), String.format(Locale.US, "specified orientation %d not valid.  Valid Orientations: %s", new Object[] {
            Integer.valueOf(i), b
        }));
        a.put("orientation", Integer.valueOf(i));
        return this;
    }

    public final gvb c(long l)
    {
        a.put("datetaken", Long.valueOf(l));
        return this;
    }

}
