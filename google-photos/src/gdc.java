// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;

public final class gdc
{

    private final ContentValues a;

    public gdc(ContentValues contentvalues)
    {
        p.b(contentvalues, "ContentValues cannot be null.");
        a = contentvalues;
    }

    public final int a(String s)
    {
        if (a.get(s) == null)
        {
            return 0;
        } else
        {
            return a.getAsInteger(s).intValue();
        }
    }

    public final long b(String s)
    {
        if (a.get(s) == null)
        {
            return 0L;
        } else
        {
            return a.getAsLong(s).longValue();
        }
    }

    public final double c(String s)
    {
        if (a.get(s) == null)
        {
            return 0.0D;
        } else
        {
            return a.getAsDouble(s).doubleValue();
        }
    }

    public final String d(String s)
    {
        return a.getAsString(s);
    }
}
