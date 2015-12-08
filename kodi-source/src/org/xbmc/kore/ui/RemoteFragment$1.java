// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class this._cls0
    implements android.view.ner
{

    final RemoteFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 63
    //                   2 36
    //                   3 63;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        RemoteFragment.access$000(RemoteFragment.this).setFillAfter(true);
        view.startAnimation(RemoteFragment.access$000(RemoteFragment.this));
        continue; /* Loop/switch isn't completed */
_L3:
        view.startAnimation(RemoteFragment.access$100(RemoteFragment.this));
        if (true) goto _L1; else goto _L4
_L4:
    }

    ()
    {
        this$0 = RemoteFragment.this;
        super();
    }
}
