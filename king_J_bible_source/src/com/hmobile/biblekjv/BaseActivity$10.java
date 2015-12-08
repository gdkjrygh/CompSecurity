// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class tor
    implements android.view.ener
{

    final BaseActivity this$0;
    private final android.content.s.Editor val$editor;

    public void onClick(View view)
    {
        val$editor.putInt("exit_alert", 1);
        val$editor.commit();
        finish();
    }

    tor()
    {
        this$0 = final_baseactivity;
        val$editor = android.content.s.Editor.this;
        super();
    }
}
