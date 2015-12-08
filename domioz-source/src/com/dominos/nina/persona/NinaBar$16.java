// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

class this._cls0
    implements Runnable
{

    final NinaBar this$0;

    public void run()
    {
        NinaBar.access$200(NinaBar.this).setVisibility(4);
        NinaBar.access$300(NinaBar.this).setFocusable(false);
    }

    ()
    {
        this$0 = NinaBar.this;
        super();
    }
}
