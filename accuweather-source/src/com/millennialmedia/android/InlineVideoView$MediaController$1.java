// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView

class this._cls0
    implements android.view.iaController._cls1
{

    final ded this$0;

    public void onClick(View view)
    {
        view = (InlineVideoView)cess._mth100(this._cls0.this).get();
        if (view == null)
        {
            return;
        }
        this._cls0 _lcls0 = InlineVideoView.access$000(view);
        boolean flag;
        if (!InlineVideoView.access$000(view).ded)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _lcls0.ded = flag;
        InlineVideoView.access$200(view);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
