// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.os.Bundle;
import android.util.Log;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class this._cls0
    implements com.facebook.widget.allback
{

    final ConnectPlugin this$0;

    public void onComplete(com.facebook.widget.endingCall endingcall, Bundle bundle)
    {
        Log.i("Activity", "Success!");
        ConnectPlugin.access$300(ConnectPlugin.this, bundle);
    }

    public void onError(com.facebook.widget.endingCall endingcall, Exception exception, Bundle bundle)
    {
        Log.e("Activity", String.format("Error: %s", new Object[] {
            exception.toString()
        }));
        ConnectPlugin.access$200(ConnectPlugin.this, exception, ConnectPlugin.access$100(ConnectPlugin.this));
    }

    ll()
    {
        this$0 = ConnectPlugin.this;
        super();
    }
}
