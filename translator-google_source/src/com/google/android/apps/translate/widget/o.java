// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import com.google.android.apps.translate.inputtools.InputToolsInput;

// Referenced classes of package com.google.android.apps.translate.widget:
//            n, HandwritingInputView

final class o
    implements Runnable
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        HandwritingInputView.a(a.b, a.b.getCursorSelectionStart(), a);
        HandwritingInputView.e(a.b).endBatchEdit();
    }
}
