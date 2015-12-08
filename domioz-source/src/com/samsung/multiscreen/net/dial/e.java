// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.dial;

import com.samsung.multiscreen.a.d;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.dial:
//            DialClient

final class e
    implements d
{

    e()
    {
    }

    public final void onError(com.samsung.multiscreen.a.e e1)
    {
        DialClient.a.info((new StringBuilder("DIAL Launch Error: ")).append(e1).toString());
    }

    public final void onResult(Object obj)
    {
        obj = (Boolean)obj;
        DialClient.a.info((new StringBuilder("Dial Launch: ")).append(obj).toString());
    }
}
