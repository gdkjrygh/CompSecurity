// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.os.Handler;
import android.view.View;

// Referenced classes of package org.xbmc.kore.utils:
//            RepeatListener

class this._cls0
    implements Runnable
{

    final RepeatListener this$0;

    public void run()
    {
        if (RepeatListener.access$000(RepeatListener.this).isShown())
        {
            if (RepeatListener.access$100(RepeatListener.this) >= 0)
            {
                RepeatListener.access$200().postDelayed(this, RepeatListener.access$100(RepeatListener.this));
            }
            RepeatListener.access$300(RepeatListener.this).onClick(RepeatListener.access$000(RepeatListener.this));
        }
    }

    ()
    {
        this$0 = RepeatListener.this;
        super();
    }
}
