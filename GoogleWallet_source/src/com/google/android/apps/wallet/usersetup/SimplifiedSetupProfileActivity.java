// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.apps.wallet.gms.PeopleGraphRequester;
import com.google.android.apps.wallet.inject.ApplicationInjector;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.accountswitcherview.OwnersAvatarManager;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            AccountAdapter, ZipCodeView

public class SimplifiedSetupProfileActivity extends FragmentActivity
{
    static final class Screen
    {

        public View logoSpot;
        public View mainView;

        public Screen(int i, Activity activity)
        {
            mainView = Views.findViewById(activity, i);
            logoSpot = Views.findViewById(mainView, com.google.android.apps.walletnfcrel.R.id.WalletLogoSpot);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity.getSimpleName();
    private AccountAdapter accountAdapter;
    private Spinner accountPicker;
    private Button accountSelectionContinueButton;
    private View backgroundImage;
    private final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

        final SimplifiedSetupProfileActivity this$0;

        public final void onConnected(Bundle bundle)
        {
            bundle = (new com.google.android.gms.people.Graph.LoadOwnersOptions()).setIncludePlusPages(false);
            PeopleGraphRequester peoplegraphrequester = peopleGraphRequester;
            PeopleGraphRequester.loadOwners(peopleClient, bundle, new ResultCallback() {

                final _cls7 this$1;

                private void onResult(com.google.android.gms.people.Graph.LoadOwnersResult loadownersresult)
                {
                    onOwnersLoaded(loadownersresult.getStatus(), loadownersresult.getOwners());
                }

                public final volatile void onResult(Result result)
                {
                    onResult((com.google.android.gms.people.Graph.LoadOwnersResult)result);
                }

            
            {
                this$1 = _cls7.this;
                super();
            }
            });
        }

        public final void onConnectionSuspended(int i)
        {
        }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
    };
    private final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener connectionFailedListener$3486c49a = new com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener() {

        final SimplifiedSetupProfileActivity this$0;

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            Object obj = SimplifiedSetupProfileActivity.TAG;
            String s = String.valueOf(connectionresult);
            WLog.w(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 27)).append("Client connection failure: ").append(s).toString());
            obj = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), SimplifiedSetupProfileActivity.this, 9001, new android.content.DialogInterface.OnCancelListener() {

                final _cls8 this$1;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    finish();
                }

            
            {
                this$1 = _cls8.this;
                super();
            }
            });
            if (obj != null)
            {
                ((Dialog) (obj)).show();
            } else
            if (connectionresult.hasResolution())
            {
                try
                {
                    connectionresult.startResolutionForResult(SimplifiedSetupProfileActivity.this, 9000);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ConnectionResult connectionresult)
                {
                    peopleClient.connect();
                }
                return;
            }
        }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
    };
    private View container;
    private ArrayList lastOwnerNames;
    private View logo;
    private boolean lookForNewAccount;
    private int pageIndex;
    GoogleApiClient peopleClient;
    PeopleGraphRequester peopleGraphRequester;
    private int previouslySelectedAccountIndex;
    private Screen screens[];
    private ZipCodeView zipCodeView;

    public SimplifiedSetupProfileActivity()
    {
        pageIndex = 0;
        previouslySelectedAccountIndex = 0;
        lookForNewAccount = false;
        lastOwnerNames = Lists.newArrayList();
    }

    private AnimatorSet animateLogoTo(Screen screen)
    {
        float f = screen.logoSpot.getX();
        float f1 = (float)(screen.logoSpot.getWidth() - logo.getWidth()) / 2.0F;
        float f2 = screen.logoSpot.getY();
        float f3 = (float)(screen.logoSpot.getHeight() - logo.getHeight()) / 2.0F;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(logo, "translationX", new float[] {
            f + f1
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(logo, "translationY", new float[] {
            f2 + f3
        });
        f = (float)screen.logoSpot.getWidth() / (float)logo.getWidth();
        screen = ObjectAnimator.ofFloat(logo, "scaleX", new float[] {
            f
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(logo, "scaleY", new float[] {
            f
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, screen, objectanimator2
        });
        return animatorset;
    }

    private AnimatorSet animateScreenSwap(Screen screen, Screen screen1)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            animateScreenTransition(screen, false), animateScreenTransition(screen1, true), animateLogoTo(screen1)
        });
        animatorset.setDuration(300L);
        return animatorset;
    }

    private AnimatorSet animateScreenTransition(final Screen mainView, final boolean animateIn)
    {
        Object obj = Lists.newArrayList();
        mainView = mainView.mainView;
        float f;
        float f1;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        if (animateIn)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        if (animateIn)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        objectanimator = ObjectAnimator.ofFloat(mainView, "alpha", new float[] {
            f, f1
        });
        ((List) (obj)).add(objectanimator);
        f = (float)mainView.getHeight() * 0.5F;
        if (animateIn)
        {
            f1 = f;
        } else
        {
            f1 = 0.0F;
        }
        if (animateIn)
        {
            f = 0.0F;
        }
        objectanimator1 = ObjectAnimator.ofFloat(mainView, "translationY", new float[] {
            f1, f
        });
        ((List) (obj)).add(objectanimator1);
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).addListener(new AnimatorListenerAdapter() {

            final SimplifiedSetupProfileActivity this$0;
            final boolean val$animateIn;
            final View val$mainView;

            public final void onAnimationEnd(Animator animator)
            {
                if (!animateIn)
                {
                    mainView.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                if (animateIn)
                {
                    mainView.setVisibility(0);
                }
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                animateIn = flag;
                mainView = view;
                super();
            }
        });
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        return ((AnimatorSet) (obj));
    }

    private void connectPeopleClient()
    {
        if (!peopleClient.isConnected() && !peopleClient.isConnecting())
        {
            peopleClient.registerConnectionCallbacks(connectionCallbacks);
            peopleClient.registerConnectionFailedListener$40dd7b8f(connectionFailedListener$3486c49a);
            peopleClient.connect();
        }
    }

    private void disconnectPeopleClient()
    {
        peopleClient.unregisterConnectionCallbacks(connectionCallbacks);
        peopleClient.unregisterConnectionFailedListener$40dd7b8f(connectionFailedListener$3486c49a);
        peopleClient.disconnect();
    }

    private void next()
    {
        int i = pageIndex;
        pageIndex = (pageIndex + 1) % screens.length;
        float f = (((float)container.getWidth() - (float)backgroundImage.getWidth()) * (float)pageIndex) / (float)(screens.length - 1);
        backgroundImage.animate().translationX(f);
        animateScreenSwap(screens[i], screens[pageIndex]).start();
    }

    private void onOwnersLoaded(Status status, OwnerBuffer ownerbuffer)
    {
        if (!status.isSuccess())
        {
            ownerbuffer = TAG;
            status = String.valueOf(status);
            WLog.e(ownerbuffer, (new StringBuilder(String.valueOf(status).length() + 33)).append("Loading owners was unsuccessful: ").append(status).toString());
            finish();
            return;
        }
        accountPicker.setVisibility(0);
        accountAdapter.setOwners(ownerbuffer);
        status = Lists.newArrayList(Iterables.transform(ownerbuffer, new Function() {

            final SimplifiedSetupProfileActivity this$0;

            private static String apply(Owner owner)
            {
                return owner.getAccountName();
            }

            public final volatile Object apply(Object obj)
            {
                return apply((Owner)obj);
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
        }));
        if (!lookForNewAccount) goto _L2; else goto _L1
_L1:
        int i;
        i = 0;
        ownerbuffer = status.iterator();
_L8:
        if (!ownerbuffer.hasNext()) goto _L4; else goto _L3
_L3:
        String s = (String)ownerbuffer.next();
        if (lastOwnerNames.contains(s)) goto _L6; else goto _L5
_L5:
        accountPicker.setSelection(i);
_L4:
        lookForNewAccount = false;
_L2:
        lastOwnerNames = status;
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void previous()
    {
        float f;
        int i;
        boolean flag;
        if (pageIndex > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        i = pageIndex;
        pageIndex = pageIndex - 1;
        f = (((float)container.getWidth() - (float)backgroundImage.getWidth()) * (float)pageIndex) / (float)(screens.length - 1);
        backgroundImage.animate().translationX(f);
        animateScreenSwap(screens[i], screens[pageIndex]).start();
    }

    private void restoreFromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            pageIndex = bundle.getInt("setupPageIndex", pageIndex);
            previouslySelectedAccountIndex = bundle.getInt("previouslySelectedAccount", previouslySelectedAccountIndex);
            lookForNewAccount = bundle.getBoolean("lookForNewAccount", lookForNewAccount);
            if (bundle.containsKey("lastOwnerNames"))
            {
                lastOwnerNames = bundle.getStringArrayList("lastOwnerNames");
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i != 9000 && i != 9001) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        peopleClient.connect();
_L6:
        return;
_L4:
        WLog.w(TAG, (new StringBuilder(50)).append("non-OK result for request ").append(i).append(": ").append(j).toString());
        finish();
        return;
_L2:
        if (i == 9002)
        {
            if (j == 0)
            {
                accountPicker.setSelection(previouslySelectedAccountIndex);
                return;
            } else
            {
                lookForNewAccount = true;
                disconnectPeopleClient();
                connectPeopleClient();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onBackPressed()
    {
        if (pageIndex == 0)
        {
            super.onBackPressed();
            return;
        } else
        {
            previous();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ApplicationInjector.inject(this, this);
        restoreFromBundle(bundle);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.simplified_setup_profile_activity);
        accountAdapter = new AccountAdapter(this, new OwnersAvatarManager(this, peopleClient));
        container = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Container);
        backgroundImage = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.BackgroundImage);
        accountPicker = (Spinner)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AccountPickerSpinner);
        accountPicker.setAdapter(accountAdapter);
        accountPicker.setVisibility(8);
        accountPicker.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SimplifiedSetupProfileActivity this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                if (accountAdapter.isAddAccountIndex(j))
                {
                    accountPicker.setSelection(previouslySelectedAccountIndex);
                    adapterview = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                    adapterview.putExtra("account_types", new String[] {
                        "com.google"
                    });
                    startActivityForResult(adapterview, 9002);
                    return;
                } else
                {
                    zipCodeView.clear();
                    previouslySelectedAccountIndex = j;
                    return;
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
        });
        accountSelectionContinueButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ContinueButton);
        accountSelectionContinueButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SimplifiedSetupProfileActivity this$0;

            public final void onClick(View view)
            {
                next();
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
        });
        zipCodeView = (ZipCodeView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ZipCodeView);
        zipCodeView.setSubmitListener(new ZipCodeView.SubmitListener() {

            final SimplifiedSetupProfileActivity this$0;

            public final void onSubmit(String s)
            {
                next();
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
        });
        logo = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WalletLogo);
        screens = (new Screen[] {
            new Screen(com.google.android.apps.walletnfcrel.R.id.AccountPickerScreen, this), new Screen(com.google.android.apps.walletnfcrel.R.id.ZipCodeScreen, this), new Screen(com.google.android.apps.walletnfcrel.R.id.AcceptTosScreen, this)
        });
        for (int i = 1; i < screens.length; i++)
        {
            screens[i].mainView.setVisibility(4);
        }

        container.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final SimplifiedSetupProfileActivity this$0;

            public final void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
                    int l1, int i2)
            {
                float f = screens[0].logoSpot.getX();
                float f1 = (float)(screens[0].logoSpot.getWidth() - logo.getWidth()) / 2.0F;
                float f2 = screens[0].logoSpot.getY();
                float f3 = (float)(screens[0].logoSpot.getHeight() - logo.getHeight()) / 2.0F;
                float f4 = (float)screens[0].logoSpot.getWidth() / (float)logo.getWidth();
                logo.animate().translationX(f + f1).translationY(f2 + f3).scaleX(f4).scaleY(f4).setDuration(0L).start();
                container.removeOnLayoutChangeListener(this);
            }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
        });
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (pageIndex == 1 && zipCodeView.onKeyUp(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("setupPageIndex", pageIndex);
        bundle.putInt("previouslySelectedAccount", previouslySelectedAccountIndex);
        bundle.putBoolean("lookForNewAccount", lookForNewAccount);
        bundle.putStringArrayList("lastOwnerNames", lastOwnerNames);
    }

    public void onStart()
    {
        super.onStart();
        connectPeopleClient();
    }

    public void onStop()
    {
        disconnectPeopleClient();
        super.onStop();
    }





/*
    static int access$102(SimplifiedSetupProfileActivity simplifiedsetupprofileactivity, int i)
    {
        simplifiedsetupprofileactivity.previouslySelectedAccountIndex = i;
        return i;
    }

*/








}
