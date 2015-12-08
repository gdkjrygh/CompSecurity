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
    implements android.view.ChangeListener, a
{

    final Handler a;

    public final void a(View view)
    {
        view.addOnAttachStateChangeListener(this);
    }

    public final void b(View view)
    {
        view.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view)
    {
        a.obtainMessage(view.getId(), sponse.a).sendToTarget();
    }

    public final void onViewDetachedFromWindow(View view)
    {
        a.obtainMessage(view.getId(), sponse.b).sendToTarget();
    }

    sponse(Handler handler)
    {
        a = handler;
    }
}
