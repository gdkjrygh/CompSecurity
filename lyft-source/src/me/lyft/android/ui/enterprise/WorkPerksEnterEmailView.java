// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.WorkPerksAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.LowerCaseTextWatcher;
import me.lyft.android.controls.SimpleTextWatcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.OrganizationJoinDetailsDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public class WorkPerksEnterEmailView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    Binder binder;
    IConstantsProvider constantsProvider;
    ContactsProvider contactsProvider;
    AdvancedEditText emailEditText;
    private GestureDetectorCompat gestureDetectorCompat;
    TextView inlineErrorTxt;
    private OrganizationJoinDetailsDTO joinDetails;
    ILyftApi lyftApi;
    private final EnterpriseScreens.WorkPerksEnterEmailScreen params;
    IProgressController progressController;
    SlideMenuController slideMenuController;
    private SimpleTextWatcher textChangedListener;
    Toolbar toolbar;
    private UserOrganizationDTO userOrganization;
    IViewErrorHandler viewErrorHandler;
    TextView workPerksDescription;
    private String workPerksEmail;
    ScrollView workPerksScrollView;
    Button workPerksSubmitButton;
    TextView workPerksTitle;

    public WorkPerksEnterEmailView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        textChangedListener = new SimpleTextWatcher() {

            final WorkPerksEnterEmailView this$0;

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                inlineErrorTxt.setVisibility(8);
                emailEditText.setTextAppearance(getContext().getApplicationContext(), 0x7f09008b);
                emailEditText.setBackgroundResource(0x7f0201d8);
            }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksEnterEmailScreen)context.a();
    }

    private void handleEmailError(String s)
    {
        inlineErrorTxt.setText(s);
        inlineErrorTxt.setVisibility(0);
        s = inlineErrorTxt.getLayoutParams();
        s.height = -2;
        inlineErrorTxt.setLayoutParams(s);
        emailEditText.setBackgroundResource(0x7f020016);
        emailEditText.setTypeface(emailEditText.getTypeface(), 1);
        emailEditText.setTextColor(getResources().getColor(0x7f0c008f));
        emailEditText.addTextChangedListener(textChangedListener);
    }

    private void setContentViewProperties()
    {
        joinDetails = (OrganizationJoinDetailsDTO)Objects.firstNonNull(((OrganizationDTO)Objects.firstNonNull(params.getUserOrganization().getOrganization(), new OrganizationDTO(null, null, null, null, null, null, null, joinDetails, null))).getJoinDetails(), new OrganizationJoinDetailsDTO(null, null));
        Object obj = constantsProvider.getConstants().getOrganizationJoinHeader();
        String s1 = constantsProvider.getConstants().getOrganizationJoinDescription();
        TextView textview = workPerksTitle;
        String s = ((String) (obj));
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            s = (String)Objects.firstNonNull(joinDetails.getJoinHeader(), "");
        }
        textview.setText(s);
        obj = workPerksDescription;
        if (Strings.isNullOrEmpty(s1))
        {
            s = (String)Objects.firstNonNull(joinDetails.getJoinDescription(), "");
        } else
        {
            s = s1;
        }
        ((TextView) (obj)).setText(s);
        emailEditText.addTextChangedListener(new LowerCaseTextWatcher());
        emailEditText.setValidationMessageView(inlineErrorTxt);
        workPerksScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final WorkPerksEnterEmailView this$0;

            public void onGlobalLayout()
            {
                workPerksScrollView.post(new Runnable() {

                    final _cls4 this$1;

                    public void run()
                    {
                        workPerksScrollView.fullScroll(130);
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
            }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
        });
        gestureDetectorCompat = new GestureDetectorCompat(getContext(), new MyGestureListener());
    }

    private void verifyEmail()
    {
        workPerksEmail = emailEditText.getEditableText().toString();
        boolean flag1 = workPerksEmail.contains("@");
        final AsyncActionAnalytics analytics;
        boolean flag;
        if (workPerksEmail.split("@").length > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        analytics = WorkPerksAnalytics.trackEnterEmailAttempt();
        if (!Boolean.valueOf(flag1).booleanValue() || !Boolean.valueOf(flag).booleanValue() || !workPerksEmail.split("@")[1].contains("."))
        {
            analytics.trackResponseFailure("Client detected Invalid email format");
            handleEmailError(getResources().getString(0x7f07039b));
            return;
        } else
        {
            progressController.disableUI();
            progressController.showProgress();
            binder.bind(lyftApi.createUserOrganization(workPerksEmail).flatMap(new Func1() {

                final WorkPerksEnterEmailView this$0;

                public volatile Object call(Object obj)
                {
                    return call((UserOrganizationDTO)obj);
                }

                public Observable call(UserOrganizationDTO userorganizationdto)
                {
                    userOrganization = userorganizationdto;
                    return contactsProvider.create().emails().phones().companies().observe();
                }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
            }), new AsyncCall() {

                final WorkPerksEnterEmailView this$0;
                final AsyncActionAnalytics val$analytics;

                public void onFail(Throwable throwable)
                {
                    if (throwable instanceof LyftApiException)
                    {
                        Object obj = (LyftApiException)throwable;
                        if (((LyftApiException) (obj)).getStatusCode() == 422)
                        {
                            if (((LyftApiException) (obj)).getValidationErrors().size() > 0)
                            {
                                Object obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)((LyftApiException) (obj)).getValidationErrors().get(0);
                                obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getField();
                                obj1 = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getReason();
                                if (((String) (obj)).equalsIgnoreCase("email"))
                                {
                                    if (((String) (obj1)).equalsIgnoreCase("duplicateAccount"))
                                    {
                                        analytics.trackResponseFailure("duplicateAccount");
                                        handleEmailError(getResources().getString(0x7f070398));
                                        return;
                                    }
                                    if (((String) (obj1)).equalsIgnoreCase("invalidFormat"))
                                    {
                                        analytics.trackResponseFailure("invalidFormat");
                                        handleEmailError(getResources().getString(0x7f07039b));
                                        return;
                                    }
                                    if (((String) (obj1)).equalsIgnoreCase("emailInvalid"))
                                    {
                                        analytics.trackResponseFailure("emailInvalid");
                                        handleEmailError(getResources().getString(0x7f07039a));
                                        return;
                                    } else
                                    {
                                        analytics.trackResponseFailure("general");
                                        handleEmailError(getResources().getString(0x7f070399));
                                        return;
                                    }
                                } else
                                {
                                    analytics.trackResponseFailure("unknown");
                                    viewErrorHandler.handle(throwable);
                                    return;
                                }
                            } else
                            {
                                analytics.trackResponseFailure(throwable);
                                viewErrorHandler.handle(throwable);
                                return;
                            }
                        }
                    }
                    analytics.trackResponseFailure(throwable);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((List)obj);
                }

                public void onSuccess(List list)
                {
                    String s;
                    if (userOrganization.getOrganization() != null)
                    {
                        s = userOrganization.getOrganization().getStatus();
                    } else
                    {
                        s = null;
                    }
                    if (!Strings.isNullOrEmpty(s) && "unverified".equalsIgnoreCase(s))
                    {
                        if (list.isEmpty())
                        {
                            analytics.trackResponseSuccess("Unverified with 0 users");
                            appFlow.replaceWith(new EnterpriseScreens.WorkPerksVerifyEmailScreen(workPerksEmail, userOrganization));
                            return;
                        } else
                        {
                            analytics.trackResponseSuccess(String.format("Unverified with %d users", new Object[] {
                                Integer.valueOf(list.size())
                            }));
                            appFlow.goTo(new EnterpriseScreens.WorkPerksInviteCoworkersViaContactsScreen(workPerksEmail, userOrganization));
                            return;
                        }
                    } else
                    {
                        analytics.trackResponseSuccess(String.format("Verified with %d users", new Object[] {
                            Integer.valueOf(list.size())
                        }));
                        appFlow.replaceWith(new EnterpriseScreens.WorkPerksInviteCoworkersSelectScreen(workPerksEmail, userOrganization));
                        return;
                    }
                }

                public void onUnsubscribe()
                {
                    progressController.enableUI();
                    progressController.hideProgress();
                }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                analytics = asyncactionanalytics;
                super();
            }
            });
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setContentViewProperties();
        toolbar.setTitle(getContext().getString(0x7f0702d4));
        workPerksSubmitButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WorkPerksEnterEmailView this$0;

            public void onClick(View view)
            {
                verifyEmail();
            }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
        });
        binder = Binder.attach(this);
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final WorkPerksEnterEmailView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                Keyboard.hideKeyboard(emailEditText);
            }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
        });
        emailEditText.addTextChangedListener(textChangedListener);
        Keyboard.showKeyboard(emailEditText);
        gestureDetectorCompat.a(new MyGestureListener());
        workPerksScrollView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final WorkPerksEnterEmailView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return gestureDetectorCompat.a(motionevent);
            }

            
            {
                this$0 = WorkPerksEnterEmailView.this;
                super();
            }
        });
        slideMenuController.enableMenu();
    }

    public boolean onBack()
    {
        appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
        emailEditText.removeTextChangedListener(textChangedListener);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }





/*
    static UserOrganizationDTO access$202(WorkPerksEnterEmailView workperksenteremailview, UserOrganizationDTO userorganizationdto)
    {
        workperksenteremailview.userOrganization = userorganizationdto;
        return userorganizationdto;
    }

*/



    private class MyGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final WorkPerksEnterEmailView this$0;

        public boolean onDown(MotionEvent motionevent)
        {
            Keyboard.hideKeyboard(emailEditText);
            return true;
        }

        MyGestureListener()
        {
            this$0 = WorkPerksEnterEmailView.this;
            super();
        }
    }

}
