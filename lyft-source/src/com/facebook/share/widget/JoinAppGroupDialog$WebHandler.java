// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.widget:
//            JoinAppGroupDialog

class <init> extends com.facebook.internal.
{

    final JoinAppGroupDialog this$0;

    public volatile boolean canShow(Object obj)
    {
        return canShow((String)obj);
    }

    public boolean canShow(String s)
    {
        return true;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((String)obj);
    }

    public AppCall createAppCall(String s)
    {
        AppCall appcall = createBaseAppCall();
        Bundle bundle = new Bundle();
        bundle.putString("id", s);
        DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_join", bundle);
        return appcall;
    }

    private ()
    {
        this$0 = JoinAppGroupDialog.this;
        super(JoinAppGroupDialog.this);
    }

    it>(it> it>)
    {
        this();
    }
}
