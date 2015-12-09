// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.facebook.b:
//            as

class av extends WebView
{

    final as a;

    av(as as, Context context)
    {
        a = as;
        super(context);
    }

    public void onWindowFocusChanged(boolean flag)
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
