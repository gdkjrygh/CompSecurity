// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.media.AudioTrack;
import android.os.Handler;
import com.nuance.dragon.toolkit.audio.k;
import java.util.LinkedList;

// Referenced classes of package com.nuance.b.b:
//            eo, eq

final class er
    implements Runnable
{

    final eo a;
    private int b;

    er(eo eo1)
    {
        a = eo1;
        super();
        b = 0;
    }

    public final void run()
    {
        int i;
        if (eo.a(a))
        {
            return;
        }
        i = eo.f(a).getPlaybackHeadPosition();
        if (i > 0) goto _L2; else goto _L1
_L1:
        i = 1;
_L9:
        if (i == 0) goto _L4; else goto _L3
_L3:
        Handler handler = eo.i(a);
        if (eo.a(a) || handler == null) goto _L4; else goto _L5
_L5:
        boolean flag = handler.postDelayed(this, eo.j(a));
_L7:
        eo.a(a, flag);
        return;
_L2:
        if (b == 0)
        {
            b = i;
        }
        int j = b;
        eq eq1;
        do
        {
            if (eo.g(a).isEmpty())
            {
                break; /* Loop/switch isn't completed */
            }
            eq1 = (eq)eo.g(a).removeFirst();
        } while (eq1.b < i - j);
        eo.h(a).a(eq1.a);
        i = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        i = 0;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
