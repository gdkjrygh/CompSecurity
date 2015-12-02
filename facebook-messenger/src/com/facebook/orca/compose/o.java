// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.orca.emoji.ai;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class o
    implements ai
{

    final ComposeFragment a;

    o(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.a(a, false);
        ComposeFragment.b(a, false);
    }

    public boolean a(MotionEvent motionevent)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (ComposeFragment.a(a) == null)
            {
                flag = flag1;
                if (ComposeFragment.b(a) == null)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (ComposeFragment.c(a) != null)
            {
                int ai1[] = new int[2];
                ComposeFragment.d(a).getLocationInWindow(ai1);
                flag = (new Rect(ai1[0], ai1[1], ai1[0] + ComposeFragment.d(a).getWidth(), ai1[1] + ComposeFragment.d(a).getHeight())).contains((int)motionevent.getX(), (int)motionevent.getY());
            }
        }
        return flag;
    }
}
