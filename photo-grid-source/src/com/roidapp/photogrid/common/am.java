// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.roidapp.photogrid.common:
//            al

public final class am extends TimerTask
{

    final al a;

    public am(al al1)
    {
        a = al1;
        super();
    }

    public final void run()
    {
        if (al.a(a) != null)
        {
            al.a(a).sendEmptyMessage(566);
        }
    }
}
