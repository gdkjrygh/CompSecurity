// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LocatorListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.StoreListController;
import com.dominos.controllers.interfaces.IDominosStoreList;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.fragments.SignInFragment;
import com.dominos.fragments.SignInFragment_;
import com.dominos.nina.dialog.agent.CarryoutLoadGuard;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.views.SavedAddressView;
import com.dominos.views.SavedAddressView_;
import com.dominos.views.ToolBarView;
import com.google.a.b.ar;
import com.nuance.b.e.c;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, CartActivity_, UserLoginActivity_, StoreProfileActivity_

public class StoreListActivity extends LabsBaseListActivity
    implements com.dominos.adapters.LocatorListAdapter.OnItemLinkClickListener, IDominosStoreList, com.dominos.fragments.SignInFragment.SignInClickListener
{

    private static final int ADDRESS_LIST_AT_TOP = 0;
    private static final int ADDRESS_LIST_SIZE_SINGLE = 1;
    private static final int REQUEST_OPTIONS = 1;
    private static final String TAG = "OLO.StoreListActivity";
    private android.view.View.OnClickListener OCL;
    EditText addressEntry;
    int addressIndex;
    Button chooseFromSavedLocButton;
    private UserObject currentUser;
    Animation fadeIn;
    Animation fadeOut;
    LayoutInflater inflater;
    private boolean isStoreAutoLoadInProgress;
    private BusSubscriber mBusSubscriber;
    ControllerLocator mControllerLocator;
    private String mDomCommands[];
    LinearLayout mSavedLocationsList;
    FrameLayout mSignInFragmentContainer;
    private StoreListController mStoreListController;
    private StoreManager mStoreManager;
    ToolBarView mToolBar;
    protected LinearLayout savedLocationView;
    ScrollView savedLocationsScroller;
    protected LinearLayout storeListHeader;
    private ar stores;
    private boolean userEnteredAddress;

    public StoreListActivity()
    {
        isStoreAutoLoadInProgress = false;
        userEnteredAddress = false;
        mDomCommands = (new CommandBuilder()).appendReset("CarryoutAgency").build();
        OCL = new _cls1();
        addressIndex = -1;
    }

    private void checkLocationProvider()
    {
        if (!mStoreListController.isLocationProviderExists())
        {
            findViewById(0x7f0f00dc).setVisibility(8);
        }
    }

    private void fadeOutSavedLocations()
    {
        if (savedLocationsScroller != null && savedLocationsScroller.getVisibility() != 8)
        {
            savedLocationsScroller.startAnimation(fadeOut);
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.SavedAddressSelected());
        }
    }

    private void initLocationRows()
    {
        if (currentUser != null && currentUser.getAddressList().size() > 0)
        {
            savedLocationView.findViewById(0x7f0f03b2).setVisibility(0);
            mSavedLocationsList.removeAllViews();
            ArrayList arraylist = currentUser.getAddressList();
            int i = 0;
            while (i < arraylist.size()) 
            {
                SavedAddressView savedaddressview = SavedAddressView_.build(this);
                com.dominos.views.SavedAddressView.ViewType viewtype = com.dominos.views.SavedAddressView.ViewType.CENTER;
                if (arraylist.size() == 1)
                {
                    viewtype = com.dominos.views.SavedAddressView.ViewType.SINGLE;
                } else
                if (i == 0)
                {
                    viewtype = com.dominos.views.SavedAddressView.ViewType.TOP;
                } else
                if (i == arraylist.size() - 1)
                {
                    viewtype = com.dominos.views.SavedAddressView.ViewType.BOTTOM;
                }
                savedaddressview.bindAddress((LabsAddress)arraylist.get(i), i, viewtype);
                savedaddressview.setOnClickListener(OCL);
                mSavedLocationsList.addView(savedaddressview);
                i++;
            }
            FontManager.applyDominosFont(mSavedLocationsList);
            addressEntry.setOnFocusChangeListener(new _cls7());
            if (getListAdapter() != null && getListAdapter().getCount() > 0)
            {
                chooseFromSavedLocButton.setVisibility(8);
                return;
            } else
            {
                chooseFromSavedLocButton.setVisibility(0);
                FontManager.applyDominosFont(chooseFromSavedLocButton);
                return;
            }
        } else
        {
            addressEntry.setOnFocusChangeListener(new _cls8());
            savedLocationView.findViewById(0x7f0f03b2).setVisibility(8);
            return;
        }
    }

    private void navigateToCart()
    {
        mSpeechManager.preventNinaPause();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        setResult(1);
        finish();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.StoreSelectionResponded(true));
    }

    private void navigateToLogin()
    {
        UserProfileManager userprofilemanager = (UserProfileManager)mMobileSession.getManager("user_manager");
        Intent intent = new Intent(this, com/dominos/activities/UserLoginActivity_);
        if (userprofilemanager.isRemembered())
        {
            intent.putExtra("confirm-login", true);
        } else
        {
            intent.putExtra("return-to-caller", true);
        }
        startActivity(intent);
    }

    private void onInfoClick(View view)
    {
        view = (Bundle)view.getTag();
        String s = view.getString("storeNumber");
        mAnalyticsUtil.postStoreListInfoClicked(s);
        if (c.i())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        }
        StoreProfileActivity_.intent(this).mBundle(view).startForResult(50);
    }

    private void onStoreListSelected(LocatorStore locatorstore)
    {
        mOrderManager.createOrderForCarryout(locatorstore.getStoreId(), new _cls6());
    }

    private void resetCarryoutAgency()
    {
        SpeechContext.updateAgents(new String[] {
            "CarryoutAgency", "RESET"
        });
        LogUtil.d("OLO.StoreListActivity", "CarryoutAgency set as RESET", new Object[0]);
    }

    private void selectSavedLocation(int i)
    {
        Object obj = (LabsAddress)currentUser.getAddressList().get(i);
        obj = (new StringBuilder()).append(((LabsAddress) (obj)).getStreetLine()).append(" ").append(((LabsAddress) (obj)).getCityRegionLine()).toString();
        addressEntry.setText(((CharSequence) (obj)));
        onSubmit(addressEntry);
    }

    private void selectStoreFromList(int i)
    {
        if (i > 0 && i <= stores.size())
        {
            onStoreListSelected((LocatorStore)stores.get(i - 1));
            return;
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.StoreSelectionResponded(false));
            return;
        }
    }

    private void setOrResetAgency()
    {
        if (userEnteredAddress)
        {
            mSpeechManager.setShouldRepeat(false);
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent(this));
        }
        userEnteredAddress = false;
        if (!c.i())
        {
            return;
        }
        if (SpeechContext.getAgentNameInFocus().equalsIgnoreCase(CarryoutLoadGuard.NAME))
        {
            SpeechContext.updateAgents(new String[] {
                CarryoutLoadGuard.NAME, "DONE"
            });
            LogUtil.d("OLO.StoreListActivity", "CarryoutLoadGuard set as DONE", new Object[0]);
            return;
        } else
        {
            resetCarryoutAgency();
            return;
        }
    }

    private void showGpsSettings()
    {
        startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1);
    }

    private void showSignInFragment()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            mSignInFragmentContainer.setVisibility(8);
            return;
        } else
        {
            mSignInFragmentContainer.setVisibility(0);
            SignInFragment signinfragment = SignInFragment_.builder().build();
            signinfragment.setSignInClickListener(this);
            getSupportFragmentManager().a().b(0x7f0f00dd, signinfragment).b();
            return;
        }
    }

    private void speechSearchComplete(LocatorResult locatorresult)
    {
        if (locatorresult == null)
        {
            mStoreManager.setStores(null);
        }
        setOrResetAgency();
    }

    public boolean handleHomeButtonClicked()
    {
        mSpeechManager.resetDialogModel();
        finish();
        return true;
    }

    public void hideLoading()
    {
        super.hideLoading();
        isStoreAutoLoadInProgress = false;
    }

    protected void onActivityResult(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            setResult(1);
            break;
        }
        finish();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j == -1 && i == 1)
        {
            onUseLocation(null);
        }
    }

    void onAfterInject()
    {
        mStoreListController = mControllerLocator.getStoreListController(this);
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
    }

    public void onBackPressed()
    {
        if (savedLocationsScroller != null && savedLocationsScroller.getVisibility() != 8)
        {
            fadeOutSavedLocations();
            findViewById(0x7f0f00d9).requestFocus();
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.SavedAddressCanceled());
            return;
        } else
        {
            mSpeechManager.resetDialogModel();
            super.onBackPressed();
            finish();
            return;
        }
    }

    public void onDestroy()
    {
        mStoreManager.clearStores();
        super.onDestroy();
    }

    public void onLinkClickListener(View view)
    {
        onInfoClick(view);
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
        listview = (LocatorStore)listview.getItemAtPosition(i);
        if (listview != null)
        {
            onStoreListSelected(listview);
        }
    }

    public void onLocateStoresCompleted(LocatorResult locatorresult)
    {
        if (locatorresult != null)
        {
            updateList(locatorresult);
        } else
        {
            showLongToast(getString(0x7f08018e));
            mStoreManager.clearStores();
        }
        speechSearchComplete(locatorresult);
        hideLoading();
    }

    public void onPause()
    {
        super.onPause();
        if (mBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mBusSubscriber);
        }
    }

    protected void onPostResume()
    {
        super.onPostResume();
        showSignInFragment();
    }

    public void onResume()
    {
        super.onResume();
        currentUser = mProfileManager.getCurrentUser();
        initLocationRows();
        if (mBusSubscriber == null)
        {
            mBusSubscriber = new BusSubscriber(null);
        }
        App.getInstance().bus.register(mBusSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.StoreListActivityTransition());
    }

    public void onSignInClicked()
    {
        mAnalyticsUtil.postLocatorSignInButton();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        navigateToLogin();
    }

    public void onSubmit(View view)
    {
        fadeOutSavedLocations();
        mAnalyticsUtil.postStoreListSearchClick();
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view = addressEntry.getText().toString();
        findViewById(0x7f0f00d9).requestFocus();
        showLoading();
        mStoreListController.locateStores(view, view);
    }

    public void onUseLocation(View view)
    {
        if (view != null)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        fadeOutSavedLocations();
        findViewById(0x7f0f00d9).requestFocus();
        showLoading();
        mStoreListController.findStoresAtCurrentLocation();
    }

    void setupStoreList()
    {
        mToolBar.setTitle(getString(0x7f0802d6));
        checkLocationProvider();
        mAnalyticsUtil.postStoreListSetUp();
        addressEntry.setOnEditorActionListener(new _cls2());
        currentUser = mProfileManager.getCurrentUser();
        fadeIn.setFillAfter(true);
        fadeOut.setAnimationListener(new _cls3());
        savedLocationView = (LinearLayout)inflater.inflate(0x7f0300b0, null);
        getListView().addHeaderView(savedLocationView, null, false);
        FontManager.applyDominosFont((Button)savedLocationView.findViewById(0x7f0f03b2));
        storeListHeader = (LinearLayout)inflater.inflate(0x7f0300af, null);
        getListView().addHeaderView(storeListHeader, null, false);
        FontManager.applyDominosFont((TextView)storeListHeader.findViewById(0x7f0f03b1));
        getListView().addFooterView(getNinaPaddingView(), null, false);
        initLocationRows();
        findViewById(0x7f0f00d9).requestFocus();
        if (addressIndex != -1 && currentUser != null)
        {
            Object obj = (LabsAddress)currentUser.getAddressList().get(addressIndex);
            obj = (new StringBuilder()).append(((LabsAddress) (obj)).getStreetLine()).append(" ").append(((LabsAddress) (obj)).getCityRegionLine()).toString();
            addressEntry.setText(((CharSequence) (obj)));
            onSubmit(addressEntry);
        }
        showLoading();
        isStoreAutoLoadInProgress = true;
        mStoreListController.findStoresAtCurrentLocation();
    }

    public void showGpsEnableDialog()
    {
        mActivityHelper.showOptionAlert(AlertType.ENABLE_LOCATION, mDomCommands, new _cls4());
        hideLoading();
    }

    public void showLocations(View view)
    {
        savedLocationsScroller.setVisibility(4);
        savedLocationsScroller.startAnimation(fadeIn);
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.SavedLocationShownRequest());
    }

    public void showRetryLocationDialog()
    {
        mActivityHelper.showOptionAlert(AlertType.LOCATION_ERROR, mDomCommands, new _cls5());
        hideLoading();
    }

    void updateList(LocatorResult locatorresult)
    {
        ar ar1;
        if (locatorresult == null)
        {
            ar1 = ar.d();
        } else
        {
            ar1 = locatorresult.getStores();
        }
        stores = ar1;
        mStoreManager.setStores(stores);
        mAnalyticsUtil.postStoreListSearchResults(locatorresult, stores);
        currentUser = mProfileManager.getCurrentUser();
        if (stores.size() > 0)
        {
            chooseFromSavedLocButton.setVisibility(8);
            storeListHeader.findViewById(0x7f0f03b1).setVisibility(0);
        } else
        {
            if (currentUser != null)
            {
                chooseFromSavedLocButton.setVisibility(0);
            }
            storeListHeader.findViewById(0x7f0f03b1).setVisibility(8);
        }
        locatorresult = new LocatorListAdapter(this, stores);
        locatorresult.setOnItemLinkClickListener(this);
        setListAdapter(locatorresult);
    }






