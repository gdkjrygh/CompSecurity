// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.facebook.FacebookSdk;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.adapters.ConfigAdapter;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.activity.SimpleActivityLifecycleCallbacks;
import me.lyft.android.infrastructure.s3.ConfigDTO;
import me.lyft.android.infrastructure.s3.ConfigsDTO;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.MainActivity;
import me.lyft.android.utils.Keyboard;

public class EnvironmentSwitcherView extends LinearLayout
{

    IS3Api IS3Api;
    ActivityController activityController;
    private ArrayAdapter adapter;
    AnalyticsService analyticsService;
    AppFlow appFlow;
    private ConfigsDTO configs;
    ListView environmentListView;
    SimpleActivityLifecycleCallbacks lifecycleCallback;
    ILogoutService logoutService;
    ILyftPreferences lyftPreferences;
    EditText searchEditText;
    IViewErrorHandler viewErrorHandler;
    private TextWatcher watcher;

    public EnvironmentSwitcherView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        watcher = new TextWatcher() {

            final EnvironmentSwitcherView this$0;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                adapter.getFilter().filter(charsequence);
            }

            
            {
                this$0 = EnvironmentSwitcherView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void populateList()
    {
        int i = configs.getIndexForApiRoot(lyftPreferences.getLyftApiRoot());
        adapter = new ConfigAdapter(getContext(), 0x109000f, configs);
        environmentListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        environmentListView.requestFocusFromTouch();
        environmentListView.setItemChecked(i, true);
        environmentListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final EnvironmentSwitcherView this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                Keyboard.hideKeyboard(searchEditText);
                adapterview = (ConfigDTO)adapter.getItem(j);
                FacebookSdk.setApplicationId(adapterview.getFacebookAppId());
                analyticsService.setAnalyticsUrl(adapterview.getAnalyticsUrl());
                populatePreferences(adapterview);
                logoutService.logout("environment_switch");
                appFlow.goTo(new me.lyft.android.ui.landing.LandingScreens.IntroductionScreen("environment_switch"));
                restartMainActivity();
            }

            
            {
                this$0 = EnvironmentSwitcherView.this;
                super();
            }
        });
    }

    private void populatePreferences(ConfigDTO configdto)
    {
        lyftPreferences.setFacebookAppId(configdto.getFacebookAppId());
        lyftPreferences.setStripeKey(configdto.getStripeKey());
        lyftPreferences.setLyftApiRoot(configdto.getUrl());
        lyftPreferences.setEnvironmentName(configdto.getDisplayName());
        lyftPreferences.setAtsApiRoot(configdto.getAtsUrl());
        lyftPreferences.setLyftWebRoot(configdto.getWebUrl());
    }

    private void restartMainActivity()
    {
        final Application app = (Application)getContext().getApplicationContext();
        lifecycleCallback = new SimpleActivityLifecycleCallbacks() {

            final EnvironmentSwitcherView this$0;
            final Application val$app;

            public void onActivityDestroyed(Activity activity)
            {
                super.onActivityDestroyed(activity);
                app.unregisterActivityLifecycleCallbacks(lifecycleCallback);
                activity.startActivity(MainActivity.createIntent(activity));
            }

            
            {
                this$0 = EnvironmentSwitcherView.this;
                app = application;
                super();
            }
        };
        app.registerActivityLifecycleCallbacks(lifecycleCallback);
        activityController.finish();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder.attach(this).bind(IS3Api.getConfigs(), new AsyncCall() {

                final EnvironmentSwitcherView this$0;

                public void onFail(Throwable throwable)
                {
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((ConfigsDTO)obj);
                }

                public void onSuccess(ConfigsDTO configsdto)
                {
                    configs = configsdto;
                    populateList();
                    searchEditText.addTextChangedListener(watcher);
                    Keyboard.showKeyboard(searchEditText);
                }

            
            {
                this$0 = EnvironmentSwitcherView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }


/*
    static ConfigsDTO access$002(EnvironmentSwitcherView environmentswitcherview, ConfigsDTO configsdto)
    {
        environmentswitcherview.configs = configsdto;
        return configsdto;
    }

*/





}
