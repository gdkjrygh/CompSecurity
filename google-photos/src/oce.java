// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class oce
    implements mru
{

    public final int a;

    public oce(int i)
    {
        a = i;
    }

    public final String a(Context context, mrw mrw)
    {
        return null;
    }

    public final void a(Context context)
    {
    }

    public final void b(Context context)
    {
        ((mrv)olm.a(context, mrv)).a(context, this);
    }

    public final String toString()
    {
        return String.format(Locale.US, "LatencyEvent eventCode=%d", new Object[] {
            Integer.valueOf(a)
        });
    }
}
