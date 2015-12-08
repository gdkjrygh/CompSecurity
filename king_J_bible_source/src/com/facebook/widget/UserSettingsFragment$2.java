// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.internal.ImageResponse;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            UserSettingsFragment

class this._cls0
    implements com.facebook.internal.is._cls0
{

    final UserSettingsFragment this$0;

    public void onCompleted(ImageResponse imageresponse)
    {
        UserSettingsFragment.access$7(UserSettingsFragment.this, UserSettingsFragment.access$6(UserSettingsFragment.this).getId(), imageresponse);
    }

    ()
    {
        this$0 = UserSettingsFragment.this;
        super();
    }
}
