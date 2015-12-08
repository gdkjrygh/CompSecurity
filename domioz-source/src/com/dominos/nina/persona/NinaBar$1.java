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
    implements android.widget.wer.OnDrawerOpenListener
{

    final NinaBar this$0;

    public void onDrawerOpened()
    {
        if (NinaBar.access$000(NinaBar.this))
        {
            NinaBar.access$100(NinaBar.this).hintsRaised();
        }
        NinaBar.access$200(NinaBar.this).setVisibility(4);
        if (!NinaBar.access$400(NinaBar.this).isActive(NinaBar.access$300(NinaBar.this)))
        {
            NinaBar.access$300(NinaBar.this).setHint(NinaBar.access$500(NinaBar.this));
        }
    }

    dManager()
    {
        this$0 = NinaBar.this;
        super();
    }
}
