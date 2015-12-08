// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Message;
import android.util.SparseArray;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

final class a
    implements android.os.scroll.LayoutCostMeter._cls1
{

    final LayoutCostMeter a;

    public final boolean handleMessage(Message message)
    {
        int i = message.what;
        message = (sponse)message.obj;
        ((ssion)a.a.get(i)).a(message);
        return true;
    }

    ssion(LayoutCostMeter layoutcostmeter)
    {
        a = layoutcostmeter;
        super();
    }
}
