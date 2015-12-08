// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.leanplum;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.annotations.Parser;
import com.leanplum.callbacks.StartCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.LeanplumTrackerExtra;
import me.lyft.android.application.IAppInfoService;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.leanplum:
//            ILeanplumService

public class LeanplumService extends ActivityService
    implements ILeanplumService
{

    private volatile Long appInfoResponseTime;
    private final IAppInfoService appInfoService;
    private String currentUserId;
    private LeanplumActivityHelper helper;
    private final AtomicBoolean initializedSdk = new AtomicBoolean(false);
    private final String leanplumAppId;
    private final String leanplumKey;
    private final IUserProvider userProvider;

    public LeanplumService(Application application, IUserProvider iuserprovider, IAppInfoService iappinfoservice)
    {
        Leanplum.setApplicationContext(application);
        Parser.parseVariables(new Object[] {
            application
        });
        LeanplumActivityHelper.enableLifecycleCallbacks(application);
        userProvider = iuserprovider;
        appInfoService = iappinfoservice;
        leanplumAppId = application.getString(0x7f0701ec);
        leanplumKey = application.getString(0x7f0701ed);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        super.onActivityCreated(activity, bundle);
        helper = new LeanplumActivityHelper(activity);
        if (!initializedSdk.compareAndSet(false, true))
        {
            return;
        }
        Leanplum.setAppIdForProductionMode(leanplumAppId, leanplumKey);
        L.d((new StringBuilder()).append("Starting leanplum in production mode with key: ").append(leanplumKey).toString(), new Object[0]);
        bundle = new HashMap() {

            final LeanplumService this$0;

            
            {
                this$0 = LeanplumService.this;
                super();
                put("appId", "me.lyft.android");
            }
        };
        currentUserId = userProvider.getUser().getId();
        Leanplum.addStartResponseHandler(new StartCallback() {

            final LeanplumService this$0;
            final long val$startTime;

            public void onResponse(boolean flag)
            {
                long l = SystemClock.elapsedRealtime();
                Double double1 = new Double(l - startTime);
                String s;
                HashMap hashmap;
                if (flag)
                {
                    s = "success";
                } else
                {
                    s = "failure";
                }
                hashmap = new HashMap();
                if (appInfoResponseTime != null)
                {
                    hashmap.put("delay", new Double(Math.max(appInfoResponseTime.longValue() - l, 0L)));
                } else
                {
                    hashmap.put("delay", Double.valueOf(0.0D));
                }
                Analytics.track((new Event("leanplumStartup")).addTracker(new LeanplumTrackerExtra(double1.doubleValue(), s, hashmap)));
            }

            
            {
                this$0 = LeanplumService.this;
                startTime = l;
                super();
            }
        });
        appInfoService.observeAppInfo().first().subscribe(new Subscriber() {

            final LeanplumService this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public volatile void onNext(Object obj)
            {
                onNext((AppInfo)obj);
            }

            public void onNext(AppInfo appinfo)
            {
                appInfoResponseTime = Long.valueOf(SystemClock.elapsedRealtime());
            }

            
            {
                this$0 = LeanplumService.this;
                super();
            }
        });
        if (Strings.isNullOrEmpty(currentUserId))
        {
            currentUserId = "";
            Leanplum.start(activity.getApplicationContext(), bundle);
        } else
        {
            Leanplum.start(activity.getApplicationContext(), currentUserId, bundle);
        }
        userProvider.observeUserUpdates().doOnNext(new Action1() {

            final LeanplumService this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                user = user.getId();
                if (!currentUserId.equals(user) && !Strings.isNullOrEmpty(user))
                {
                    Leanplum.setUserId(user);
                }
            }

            
            {
                this$0 = LeanplumService.this;
                super();
            }
        });
    }

    public void onActivityPaused(Activity activity)
    {
        super.onActivityPaused(activity);
        helper.onPause();
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        helper.onResume();
    }

    public void onActivityStopped(Activity activity)
    {
        super.onActivityStopped(activity);
        helper.onStop();
    }



/*
    static Long access$002(LeanplumService leanplumservice, Long long1)
    {
        leanplumservice.appInfoResponseTime = long1;
        return long1;
    }

*/

}
