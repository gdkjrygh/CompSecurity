// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.view.View;

// Referenced classes of package com.skype.android.app:
//            ActionBarCustomizer, Navigation

final class val.requestCode
    implements android.view.omizer._cls2
{

    final ActionBarCustomizer this$0;
    final int val$requestCode;

    public final void onClick(View view)
    {
        if (val$requestCode == -1000)
        {
            ActionBarCustomizer.access$100(ActionBarCustomizer.this).profile(ActionBarCustomizer.access$000(ActionBarCustomizer.this));
            return;
        } else
        {
            ActionBarCustomizer.access$100(ActionBarCustomizer.this).profileForResult(ActionBarCustomizer.access$000(ActionBarCustomizer.this), ActionBarCustomizer.access$200(ActionBarCustomizer.this));
            return;
        }
    }

    ()
    {
        this$0 = final_actionbarcustomizer;
        val$requestCode = I.this;
        super();
    }
}
