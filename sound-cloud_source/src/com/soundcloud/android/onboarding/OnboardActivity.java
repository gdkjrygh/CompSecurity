// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.accounts.AccountAuthenticatorResponse;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewStub;
import com.facebook.internal.Y;
import com.facebook.internal.m;
import com.facebook.j;
import com.facebook.login.o;
import com.facebook.p;
import com.facebook.s;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.dialog.ImageAlertDialog;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.onboarding.auth.AcceptTermsLayout;
import com.soundcloud.android.onboarding.auth.AddUserInfoTaskFragment;
import com.soundcloud.android.onboarding.auth.GooglePlusSignInTaskFragment;
import com.soundcloud.android.onboarding.auth.LoginLayout;
import com.soundcloud.android.onboarding.auth.LoginTaskFragment;
import com.soundcloud.android.onboarding.auth.RecoverActivity;
import com.soundcloud.android.onboarding.auth.SignupBasicsLayout;
import com.soundcloud.android.onboarding.auth.SignupDetailsLayout;
import com.soundcloud.android.onboarding.auth.SignupLog;
import com.soundcloud.android.onboarding.auth.SignupMethodLayout;
import com.soundcloud.android.onboarding.auth.SignupTaskFragment;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.onboarding.auth.TokenInformationGenerator;
import com.soundcloud.android.profile.BirthdayInfo;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.util.AnimUtils;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.onboarding:
//            ActivityResult, FacebookSessionCallback, TourPhotoPagerAdapter, PhotoLoadHandler, 
//            SpamDialogOnClickListener

