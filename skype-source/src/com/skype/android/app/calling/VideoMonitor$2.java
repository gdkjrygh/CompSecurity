// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.View;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor

final class this._cls0
    implements android.view.angeListener
{

    final VideoMonitor this$0;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (k != k1 || l != l1)
        {
            view = getWindow(0);
            if (view != null)
            {
                updateViewLayout(0, getParams(0, view));
            }
        }
    }

    ()
    {
        this$0 = VideoMonitor.this;
        super();
    }
}
