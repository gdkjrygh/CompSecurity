// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.Toast;
import com.dominos.App;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import org.c.c.l;
import org.c.e.a.f;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class estCallback extends PowerRestCallback
{

    final LabsCheckoutActivity this$0;

    public void onError(Exception exception, String s)
    {
        if ((exception instanceof f) && ((f)exception).getStatusCode() == l.REQUEST_TIMEOUT)
        {
            Toast.makeText(App.getInstance(), 0x7f0801d2, 0).show();
        }
        class _cls2
            implements Runnable
        {

            final LabsCheckoutActivity._cls8 this$1;

            public void run()
            {
                hideLoading();
            }

            _cls2()
            {
                this$1 = LabsCheckoutActivity._cls8.this;
                super();
            }
        }

        runOnUiThread(new _cls2());
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        class _cls1
            implements Runnable
        {

            final LabsCheckoutActivity._cls8 this$1;

            public void run()
            {
                hideLoading();
                LabsCheckoutActivity.access$1200(this$0);
            }

            _cls1()
            {
                this$1 = LabsCheckoutActivity._cls8.this;
                super();
            }
        }

        runOnUiThread(new _cls1());
        mStoreManager.setStoreProfile(StoreProfile.from(s));
    }

    r()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
