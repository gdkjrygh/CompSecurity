// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            NinaView, NinaBar

class this._cls0
    implements Runnable
{

    final NinaView this$0;

    public void run()
    {
        close();
        NinaView.access$100(NinaView.this).cleanupEdit();
    }

    ()
    {
        this$0 = NinaView.this;
        super();
    }
}
