// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaView

class this._cls1
    implements Runnable
{

    final ViewListener.wakeUp this$1;

    public void run()
    {
        if (ninaView.listener != null)
        {
            ninaView.listener.wakeUp();
        }
    }

    ViewListener()
    {
        this$1 = this._cls1.this;
        super();
    }
}
