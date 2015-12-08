// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class lzd
    implements jyx
{

    private lyz a;

    lzd(lyz lyz1)
    {
        a = lyz1;
        super();
    }

    public final void a(jyw jyw)
    {
        jyw = (Status)jyw;
        if (Log.isLoggable("GcoreClearcutLogger", 3))
        {
            jyw = String.valueOf(jyw);
            (new StringBuilder(String.valueOf(jyw).length() + 27)).append("ClearcutLogger log result: ").append(jyw);
        }
        lyz.c(a).postDelayed(lyz.b(a), 10000L);
    }
}
