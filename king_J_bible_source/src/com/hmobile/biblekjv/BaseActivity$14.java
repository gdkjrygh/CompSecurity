// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import com.hmobile.quickaction.QuickAction;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, HolyBibleApplication

class this._cls0
    implements android.view.ener
{

    final BaseActivity this$0;

    public void onClick(View view)
    {
        view = new QuickAction(view);
        if (!HolyBibleApplication.isPurchased)
        {
            view.addActionItem(BaseActivity.access$2(BaseActivity.this));
        }
        view.addActionItem(BaseActivity.access$3(BaseActivity.this));
        view.addActionItem(BaseActivity.access$4(BaseActivity.this));
        view.addActionItem(BaseActivity.access$5(BaseActivity.this));
        view.addActionItem(BaseActivity.access$6(BaseActivity.this));
        view.addActionItem(BaseActivity.access$7(BaseActivity.this));
        view.show();
    }

    tion()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
