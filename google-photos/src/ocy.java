// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

final class ocy
    implements ocx
{

    private lyy a;

    ocy(Context context)
    {
        a = (lyy)olm.a(context, lyy);
    }

    public final void a(String s, String s1, qlw qlw1, Bundle bundle)
    {
        int i = 0;
        try
        {
            qlw1 = qlw.a(qlw1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AnalyticsTransmitter", "Cannot send log record", s);
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        i = bundle.getInt("latency_event_code", 0);
        a.a(s1, s, i, qlw1);
        return;
    }
}
