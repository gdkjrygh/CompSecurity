// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.view.View;
import android.view.animation.Animation;
import com.qihoo.security.malware.widget.RadarProgressBar;
import com.qihoo.security.opti.trashclear.ui.wave.WaveView;
import com.qihoo.security.ui.b.b;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements android.view.animation.nListener
{

    final CleanupFragment a;

    public void onAnimationEnd(Animation animation)
    {
        b.c(5);
        CleanupFragment.Y(a).setVisibility(0);
        CleanupFragment.aa(a);
        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, false);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        b.a(5, CleanupFragment.Y(a));
        CleanupFragment.Z(a);
        CleanupFragment.G(a).a(false);
        CleanupFragment.h(a).b();
    }

    (CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }
}
