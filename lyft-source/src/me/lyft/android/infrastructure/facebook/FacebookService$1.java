// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.facebook;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.facebook:
//            FacebookService

class val.result
    implements FacebookCallback
{

    final FacebookService this$0;
    final PublishSubject val$result;

    public void onCancel()
    {
        val$result.onCompleted();
    }

    public void onError(FacebookException facebookexception)
    {
        val$result.onError(facebookexception);
    }

    public void onSuccess(LoginResult loginresult)
    {
        val$result.onNext(Unit.create());
        val$result.onCompleted();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((LoginResult)obj);
    }

    ()
    {
        this$0 = final_facebookservice;
        val$result = PublishSubject.this;
        super();
    }
}
