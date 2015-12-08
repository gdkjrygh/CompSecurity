// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class this._cls0
    implements android.view.r
{

    final MainBookActivity this$0;

    public void onClick(View view)
    {
        MainBookActivity.access$0(MainBookActivity.this).setVisibility(0);
        if (thread == null)
        {
            startNewThread();
        }
    }

    ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
