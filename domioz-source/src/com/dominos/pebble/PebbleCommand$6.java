// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.getpebble.android.kit.PebbleKit;

// Referenced classes of package com.dominos.pebble:
//            PebbleCommand

final class nit> extends PebbleCommand
{

    public final transient void execute(Context context, int i, Object aobj[])
    {
        if (aobj.length > 0)
        {
            PebbleKit.a(context, i);
            PebbleOrderHandler_.getInstance_(context).placeOrder();
            return;
        } else
        {
            PebbleKit.b(context, i);
            return;
        }
    }

    rHandler_(String s, int i)
    {
        super(s, i, null);
    }
}
