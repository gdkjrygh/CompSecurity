// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aqd
    implements Runnable
{

    private Context a;
    private aqf b;

    aqd(Context context, aqf aqf)
    {
        a = context;
        b = aqf;
    }

    public final void run()
    {
        aqb.a(b, a);
    }
}
