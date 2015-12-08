// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyOverlay

class a
    implements Runnable
{

    final View a;
    final AdColonyOverlay b;

    public void run()
    {
        b.N.removeView(a);
    }

    (AdColonyOverlay adcolonyoverlay, View view)
    {
        b = adcolonyoverlay;
        a = view;
        super();
    }
}
