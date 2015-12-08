// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.util.Log;
import com.leanplum.callbacks.StartCallback;
import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            T, ah

final class ai
    implements Runnable
{

    private final JSONObject a;
    private final StartCallback b;

    ai(ah ah, JSONObject jsonobject, StartCallback startcallback)
    {
        a = jsonobject;
        b = startcallback;
        super();
    }

    public final void run()
    {
        JSONObject jsonobject = T.b(a);
        if (T.c(jsonobject))
        {
            if (b != null)
            {
                b.onResponse(true);
            }
        } else
        {
            Log.e("Leanplum", T.d(jsonobject));
            if (b != null)
            {
                b.onResponse(false);
                return;
            }
        }
    }
}
