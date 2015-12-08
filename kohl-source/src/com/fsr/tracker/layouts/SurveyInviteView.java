// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.styles.FsrStyles;
import com.fsr.tracker.util.DisplayUtil;

// Referenced classes of package com.fsr.tracker.layouts:
//            InviteView, InviteViewParams, SurveyInviteClickHandler

public class SurveyInviteView extends InviteView
{
    static class InviteBodyView extends InviteView.BodyView
    {

        private final TextView bodyTextView;
        private Display display;
        private final TextView titleText;
        private InviteViewParams viewParams;

        public void setBodyText(String s)
        {
            bodyTextView.setText(s);
        }

        public void setTitle(String s)
        {
            titleText.setText(s);
        }

        public InviteBodyView(Context context, InviteViewParams inviteviewparams, String s, String s1)
        {
            super(context);
            viewParams = inviteviewparams;
            DisplayUtil displayutil = new DisplayUtil(getResources().getDisplayMetrics());
            display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            setOrientation(1);
            android.widget.TableLayout.LayoutParams layoutparams = new android.widget.TableLayout.LayoutParams(-2, -2);
            setLayoutParams(layoutparams);
            displayutil.setPadding(this, 0, 10, 0, 10);
            titleText = new TextView(context);
            titleText.setText(s);
            FsrStyles.INVITE_TITLE.apply(titleText, inviteviewparams);
            bodyTextView = new TextView(context);
            bodyTextView.setText(s1);
            FsrStyles.INVITE_TEXT.apply(bodyTextView, inviteviewparams);
            addView(titleText, layoutparams);
            addView(bodyTextView, layoutparams);
        }
    }


    public SurveyInviteView(Context context, InviteViewParams inviteviewparams, String s, SurveyInviteClickHandler surveyinviteclickhandler, StringsProvider stringsprovider)
    {
        super(context, inviteviewparams, s, surveyinviteclickhandler, stringsprovider);
    }

    protected String getAcceptButtonText(StringsProvider stringsprovider)
    {
        return stringsprovider.getAcceptButtonText();
    }

    protected InviteView.BodyView getBodyView(Context context, StringsProvider stringsprovider)
    {
        return new InviteBodyView(context, viewParams, stringsprovider.getInviteTitle(), stringsprovider.getInviteText());
    }

    protected String getDeclineButtonText(StringsProvider stringsprovider)
    {
        return stringsprovider.getDeclineButtonText();
    }
}
