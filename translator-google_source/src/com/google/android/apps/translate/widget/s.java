// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.apps.translate.widget:
//            r, HandwritingInputView

final class s
    implements Runnable
{

    final CharSequence a;
    final r b;

    s(r r1, CharSequence charsequence)
    {
        b = r1;
        a = charsequence;
        super();
    }

    public final void run()
    {
        if (TextUtils.isEmpty(a))
        {
            HandwritingInputView.k(b.a).setVisibility(8);
            HandwritingInputView.l(b.a).setVisibility(0);
            return;
        } else
        {
            HandwritingInputView.k(b.a).setText(a);
            HandwritingInputView.k(b.a).setVisibility(0);
            HandwritingInputView.l(b.a).setVisibility(8);
            return;
        }
    }
}
