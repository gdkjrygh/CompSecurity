// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.remote.contoller.RemoteOrderManager_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.pebble:
//            PebbleRequestManager, PebbleSession_

public final class PebbleRequestManager_ extends PebbleRequestManager
{

    private static PebbleRequestManager_ instance_;
    private Context context_;

    private PebbleRequestManager_(Context context)
    {
        context_ = context;
    }

    public static PebbleRequestManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new PebbleRequestManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mRemoteOrderManager = RemoteOrderManager_.getInstance_(context_);
        mPebbleSession = PebbleSession_.getInstance_(context_);
        onAfterInject();
    }
}
