// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.os.Message;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            g

class a
    implements android.os.ler.Callback
{

    final g a;

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 4: default 48
    //                   4: 50
    //                   5: 60
    //                   12: 70
    //                   1000: 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        a.i();
        continue; /* Loop/switch isn't completed */
_L3:
        a.j();
        continue; /* Loop/switch isn't completed */
_L4:
        if (a.n() && a.c != null)
        {
            a.c.postInvalidate();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (a.n())
        {
            a.c(true);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    geViewTouch(g g1)
    {
        a = g1;
        super();
    }
}
