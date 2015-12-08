// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaView

class this._cls0
    implements Runnable
{

    final NinaBar this$0;

    public void run()
    {
        ninaView.superLock();
    }

    ()
    {
        this$0 = NinaBar.this;
        super();
    }
}
