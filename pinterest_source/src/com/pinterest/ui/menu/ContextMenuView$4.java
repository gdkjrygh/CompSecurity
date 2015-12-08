// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.pinterest.ui.menu:
//            ContextMenuView, ContextMenuItemView

class this._cls0
    implements android.view.er
{

    final ContextMenuView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 78
    //                   2 124;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        ContextMenuView.access$102(ContextMenuView.this, motionevent.getX());
        ContextMenuView.access$202(ContextMenuView.this, motionevent.getY());
        if (ContextMenuView.access$400(ContextMenuView.this))
        {
            ContextMenuView.access$500(ContextMenuView.this);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (ContextMenuView.access$400(ContextMenuView.this))
        {
            view = ContextMenuView.access$600(ContextMenuView.this, (int)motionevent.getX(), (int)motionevent.getY());
            if (view != null)
            {
                view.performClick();
            }
            ContextMenuView.access$500(ContextMenuView.this);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (ContextMenuView.access$000(ContextMenuView.this))
        {
            ContextMenuView.access$600(ContextMenuView.this, (int)motionevent.getX(), (int)motionevent.getY());
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    w()
    {
        this$0 = ContextMenuView.this;
        super();
    }
}
