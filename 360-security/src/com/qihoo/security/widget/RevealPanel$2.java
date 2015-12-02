// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.view.View;
import com.nineoldandroids.b.a;

// Referenced classes of package com.qihoo.security.widget:
//            RevealPanel, RevealRippleLayout

class a
    implements Runnable
{

    final RevealRippleLayout a;
    final RevealPanel b;

    public void run()
    {
        b.b();
        View view = a.getChildAt(0);
        a.setxRippleOrigin(Float.valueOf(com.nineoldandroids.b.a.a(view) + (float)(view.getWidth() / 2)));
        RevealRippleLayout revealripplelayout = a;
        float f = com.nineoldandroids.b.a.b(view);
        revealripplelayout.setyRippleOrigin(Float.valueOf((float)(view.getHeight() / 2) + f));
        a.setRippleColor(RevealPanel.b(b));
        a.setRippleSpeed(30);
    }

    yout(RevealPanel revealpanel, RevealRippleLayout revealripplelayout)
    {
        b = revealpanel;
        a = revealripplelayout;
        super();
    }
}
