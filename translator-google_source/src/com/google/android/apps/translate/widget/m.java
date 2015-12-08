// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.translate.widget:
//            HandwritingInputView

final class m
    implements Runnable
{

    final HandwritingInputView a;

    m(HandwritingInputView handwritinginputview)
    {
        a = handwritinginputview;
        super();
    }

    public final void run()
    {
        a.onClick(HandwritingInputView.f(a));
        HandwritingInputView.g(a).postDelayed(this, 100L);
    }
}
