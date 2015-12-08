// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class itor
    implements android.view.tener
{

    final BaseActivity this$0;
    private final android.content.es.Editor val$editor;

    public void onClick(View view)
    {
        val$editor.putInt("exit_alert", 0);
        val$editor.commit();
        finish();
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(getPackageName()).toString()));
        startActivity(view);
        finish();
    }

    itor()
    {
        this$0 = final_baseactivity;
        val$editor = android.content.es.Editor.this;
        super();
    }
}
