// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzt, zzu

class zzlI
    implements android.view.nTouchListener
{

    final zzu zzlI;
    final zzt zzlJ;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        zzlI.recordClick();
        return false;
    }

    (zzt zzt1, zzu zzu1)
    {
        zzlJ = zzt1;
        zzlI = zzu1;
        super();
    }
}
