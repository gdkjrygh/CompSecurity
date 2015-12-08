// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class obv
    implements mru
{

    public final byte a[];
    private final String b;

    public obv(String s, byte abyte0[])
    {
        b = s;
        a = (byte[])p.b(abyte0, "delta must not be null.");
    }

    public final String a(Context context, mrw mrw1)
    {
        if (b != null)
        {
            return b;
        } else
        {
            return mrw1.a(context);
        }
    }

    public final void a(Context context)
    {
    }

    public final String toString()
    {
        return "CronetHistogramEvent";
    }
}
