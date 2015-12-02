// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.Context;
import android.os.Handler;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.nobreak:
//            RecoveryModeHelper, NobreakUtils

class c extends Thread
{

    final Context a;
    final Handler b;
    final Runnable c;
    final RecoveryModeHelper d;

    public void run()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(RecoveryModeHelper.a(d, a));
        NobreakUtils.a(a, arraylist);
        HandlerDetour.a(b, c, 0x6f0ae8b6);
    }

    ndlerDetour(RecoveryModeHelper recoverymodehelper, Context context, Handler handler, Runnable runnable)
    {
        d = recoverymodehelper;
        a = context;
        b = handler;
        c = runnable;
        super();
    }
}
