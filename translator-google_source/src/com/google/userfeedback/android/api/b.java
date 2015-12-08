// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.view.View;

// Referenced classes of package com.google.userfeedback.android.api:
//            PreviewActivity

final class b
    implements android.view.View.OnClickListener
{

    final PreviewActivity a;

    b(PreviewActivity previewactivity)
    {
        a = previewactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.setResult(0);
        a.finish();
    }
}
