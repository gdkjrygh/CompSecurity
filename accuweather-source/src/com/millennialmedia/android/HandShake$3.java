// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.widget.Toast;

// Referenced classes of package com.millennialmedia.android:
//            HandShake, MMLog

class val.message
    implements Runnable
{

    final HandShake this$0;
    final String val$message;
    final Context val$toastContext;

    public void run()
    {
        try
        {
            Toast.makeText(val$toastContext, (new StringBuilder()).append("Error: ").append(val$message).toString(), 1).show();
            return;
        }
        catch (android.view.r.BadTokenException badtokenexception)
        {
            MMLog.e("HandShake", "Error with toast token", badtokenexception);
        }
    }

    tion()
    {
        this$0 = final_handshake;
        val$toastContext = context;
        val$message = String.this;
        super();
    }
}
