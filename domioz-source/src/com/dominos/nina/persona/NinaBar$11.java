// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

class this._cls0
    implements android.view.sChangeListener
{

    final NinaBar this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            NinaBar.access$1400(NinaBar.this);
        }
    }

    ner()
    {
        this$0 = NinaBar.this;
        super();
    }
}
