// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import dagger.ObjectGraph;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.AppLaunchAnalytics;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityServiceRegistry;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.logging.L;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.map.lyft.LyftMapView;
import me.lyft.android.rx.Binder;
import me.lyft.android.services.AppService;
import me.lyft.android.utils.VersionUtils;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            SlideMenuController, ProgressController, DialogScreensContainer, MainScreensContainer, 
//            MainActivityModule, ProgressView, MenuView

public class MainActivity extends Activity
{

    ActivityController activityController;
    private ActivityResult activityResult;
    ActivityServiceRegistry activityServiceRegistry;
    ApiFacade apiFacade;
    AppFlow appFlow;
    IAppForegroundDetector appForegroundDetector;
    private Binder binder;
    DeepLinkManager deepLinkManager;
    DeveloperTools developerTools;
    DialogFlow dialogFlow;
    private DialogScreensContainer dialogScreensContainer;
    IGoogleApiProvider googleApiProvider;
    ILocationSettingsService locationSettingsService;
    private MainScreensContainer mainScreensContainer;
    LyftMapView mapView;
    DrawerLayout menuDrawer;
    ViewGroup menuPlaceholder;
    private ObjectGraph objectGraph;
    private Action1 onDialogChanged;
    private Action1 onScreenChanged;
    ProgressController progressController;
    private ProgressView progressView;
    ViewGroup rootView;
    ViewGroup screensPlaceholder;
    SlideMenuController slideMenuController;
    IUserSession userSession;

    public MainActivity()
    {
        binder = new Binder();
        onDialogChanged = new Action1() {

            final MainActivity this$0;

            public void call(Screen screen)
            {
                ScreenAnalytics.trackDialogView(screen);
                dialogScreensContainer.goTo(screen);
            }

            public volatile void call(Object obj)
            {
                call((Screen)obj);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
        onScreenChanged = new Action1() {

            final MainActivity this$0;

            public void call(Screen screen)
            {
                L.d("Screen: %s", new Object[] {
                    screen.getName()
                });
                ScreenAnalytics.trackScreenView(screen);
                mainScreensContainer.goTo(screen);
            }

            public volatile void call(Object obj)
            {
                call((Screen)obj);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        };
    }

    private void checkIfMockLocationsUsedInProduction()
    {
        if (!developerTools.isDeveloperMode() && locationSettingsService.mockLocationEnabled())
        {
            dialogFlow.show(new Dialogs.MockLocationsWarningDialog());
        }
    }

    public static Intent createIntent(Context context)
    {
        context = new Intent(context, me/lyft/android/ui/MainActivity);
        context.addFlags(0x14000000);
        return context;
    }

    public static void startActivity(Context context)
    {
        context.startActivity(createIntent(context));
    }

    public void inject(Object obj)
    {
        objectGraph.inject(obj);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        activityResult = ActivityResult.create(i, j, intent);
    }

    public void onBackPressed()
    {
        if (slideMenuController.isOpen())
        {
            slideMenuController.close();
        } else
        {
            if (progressController.isActive())
            {
                super.onBackPressed();
                return;
            }
            if (!dialogScreensContainer.onBack() && !dialogFlow.dismiss() && !mainScreensContainer.onBack() && !appFlow.goBack())
            {
                super.onBackPressed();
                return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        activityController.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AppLaunchAnalytics.onCreateMainActivity();
        AppService.start(this);
        if (VersionUtils.hasLollipop())
        {
            setTaskDescription(new android.app.ActivityManager.TaskDescription(getString(0x7f070066), null, getResources().getColor(0x7f0c00a4)));
        }
        setContentView(0x7f030123);
        getWindow().setBackgroundDrawableResource(0x7f0c00a4);
        ButterKnife.a(this);
        objectGraph = LyftApplication.from(this).getApplicationGraph().plus(new Object[] {
            new MainActivityModule(this)
        });
        objectGraph.inject(this);
        slideMenuController = new SlideMenuController(menuDrawer);
        mapView = new LyftMapView(this);
        Object obj;
        if (bundle != null)
        {
            mapView.onCreate(bundle.getBundle("map_bundle"));
        } else
        {
            mapView.onCreate(null);
        }
        activityController.onCreate(this);
        obj = Scoop.a(objectGraph).a(this);
        progressController = new ProgressController();
        menuDrawer.a(0x7f0200de, 0x800003);
        mainScreensContainer = (MainScreensContainer)((LayoutInflater) (obj)).inflate(0x7f0300a0, screensPlaceholder, false);
        dialogScreensContainer = (DialogScreensContainer)((LayoutInflater) (obj)).inflate(0x7f03005d, rootView, false);
        progressView = (ProgressView)((LayoutInflater) (obj)).inflate(0x7f0300aa, rootView, false);
        obj = (MenuView)((LayoutInflater) (obj)).inflate(0x7f0300a2, menuPlaceholder, false);
        menuPlaceholder.addView(((android.view.View) (obj)));
        screensPlaceholder.addView(mainScreensContainer);
        rootView.addView(dialogScreensContainer);
        rootView.addView(progressView);
        progressController.takeView(progressView, rootView);
        binder.bind(dialogFlow.observeDialogChange(), onDialogChanged);
        dialogFlow.onCreate();
        activityServiceRegistry.onActivityCreated(this, bundle);
        if (googleApiProvider.checkGooglePlayServicesAvailable())
        {
            binder.bind(appFlow.observeScreenChange(), onScreenChanged);
            appFlow.onCreate((new me.lyft.android.ui.landing.LandingScreens.StarterScreen()).enableLoadingAnimation());
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        binder.detach();
        ScreenAnalytics.cleanScreenTracking();
        mapView.onDestroy();
        activityController.onDestroy(this);
        progressController.dropView();
        activityServiceRegistry.onActivityDestroyed(this);
        Analytics.flush();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    protected void onPause()
    {
        super.onPause();
        mapView.onPause();
        activityServiceRegistry.onActivityPaused(this);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        mainScreensContainer.post(new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                if (activityResult != null)
                {
                    activityServiceRegistry.onActivityResult(MainActivity.this, activityResult);
                    activityResult = null;
                }
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        mapView.onResume();
        deepLinkManager.tryHandleDeepLink(this);
        checkIfMockLocationsUsedInProduction();
        activityServiceRegistry.onActivityResumed(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        activityServiceRegistry.onActivitySaveInstanceState(this, bundle);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        appForegroundDetector.onStart();
        activityServiceRegistry.onActivityStarted(this);
    }

    protected void onStop()
    {
        appForegroundDetector.onStop();
        activityServiceRegistry.onActivityStopped(this);
        super.onStop();
    }



/*
    static ActivityResult access$002(MainActivity mainactivity, ActivityResult activityresult)
    {
        mainactivity.activityResult = activityresult;
        return activityresult;
    }

*/


}
