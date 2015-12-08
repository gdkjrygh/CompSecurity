// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.facebook.LegacyHelper;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.android:
//            Facebook, FacebookError

private static class connectionWeakReference extends Handler
{

    WeakReference connectionWeakReference;
    WeakReference facebookWeakReference;

    public void handleMessage(Message message)
    {
        Object obj;
        connectionWeakReference connectionweakreference;
        String s1;
        long l;
        obj = (Facebook)facebookWeakReference.get();
        connectionweakreference = (facebookWeakReference)connectionWeakReference.get();
        if (obj == null || connectionweakreference == null)
        {
            return;
        }
        s1 = message.getData().getString("access_token");
        l = message.getData().getLong("expires_in") * 1000L;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        ((Facebook) (obj)).setAccessToken(s1);
        ((Facebook) (obj)).setAccessExpires(l);
        obj = Facebook.access$1(((Facebook) (obj)));
        if (obj != null)
        {
            LegacyHelper.extendTokenCompleted(((com.facebook.Session) (obj)), message.getData());
        }
        if (connectionweakreference.serviceListener != null)
        {
            message = (Bundle)message.getData().clone();
            message.putLong("expires_in", l);
            connectionweakreference.serviceListener.serviceListener(message);
        }
_L4:
        connectionweakreference.applicationsContext.unbindService(connectionweakreference);
        return;
_L2:
        if (connectionweakreference.serviceListener != null)
        {
            String s = message.getData().getString("error");
            if (message.getData().containsKey("error_code"))
            {
                int i = message.getData().getInt("error_code");
                connectionweakreference.serviceListener.r(new FacebookError(s, null, i));
            } else
            {
                connectionWeakReference connectionweakreference1 = connectionweakreference.serviceListener;
                if (s != null)
                {
                    message = s;
                } else
                {
                    message = "Unknown service error";
                }
                connectionweakreference1.serviceListener(new Error(message));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    A(Facebook facebook, A a)
    {
        facebookWeakReference = new WeakReference(facebook);
        connectionWeakReference = new WeakReference(a);
    }
}
