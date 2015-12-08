// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupDetailsLayout

class val.avatarText
    implements android.view.er
{

    final SignupDetailsLayout this$0;
    final TextView val$avatarText;
    final ImageView val$avatarView;

    public boolean onLongClick(View view)
    {
        SignupDetailsLayout.access$200(SignupDetailsLayout.this);
        val$avatarView.setVisibility(8);
        val$avatarText.setVisibility(0);
        return true;
    }

    ()
    {
        this$0 = final_signupdetailslayout;
        val$avatarView = imageview;
        val$avatarText = TextView.this;
        super();
    }
}
