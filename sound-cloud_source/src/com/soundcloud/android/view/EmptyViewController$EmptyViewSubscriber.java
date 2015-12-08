// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.sync.SyncFailedException;
import com.soundcloud.android.utils.NetworkConnectionHelper;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyViewController

private final class <init> extends DefaultSubscriber
{

    final EmptyViewController this$0;

    public final void onCompleted()
    {
        EmptyViewController.access$100(EmptyViewController.this, this._fld0);
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
                obj = this._fld0;
            } else
            {
                obj = this._fld0;
            }
            EmptyViewController.access$100(emptyviewcontroller, ((this._cls0) (obj)));
        }
        if (throwable instanceof SyncFailedException)
        {
            obj = EmptyViewController.this;
            if (EmptyViewController.access$200(EmptyViewController.this).isNetworkConnected())
            {
                throwable = ted;
            } else
            {
                throwable = ted;
            }
            EmptyViewController.access$100(((EmptyViewController) (obj)), throwable);
            return;
        } else
        {
            super.onError(throwable);
            return;
        }
    }

    public final void onNext(Object obj)
    {
        EmptyViewController.access$100(EmptyViewController.this, this._fld0);
    }

    private I()
    {
        this$0 = EmptyViewController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
