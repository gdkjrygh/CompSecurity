// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.g;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import com.skype.ObjectInterface;
import com.skype.android.analytics.AnalyticsInAppObserver;
import com.skype.android.analytics.AnalyticsLifecycleObserver;
import com.skype.android.app.ActionBarProvider;
import com.skype.android.crash.CrashReporter;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.ActivityAccountStateObserver;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.LayoutAdapter;
import com.skype.android.inject.LifecycleListener;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.inject.ObjectInterfaceFinder;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyFactory;
import com.skype.android.inject.ShakeBugReportObserver;
import com.skype.android.inject.SubscriberLifecycleListener;
import com.skype.android.inject.UpActionObserver;
import com.skype.android.text.TypeFaceTextStyleCallback;
import com.skype.android.util.permission.OnRequestPermissionsResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android:
//            SkypeConstants, SkypeFragment, DaggerSkypeActivityComponent, a, 
//            SkypeActivityComponent

public abstract class SkypeActivity extends AppCompatActivity
    implements LayoutInflaterFactory, SkypeConstants, ActionBarProvider
{

    protected static final Logger log = Logger.getLogger("Skype");
    ActivityAccountStateObserver activityAccountStateObserver;
    AnalyticsInAppObserver analyticsInAppObserver;
    AnalyticsLifecycleObserver analyticsObserver;
    private SkypeActivityComponent component;
    CrashReporter crashReporter;
    protected LifecycleSupport lifecycleSupport;
    ObjectInterfaceFinder objectInterfaceFinder;
    ShakeBugReportObserver shakeBugReportObserver;
    TypeFaceTextStyleCallback typeFaceTextStyleCallback;
    UpActionObserver upActionObserver;

    public SkypeActivity()
    {
    }

    private List getActiveFragments()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = getSupportFragmentManager().f();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)((Iterator) (obj)).next();
                if (fragment instanceof SkypeFragment)
                {
                    arraylist.add((SkypeFragment)fragment);
                }
            } while (true);
        }
        return arraylist;
    }

    protected SkypeActivityComponent getComponent()
    {
        if (component == null)
        {
            SkypeApplicationComponent.ComponentProvider componentprovider = (SkypeApplicationComponent.ComponentProvider)getApplication();
            component = DaggerSkypeActivityComponent.builder().a(componentprovider.a()).a(new ActivityModule(this)).a();
        }
        return component;
    }

    public ObjectInterface getObjectInterface(Class class1)
    {
        return objectInterfaceFinder.get(class1, this);
    }

    public void onBackPressed()
    {
        for (Iterator iterator = getActiveFragments().iterator(); iterator.hasNext(); ((SkypeFragment)iterator.next()).onBackPressed()) { }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        new a(this);
        getComponent().inject(this);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            int i;
            if (android.os.Build.VERSION.SDK_INT >= 23)
            {
                i = getColor(0x7f0f0009);
            } else
            {
                i = getResources().getColor(0x7f0f0009);
            }
            setTaskDescription(new android.app.ActivityManager.TaskDescription(null, null, i));
        }
        g.a((LayoutInflater)getSystemService("layout_inflater"), this);
        super.onCreate(bundle);
        activityAccountStateObserver.loginIfRequired();
        lifecycleSupport = new LifecycleSupport(new LifecycleListener[] {
            new SubscriberLifecycleListener(EventBusInstance.a(), this), activityAccountStateObserver, new LayoutAdapter(this), analyticsObserver, analyticsInAppObserver, upActionObserver
        });
        if (shakeBugReportObserver != null)
        {
            lifecycleSupport.addListener(shakeBugReportObserver);
        }
        lifecycleSupport.onCreate(bundle);
        crashReporter.a(this);
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        boolean flag = super.onCreatePanelMenu(i, menu);
        if (flag)
        {
            typeFaceTextStyleCallback.a(menu);
        }
        return flag;
    }

    public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        View view1 = super.onCreateView(view, s, context, attributeset);
        view = view1;
        if (view1 == null)
        {
            view = typeFaceTextStyleCallback.a(s, context, attributeset);
        }
        return view;
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view1 = super.onCreateView(s, context, attributeset);
        View view = view1;
        if (view1 == null)
        {
            view = typeFaceTextStyleCallback.a(s, context, attributeset);
        }
        return view;
    }

    protected void onDestroy()
    {
        lifecycleSupport.onDestroy();
        super.onDestroy();
    }

    protected void onPause()
    {
        lifecycleSupport.onPause();
        super.onPause();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        boolean flag = super.onPreparePanel(i, view, menu);
        if (flag)
        {
            typeFaceTextStyleCallback.a(menu);
        }
        return flag;
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        EventBusInstance.a().b(new OnRequestPermissionsResult(i, as, ai));
    }

    protected void onResume()
    {
        super.onResume();
        lifecycleSupport.onResume();
    }

    protected void onStart()
    {
        super.onStart();
        lifecycleSupport.onStart();
    }

    protected void onStop()
    {
        lifecycleSupport.onStop();
        super.onStop();
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        Proxy proxy = ProxyFactory.get(this);
        if (proxy != null)
        {
            proxy.injectViews();
        }
    }

    public boolean onSupportNavigateUp()
    {
        for (Iterator iterator = getActiveFragments().iterator(); iterator.hasNext(); ((SkypeFragment)iterator.next()).onSupportNavigateUp()) { }
        return upActionObserver.onUpEvent() || super.onSupportNavigateUp();
    }

}