/*
    static boolean access$502(StoreListActivity storelistactivity, boolean flag)
    {
        storelistactivity.userEnteredAddress = flag;
        return flag;
    }

*/




    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StoreListActivity this$0;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            selectSavedLocation(i);
        }

        _cls1()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnFocusChangeListener
    {

        final StoreListActivity this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag)
            {
                if (c.i())
                {
                    userEnteredAddress = true;
                    App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
                }
                savedLocationsScroller.setVisibility(4);
                savedLocationsScroller.startAnimation(fadeIn);
                return;
            } else
            {
                fadeOutSavedLocations();
                return;
            }
        }

        _cls7()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnFocusChangeListener
    {

        final StoreListActivity this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag && c.i())
            {
                userEnteredAddress = true;
                App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            }
        }

        _cls8()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls6 extends com.dominos.android.sdk.core.order.OrderManager.CreateCarryoutOrderCallback
    {

        final StoreListActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onCreateOrderError(RequestErrorCode requesterrorcode)
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR, mDomCommands);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onOrderCreated(LabsOrder labsorder)
        {
            navigateToCart();
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null, mDomCommands, null);
        }

        public void onStoreClosed()
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED, mDomCommands);
        }

        public void onStoreOffline(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null, mDomCommands, null);
        }

        _cls6()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class BusSubscriber
    {

        final StoreListActivity this$0;

        public void storeSelectEvent(final com.dominos.bus.events.SpeechEvents.SpeechActionEvent actionEvent)
        {
            class _cls1
                implements Runnable
            {

                final BusSubscriber this$1;
                final com.dominos.bus.events.SpeechEvents.SpeechActionEvent val$actionEvent;

                public void run()
                {
                    _cls9..SwitchMap.com.dominos.bus.events.SpeechEvents.ActionType[actionEvent.getActionType().ordinal()];
                    JVM INSTR tableswitch 1 4: default 44
                //                               1 45
                //                               2 69
                //                               3 113
                //                               4 125;
                       goto _L1 _L2 _L3 _L4 _L5
_L1:
                    return;
_L2:
                    selectStoreFromList(Integer.valueOf(actionEvent.getData()).intValue());
                    return;
_L3:
                    if (!isStoreAutoLoadInProgress)
                    {
                        SpeechContext.updateAgents(new String[] {
                            CarryoutLoadGuard.NAME, "DONE"
                        });
                        LogUtil.d("OLO.StoreListActivity", "CarryoutLoadGuard set as DONE", new Object[0]);
                        return;
                    }
                      goto _L1
_L4:
                    showLocations(null);
                    return;
_L5:
                    selectSavedLocation(Integer.valueOf(actionEvent.getData()).intValue() - 1);
                    return;
                }

                _cls1()
                {
                    this$1 = BusSubscriber.this;
                    actionEvent = speechactionevent;
                    super();
                }

                private class _cls9
                {

                    static final int $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[];

                    static 
                    {
                        $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType = new int[com.dominos.bus.events.SpeechEvents.ActionType.values().length];
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.SELECT_STORE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.CARRYOUT_LOAD_GUARD_FOCUSED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.SHOW_SAVED_ADDRESS.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.SELECT_SAVED_LOCATION.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

            }

            runOnUiThread(new _cls1());
        }

        private BusSubscriber()
        {
            this$0 = StoreListActivity.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final StoreListActivity this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6 || i == 5)
            {
                onSubmit(textview);
                return true;
            } else
            {
                return false;
            }
        }

        _cls2()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final StoreListActivity this$0;

        public void onAnimationEnd(Animation animation)
        {
            savedLocationsScroller.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls3()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls4 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final StoreListActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            showGpsSettings();
        }

        _cls4()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }


    private class _cls5 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final StoreListActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            onUseLocation(null);
        }

        _cls5()
        {
            this$0 = StoreListActivity.this;
            super();
        }
    }

}
