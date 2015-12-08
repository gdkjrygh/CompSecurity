// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import com.google.android.apps.translate.r;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.handwriting.gui.ab;

// Referenced classes of package com.google.android.apps.translate.widget:
//            HandwritingInputView

final class q extends ab
{

    final HandwritingInputView a;

    q(HandwritingInputView handwritinginputview)
    {
        a = handwritinginputview;
        super();
    }

    public final void a(int i, String s)
    {
        if (i <= 0)
        {
            return;
        } else
        {
            HandwritingInputView.d(a).d();
            HandwritingInputView.a(a, a.getContext().getString(r.msg_network_error));
            return;
        }
    }
}
