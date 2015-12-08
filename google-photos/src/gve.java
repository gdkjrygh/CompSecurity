// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;

final class gve extends gvb
{

    gve()
    {
        super(euv.c);
    }

    public final gvb a(double d1, double d2)
    {
        a.put("latitude", Double.valueOf(d1));
        a.put("longitude", Double.valueOf(d2));
        return this;
    }

    public final gvb a(int i)
    {
        throw new UnsupportedOperationException("Cannot set orientation for videos");
    }

    public final gvb a(int i, int j)
    {
        a.put("resolution", String.format("%dx%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        return super.a(i, j);
    }

    public final gvb c(long l)
    {
        a.put("datetaken", Long.valueOf(l));
        return this;
    }

    public final gvb d(long l)
    {
        a.put("duration", Long.valueOf(l));
        return this;
    }
}
