// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook:
//            Session

class refreshRequestWeakReference extends Handler
{

    private WeakReference refreshRequestWeakReference;
    private WeakReference sessionWeakReference;

    public void handleMessage(Message message)
    {
        String s = message.getData().getString("access_token");
        Session session = (Session)sessionWeakReference.get();
        if (session != null && s != null)
        {
            session.extendTokenCompleted(message.getData());
        }
        message = (sessionWeakReference)refreshRequestWeakReference.get();
        if (message != null)
        {
            Session.access$1500().unbindService(message);
            _mth1700(message);
        }
    }

    (Session session,  )
    {
        super(Looper.getMainLooper());
        sessionWeakReference = new WeakReference(session);
        refreshRequestWeakReference = new WeakReference();
    }
}
