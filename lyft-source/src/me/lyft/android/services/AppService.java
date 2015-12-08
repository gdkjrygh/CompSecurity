// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.service.AppProcessRegistry;
import me.lyft.android.logging.L;
import me.lyft.android.ui.MainActivity;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package me.lyft.android.services:
//            LyftService

public class AppService extends LyftService
{

    private static final int NOTIFY_ON_DUTY = 1;
    AppProcessRegistry appProcessRegistry;
    IDefaultErrorHandler defaultErrorHandler;
    private boolean isForeground;
    private Action1 onUserUpdated;
    private CompositeSubscription subscriptions;
    IUserProvider userProvider;

    public AppService()
    {
        isForeground = false;
        subscriptions = new CompositeSubscription();
        onUserUpdated = new Action1() {

            final AppService this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                if (user.isInDriverMode())
                {
                    startForegroundDriverMode();
                    return;
                } else
                {
                    stopForegroundDriverMode();
                    return;
                }
            }

            
            {
                this$0 = AppService.this;
                super();
            }
        };
    }

    public static void start(Context context)
    {
        L.d("try to start", new Object[0]);
        context.startService(new Intent(context, me/lyft/android/services/AppService));
    }

    private void startForegroundDriverMode()
    {
        if (!isForeground)
        {
            isForeground = true;
            startForeground(1, (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(0x7f0201c7).setColor(getResources().getColor(0x7f0c007e)).setContentTitle(getString(0x7f07013e)).setContentText(getString(0x7f07013d)).setOngoing(true).setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, me/lyft/android/ui/MainActivity), 0)).build());
        }
    }

    private void stopForegroundDriverMode()
    {
        stopForeground(true);
        isForeground = false;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        L.d("onCreate", new Object[0]);
        rx.Subscription subscription = userProvider.observeUserUpdates().observeOn(AndroidSchedulers.mainThread()).subscribe(onUserUpdated);
        subscriptions.add(subscription);
        appProcessRegistry.onServiceCreated();
        appProcessRegistry.setErrorHandler(new Action1() {

            final AppService this$0;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                defaultErrorHandler.handle(throwable);
            }

            
            {
                this$0 = AppService.this;
                super();
            }
        });
    }

    public void onDestroy()
    {
        super.onDestroy();
        L.d("onDestroy", new Object[0]);
        isForeground = false;
        subscriptions.unsubscribe();
        appProcessRegistry.onServiceDestroyed();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        L.d("onLowMemory", new Object[0]);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 1;
    }

    public void onTaskRemoved(Intent intent)
    {
        super.onTaskRemoved(intent);
        L.d("onTaskRemoved", new Object[0]);
        stopSelf();
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        L.d("onTrimMemory", new Object[0]);
    }


}
