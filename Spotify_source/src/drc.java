// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Collections;

public final class drc extends dok
    implements drf
{

    public final View b;
    private final Iterable c;

    private drc(String s, View view, Iterable iterable, dsn dsn)
    {
        super(s);
        b = (View)ctz.a(view);
        c = (Iterable)ctz.a(iterable);
        ctz.a(dsn);
    }

    public static drc a(String s, View view)
    {
        dsq dsq1 = new dsq();
        return new drc(s, view, Collections.emptySet(), dsq1);
    }

    public final drp getMetricsInfo()
    {
        return null;
    }

    public final Iterable getPlayables()
    {
        return c;
    }

    public final int getType()
    {
        return 0x7f1100f7;
    }
}
