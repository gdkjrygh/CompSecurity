// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view:
//            k

public class l extends View
{

    private k a;

    public l(Context context, k k1)
    {
        super(context);
        a = k1;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int i)
    {
        if (a != null)
        {
            a.a(i);
        }
    }
}
