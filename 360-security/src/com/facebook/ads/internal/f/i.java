// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.facebook.ads.internal.f:
//            h

public class i extends View
{

    private h a;

    public i(Context context, h h1)
    {
        super(context);
        a = h1;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int j)
    {
        if (a != null)
        {
            a.a(j);
        }
    }
}
