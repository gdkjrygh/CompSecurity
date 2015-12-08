// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;


// Referenced classes of package com.pinterest.ui.megaphone:
//            MegaphoneView

class this._cls0
    implements Runnable
{

    final MegaphoneView this$0;

    public void run()
    {
        if (getParent() != null)
        {
            setVisibility(0);
        }
    }

    ()
    {
        this$0 = MegaphoneView.this;
        super();
    }
}
