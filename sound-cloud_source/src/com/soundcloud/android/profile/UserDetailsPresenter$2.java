// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.profile:
//            UserDetailsFragment, UserDetailsPresenter

class val.fragment
    implements ailsListener
{

    final UserDetailsPresenter this$0;
    final UserDetailsFragment val$fragment;

    public void onViewUri(Uri uri)
    {
        val$fragment.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    ailsListener()
    {
        this$0 = final_userdetailspresenter;
        val$fragment = UserDetailsFragment.this;
        super();
    }
}
