// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import a.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.profile:
//            BirthdayInfo, UpdateAgeCommand

public class VerifyAgePresenter extends DefaultActivityLightCycle
{

    private Activity activity;
    private final EngagementsTracking engagementsTracking;
    private final NextFollowingOperations followingOperations;
    Button submitButton;
    private final UpdateAgeCommand updateAgeCommand;
    private Urn userToFollowUrn;
    EditText yearInput;

    VerifyAgePresenter(UpdateAgeCommand updateagecommand, NextFollowingOperations nextfollowingoperations, EngagementsTracking engagementstracking)
    {
        updateAgeCommand = updateagecommand;
        followingOperations = nextfollowingoperations;
        engagementsTracking = engagementstracking;
    }

    private int getAge()
    {
        return (int)ScTextUtils.safeParseLong(yearInput.getText().toString());
    }

    private void maybeEnableSubmitButton()
    {
        Button button = submitButton;
        boolean flag;
        if (yearInput.getText().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    private DefaultSubscriber updateResponseHandler()
    {
        return new _cls1();
    }

    public void onCreate(Activity activity1, Bundle bundle)
    {
        activity = activity1;
        activity1.setContentView(0x7f0300dc);
        a.a(this, activity1);
        userToFollowUrn = (Urn)activity1.getIntent().getParcelableExtra("userToFollowUrn");
        submitButton.setEnabled(false);
        yearInput.requestFocus();
    }

    public void submitButtonListener()
    {
        submitButton.setEnabled(false);
        updateAgeCommand.call(BirthdayInfo.buildFrom(getAge()), updateResponseHandler());
    }

    public void yearTextListener()
    {
        maybeEnableSubmitButton();
    }





    private class _cls1 extends DefaultSubscriber
    {

        final VerifyAgePresenter this$0;

        public void onNext(Boolean boolean1)
        {
            fireAndForget(followingOperations.toggleFollowing(userToFollowUrn, true));
            engagementsTracking.followUserUrn(userToFollowUrn, true);
            activity.finish();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Boolean)obj);
        }

        _cls1()
        {
            this$0 = VerifyAgePresenter.this;
            super();
        }
    }

}
