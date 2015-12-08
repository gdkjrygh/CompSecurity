// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity

final class g extends Handler
{

    private WeakReference a;

    public g(InstagramAuthActivity instagramauthactivity)
    {
        a = new WeakReference(instagramauthactivity);
    }

    public final void dispatchMessage(Message message)
    {
        InstagramAuthActivity instagramauthactivity = (InstagramAuthActivity)a.get();
        message.what;
        JVM INSTR lookupswitch 2: default 40
    //                   16: 41
    //                   32: 59;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (instagramauthactivity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        instagramauthactivity.setResult(-1, instagramauthactivity.getIntent());
        instagramauthactivity.finish();
        return;
_L3:
        message = (String)message.obj;
        if (instagramauthactivity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (message != null && !instagramauthactivity.isFinishing())
        {
            Toast.makeText(instagramauthactivity, message, 1).show();
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }
}
