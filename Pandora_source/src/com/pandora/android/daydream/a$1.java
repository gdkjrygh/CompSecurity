// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.widget.LinearLayout;

// Referenced classes of package com.pandora.android.daydream:
//            a

static final class a
    implements Runnable
{

    final LinearLayout a;

    public void run()
    {
        a.setVisibility(4);
    }

    (LinearLayout linearlayout)
    {
        a = linearlayout;
        super();
    }
}
