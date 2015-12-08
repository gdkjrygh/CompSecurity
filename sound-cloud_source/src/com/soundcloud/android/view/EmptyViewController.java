// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.sync.SyncFailedException;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import rx.Y;
import rx.b;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyView

public class EmptyViewController extends DefaultSupportFragmentLightCycle
{
    private final class EmptyViewSubscriber extends DefaultSubscriber
    {

        final EmptyViewController this$0;

        public final void onCompleted()
        {
            updateEmptyViewStatus(EmptyView.Status.OK);
        }

        public final void onError(Throwable throwable)
        {
            throwable.printStackTrace();
            if (throwable instanceof ApiRequestException)
            {
                boolean flag = ((ApiRequestException)throwable).isNetworkError();
                EmptyViewController emptyviewcontroller = EmptyViewController.this;
                Object obj;
                if (flag)
                {
                    obj = EmptyView.Status.CONNECTION_ERROR;
                } else
                {
                    obj = EmptyView.Status.SERVER_ERROR;
                }
                emptyviewcontroller.updateEmptyViewStatus(((EmptyView.Status) (obj)));
            }
            if (throwable instanceof SyncFailedException)
            {
                obj = EmptyViewController.this;
                if (networkConnectionHelper.isNetworkConnected())
                {
                    throwable = EmptyView.Status.SERVER_ERROR;
                } else
                {
                    throwable = EmptyView.Status.CONNECTION_ERROR;
                }
                ((EmptyViewController) (obj)).updateEmptyViewStatus(throwable);
                return;
            } else
            {
                super.onError(throwable);
                return;
            }
        }

        public final void onNext(Object obj)
        {
            updateEmptyViewStatus(EmptyView.Status.OK);
        }

        private EmptyViewSubscriber()
        {
            this$0 = EmptyViewController.this;
            super();
        }

        EmptyViewSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private EmptyView emptyView;
    private EmptyView.Status emptyViewStatus;
    private final NetworkConnectionHelper networkConnectionHelper;
    private Y subscription;

    public EmptyViewController(NetworkConnectionHelper networkconnectionhelper)
    {
        emptyViewStatus = EmptyView.Status.WAITING;
        subscription = RxUtils.invalidSubscription();
        networkConnectionHelper = networkconnectionhelper;
    }

    private void updateEmptyViewStatus(EmptyView.Status status)
    {
        emptyViewStatus = status;
        emptyView.setStatus(status);
    }

    public void connect(b b1)
    {
        subscription = b1.subscribe(new EmptyViewSubscriber(null));
    }

    public EmptyView getEmptyView()
    {
        return emptyView;
    }

    public void onDestroyView(Fragment fragment)
    {
        subscription.unsubscribe();
        emptyView = null;
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        emptyView = (EmptyView)view.findViewById(0x1020004);
        emptyView.setStatus(emptyViewStatus);
    }


}
