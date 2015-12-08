// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.content.DialogInterface;
import android.view.View;
import com.soundcloud.android.accounts.LogoutActivity;

// Referenced classes of package com.soundcloud.android.you:
//            YouPresenter

class val.view
    implements android.content..OnClickListener
{

    final YouPresenter this$0;
    final View val$view;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        LogoutActivity.start(val$view.getContext());
    }

    vity()
    {
        this$0 = final_youpresenter;
        val$view = View.this;
        super();
    }
}
