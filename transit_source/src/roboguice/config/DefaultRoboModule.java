// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.config;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.AnnotatedConstantBindingBuilder;
import com.google.inject.binder.ConstantBindingBuilder;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import roboguice.activity.RoboActivity;
import roboguice.event.EventManager;
import roboguice.event.ObservesTypeListener;
import roboguice.event.eventListener.factory.EventListenerThreadingDecorator;
import roboguice.inject.AccountManagerProvider;
import roboguice.inject.AssetManagerProvider;
import roboguice.inject.ContentResolverProvider;
import roboguice.inject.ContextScope;
import roboguice.inject.ContextScopedSystemServiceProvider;
import roboguice.inject.ContextSingleton;
import roboguice.inject.ExtrasListener;
import roboguice.inject.FragmentManagerProvider;
import roboguice.inject.HandlerProvider;
import roboguice.inject.PreferenceListener;
import roboguice.inject.ResourceListener;
import roboguice.inject.ResourcesProvider;
import roboguice.inject.SharedPreferencesProvider;
import roboguice.inject.SystemServiceProvider;
import roboguice.inject.ViewListener;
import roboguice.service.RoboService;
import roboguice.util.Ln;
import roboguice.util.Strings;

public class DefaultRoboModule extends AbstractModule
{

    protected static final Class accountManagerClass;
    protected static final Class fragmentManagerClass;
    protected Application application;
    protected ContextScope contextScope;
    protected ResourceListener resourceListener;
    protected ViewListener viewListener;

    public DefaultRoboModule(Application application1, ContextScope contextscope, ViewListener viewlistener, ResourceListener resourcelistener)
    {
        application = application1;
        contextScope = contextscope;
        viewListener = viewlistener;
        resourceListener = resourcelistener;
    }

    protected void configure()
    {
        com.google.inject.Provider provider = getProvider(android/content/Context);
        ExtrasListener extraslistener = new ExtrasListener(provider);
        PreferenceListener preferencelistener = new PreferenceListener(provider, application, contextScope);
        EventListenerThreadingDecorator eventlistenerthreadingdecorator = new EventListenerThreadingDecorator();
        String s = android.provider.Settings.Secure.getString(application.getContentResolver(), "android_id");
        try
        {
            PackageInfo packageinfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            bind(android/content/pm/PackageInfo).toInstance(packageinfo);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
        if (Strings.notEmpty(s))
        {
            bindConstant().annotatedWith(Names.named("android_id")).to(s);
        }
        bind(roboguice/inject/ViewListener).toInstance(viewListener);
        bind(roboguice/inject/PreferenceListener).toInstance(preferencelistener);
        bindScope(roboguice/inject/ContextSingleton, contextScope);
        bind(roboguice/inject/ContextScope).toInstance(contextScope);
        bind(android/content/res/AssetManager).toProvider(roboguice/inject/AssetManagerProvider);
        bind(android/content/Context).toProvider(Key.get(new TypeLiteral() {

            final DefaultRoboModule this$0;

            
            {
                this$0 = DefaultRoboModule.this;
                super();
            }
        })).in(roboguice/inject/ContextSingleton);
        bind(android/app/Activity).toProvider(Key.get(new TypeLiteral() {

            final DefaultRoboModule this$0;

            
            {
                this$0 = DefaultRoboModule.this;
                super();
            }
        })).in(roboguice/inject/ContextSingleton);
        bind(roboguice/activity/RoboActivity).toProvider(Key.get(new TypeLiteral() {

            final DefaultRoboModule this$0;

            
            {
                this$0 = DefaultRoboModule.this;
                super();
            }
        })).in(roboguice/inject/ContextSingleton);
        bind(android/app/Service).toProvider(Key.get(new TypeLiteral() {

            final DefaultRoboModule this$0;

            
            {
                this$0 = DefaultRoboModule.this;
                super();
            }
        })).in(roboguice/inject/ContextSingleton);
        bind(roboguice/service/RoboService).toProvider(Key.get(new TypeLiteral() {

            final DefaultRoboModule this$0;

            
            {
                this$0 = DefaultRoboModule.this;
                super();
            }
        })).in(roboguice/inject/ContextSingleton);
        bind(android/content/SharedPreferences).toProvider(roboguice/inject/SharedPreferencesProvider);
        bind(android/content/res/Resources).toProvider(roboguice/inject/ResourcesProvider);
        bind(android/content/ContentResolver).toProvider(roboguice/inject/ContentResolverProvider);
        bind(android/app/Application).toInstance(application);
        bind(roboguice/event/eventListener/factory/EventListenerThreadingDecorator).toInstance(eventlistenerthreadingdecorator);
        bind(android/os/Handler).toProvider(roboguice/inject/HandlerProvider);
        bind(android/location/LocationManager).toProvider(new SystemServiceProvider("location"));
        bind(android/view/WindowManager).toProvider(new SystemServiceProvider("window"));
        bind(android/app/ActivityManager).toProvider(new SystemServiceProvider("activity"));
        bind(android/os/PowerManager).toProvider(new SystemServiceProvider("power"));
        bind(android/app/AlarmManager).toProvider(new SystemServiceProvider("alarm"));
        bind(android/app/NotificationManager).toProvider(new SystemServiceProvider("notification"));
        bind(android/app/KeyguardManager).toProvider(new SystemServiceProvider("keyguard"));
        bind(android/os/Vibrator).toProvider(new SystemServiceProvider("vibrator"));
        bind(android/net/ConnectivityManager).toProvider(new SystemServiceProvider("connectivity"));
        bind(android/net/wifi/WifiManager).toProvider(new SystemServiceProvider("wifi"));
        bind(android/view/inputmethod/InputMethodManager).toProvider(new SystemServiceProvider("input_method"));
        bind(android/hardware/SensorManager).toProvider(new SystemServiceProvider("sensor"));
        bind(android/telephony/TelephonyManager).toProvider(new SystemServiceProvider("phone"));
        bind(android/media/AudioManager).toProvider(new SystemServiceProvider("audio"));
        bind(android/view/LayoutInflater).toProvider(new ContextScopedSystemServiceProvider(provider, "layout_inflater"));
        bind(android/app/SearchManager).toProvider(new ContextScopedSystemServiceProvider(provider, "search"));
        bindListener(Matchers.any(), resourceListener);
        bindListener(Matchers.any(), extraslistener);
        bindListener(Matchers.any(), viewListener);
        bindListener(Matchers.any(), preferencelistener);
        bindListener(Matchers.any(), new ObservesTypeListener(getProvider(roboguice/event/EventManager), eventlistenerthreadingdecorator));
        requestInjection(eventlistenerthreadingdecorator);
        requestStaticInjection(new Class[] {
            roboguice/util/Ln
        });
        if (fragmentManagerClass != null)
        {
            bind(fragmentManagerClass).toProvider(roboguice/inject/FragmentManagerProvider);
        }
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            bind(accountManagerClass).toProvider(roboguice/inject/AccountManagerProvider);
        }
    }

    static 
    {
        Class class1 = null;
        Class class2 = Class.forName("android.support.v4.app.FragmentManager");
        class1 = class2;
_L4:
        fragmentManagerClass = class1;
        class1 = null;
        class2 = Class.forName("android.accounts.AccountManager");
        class1 = class2;
_L2:
        accountManagerClass = class1;
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
