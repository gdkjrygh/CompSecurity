// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Intent;
import com.facebook.FacebookCallback;

// Referenced classes of package com.facebook.login:
//            LoginManager

class val.callback
    implements com.facebook.internal.Impl.Callback
{

    final LoginManager this$0;
    final FacebookCallback val$callback;

    public boolean onActivityResult(int i, Intent intent)
    {
        return LoginManager.this.onActivityResult(i, intent, val$callback);
    }

    gerImpl.Callback()
    {
        this$0 = final_loginmanager;
        val$callback = FacebookCallback.this;
        super();
    }
}
