// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.drawables.InvitationBackground;
import com.fsr.tracker.drawables.RoundedRectBackground;
import com.fsr.tracker.styles.FsrColor;
import com.fsr.tracker.styles.FsrStyles;
import com.fsr.tracker.util.DisplayUtil;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fsr.tracker.layouts:
//            InviteViewParams, SurveyInviteClickHandler

public abstract class InviteView extends LinearLayout
{
    static abstract class BodyView extends TableLayout
    {

        public abstract void setBodyText(String s);

        public void setEnabled(boolean flag)
        {
        }

        public abstract void setTitle(String s);

        public BodyView(Context context)
        {
            super(context);
        }
    }

    protected static class InviteButtonsView extends LinearLayout
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

        public InviteButtonsView(Context context, InviteViewParams inviteviewparams, String s, String s1, SurveyInviteClickHandler surveyinviteclickhandler)
        {
            super(context);
            viewParams = inviteviewparams;
            DisplayUtil displayutil = new DisplayUtil(getResources().getDisplayMetrics());
            display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            displayutil.setPadding(this, 0, 0, 0, 10);
            setLayoutParams(layoutparams);
            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F);
            layoutparams = new android.widget.LinearLayout.LayoutParams(layoutparams1);
            layoutparams.weight = 1.0F;
            displayutil.setMargins(layoutparams, 0, 0, 5, 0);
            layoutparams1 = new android.widget.LinearLayout.LayoutParams(layoutparams1);
            displayutil.setMargins(layoutparams1, 5, 0, 0, 0);
            layoutparams1.weight = 1.0F;
            noButton = new Button(context);
            noButton.setOnClickListener(surveyinviteclickhandler. new _cls1());
            noButton.setText(s1);
            noButton.setLayoutParams(layoutparams);
            noButton.setBackgroundDrawable(new RoundedRectBackground(displayutil.toDP(5), displayutil.toDP(1), FsrColor.WHITE.getColor(), FsrColor.GREY.getColor(), FsrColor.BORDER_GREY.getColor(), FsrColor.DARK_GREY_TRANSPARENT.getColor()));
            FsrStyles.BUTTON_TEXT.apply(noButton, inviteviewparams);
            yesButton = new Button(context);
            yesButton.setOnClickListener(surveyinviteclickhandler. new _cls2());
            yesButton.setText(s);
            yesButton.setLayoutParams(layoutparams1);
            yesButton.setBackgroundDrawable(new RoundedRectBackground(displayutil.toDP(5), displayutil.toDP(1), FsrColor.GREEN_HIGHLIGHT.getColor(), FsrColor.GREEN.getColor(), FsrColor.BORDER_GREY.getColor(), FsrColor.DARK_GREY_TRANSPARENT.getColor()));
            FsrStyles.BUTTON_TEXT_LIGHT.apply(yesButton, inviteviewparams);
            addView(noButton);
            addView(yesButton);
        }
    }

    protected class InviteFooterView extends LinearLayout
    {

        TextView footerText;
        final InviteView this$0;

        public InviteFooterView(Context context)
        {
            this$0 = InviteView.this;
            super(context);
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            RelativeLayout relativelayout = new RelativeLayout(context);
            footerText = new TextView(context);
            Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
            footerText.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            footerText.setText(stringsProvider.getConductedByText());
            FsrStyles.INVITE_TEXT.apply(footerText, viewParams);
            obj = new ImageView(context);
            inviteview = new android.widget.RelativeLayout.LayoutParams(-2, viewParams.getTrustELogoHeight());
            addRule(11);
            ((ImageView) (obj)).setLayoutParams(InviteView.this);
            ((ImageView) (obj)).setImageBitmap(InviteView.loadBitmap("images/truste_logo.png", getClass().getClassLoader(), context));
            ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.FIT_END);
            relativelayout.addView(footerText);
            relativelayout.addView(((View) (obj)));
            addView(relativelayout);
        }
    }

    protected static class InviteHeaderView extends LinearLayout
    {

        private InviteViewParams viewParams;

        public InviteHeaderView(InviteViewParams inviteviewparams, String s, Context context)
        {
            super(context);
            Object obj = new DisplayUtil(getResources().getDisplayMetrics());
            setGravity(48);
            setOrientation(0);
            Object obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            ((DisplayUtil) (obj)).setMargins(((android.widget.LinearLayout.LayoutParams) (obj1)), 0, 10, 0, 0);
            setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            obj1 = new RelativeLayout(context);
            ImageView imageview = new ImageView(context);
            int i = inviteviewparams.getForeSeeLogoHeight();
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, i);
            layoutparams.addRule(9);
            obj = "custom_logo.png";
            inviteviewparams = ((InviteViewParams) (obj));
            if (s != null)
            {
                inviteviewparams = ((InviteViewParams) (obj));
                if (s.length() != 0)
                {
                    inviteviewparams = s;
                }
            }
            imageview.setLayoutParams(layoutparams);
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
            imageview.setPadding(0, 0, 0, 0);
            imageview.setImageBitmap(InviteView.loadBitmap(inviteviewparams, getClass().getClassLoader(), context));
            inviteviewparams = new ImageView(context);
            s = new android.widget.RelativeLayout.LayoutParams(-2, i);
            s.addRule(11);
            inviteviewparams.setLayoutParams(s);
            inviteviewparams.setScaleType(android.widget.ImageView.ScaleType.FIT_END);
            inviteviewparams.setImageBitmap(InviteView.loadBitmap("images/foresee_logo.png", getClass().getClassLoader(), context));
            ((RelativeLayout) (obj1)).addView(imageview);
            ((RelativeLayout) (obj1)).addView(inviteviewparams);
            addView(((View) (obj1)));
        }
    }


    protected int alternateOrientationWidth;
    private final InviteButtonsView buttonsView;
    protected SurveyInviteClickHandler callback;
    protected int defaultOrientationWidth;
    private Display display;
    protected final DisplayUtil displayUtil = new DisplayUtil(getResources().getDisplayMetrics());
    private final InviteFooterView footerView;
    protected BodyView inviteBodyView;
    private final LinearLayout inviteLayout;
    protected final android.widget.LinearLayout.LayoutParams inviteLayoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
    protected StringsProvider stringsProvider;
    protected InviteViewParams viewParams;

    public InviteView(Context context, InviteViewParams inviteviewparams, String s, SurveyInviteClickHandler surveyinviteclickhandler, StringsProvider stringsprovider)
    {
        super(context);
        viewParams = inviteviewparams;
        defaultOrientationWidth = inviteviewparams.getDefaultOrientationWidth();
        alternateOrientationWidth = inviteviewparams.getAlternateOrientationWidth();
        display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        callback = surveyinviteclickhandler;
        stringsProvider = stringsprovider;
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        setGravity(17);
        layoutparams.gravity = 17;
        setLayoutParams(layoutparams);
        setBackgroundColor(FsrColor.BLACK_TRANSPARENT.getColor());
        inviteLayoutParams.gravity = 17;
        inviteLayoutParams.height = -2;
        float f;
        float f1;
        int i;
        if (context.getResources().getConfiguration().orientation == InviteViewParams.getDeviceDefaultOrientation(display, getResources().getConfiguration()))
        {
            inviteLayoutParams.width = defaultOrientationWidth;
        } else
        {
            inviteLayoutParams.width = alternateOrientationWidth;
        }
        inviteLayout = new LinearLayout(context);
        inviteLayout.setLayoutParams(inviteLayoutParams);
        inviteLayout.setOrientation(1);
        f = displayUtil.toDP(10);
        f1 = displayUtil.toDP(5);
        inviteLayout.setBackgroundDrawable(new InvitationBackground(f, f1));
        i = inviteviewparams.getInviteMargin();
        displayUtil.setPadding(inviteLayout, i, i, i, i);
        s = new InviteHeaderView(inviteviewparams, s, context);
        inviteLayout.addView(s);
        inviteBodyView = getBodyView(context, stringsprovider);
        inviteLayout.addView(inviteBodyView);
        buttonsView = new InviteButtonsView(context, inviteviewparams, getAcceptButtonText(stringsprovider), getDeclineButtonText(stringsprovider), surveyinviteclickhandler);
        inviteLayout.addView(buttonsView);
        footerView = new InviteFooterView(context);
        context = new android.widget.LinearLayout.LayoutParams(-1, -2);
        inviteLayout.addView(footerView, context);
        addView(inviteLayout);
    }

    private static Bitmap loadBitmap(String s, ClassLoader classloader, Context context)
    {
        Object obj;
        int i;
        try
        {
            obj = classloader.getResourceAsStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        classloader = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        classloader = BitmapFactory.decodeStream(((InputStream) (obj)));
        ((InputStream) (obj)).close();
        obj = classloader;
        if (classloader != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s = s.substring(0, s.indexOf("."));
        i = context.getResources().getIdentifier(s, "drawable", context.getPackageName());
        obj = classloader;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s = context.getResources().openRawResource(i);
        obj = classloader;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = BitmapFactory.decodeStream(s);
        s.close();
        return ((Bitmap) (obj));
    }

    public void disable()
    {
        buttonsView.setEnabled(false);
        inviteBodyView.setEnabled(false);
    }

    public void enable()
    {
        buttonsView.setEnabled(true);
        inviteBodyView.setEnabled(true);
    }

    protected abstract String getAcceptButtonText(StringsProvider stringsprovider);

    protected abstract BodyView getBodyView(Context context, StringsProvider stringsprovider);

    protected abstract String getDeclineButtonText(StringsProvider stringsprovider);

    public void onOrientationChanged(int i)
    {
        if (i == InviteViewParams.getDeviceDefaultOrientation(display, getResources().getConfiguration()))
        {
            inviteLayoutParams.width = defaultOrientationWidth;
            return;
        } else
        {
            inviteLayoutParams.width = alternateOrientationWidth;
            return;
        }
    }

    protected void setAcceptButtonText(String s)
    {
        buttonsView.setYesButtonText(s);
    }

    public void setBody(String s)
    {
        inviteBodyView.setBodyText(s);
    }

    public void setTitle(String s)
    {
        inviteBodyView.setTitle(s);
    }


    // Unreferenced inner class com/fsr/tracker/layouts/InviteView$InviteButtonsView$1

/* anonymous class */
    class InviteButtonsView._cls1
        implements android.view.View.OnClickListener
    {

        final InviteButtonsView this$0;
        final SurveyInviteClickHandler val$handler;

        public void onClick(View view)
        {
            handler.onDecline();
        }

            
            {
                this$0 = final_invitebuttonsview;
                handler = SurveyInviteClickHandler.this;
                super();
            }
    }


    // Unreferenced inner class com/fsr/tracker/layouts/InviteView$InviteButtonsView$2

/* anonymous class */
    class InviteButtonsView._cls2
        implements android.view.View.OnClickListener
    {

        final InviteButtonsView this$0;
        final SurveyInviteClickHandler val$handler;

        public void onClick(View view)
        {
            handler.onAccept();
        }

            
            {
                this$0 = final_invitebuttonsview;
                handler = SurveyInviteClickHandler.this;
                super();
            }
    }

}
