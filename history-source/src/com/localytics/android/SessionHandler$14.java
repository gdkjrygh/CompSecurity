// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.localytics.android:
//            SessionHandler, Constants

class val.intent
    implements Runnable
{

    final SessionHandler this$0;
    final Intent val$intent;

    public void run()
    {
        String s = val$intent.getStringExtra("registration_id");
        if (!SessionHandler.access$000(SessionHandler.this)) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "GCM registered but push disabled: removing id");
        }
        setPushRegistrationId(null);
_L4:
        return;
_L2:
        if (val$intent.getStringExtra("error") == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "GCM registration failed");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (val$intent.getStringExtra("unregistered") != null)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "GCM unregistered: removing id");
            }
            setPushRegistrationId(null);
            return;
        }
        if (s != null)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", String.format("GCM registered, new id: %s", new Object[] {
                    s
                }));
            }
            setPushRegistrationId(s);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$intent = Intent.this;
        super();
    }
}
