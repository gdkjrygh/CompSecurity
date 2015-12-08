// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.View;
import com.android.slyce.report.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.android.slyce.report.surveys:
//            k

class n
    implements android.view.View.OnClickListener
{

    final k a;

    n(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
        UpdateDisplayState.a(k.b(a));
    }
}
