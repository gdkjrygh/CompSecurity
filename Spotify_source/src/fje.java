// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.orbit.OrbitServiceObserver;
import com.spotify.mobile.android.service.notifications.SocialErrorNotifier;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fje extends BroadcastReceiver
{

    public int a;

    public fje()
    {
        dmz.a(fop);
        a = -1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        int i;
        i = intent.getIntExtra("error_code", 0);
        String s = intent.getStringExtra("error_description");
        intent = s;
        if (s == null)
        {
            intent = "";
        }
        OrbitServiceObserver.getSocialErrorAsString(i);
        i;
        JVM INSTR tableswitch 1 7: default 76
    //                   1 110
    //                   2 164
    //                   3 110
    //                   4 76
    //                   5 111
    //                   6 121
    //                   7 146;
           goto _L1 _L2 _L3 _L2 _L1 _L4 _L5 _L6
_L2:
        break MISSING_BLOCK_LABEL_110;
_L1:
        Assertion.a((new StringBuilder("Here we received an onSocialError call that we should have handled (")).append(i).append(", ").append(intent).append(")").toString());
_L8:
        return;
_L4:
        context.startService(SocialErrorNotifier.a(context));
        return;
_L5:
        if (!dtw.a(a)) goto _L8; else goto _L7
_L7:
        fop.a(context);
        fop.a(context, ViewUri.i, com.spotify.mobile.android.util.ClientEvent.SubEvent.z);
        return;
_L6:
        dmz.a(ggc);
        ggc.a(context, 0x7f080555, 1, new Object[0]);
        return;
_L3:
        Logger.c("Error loading user data for %s", new Object[] {
            intent
        });
        return;
    }
}
