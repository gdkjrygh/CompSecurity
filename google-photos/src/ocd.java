// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class ocd
    implements mru
{

    public final int a = 26;
    public final int b = -1;
    private String c;

    public ocd(String s, int i, int j)
    {
        c = s;
    }

    public final String a(Context context, mrw mrw)
    {
        return c;
    }

    public final void a(Context context)
    {
    }

    public final String toString()
    {
        return String.format(Locale.US, "GmsFailureEvent gmsApi=%d, statusCode=%d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
