// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static final class a
    implements android.view.eListener, a
{

    final Handler a;

    public final void a(View view)
    {
        view.addOnLayoutChangeListener(this);
    }

    public final void b(View view)
    {
        view.removeOnLayoutChangeListener(this);
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        a.obtainMessage(view.getId(), sponse.c).sendToTarget();
    }

    public sponse(Handler handler)
    {
        a = handler;
    }
}
