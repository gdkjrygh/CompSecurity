// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.facebook.internal:
//            bd

final class bg extends WebView
{

    final bd a;

    bg(bd bd, Context context)
    {
        a = bd;
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
