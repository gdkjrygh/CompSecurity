// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
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
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFacedSpan;
import com.skype.android.util.DeviceFeatures;
import java.lang.reflect.Field;

// Referenced classes of package com.skype.android:
//            SkypeConstants, DaggerSkypeDialogFragmentComponent, SkypeDialogFragmentComponent

public class SkypeDialogFragment extends h
    implements SkypeConstants
{
    public static class SkypeAlertDialogBuilder extends android.support.v7.app.AlertDialog.a
    {

        private TypeFaceFactory a;
        private Context b;

        public final android.support.v7.app.AlertDialog.a a(int i)
        {
            a(((CharSequence) (b.getString(i))));
            return this;
        }

        public final android.support.v7.app.AlertDialog.a a(CharSequence charsequence)
        {
            charsequence = new SpannableStringBuilder(charsequence);
            charsequence.setSpan(new TypeFacedSpan(a), 0, charsequence.length(), 33);
            super.a(charsequence);
            return this;
        }

        public SkypeAlertDialogBuilder(Context context)
        {
            super(context, 0x7f0900cd);
            b = context;
            a = SegoeTypeFaceFactory.getInstance((Application)context.getApplicationContext());
        }
    }


    public static final String DEFAULT_TAG = "skypeDialog";
    private SkypeDialogFragmentComponent component;
    protected LifecycleSupport lifecycleSupport;
    ObjectInterfaceFinder objectInterfaceFinder;
    private android.content.DialogInterface.OnDismissListener onDismissListener;

    public SkypeDialogFragment()
    {
    }

    public static SkypeDialogFragment create(int i, Class class1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.skype.objId", i);
        return create(bundle, class1);
    }

    public static SkypeDialogFragment create(Bundle bundle, Class class1)
    {
        try
        {
            class1 = (SkypeDialogFragment)class1.newInstance();
            class1.setArguments(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
        return class1;
    }

    public static SkypeDialogFragment create(ObjectInterface objectinterface, Class class1)
    {
        return create(objectinterface.getObjectID(), class1);
    }

    public static void dismiss(l l1)
    {
        h h1 = (h)l1.a("skypeDialog");
        if (h1 != null)
        {
            l1.a().b(h1).b();
        }
    }

    public static android.support.v7.app.AlertDialog.a getMaterialDialogBuilder(Context context)
    {
        Object obj = context;
        if (!DeviceFeatures.f())
        {
            obj = new ContextThemeWrapper(context, 0x7f0900cd);
        }
        return new SkypeAlertDialogBuilder(((Context) (obj)));
    }

    public AppCompatActivity getActionBarActivity()
    {
        return (AppCompatActivity)getActivity();
    }

    protected SkypeDialogFragmentComponent getComponent()
    {
        if (component == null)
        {
            SkypeApplicationComponent.ComponentProvider componentprovider = (SkypeApplicationComponent.ComponentProvider)getActivity().getApplication();
            component = DaggerSkypeDialogFragmentComponent.builder().a(componentprovider.a()).a(new ActivityModule(getActivity())).a();
        }
        return component;
    }

    public ObjectInterface getObjectInterface(Class class1)
    {
        return objectInterfaceFinder.get(class1, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (getShowsDialog())
        {
            try
            {
                Field field = android/support/v4/app/Fragment.getDeclaredField("mFragmentId");
                field.setAccessible(true);
                field.set(this, Integer.valueOf(-1));
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
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

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (onDismissListener != null)
        {
            onDismissListener.onDismiss(dialoginterface);
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

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = ProxyFactory.get(this);
        if (view != null)
        {
            view.injectViews();
        }
    }

    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        onDismissListener = ondismisslistener;
    }

    public void show(l l1)
    {
        o o1 = l1.a();
        h h1 = (h)l1.a("skypeDialog");
        if (h1 != null)
        {
            o1.b(h1);
        }
        o1.a(this, "skypeDialog");
        o1.b();
        l1.b();
    }
}
