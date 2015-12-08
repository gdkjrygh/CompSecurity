// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aqc
    implements Runnable
{

    private Context a;
    private aqf b;
    private boolean c;

    aqc(Context context, aqf aqf, boolean flag)
    {
        a = context;
        b = aqf;
        c = flag;
    }

    public final void run()
    {
        aqb.a(b, a, c);
    }
}
