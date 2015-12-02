// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.view.MotionEvent;
import android.view.View;
import com.nineoldandroids.b.a;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements android.view.sScanFragmentV3._cls37
{

    final VirusScanFragmentV3 a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i == 0)
        {
            com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 0.8F);
        }
        if (i == 1)
        {
            com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 1.0F);
        }
        if (i == 3)
        {
            com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 1.0F);
        }
        return false;
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
