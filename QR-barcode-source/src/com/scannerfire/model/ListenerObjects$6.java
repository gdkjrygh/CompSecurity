// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.scannerfire.model:
//            ListenerObjects

class this._cls0
    implements android.view.er
{

    final ListenerObjects this$0;

    public void onClick(View view)
    {
        String s = value;
        Log.d("", (new StringBuilder("GEO VALUE ")).append(value).toString());
        if (value.startsWith("geo:"))
        {
            try
            {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder(String.valueOf(value))).append("&z=16").toString())));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Utils.showToastNotification(context, context.getString(0x7f080116));
            }
            return;
        }
        view = s;
        if (!s.startsWith("http://"))
        {
            view = s;
            if (!s.startsWith("https://"))
            {
                view = s;
                if (!s.startsWith("market://"))
                {
                    view = (new StringBuilder("http://")).append(s).toString();
                }
            }
        }
        view = new Intent("android.intent.action.VIEW", Uri.parse(view));
        context.startActivity(view);
    }

    n()
    {
        this$0 = ListenerObjects.this;
        super();
    }
}
