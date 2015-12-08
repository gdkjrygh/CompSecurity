// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class obs
    implements mru
{

    public final String a;
    public final int b = 1;
    public final int c;
    public final String d;
    public final boolean e;

    public obs(String s, int i, int j, String s1, boolean flag)
    {
        a = s;
        c = j;
        d = s1;
        e = flag;
    }

    public final String a(Context context, mrw mrw1)
    {
        return mrw1.a(context);
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
        return String.format(Locale.US, "AdsConversionEvent {referrer: %s, referrerSource: %d, conversionType: %d, advertisingId: %s, limitAdTracking: %b}", new Object[] {
            a, Integer.valueOf(b), Integer.valueOf(c), d, Boolean.valueOf(e)
        });
    }
}
