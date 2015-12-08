// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.styles.FsrStyles;
import com.fsr.tracker.util.DisplayUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.fsr.tracker.layouts:
//            InviteView, InviteViewParams, SurveyInviteClickHandler

public class OnExitDetailsView extends InviteView
{
    private class OnExitInviteBodyView extends InviteView.BodyView
    {

        private final TextView bodyTextView;
        private Display display;
        private final EditText editText;
        private final TextView errorText;
        private SurveyInviteClickHandler handler;
        final OnExitDetailsView this$0;
        private final TextView titleText;

        public void setBodyText(String s)
        {
            bodyTextView.setText(s);
        }

        public void setEnabled(boolean flag)
        {
            editText.setFocusable(flag);
            editText.setFocusableInTouchMode(flag);
            editText.setEnabled(flag);
        }

        public void setTitle(String s)
        {
            titleText.setText(s);
        }




        public OnExitInviteBodyView(Context context, String s, String s1, String s2, SurveyInviteClickHandler surveyinviteclickhandler)
        {
            this$0 = OnExitDetailsView.this;
            super(context);
            DisplayUtil displayutil = new DisplayUtil(getResources().getDisplayMetrics());
            display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            handler = surveyinviteclickhandler;
            setOrientation(1);
            surveyinviteclickhandler = new android.widget.TableLayout.LayoutParams(-2, -2);
            setLayoutParams(surveyinviteclickhandler);
            displayutil.setPadding(this, 0, 10, 0, 10);
            titleText = new TextView(context);
            titleText.setText(s);
            FsrStyles.INVITE_TITLE.apply(titleText, viewParams);
            bodyTextView = new TextView(context);
            bodyTextView.setText(s1);
            bodyTextView.setFocusable(true);
            FsrStyles.INVITE_TEXT.apply(bodyTextView, viewParams);
            errorText = new TextView(context);
            errorText.setVisibility(8);
            FsrStyles.INVITE_TEXT.apply(errorText, viewParams);
            displayutil.setPadding(errorText, 5, 0, 0, 0);
            editText = new EditText(context);
            editText.setTag("fs_masked");
            editText.setSingleLine(true);
            editText.setInputType(0x80000);
            editText.setImeOptions(0x80004);
            editText.setHint(s2);
            editText.setTextSize(0, viewParams.getInviteBodyTextSize());
            editText.setOnEditorActionListener(new _cls1());
            editText.addTextChangedListener(new _cls2());
            onexitdetailsview = new android.widget.TableLayout.LayoutParams(-1, -2);
            displayutil.setMargins(OnExitDetailsView.this, 0, 10, 0, 0);
            addView(titleText, surveyinviteclickhandler);
            addView(bodyTextView, surveyinviteclickhandler);
            addView(editText, OnExitDetailsView.this);
            addView(errorText, surveyinviteclickhandler);
        }
    }


    private OnExitInviteBodyView view;

    public OnExitDetailsView(Context context, InviteViewParams inviteviewparams, String s, SurveyInviteClickHandler surveyinviteclickhandler, StringsProvider stringsprovider)
    {
        super(context, inviteviewparams, s, surveyinviteclickhandler, stringsprovider);
    }

    public void clearError()
    {
        view.errorText.setText(null);
        view.errorText.setVisibility(8);
    }

    protected String getAcceptButtonText(StringsProvider stringsprovider)
    {
        return stringsprovider.getOnExitDetailAcceptButtonText();
    }

    protected InviteView.BodyView getBodyView(Context context, StringsProvider stringsprovider)
    {
        if (view == null)
        {
            view = new OnExitInviteBodyView(context, stringsprovider.getOnExitDetailsTitle(), stringsprovider.getOnExitDetailsBody(), stringsprovider.getOnExitHintText(), callback);
        }
        return view;
    }

    protected String getDeclineButtonText(StringsProvider stringsprovider)
    {
        return stringsprovider.getOnExitDetailDeclineButtonText();
    }

    public EditText getEditField()
    {
        return view.editText;
    }

    public void setErrorText(String s)
    {
        view.errorText.setText(s);
        view.errorText.setVisibility(0);
    }

    // Unreferenced inner class com/fsr/tracker/layouts/OnExitDetailsView$OnExitInviteBodyView$1

/* anonymous class */
    class OnExitInviteBodyView._cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final OnExitInviteBodyView this$1;
        final OnExitDetailsView val$this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (handler != null)
            {
                handler.onAccept();
            }
            return false;
        }

            
            {
                this$1 = final_onexitinvitebodyview;
                this$0 = OnExitDetailsView.this;
                super();
            }
    }


    // Unreferenced inner class com/fsr/tracker/layouts/OnExitDetailsView$OnExitInviteBodyView$2

/* anonymous class */
    class OnExitInviteBodyView._cls2
        implements TextWatcher
    {

        final OnExitInviteBodyView this$1;
        final OnExitDetailsView val$this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            Pattern pattern = Pattern.compile("^[\\d]{3}");
            if (Pattern.compile("@").matcher(charsequence).find())
            {
                setAcceptButtonText(stringsProvider.getEmailNotificationSubmit());
                return;
            }
            if (pattern.matcher(charsequence).find())
            {
                setAcceptButtonText(stringsProvider.getTextMessageNotificationSubmit());
                return;
            } else
            {
                setAcceptButtonText(stringsProvider.getOnExitDetailAcceptButtonText());
                return;
            }
        }

            
            {
                this$1 = final_onexitinvitebodyview;
                this$0 = OnExitDetailsView.this;
                super();
            }
    }

}
