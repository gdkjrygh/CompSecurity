// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaAnimatedIcon

class this._cls0
    implements android.widget.wer.OnDrawerCloseListener
{

    final NinaBar this$0;

    public void onDrawerClosed()
    {
        NinaBar.access$100(NinaBar.this).popAnimSet();
        if (!NinaBar.access$600(NinaBar.this))
        {
            NinaBar.access$200(NinaBar.this).setVisibility(0);
        }
        if (!NinaBar.access$400(NinaBar.this).isActive(NinaBar.access$300(NinaBar.this)))
        {
            NinaBar.access$300(NinaBar.this).setHint(NinaBar.access$700(NinaBar.this));
        }
    }

    dManager()
    {
        this$0 = NinaBar.this;
        super();
    }
}
