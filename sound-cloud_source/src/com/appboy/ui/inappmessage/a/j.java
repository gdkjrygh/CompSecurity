// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.a;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.a:
//            f

public final class j extends f
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    public a c;

    public j(View view, f.a a1)
    {
        super(view, a1);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 43
    //                   1 62
    //                   2 36
    //                   3 62;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return super.onTouch(view, motionevent);
_L2:
        if (c != null)
        {
            c.a();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (c != null)
        {
            c.b();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
