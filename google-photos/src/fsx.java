// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;

final class fsx
    implements iwe
{

    private fsv a;

    fsx(fsv fsv1)
    {
        a = fsv1;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 1 3: default 32
    //                   1 41
    //                   2 32
    //                   3 41;
           goto _L1 _L2 _L1 _L2
_L1:
        return a.a(motionevent);
_L2:
        fsv.d(a).a().b(this);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
