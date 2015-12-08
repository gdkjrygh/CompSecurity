// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.dial;

import com.samsung.multiscreen.a.e;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.dial:
//            DialClient

final class d
    implements com.samsung.multiscreen.a.d
{

    d()
    {
    }

    public final void onError(e e)
    {
        DialClient.a.info((new StringBuilder("DIAL Launch Error: ")).append(e).toString());
    }

    public final void onResult(Object obj)
    {
        obj = (Boolean)obj;
        DialClient.a.info((new StringBuilder("Dial Launch: ")).append(obj).toString());
    }
}
