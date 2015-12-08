// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.os.Bundle;
import com.facebook.FacebookException;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class this._cls0
    implements com.facebook.widget.leteListener
{

    final ConnectPlugin this$0;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception != null)
        {
            ConnectPlugin.access$200(ConnectPlugin.this, facebookexception, ConnectPlugin.access$100(ConnectPlugin.this));
            return;
        } else
        {
            ConnectPlugin.access$300(ConnectPlugin.this, bundle);
            return;
        }
    }

    ener()
    {
        this$0 = ConnectPlugin.this;
        super();
    }
}
