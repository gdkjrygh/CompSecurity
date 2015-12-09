// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.EditText;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaView

class this._cls0
    implements Runnable
{

    final NinaBar this$0;

    public void run()
    {
        ninaView.close();
        NinaBar.access$300(NinaBar.this).setVisibility(4);
        NinaBar.access$2300(NinaBar.this, NinaBar.access$700(NinaBar.this));
    }

    ()
    {
        this$0 = NinaBar.this;
        super();
    }
}
