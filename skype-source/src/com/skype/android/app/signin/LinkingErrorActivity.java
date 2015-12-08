// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;

public abstract class LinkingErrorActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    public static final int ACTION_CANCEL_START_AGAIN = 6;
    public static final int ACTION_PROBLEMS_SIGN_IN = 3;
    public static final int ACTION_SKIP_LINKING = 2;
    public static final int ACTION_TRY_AGAIN = 1;
    public static final int ACTION_TRY_DIFF_ACCOUNT = 0;
    public static final int ACTION_USE_DIFF_MSA = 4;
    public static final int ACTION_VISIT_SKYPE_SUPPORT = 5;
    public static final String EXTRA_CLICKED_ACTION = "clickedAction";
    AccessibilityUtil accessibility;
    ViewGroup actionContainer;
    Button actionLink;
    TextView errorHint;
    TextView errorMessage;
    Button firstBtn;
    ViewGroup firstBtnContainer;
    ViewGroup hintContainer;
    LayoutExperience layoutExperience;
    ViewGroup messageContainer;
    Button secondBtn;
    ViewGroup secondBtnContainer;

    public LinkingErrorActivity()
    {
    }

    public abstract void onClick(View view);

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (!layoutExperience.isMultipane())
        {
            setRequestedOrientation(7);
        }
        if (accessibility.a())
        {
            messageContainer.post(accessibility.a(messageContainer, errorMessage, 12));
            accessibility.a(messageContainer);
            hintContainer.post(accessibility.a(hintContainer, errorHint, 12));
            accessibility.a(hintContainer);
            firstBtnContainer.post(accessibility.a(firstBtnContainer, firstBtn, 13));
            accessibility.a(firstBtnContainer);
            secondBtnContainer.post(accessibility.a(secondBtnContainer, secondBtn, 12));
            accessibility.a(secondBtnContainer);
            actionContainer.post(accessibility.a(actionContainer, actionLink, 1));
            accessibility.a(actionContainer);
        }
        ViewUtil.a(this, new View[] {
            firstBtn, secondBtn, actionLink
        });
    }
}
