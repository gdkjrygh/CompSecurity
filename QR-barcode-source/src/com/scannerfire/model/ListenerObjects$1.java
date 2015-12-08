// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.scannerfire.model:
//            ListenerObjects

class this._cls0
    implements android.view.er
{

    final ListenerObjects this$0;

    public void onClick(View view)
    {
        String s = value.toLowerCase();
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

    ()
    {
        this$0 = ListenerObjects.this;
        super();
    }
}