public class OnboardActivity extends FragmentActivity
    implements FacebookSessionCallback.FacebookLoginCallbacks, com.soundcloud.android.onboarding.auth.AcceptTermsLayout.AcceptTermsHandler, com.soundcloud.android.onboarding.auth.AuthTaskFragment.OnAuthResultListener, com.soundcloud.android.onboarding.auth.GenderPickerDialogFragment.CallbackProvider, com.soundcloud.android.onboarding.auth.LoginLayout.LoginHandler, com.soundcloud.android.onboarding.auth.SignupBasicsLayout.SignUpBasicsHandler, com.soundcloud.android.onboarding.auth.SignupDetailsLayout.UserDetailsHandler, com.soundcloud.android.onboarding.auth.SignupMethodLayout.SignUpMethodHandler
{
    protected static final class OnboardingState extends Enum
    {

        private static final OnboardingState $VALUES[];
        public static final OnboardingState ACCEPT_TERMS;
        public static final OnboardingState LOGIN;
        public static final OnboardingState PHOTOS;
        public static final OnboardingState SIGN_UP_BASICS;
        public static final OnboardingState SIGN_UP_DETAILS;
        public static final OnboardingState SIGN_UP_METHOD;

        public static OnboardingState valueOf(String s1)
        {
            return (OnboardingState)Enum.valueOf(com/soundcloud/android/onboarding/OnboardActivity$OnboardingState, s1);
        }

        public static OnboardingState[] values()
        {
            return (OnboardingState[])$VALUES.clone();
        }

        static 
        {
            PHOTOS = new OnboardingState("PHOTOS", 0);
            LOGIN = new OnboardingState("LOGIN", 1);
            SIGN_UP_METHOD = new OnboardingState("SIGN_UP_METHOD", 2);
            SIGN_UP_BASICS = new OnboardingState("SIGN_UP_BASICS", 3);
            SIGN_UP_DETAILS = new OnboardingState("SIGN_UP_DETAILS", 4);
            ACCEPT_TERMS = new OnboardingState("ACCEPT_TERMS", 5);
            $VALUES = (new OnboardingState[] {
                PHOTOS, LOGIN, SIGN_UP_METHOD, SIGN_UP_BASICS, SIGN_UP_DETAILS, ACCEPT_TERMS
            });
        }

        private OnboardingState(String s1, int i)
        {
            super(s1, i);
        }
    }


    private static final String BUNDLE_ACCEPT_TERMS = "BUNDLE_ACCEPT_TERMS";
    private static final String BUNDLE_LOGIN = "BUNDLE_LOGIN";
    private static final String BUNDLE_SIGN_UP_BASICS = "BUNDLE_SIGN_UP_BASICS";
    private static final String BUNDLE_SIGN_UP_DETAILS = "BUNDLE_SIGN_UP_DETAILS";
    private static final String BUNDLE_STATE = "BUNDLE_STATE";
    private static final String BUNDLE_USER = "BUNDLE_USER";
    public static final String EXTRA_DEEPLINK_URN = "EXTRA_URN";
    private static final String LAST_GOOGLE_ACCT_USED = "BUNDLE_LAST_GOOGLE_ACCOUNT_USED";
    private static final String LOGIN_DIALOG_TAG = "login_dialog";
    private static final String SIGNUP_DIALOG_TAG = "signup_dialog";
    private Bundle acceptTermsBundle;
    private AcceptTermsLayout acceptTermsLayout;
    private AccountAuthenticatorResponse accountAuthenticatorResponse;
    private ActivityResult activityResult;
    ApplicationProperties applicationProperties;
    BugReporter bugReporter;
    ConfigurationManager configurationManager;
    EventBus eventBus;
    j facebookCallbackManager;
    o facebookLoginManager;
    s facebookSdk;
    private final android.view.animation.Animation.AnimationListener hideScrollViewListener;
    private OnboardingState lastAuthState;
    private String lastGoogleAccountSelected;
    private Bundle loginBundle;
    private LoginLayout loginLayout;
    Navigator navigator;
    OAuth oauth;
    PublicApi oldCloudAPI;
    private final android.view.View.OnClickListener onLoginButtonClick;
    private final android.view.View.OnClickListener onSignupButtonClick;
    private final android.support.v4.view.ViewPager.OnPageChangeListener onTourPageChange;
    private View overlayBg;
    private View overlayHolder;
    private View photoBottomBar;
    private View photoLogo;
    private ViewPager photoPager;
    private TourPhotoPagerAdapter photosAdapter;
    private Urn resourceUrn;
    protected Bundle resultBundle;
    private Bundle signUpBasicsBundle;
    private SignupBasicsLayout signUpBasicsLayout;
    private Bundle signUpDetailsBundle;
    private SignupDetailsLayout signUpDetailsLayout;
    private SignupMethodLayout signUpMethodLayout;
    private OnboardingState state;
    TokenInformationGenerator tokenUtils;
    private PublicApiUser user;

    public OnboardActivity()
    {
        onTourPageChange = new _cls1();
        state = OnboardingState.PHOTOS;
        activityResult = ActivityResult.empty();
        hideScrollViewListener = new _cls2();
        resourceUrn = Urn.NOT_SET;
        onLoginButtonClick = new _cls3();
        onSignupButtonClick = new _cls4();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    OnboardActivity(ConfigurationManager configurationmanager, BugReporter bugreporter, EventBus eventbus, TokenInformationGenerator tokeninformationgenerator, Navigator navigator1, s s1, o o1, 
            j j1)
    {
        onTourPageChange = new _cls1();
        state = OnboardingState.PHOTOS;
        activityResult = ActivityResult.empty();
        hideScrollViewListener = new _cls2();
        resourceUrn = Urn.NOT_SET;
        onLoginButtonClick = new _cls3();
        onSignupButtonClick = new _cls4();
        configurationManager = configurationmanager;
        bugReporter = bugreporter;
        eventBus = eventbus;
        tokenUtils = tokeninformationgenerator;
        navigator = navigator1;
        facebookSdk = s1;
        facebookLoginManager = o1;
        facebookCallbackManager = j1;
    }

    private void addFeedbackButton(android.support.v7.app.AlertDialog.Builder builder)
    {
        if (applicationProperties.shouldAllowFeedback())
        {
            builder.setNeutralButton(0x7f070202, new _cls10());
        }
    }

    private void buildPhotoPager(PagerAdapter pageradapter)
    {
        photoPager.setAdapter(pageradapter);
        photoPager.setCurrentItem(0);
        photoPager.setOnPageChangeListener(onTourPageChange);
    }

    private void checkForDeviceConflict()
    {
        if (configurationManager.shouldDisplayDeviceConflict())
        {
            showDeviceConflictLogoutDialog();
            configurationManager.clearDeviceConflict();
        }
    }

    private android.support.v7.app.AlertDialog.Builder createDefaultAuthErrorDialogBuilder(int i)
    {
        return (new android.support.v7.app.AlertDialog.Builder(this)).setTitle(getString(i)).setIconAttribute(0x1010355);
    }

    private void createNewUserFromEmail(Bundle bundle)
    {
        SignupTaskFragment.create(bundle).show(getSupportFragmentManager(), "signup_dialog");
    }

    private void createNewUserFromFacebook()
    {
        facebookLoginManager.a(this, FacebookSessionCallback.DEFAULT_FACEBOOK_READ_PERMISSIONS);
    }

    private void createNewUserFromGooglePlus(Bundle bundle)
    {
        GooglePlusSignInTaskFragment.create(bundle).show(getSupportFragmentManager(), "signup_dialog");
    }

    private void doSafeActivityResultActions(ActivityResult activityresult)
    {
        int i;
        int k;
        i = activityresult.requestCode;
        k = activityresult.resultCode;
        activityresult = activityresult.intent;
        if (s.a(i))
        {
            facebookCallbackManager.a(i, k, activityresult);
        }
        i;
        JVM INSTR lookupswitch 6: default 96
    //                   6709: 130
    //                   8002: 147
    //                   8003: 224
    //                   8004: 230
    //                   9000: 97
    //                   9001: 114;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_230;
_L8:
        return;
_L6:
        if (getSignUpDetailsLayout() != null)
        {
            getSignUpDetailsLayout().onImagePick(k, activityresult);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (getSignUpDetailsLayout() != null)
        {
            getSignUpDetailsLayout().onImageTake(k);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (getSignUpDetailsLayout() != null)
        {
            getSignUpDetailsLayout().onImageCrop(k, activityresult);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (k == -1 && activityresult != null)
        {
            if (activityresult.getBooleanExtra("success", false))
            {
                AndroidUtils.showToast(this, 0x7f07009c, new Object[0]);
                return;
            }
            activityresult = activityresult.getStringExtra("error");
            if (activityresult == null)
            {
                activityresult = getString(0x7f070098);
            } else
            {
                activityresult = getString(0x7f070099, new Object[] {
                    activityresult
                });
            }
            AndroidUtils.showToast(this, activityresult);
            return;
        }
        if (true) goto _L8; else goto _L4
_L4:
        onGoogleActivityResult(k);
        return;
        onGoogleActivityResult(k);
        return;
    }

    private AcceptTermsLayout getAcceptTermsLayout()
    {
        if (acceptTermsLayout == null)
        {
            acceptTermsLayout = (AcceptTermsLayout)((ViewStub)findViewById(0x7f0f024d)).inflate();
            acceptTermsLayout.setAcceptTermsHandler(this);
            acceptTermsLayout.setState(acceptTermsBundle);
            acceptTermsLayout.setVisibility(8);
        }
        return acceptTermsLayout;
    }

    private SoundCloudApplication getApp()
    {
        return (SoundCloudApplication)getApplication();
    }

    private LoginLayout getLoginLayout()
    {
        if (loginLayout == null)
        {
            loginLayout = (LoginLayout)((ViewStub)findViewById(0x7f0f0249)).inflate();
            loginLayout.setLoginHandler(this);
            loginLayout.setVisibility(8);
            loginLayout.setStateFromBundle(loginBundle);
            loginLayout.setGooglePlusVisibility(applicationProperties.isGooglePlusEnabled());
        }
        return loginLayout;
    }

    private SignupBasicsLayout getSignUpBasicsLayout()
    {
        if (signUpBasicsLayout == null)
        {
            signUpBasicsLayout = (SignupBasicsLayout)((ViewStub)findViewById(0x7f0f024b)).inflate();
            signUpBasicsLayout.setSignUpHandler(this);
            signUpBasicsLayout.setVisibility(8);
            signUpBasicsLayout.setStateFromBundle(signUpBasicsBundle);
        }
        return signUpBasicsLayout;
    }

    private SignupDetailsLayout getSignUpDetailsLayout()
    {
        if (signUpDetailsLayout == null)
        {
            signUpDetailsLayout = (SignupDetailsLayout)((ViewStub)findViewById(0x7f0f024c)).inflate();
            signUpDetailsLayout.setUserDetailsHandler(this);
            signUpDetailsLayout.setVisibility(8);
            signUpDetailsLayout.setState(signUpDetailsBundle);
        }
        return signUpDetailsLayout;
    }

    private SignupMethodLayout getSignUpMethodLayout()
    {
        if (signUpMethodLayout == null)
        {
            signUpMethodLayout = (SignupMethodLayout)((ViewStub)findViewById(0x7f0f024a)).inflate();
            signUpMethodLayout.setSignUpMethodHandler(this);
            signUpMethodLayout.setVisibility(8);
            signUpMethodLayout.setGooglePlusVisibility(applicationProperties.isGooglePlusEnabled());
        }
        return signUpMethodLayout;
    }

    private void hideViews(OnboardingState onboardingstate, boolean flag)
    {
        if (onboardingstate != OnboardingState.LOGIN && loginLayout != null)
        {
            AnimUtils.hideView(loginLayout, flag);
        }
        if (onboardingstate != OnboardingState.SIGN_UP_METHOD && signUpMethodLayout != null)
        {
            AnimUtils.hideView(signUpMethodLayout, flag);
        }
        if (onboardingstate != OnboardingState.SIGN_UP_BASICS && signUpBasicsLayout != null)
        {
            AnimUtils.hideView(signUpBasicsLayout, flag);
        }
        if (onboardingstate != OnboardingState.SIGN_UP_DETAILS && signUpDetailsLayout != null)
        {
            AnimUtils.hideView(signUpDetailsLayout, flag);
        }
        if (onboardingstate != OnboardingState.ACCEPT_TERMS && acceptTermsLayout != null)
        {
            AnimUtils.hideView(acceptTermsLayout, flag);
        }
    }

    private void login(Bundle bundle)
    {
        LoginTaskFragment.create(bundle).show(getSupportFragmentManager(), "login_dialog");
    }

    private void onGoogleAccountSelected(String s1)
    {
        lastGoogleAccountSelected = s1;
        proposeTermsOfUse(SignupVia.GOOGLE_PLUS, GooglePlusSignInTaskFragment.getParams(s1, 8003));
    }

    private void onGoogleActivityResult(int i)
    {
        if (i == -1)
        {
            createNewUserFromGooglePlus(GooglePlusSignInTaskFragment.getParams(lastGoogleAccountSelected, 8003));
        }
    }

    private void onHideOverlay(boolean flag)
    {
        AnimUtils.showView(photoBottomBar, flag);
        AnimUtils.showView(photoLogo, flag);
        AnimUtils.hideView(overlayBg, flag);
        photosAdapter.hideViewsOfLayout(photoPager.getCurrentItem());
        if (flag && overlayHolder.getVisibility() == 0)
        {
            AnimUtils.hideView(overlayHolder, hideScrollViewListener);
            return;
        } else
        {
            hideScrollViewListener.onAnimationEnd(null);
            return;
        }
    }

    private void proposeTermsOfUse(SignupVia signupvia, Bundle bundle)
    {
        getAcceptTermsLayout().setSignupParams(signupvia, bundle);
        setState(OnboardingState.ACCEPT_TERMS);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_TERMS));
    }

    private void setButtonListeners()
    {
        findViewById(0x7f0f0267).setOnClickListener(onLoginButtonClick);
        findViewById(0x7f0f0266).setOnClickListener(onSignupButtonClick);
    }

    private void setState(OnboardingState onboardingstate)
    {
        setState(onboardingstate, true);
    }

    private void setState(OnboardingState onboardingstate, boolean flag)
    {
        state = onboardingstate;
        ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("will set OnboardActivity state to: ")).append(onboardingstate).toString());
        switch (_cls11..SwitchMap.com.soundcloud.android.onboarding.OnboardActivity.OnboardingState[state.ordinal()])
        {
        default:
            return;

        case 6: // '\006'
            onHideOverlay(flag);
            return;

        case 1: // '\001'
            lastAuthState = OnboardingState.LOGIN;
            hideViews(onboardingstate, flag);
            showOverlay(getLoginLayout(), flag);
            return;

        case 2: // '\002'
            lastAuthState = OnboardingState.SIGN_UP_METHOD;
            hideViews(onboardingstate, flag);
            showOverlay(getSignUpMethodLayout(), flag);
            return;

        case 4: // '\004'
            hideViews(onboardingstate, flag);
            showOverlay(getSignUpBasicsLayout(), flag);
            return;

        case 5: // '\005'
            hideViews(onboardingstate, flag);
            showOverlay(getSignUpDetailsLayout(), flag);
            return;

        case 3: // '\003'
            hideViews(onboardingstate, false);
            showOverlay(getAcceptTermsLayout(), flag);
            return;
        }
    }

    private void setupFacebookCallback()
    {
        Object obj = facebookLoginManager;
        Object obj1 = facebookCallbackManager;
        FacebookSessionCallback facebooksessioncallback = new FacebookSessionCallback(this);
        if (!(obj1 instanceof m))
        {
            throw new p("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            obj1 = (m)obj1;
            int i = com.facebook.internal.m.b.a.a();
            obj = new com.facebook.login.p(((o) (obj)), facebooksessioncallback);
            Y.a(obj, "callback");
            ((m) (obj1)).a.put(Integer.valueOf(i), obj);
            return;
        }
    }

    private void showDeviceConflictLogoutDialog()
    {
        showDialogAndTrackEvent((new ImageAlertDialog(this)).setContent(0x7f0200f6, 0x7f0702a8, 0x7f0702a6).setPositiveButton(0x7f0702a7, null), OnboardingEvent.deviceConflictLoggedOut());
    }

    private void showDialogAndTrackEvent(android.support.v7.app.AlertDialog.Builder builder, OnboardingEvent onboardingevent)
    {
        if (!isFinishing())
        {
            builder.create().show();
            eventBus.publish(EventQueue.ONBOARDING, onboardingevent);
        }
    }

    private void showDialogWithFeedbackAndTrackEvent(android.support.v7.app.AlertDialog.Builder builder, OnboardingEvent onboardingevent)
    {
        if (!isFinishing())
        {
            addFeedbackButton(builder);
            showDialogAndTrackEvent(builder, onboardingevent);
        }
    }

    private void showDialogWithHyperlinksAndTrackEvent(android.support.v7.app.AlertDialog.Builder builder, OnboardingEvent onboardingevent)
    {
        if (!isFinishing())
        {
            builder.create().show();
            eventBus.publish(EventQueue.ONBOARDING, onboardingevent);
        }
    }

    private void showOverlay(View view, boolean flag)
    {
        AnimUtils.hideView(photoBottomBar, flag);
        AnimUtils.hideView(photoLogo, flag);
        photosAdapter.showViewsOfLayout(photoPager.getCurrentItem(), flag);
        AnimUtils.showView(overlayHolder, flag);
        AnimUtils.showView(overlayBg, flag);
        AnimUtils.showView(view, flag);
    }

    private void showPhotos(boolean flag)
    {
        overridePendingTransition(0, 0);
        photoBottomBar = findViewById(0x7f0f0246);
        photoLogo = findViewById(0x7f0f0245);
        photoPager = (ViewPager)findViewById(0x7f0f0244);
        overlayBg = findViewById(0x7f0f0247);
        overlayHolder = findViewById(0x7f0f0248);
        photosAdapter = new TourPhotoPagerAdapter(this);
        buildPhotoPager(photosAdapter);
        setState(OnboardingState.PHOTOS);
        if (!flag)
        {
            trackTourScreen();
        }
        Object obj = findViewById(0x7f0f024e);
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        if (flag)
        {
            overlayBg.setVisibility(8);
            overlayHolder.setVisibility(8);
        }
        obj = new PhotoLoadHandler(this, ((View) (obj)));
        photosAdapter.load(this, ((PhotoLoadHandler) (obj)));
    }

    private void trackTourScreen()
    {
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.TOUR));
    }

    private void unpackAccountAuthenticatorResponse(Intent intent)
    {
        accountAuthenticatorResponse = (AccountAuthenticatorResponse)intent.getParcelableExtra("accountAuthenticatorResponse");
        if (accountAuthenticatorResponse != null)
        {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }

    private void unpackDeeplink(Intent intent)
    {
        if (intent.hasExtra("EXTRA_URN"))
        {
            resourceUrn = (Urn)intent.getParcelableExtra("EXTRA_URN");
        }
    }

    private void unpackDeeplink(Bundle bundle)
    {
        if (bundle.containsKey("EXTRA_URN"))
        {
            resourceUrn = (Urn)bundle.getParcelable("EXTRA_URN");
        }
    }

    public void confirmRequestForFacebookEmail()
    {
        showDialogAndTrackEvent(createDefaultAuthErrorDialogBuilder(0x7f070090).setMessage(0x7f0700a1).setPositiveButton(0x104000a, new _cls7()), OnboardingEvent.signupFacebookEmailDenied());
    }

    public void finish()
    {
        if (accountAuthenticatorResponse != null)
        {
            if (resultBundle != null)
            {
                accountAuthenticatorResponse.onResult(resultBundle);
            } else
            {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            accountAuthenticatorResponse = null;
        }
        super.finish();
    }

    public FragmentActivity getFragmentActivity()
    {
        return this;
    }

    public com.soundcloud.android.onboarding.auth.GenderPickerDialogFragment.Callback getGenderPickerCallback()
    {
        return getSignUpBasicsLayout();
    }

    public void loginWithFacebook(String s1)
    {
        login(tokenUtils.getGrantBundle("urn:soundcloud:oauth2:grant-type:facebook&access_token=", s1));
    }

    public void onAcceptTerms(SignupVia signupvia, Bundle bundle)
    {
        setState(OnboardingState.PHOTOS);
        _cls11..SwitchMap.com.soundcloud.android.onboarding.auth.SignupVia[signupvia.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 68
    //                   2 97
    //                   3 104;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown signupVia: ")).append(signupvia.name()).toString());
_L2:
        createNewUserFromGooglePlus(bundle);
_L6:
        AnimUtils.hideView(getAcceptTermsLayout(), true);
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.termsAccepted());
        return;
_L3:
        createNewUserFromFacebook();
        continue; /* Loop/switch isn't completed */
_L4:
        createNewUserFromEmail(bundle);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        activityResult = new ActivityResult(i, k, intent);
    }

    public void onAuthTaskComplete(PublicApiUser publicapiuser, SignupVia signupvia, boolean flag, boolean flag1)
    {
        ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("auth task complete, via: ")).append(signupvia).append(", was api signup task: ").append(flag).toString());
        if (flag)
        {
            SignupLog.writeNewSignupAsync();
            user = publicapiuser;
            setState(OnboardingState.SIGN_UP_DETAILS);
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_USER_DETAILS));
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.authComplete());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", publicapiuser.username);
        bundle.putString("accountType", getString(0x7f070239));
        boolean flag2;
        if (signupvia != SignupVia.NONE)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        resultBundle = bundle;
        sendBroadcast((new Intent("com.soundcloud.android.action.ACCOUNT_ADDED")).putExtra("id", publicapiuser.getId()).putExtra("signed_up", signupvia.name));
        if (flag2 || wasAuthorizedViaSignupScreen())
        {
            startActivity((new Intent(this, com/soundcloud/android/main/MainActivity)).putExtra("from_sign_in", true).addFlags(0x4000000));
        } else
        if (Urn.NOT_SET.equals(resourceUrn))
        {
            startActivity((new Intent(this, com/soundcloud/android/main/MainActivity)).addFlags(0x4000000));
        } else
        {
            navigator.openResolveForUrn(this, resourceUrn);
        }
        finish();
    }

    public void onBackPressed()
    {
        switch (_cls11..SwitchMap.com.soundcloud.android.onboarding.OnboardActivity.OnboardingState[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            setState(OnboardingState.PHOTOS);
            trackTourScreen();
            return;

        case 4: // '\004'
            setState(OnboardingState.SIGN_UP_METHOD);
            return;

        case 5: // '\005'
            onSkipUserDetails();
            return;

        case 6: // '\006'
            super.onBackPressed();
            break;
        }
    }

    public void onBlocked()
    {
        showDialogWithHyperlinksAndTrackEvent(createDefaultAuthErrorDialogBuilder(0x7f070083).setMessage(0x7f070082).setPositiveButton(0x7f0700f8, new _cls8()).setNegativeButton(0x1040000, null), OnboardingEvent.signupDenied());
    }

    public void onCancelLogin()
    {
        setState(OnboardingState.PHOTOS);
        trackTourScreen();
    }

    public void onCancelSignUp()
    {
        setState(OnboardingState.PHOTOS);
        trackTourScreen();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b4);
        eventBus.publish(EventQueue.ACTIVITY_LIFE_CYCLE, ActivityLifeCycleEvent.forOnCreate(this));
        unpackAccountAuthenticatorResponse(getIntent());
        unpackDeeplink(getIntent());
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showPhotos(flag);
        setButtonListeners();
        checkForDeviceConflict();
        setupFacebookCallback();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        photosAdapter.onDestroy();
    }

    public void onDeviceConflict(final Bundle loginBundle)
    {
        showDialogAndTrackEvent((new ImageAlertDialog(this)).setContent(0x7f0200f6, 0x7f0702a8, 0x7f0702a9).setPositiveButton(0x7f0702a7, new _cls9()).setNegativeButton(0x7f0700a6, null), OnboardingEvent.deviceConflictOnLogin());
    }

    public void onEmailAuth()
    {
        setState(OnboardingState.SIGN_UP_BASICS);
    }

    public void onEmailInvalid()
    {
        showDialogAndTrackEvent(createDefaultAuthErrorDialogBuilder(0x7f070090).setMessage(0x7f070087).setPositiveButton(0x104000a, null), OnboardingEvent.signupInvalidEmail());
    }

    public void onEmailTaken()
    {
        showDialogAndTrackEvent(createDefaultAuthErrorDialogBuilder(0x7f070090).setMessage(0x7f070089).setPositiveButton(0x104000a, null), OnboardingEvent.signupExistingEmail());
    }

    public void onError(String s1, boolean flag)
    {
        android.support.v7.app.AlertDialog.Builder builder = createDefaultAuthErrorDialogBuilder(0x7f070090);
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = getString(0x7f0700a0);
        }
        s1 = builder.setMessage(s2).setPositiveButton(0x104000a, null);
        if (flag)
        {
            showDialogWithFeedbackAndTrackEvent(s1, OnboardingEvent.signupGeneralError());
            return;
        } else
        {
            showDialogAndTrackEvent(s1, OnboardingEvent.signupExistingEmail());
            return;
        }
    }

    public void onFacebookAuth()
    {
        ErrorUtils.log(4, "ScOnboarding", "on Facebook auth");
        proposeTermsOfUse(SignupVia.FACEBOOK_SSO, null);
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.facebookAuthEvent());
    }

    public void onFacebookAuthenticationFailedMessage()
    {
        onError(getString(0x7f070135), true);
    }

    public void onGooglePlusAuth()
    {
        ErrorUtils.log(4, "ScOnboarding", "on Google+ auth");
        final String names[] = AndroidUtils.getAccountsByType(this, "com.google");
        if (names.length == 0)
        {
            onError(getString(0x7f070097), true);
        } else
        if (names.length == 1)
        {
            onGoogleAccountSelected(names[0]);
        } else
        {
            android.support.v7.app.AlertDialog.Builder builder = (new android.support.v7.app.AlertDialog.Builder(new ContextThemeWrapper(this, 0x7f0c029c))).setTitle(0x7f070119);
            builder.setItems(names, new _cls6());
            builder.show();
        }
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.googleAuthEvent());
    }

    public void onLogin(String s1, String s2)
    {
        LoginTaskFragment.create(s1, s2).show(getSupportFragmentManager(), "login_dialog");
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.nativeAuthEvent());
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.publish(EventQueue.ACTIVITY_LIFE_CYCLE, ActivityLifeCycleEvent.forOnPause(this));
    }

    public void onRecoverPassword(String s1)
    {
        Intent intent = new Intent(this, com/soundcloud/android/onboarding/auth/RecoverActivity);
        if (s1 != null && s1.length() > 0)
        {
            intent.putExtra("email", s1);
        }
        startActivityForResult(intent, 8002);
    }

    public void onRejectTerms()
    {
        setState(OnboardingState.PHOTOS);
        trackTourScreen();
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.termsRejected());
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        user = (PublicApiUser)bundle.getParcelable("BUNDLE_USER");
        lastGoogleAccountSelected = bundle.getString("BUNDLE_LAST_GOOGLE_ACCOUNT_USED");
        loginBundle = bundle.getBundle("BUNDLE_LOGIN");
        signUpBasicsBundle = bundle.getBundle("BUNDLE_SIGN_UP_BASICS");
        signUpDetailsBundle = bundle.getBundle("BUNDLE_SIGN_UP_DETAILS");
        acceptTermsBundle = bundle.getBundle("BUNDLE_ACCEPT_TERMS");
        unpackDeeplink(bundle);
        setState((OnboardingState)bundle.getSerializable("BUNDLE_STATE"), false);
    }

    protected void onResume()
    {
        super.onResume();
        eventBus.publish(EventQueue.ACTIVITY_LIFE_CYCLE, ActivityLifeCycleEvent.forOnResume(this));
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        doSafeActivityResultActions(activityResult);
        activityResult = ActivityResult.empty();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("BUNDLE_LAST_GOOGLE_ACCOUNT_USED", lastGoogleAccountSelected);
        bundle.putSerializable("BUNDLE_STATE", state);
        bundle.putParcelable("BUNDLE_USER", user);
        if (!Urn.NOT_SET.equals(resourceUrn))
        {
            bundle.putParcelable("EXTRA_URN", resourceUrn);
        }
        if (loginLayout != null)
        {
            bundle.putBundle("BUNDLE_LOGIN", loginLayout.getStateBundle());
        }
        if (signUpBasicsLayout != null)
        {
            bundle.putBundle("BUNDLE_SIGN_UP_BASICS", signUpBasicsLayout.getStateBundle());
        }
        if (signUpDetailsLayout != null)
        {
            bundle.putBundle("BUNDLE_SIGN_UP_DETAILS", signUpDetailsLayout.getStateBundle());
        }
        if (acceptTermsLayout != null)
        {
            bundle.putBundle("BUNDLE_ACCEPT_TERMS", acceptTermsLayout.getStateBundle());
        }
    }

    public void onShowPrivacyPolicy()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070332))));
    }

    public void onShowTermsOfUse()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070335))));
    }

    public void onSignUp(String s1, String s2, BirthdayInfo birthdayinfo, String s3)
    {
        proposeTermsOfUse(SignupVia.API, SignupTaskFragment.getParams(s1, s2, birthdayinfo, s3));
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.nativeAuthEvent());
    }

    public void onSkipUserDetails()
    {
        (new _cls5(getApp(), new LegacyUserStorage())).execute(new Bundle[0]);
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.skippedUserInfo());
    }

    public void onSpam()
    {
        SpamDialogOnClickListener spamdialogonclicklistener = new SpamDialogOnClickListener(this, oauth);
        showDialogAndTrackEvent(createDefaultAuthErrorDialogBuilder(0x7f070090).setMessage(0x7f070084).setPositiveButton(getString(0x7f070213), spamdialogonclicklistener).setNeutralButton(getString(0x7f0700a6), spamdialogonclicklistener), OnboardingEvent.signupServeCaptcha());
    }

    public void onSubmitUserDetails(String s1, File file)
    {
        if (user == null)
        {
            return;
        } else
        {
            AddUserInfoTaskFragment.create(s1, file).show(getSupportFragmentManager(), "add_user_task");
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.savedUserInfo(s1, file));
            return;
        }
    }

    public void onUsernameInvalid(String s1)
    {
        s1 = createDefaultAuthErrorDialogBuilder(0x7f070090).setMessage(s1).setPositiveButton(0x104000a, null);
        if (!isFinishing())
        {
            s1.create().show();
        }
    }

    public void requestFacebookEmail()
    {
        ErrorUtils.log(4, "ScOnboarding", "re-requesting facebook email permission");
        facebookLoginManager.a(this, FacebookSessionCallback.EMAIL_ONLY_PERMISSION);
    }

    protected boolean wasAuthorizedViaSignupScreen()
    {
        return lastAuthState == OnboardingState.SIGN_UP_METHOD;
    }











    private class _cls1
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final OnboardActivity this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int k)
        {
        }

        public void onPageSelected(int i)
        {
            RadioGroup radiogroup = (RadioGroup)findViewById(0x7f0f0269);
            int k = 0;
            while (k < radiogroup.getChildCount()) 
            {
                RadioButton radiobutton = (RadioButton)radiogroup.getChildAt(k);
                boolean flag;
                if (k == i)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                radiobutton.setChecked(flag);
                k++;
            }
        }

        _cls1()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls2 extends com.soundcloud.android.util.AnimUtils.SimpleAnimationListener
    {

        final OnboardActivity this$0;

        public void onAnimationEnd(Animation animation)
        {
            overlayHolder.setVisibility(8);
            if (loginLayout != null)
            {
                AnimUtils.hideView(loginLayout, false);
            }
            if (signUpMethodLayout != null)
            {
                AnimUtils.hideView(signUpMethodLayout, false);
            }
            if (signUpBasicsLayout != null)
            {
                AnimUtils.hideView(signUpBasicsLayout, false);
            }
            if (signUpDetailsLayout != null)
            {
                AnimUtils.hideView(signUpDetailsLayout, false);
            }
            if (acceptTermsLayout != null)
            {
                AnimUtils.hideView(acceptTermsLayout, false);
            }
        }

        _cls2()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final OnboardActivity this$0;

        public void onClick(View view)
        {
            setState(OnboardingState.LOGIN);
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_LOG_IN));
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.logInPrompt());
        }

        _cls3()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final OnboardActivity this$0;

        public void onClick(View view)
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.AUTH_SIGN_UP));
            eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.signUpPrompt());
            if (!applicationProperties.isDevBuildRunningOnDevice() && SignupLog.shouldThrottleSignup())
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070333))));
                finish();
                return;
            } else
            {
                setState(OnboardingState.SIGN_UP_METHOD);
                return;
            }
        }

        _cls4()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls10
        implements android.content.DialogInterface.OnClickListener
    {

        final OnboardActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            bugReporter.showSignInFeedbackDialog(getFragmentActivity());
        }

        _cls10()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls11
    {

        static final int $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[];
        static final int $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[];

        static 
        {
            $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia = new int[SignupVia.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.GOOGLE_PLUS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.FACEBOOK_SSO.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.API.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState = new int[OnboardingState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.LOGIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.SIGN_UP_METHOD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.ACCEPT_TERMS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.SIGN_UP_BASICS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.SIGN_UP_DETAILS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[OnboardingState.PHOTOS.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls7
        implements android.content.DialogInterface.OnClickListener
    {

        final OnboardActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            requestFacebookEmail();
        }

        _cls7()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls8
        implements android.content.DialogInterface.OnClickListener
    {

        final OnboardActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse(getString(0x7f07032f))));
            dialoginterface.dismiss();
        }

        _cls8()
        {
            this$0 = OnboardActivity.this;
            super();
        }
    }


    private class _cls9
        implements android.content.DialogInterface.OnClickListener
    {

        final OnboardActivity this$0;
        final Bundle val$loginBundle;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            login(loginBundle);
        }

        _cls9()
        {
            this$0 = OnboardActivity.this;
            loginBundle = bundle;
            super();
        }
    }


    private class _cls6
        implements android.content.DialogInterface.OnClickListener
    {

        final OnboardActivity this$0;
        final String val$names[];

        public void onClick(DialogInterface dialoginterface, int i)
        {
            onGoogleAccountSelected(names[i]);
        }

        _cls6()
        {
            this$0 = OnboardActivity.this;
            names = as;
            super();
        }
    }


    private class _cls5 extends AuthTask
    {

        final OnboardActivity this$0;

        protected transient AuthTaskResult doInBackground(Bundle abundle[])
        {
            addAccount(user, oldCloudAPI.getToken(), SignupVia.API);
            return null;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Bundle[])aobj);
        }

        protected void onPostExecute(AuthTaskResult authtaskresult)
        {
            onAuthTaskComplete(user, SignupVia.API, false, false);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((AuthTaskResult)obj);
        }

        _cls5(SoundCloudApplication soundcloudapplication, LegacyUserStorage legacyuserstorage)
        {
            this$0 = OnboardActivity.this;
            super(soundcloudapplication, legacyuserstorage);
        }
    }

}
