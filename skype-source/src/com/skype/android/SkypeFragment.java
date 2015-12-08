// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.skype.ObjectInterface;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.LifecycleListener;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.inject.ObjectInterfaceFinder;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyFactory;
import com.skype.android.inject.SubscriberLifecycleListener;
import java.lang.ref.WeakReference;

// Referenced classes of package com.skype.android:
//            SkypeConstants, DaggerSkypeFragmentComponent, SkypeFragmentComponent

public class SkypeFragment extends Fragment
    implements SkypeConstants
{

    private WeakReference attached;
    private SkypeFragmentComponent component;
    protected LifecycleSupport lifecycleSupport;
    ObjectInterfaceFinder objectInterfaceFinder;

    public SkypeFragment()
    {
    }

    public AppCompatActivity getActionBarActivity()
    {
        return (AppCompatActivity)getActivity();
    }

    protected SkypeFragmentComponent getComponent()
    {
        if (component == null)
        {
            SkypeApplicationComponent.ComponentProvider componentprovider = (SkypeApplicationComponent.ComponentProvider)getActivity().getApplication();
            component = DaggerSkypeFragmentComponent.builder().a(componentprovider.a()).a(new ActivityModule(getActivity())).a();
        }
        return component;
    }

    public ObjectInterface getObjectInterface(Class class1)
    {
        return objectInterfaceFinder.get(class1, this);
    }

    public void onAttach(Context context)
    {
        super.onAttach(context);
        Context context1;
        if (attached == null)
        {
            context1 = null;
        } else
        {
            context1 = (Context)attached.get();
        }
        if (context1 != context)
        {
            if (getRetainInstance())
            {
                getComponent().inject(this);
            }
            attached = new WeakReference(context);
        }
    }

    protected void onBackPressed()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport = new LifecycleSupport(new LifecycleListener[] {
            new SubscriberLifecycleListener(EventBusInstance.a(), this)
        });
        lifecycleSupport.onCreate(bundle);
    }

    public void onDestroy()
    {
        lifecycleSupport.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Proxy proxy = ProxyFactory.get(this);
        if (proxy != null)
        {
            proxy.clearViews();
        }
    }

    public void onPause()
    {
        lifecycleSupport.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        lifecycleSupport.onResume();
    }

    public void onStart()
    {
        super.onStart();
        lifecycleSupport.onStart();
    }

    public void onStop()
    {
        lifecycleSupport.onStop();
        super.onStop();
    }

    protected void onSupportNavigateUp()
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = ProxyFactory.get(this);
        if (view != null)
        {
            view.injectViews();
        }
    }
}
