// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.view.View;

// Referenced classes of package com.pandora.android:
//            Main

class a
    implements Runnable
{

    final Main a;

    public void run()
    {
        View view = a.findViewById(0x7f10029e);
        if (view != null)
        {
            view.setVisibility(0);
        }
    }

    (Main main)
    {
        a = main;
        super();
    }
}
