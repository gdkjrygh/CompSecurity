// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import com.addlive.service.InvalidateCb;

// Referenced classes of package com.addlive.view:
//            ALVideoTextureView, GLThread

class <init>
    implements InvalidateCb
{

    final ALVideoTextureView this$0;

    public void invalidate()
    {
        glThread.requestRender();
    }

    private ()
    {
        this$0 = ALVideoTextureView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
