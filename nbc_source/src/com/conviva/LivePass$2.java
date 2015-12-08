// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import com.conviva.session.SessionFactory;
import com.conviva.utils.PlatformUtils;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass

static final class ormUtils
    implements Callable
{

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        if (LivePass.access$400() != null)
        {
            LivePass.access$400().cleanup();
        }
        SessionFactory _tmp = LivePass.access$402(null);
        int _tmp1 = LivePass.access$602(-1);
        if (LivePass.access$300() != null)
        {
            LivePass.access$300().cleanup();
        }
        PlatformUtils _tmp2 = LivePass.access$302(null);
        boolean _tmp3 = LivePass.access$502(false);
        return null;
    }

    ormUtils()
    {
    }
}
