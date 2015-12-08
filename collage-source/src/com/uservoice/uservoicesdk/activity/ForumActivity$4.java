// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import com.uservoice.uservoicesdk.Session;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class this._cls0
    implements Runnable
{

    final ForumActivity this$0;

    public void run()
    {
        ForumActivity.access$100(ForumActivity.this);
    /* block-local class not found */
    class _cls1 {}

        Session.getInstance().setSignInListener(new _cls1());
    }

    _cls1()
    {
        this$0 = ForumActivity.this;
        super();
    }
}
