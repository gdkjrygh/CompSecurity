// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class obw
    implements mru
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;
    private String e;

    public obw(String s, String s1, int i, int j, int k)
    {
        e = s;
        a = s1;
        b = i;
        c = j;
        d = k;
    }

    public final String a(Context context, mrw mrw)
    {
        return e;
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
        return String.format(Locale.US, "DatabaseUpgradeFailureEvent: partitionName=%s, oldVersion=%d, newVersion=%d, failureVersion=%d", new Object[] {
            a, Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d)
        });
    }
}
