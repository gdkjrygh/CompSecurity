// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.ThreadUtils;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls0
    implements ManagerStatusListener
{

    final SignupActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.d("SignupActivity", (new StringBuilder()).append("ServiceManager ready: ").append(i).toString());
        ThreadUtils.assertOnMain();
        SignupActivity.access$1400(SignupActivity.this, servicemanager);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        Log.e("SignupActivity", "NetflixService is NOT available!");
    }

    tener()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
