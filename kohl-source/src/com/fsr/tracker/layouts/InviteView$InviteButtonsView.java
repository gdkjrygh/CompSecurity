// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.fsr.tracker.drawables.RoundedRectBackground;
import com.fsr.tracker.styles.FsrColor;
import com.fsr.tracker.styles.FsrStyles;
import com.fsr.tracker.util.DisplayUtil;

// Referenced classes of package com.fsr.tracker.layouts:
//            InviteView, InviteViewParams, SurveyInviteClickHandler

protected static class yesButton extends LinearLayout
{

    private Display display;
    private final Button noButton;
    private InviteViewParams viewParams;
    private final Button yesButton;

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        noButton.setEnabled(flag);
        yesButton.setEnabled(flag);
    }

    public void setYesButtonText(String s)
    {
        yesButton.setText(s);
    }

    public _cls2.val.handler(Context context, InviteViewParams inviteviewparams, String s, String s1, final SurveyInviteClickHandler handler)
    {
        super(context);
        viewParams = inviteviewparams;
        DisplayUtil displayutil = new DisplayUtil(getResources().getDisplayMetrics());
        display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        setOrientation(0);
        android.widget.dler dler = new android.widget.it>(-1, -2);
        displayutil.setPadding(this, 0, 0, 0, 10);
        setLayoutParams(dler);
        android.widget.dler dler1 = new android.widget.it>(-2, -2, 1.0F);
        dler = new android.widget.it>(dler1);
        dler.ght = 1.0F;
        displayutil.setMargins(dler, 0, 0, 5, 0);
        dler1 = new android.widget.it>(dler1);
        displayutil.setMargins(dler1, 5, 0, 0, 0);
        dler1.ght = 1.0F;
        noButton = new Button(context);
        noButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InviteView.InviteButtonsView this$0;
            final SurveyInviteClickHandler val$handler;

            public void onClick(View view)
            {
                handler.onDecline();
            }

            
            {
                this$0 = InviteView.InviteButtonsView.this;
                handler = surveyinviteclickhandler;
                super();
            }
        });
        noButton.setText(s1);
        noButton.setLayoutParams(dler);
        noButton.setBackgroundDrawable(new RoundedRectBackground(displayutil.toDP(5), displayutil.toDP(1), FsrColor.WHITE.getColor(), FsrColor.GREY.getColor(), FsrColor.BORDER_GREY.getColor(), FsrColor.DARK_GREY_TRANSPARENT.getColor()));
        FsrStyles.BUTTON_TEXT.T(noButton, inviteviewparams);
        yesButton = new Button(context);
        yesButton.setOnClickListener(new android.view.View.OnClickListener() {

            final InviteView.InviteButtonsView this$0;
            final SurveyInviteClickHandler val$handler;

            public void onClick(View view)
            {
                handler.onAccept();
            }

            
            {
                this$0 = InviteView.InviteButtonsView.this;
                handler = surveyinviteclickhandler;
                super();
            }
        });
        yesButton.setText(s);
        yesButton.setLayoutParams(dler1);
        yesButton.setBackgroundDrawable(new RoundedRectBackground(displayutil.toDP(5), displayutil.toDP(1), FsrColor.GREEN_HIGHLIGHT.getColor(), FsrColor.GREEN.getColor(), FsrColor.BORDER_GREY.getColor(), FsrColor.DARK_GREY_TRANSPARENT.getColor()));
        FsrStyles.BUTTON_TEXT_LIGHT.T(yesButton, inviteviewparams);
        addView(noButton);
        addView(yesButton);
    }
}
