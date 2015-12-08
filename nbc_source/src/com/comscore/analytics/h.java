// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.TransmissionMode;

// Referenced classes of package com.comscore.analytics:
//            Core

class h
    implements Runnable
{

    final TransmissionMode a;
    final Core b;

    h(Core core, TransmissionMode transmissionmode)
    {
        b = core;
        a = transmissionmode;
        super();
    }

    public void run()
    {
        Core.a(b, a);
    }
}
