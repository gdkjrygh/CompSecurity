// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Intent;
import com.google.android.apps.handwriting.service.t;

// Referenced classes of package com.google.android.apps.translate.widget:
//            h, HandwritingInputView

final class g
    implements t
{

    final HandwritingInputView a;

    g(HandwritingInputView handwritinginputview)
    {
        a = handwritinginputview;
        super();
    }

    public final void a(Intent intent)
    {
        if (intent != null)
        {
            long l = intent.getLongExtra("download_size", 0L);
            a.post(new h(this, l, intent));
        }
    }
}
