// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.views;


// Referenced classes of package com.nbcsports.liveextra.ui.views:
//            ContentLoadingOverlay

class this._cls0
    implements Runnable
{

    final ContentLoadingOverlay this$0;

    public void run()
    {
        ContentLoadingOverlay.access$202(ContentLoadingOverlay.this, false);
        if (!ContentLoadingOverlay.access$300(ContentLoadingOverlay.this))
        {
            ContentLoadingOverlay.access$102(ContentLoadingOverlay.this, System.currentTimeMillis());
            setVisibility(0);
        }
    }

    ()
    {
        this$0 = ContentLoadingOverlay.this;
        super();
    }
}
