// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.facebook.internal:
//            Z

final class ac extends WebView
{

    final Z a;

    ac(Z z, Context context)
    {
        a = z;
        super(context);
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        try
        {
            super.onWindowFocusChanged(flag);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }
}
