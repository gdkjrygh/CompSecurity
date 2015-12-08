// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.DialogInterface;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class hareDelegate
    implements android.content.OnClickListener
{

    final BaseActivity this$0;
    private final com.hmobile.model.keShareDelegate val$delegate;
    private final String val$sharetext;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        String s = (new StringBuilder(String.valueOf(val$sharetext.substring(0, 136)))).append("...").toString();
        signInwithTwitter(s, val$delegate);
        dialoginterface.dismiss();
    }

    hareDelegate()
    {
        this$0 = final_baseactivity;
        val$sharetext = s;
        val$delegate = com.hmobile.model.keShareDelegate.this;
        super();
    }
}
