// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.signin:
//            AccountsList, AccountInfo, UnifiedSignInFlow, SignInTelemetryEvent, 
//            SharedGlobalPreferences

public class UnifiedSignInFragment extends SkypeFragment
    implements TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, UnifiedLandingPageActivity.UnifiedSignInCallbacks
{

    private static final String EXTRA_SEARCH_IN_PROGRESS = "EXTRA_SEARCH_IN_PROGRESS";
    private static final String EXTRA_SHOW_MESSAGE = "EXTRA_SHOW_MESSAGE";
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    View createAccountBtn;
    EcsConfiguration ecsConfiguration;
    Navigation navigation;
    private AccountsList previouslySignedInAccounts;
    ProgressCircleView progressCircleView;
    private boolean searching;
    View signInContent;
    SignInDurationReporter signInDurationReporter;
    private UnifiedSignInFlow signInFlow;
    TextView signInLabel;
    View signInLogo;
    TextView signInMessage;
    SymbolView signInNextBtn;
    AccessibleAutoCompleteTextView userIdEdit;

    public UnifiedSignInFragment()
    {
        searching = false;
        previouslySignedInAccounts = null;
    }

    private void hideKeyboard()
    {
        ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(userIdEdit.getWindowToken(), 2);
    }

    private void nextBtnClicked()
    {
        String s = userIdEdit.getText().toString().trim();
        AccountInfo accountinfo;
        if (s.length() != 0)
        {
            if ((accountinfo = previouslySignedInAccounts.get(s)) == null || !signInFlow.navigateToSignInBasedOnType(accountinfo.getUsername(), accountinfo.getType()))
            {
                startSearching(s);
                return;
            }
        }
    }

    private void setSearching(boolean flag)
    {
        byte byte0 = 8;
        boolean flag2 = true;
        searching = flag;
        hideKeyboard();
        Object obj = userIdEdit;
        int i;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((AccessibleAutoCompleteTextView) (obj)).setFocusableInTouchMode(flag1);
        obj = userIdEdit;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((AccessibleAutoCompleteTextView) (obj)).setFocusable(flag1);
        obj = signInNextBtn;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((SymbolView) (obj)).setVisibility(i);
        obj = signInNextBtn;
        if (!flag && userIdEdit.length() > 0)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        ((SymbolView) (obj)).setEnabled(flag1);
        obj = progressCircleView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ProgressCircleView) (obj)).setVisibility(i);
        obj = createAccountBtn;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
    }

    private void setSignInMessageVisible(boolean flag)
    {
        TextView textview = signInMessage;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    private void startSearching(String s)
    {
        PerformanceLog.e.a("USER ACTION: navigate to skype sign in screen");
        setSearching(true);
        signInFlow.searchAccountsAsync(s);
    }

    private void styleForOrientation(final int orientation)
    {
        getActivity().getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            int currentHeight;
            int screenHeight;
            final UnifiedSignInFragment this$0;
            int topPadding;
            final int val$orientation;

            public final void onGlobalLayout()
            {
                int j = 8;
                boolean flag1 = false;
                View view = getActivity().findViewById(0x1020002);
                int i;
                if (view != null)
                {
                    if (currentHeight != (i = view.getHeight()))
                    {
                        View view1;
                        boolean flag;
                        if (screenHeight - i > screenHeight / 4)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        currentHeight = i;
                        view1 = createAccountBtn;
                        if (flag || searching)
                        {
                            i = 8;
                        } else
                        {
                            i = 0;
                        }
                        view1.setVisibility(i);
                        if (orientation == 2)
                        {
                            View view2 = signInLogo;
                            if (flag)
                            {
                                i = j;
                            } else
                            {
                                i = 0;
                            }
                            view2.setVisibility(i);
                            view2 = signInContent;
                            j = signInContent.getPaddingLeft();
                            i = ((flag1) ? 1 : 0);
                            if (flag)
                            {
                                i = topPadding;
                            }
                            view2.setPadding(j, i, signInContent.getPaddingRight(), signInContent.getPaddingBottom());
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = UnifiedSignInFragment.this;
                orientation = i;
                super();
                currentHeight = -1;
                topPadding = getResources().getDimensionPixelSize(0x7f0c0022);
                screenHeight = getResources().getDisplayMetrics().heightPixels;
            }
        });
    }

    public void afterTextChanged(Editable editable)
    {
        int i = editable.length();
        if (userIdEdit.hasFocus())
        {
            String s = getString(0x7f080426);
            if (i > 0)
            {
                s = editable.toString();
            }
            userIdEdit.setContentDescription(s);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onAccountSearchResult(final AccountsList.OutcomeResult result)
    {
        getActivity().runOnUiThread(new Runnable() {

            final UnifiedSignInFragment this$0;
            final AccountsList.OutcomeResult val$result;

            public final void run()
            {
                if (result == AccountsList.OutcomeResult.NO_ACCOUNT)
                {
                    setSignInMessageVisible(true);
                }
                setSearching(false);
            }

            
            {
                this$0 = UnifiedSignInFragment.this;
                result = outcomeresult;
                super();
            }
        });
    }

    public void onClick(View view)
    {
        setSignInMessageVisible(false);
        switch (view.getId())
        {
        default:
            return;

        case 2131755946: 
            view = new SignInTelemetryEvent(LogEvent.j, SignInConstants.FlowType.UNIFIED, ecsConfiguration.isMsaSdkUsedForLogin());
            analytics.a(view);
            navigation.signup();
            return;

        case 2131756397: 
            analytics.a(LogEvent.F);
            break;
        }
        nextBtnClicked();
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.a, String.valueOf(SignInConstants.ScreenName.DISAMBIGUATION_SCREEN));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        return layoutinflater.inflate(0x7f030124, viewgroup, false);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null)
        {
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
            {
                return true;
            }
            if (keyevent.getKeyCode() == 66 && keyevent.getAction() == 1)
            {
                nextBtnClicked();
                return true;
            }
        }
        if (i == 6 || i == 4)
        {
            nextBtnClicked();
            return true;
        } else
        {
            return false;
        }
    }

    public void onResume()
    {
        super.onResume();
        setSearching(searching);
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        boolean flag;
        if (signInMessage != null && signInMessage.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("EXTRA_SHOW_MESSAGE", flag);
        bundle.putBoolean("EXTRA_SEARCH_IN_PROGRESS", searching);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        toggleNextButton();
        if (userIdEdit.isPopupShowing() && android.os.Build.VERSION.SDK_INT >= 16)
        {
            userIdEdit.announceForAccessibility(charsequence.toString().substring(i));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            signInContent.setImportantForAccessibility(2);
            signInLabel.setImportantForAccessibility(2);
        }
        if (bundle != null)
        {
            if (bundle.getBoolean("EXTRA_SHOW_MESSAGE", false))
            {
                setSignInMessageVisible(true);
            } else
            {
                setSignInMessageVisible(false);
            }
            searching = bundle.getBoolean("EXTRA_SEARCH_IN_PROGRESS", false);
        } else
        {
            setSignInMessageVisible(false);
        }
        signInFlow = (UnifiedSignInFlow)getActivity();
        view = AnimationUtils.loadAnimation(getActivity(), 0x10a0000);
        signInContent.startAnimation(view);
        ViewUtil.a(this, new View[] {
            createAccountBtn
        });
        userIdEdit.setOnEditorActionListener(this);
        userIdEdit.addTextChangedListener(this);
        view = new ArrayAdapter(getActivity(), 0x1090011);
        previouslySignedInAccounts = (new SharedGlobalPreferences(getActivity())).getExistingAccounts();
        for (bundle = previouslySignedInAccounts.getAccounts().iterator(); bundle.hasNext(); view.add(((AccountInfo)bundle.next()).getUsername())) { }
        userIdEdit.setAdapter(view);
        ViewUtil.a(this, new View[] {
            signInNextBtn
        });
        styleForOrientation(getResources().getConfiguration().orientation);
    }

    protected void toggleNextButton()
    {
        String s = userIdEdit.getText().toString().trim();
        SymbolView symbolview = signInNextBtn;
        boolean flag;
        if (s.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        symbolview.setEnabled(flag);
    }

    public void updateUsername(final String username)
    {
        getActivity().runOnUiThread(new Runnable() {

            final UnifiedSignInFragment this$0;
            final String val$username;

            public final void run()
            {
                userIdEdit.setText(username);
            }

            
            {
                this$0 = UnifiedSignInFragment.this;
                username = s;
                super();
            }
        });
    }



}
