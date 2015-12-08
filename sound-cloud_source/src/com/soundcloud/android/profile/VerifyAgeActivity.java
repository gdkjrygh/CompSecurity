// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.profile:
//            VerifyAgePresenter, UpdateAgeCommand

public class VerifyAgeActivity extends ScActivity
{

    static final String EXTRA_USER_TO_FOLLOW_URN = "userToFollowUrn";
    BaseLayoutHelper baseLayoutHelper;
    VerifyAgePresenter presenter;
    UpdateAgeCommand updateAgeCommand;

    public VerifyAgeActivity()
    {
    }

    public static Intent getIntent(Context context, Urn urn)
    {
        return (new Intent(context, com/soundcloud/android/profile/VerifyAgeActivity)).putExtra("userToFollowUrn", urn);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        presenter.onCreate(this, bundle);
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }
}
