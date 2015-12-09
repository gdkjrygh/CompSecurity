// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.Intent;
import android.net.Uri;
import com.vungle.log.Logger;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.util.IntentFactory;

// Referenced classes of package com.vungle.publisher:
//            by, FullScreenAdActivity, g, h, 
//            ac, al, am, ar, 
//            x, y

public static class Factory extends by
{
    public static class Factory
    {

        FullScreenAdActivity.AdEventListener a;

        public FullScreenAdActivity.AdEventListener getInstance(FullScreenAdActivity fullscreenadactivity)
        {
            FullScreenAdActivity.AdEventListener.a(a, fullscreenadactivity);
            return a;
        }

        public Factory()
        {
        }
    }


    private FullScreenAdActivity a;

    static FullScreenAdActivity a(Factory.a a1, FullScreenAdActivity fullscreenadactivity)
    {
        a1.a = fullscreenadactivity;
        return fullscreenadactivity;
    }

    public void onEvent(ac ac)
    {
        ac = a;
        try
        {
            Intent intent = IntentFactory.a("android.intent.action.VIEW", Uri.parse("https://www.vungle.com/privacy/"));
            intent.addFlags(0x10000000);
            ac.startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            ((FullScreenAdActivity) (ac)).l.("VungleAd", "error loading privacy URL", exception);
        }
    }

    public void onEvent(al al)
    {
        Logger.v("VungleEvent", "video.onCancel()");
        a.a();
    }

    public void onEvent(am am)
    {
        Logger.v("VungleEvent", "video.onNext()");
        a.a();
    }

    public void onEvent(ar ar)
    {
        a.a(false, false);
    }

    public void onEvent(g g1)
    {
        FullScreenAdActivity fullscreenadactivity;
        com.vungle.publisher.db.model. ;
        boolean flag;
         = g1.a;
        Logger.v("VungleEvent", (new StringBuilder("cta click event: ")).append().toString());
        fullscreenadactivity = a;
        g1 = null;
        flag = false;
        String s = fullscreenadactivity.a.f();
        g1 = s;
        Logger.v("VungleAd", (new StringBuilder("call to action destination ")).append(s).toString());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        g1 = s;
        Intent intent = IntentFactory.a("android.intent.action.VIEW", Uri.parse(s));
        g1 = s;
        intent.addFlags(0x10000000);
        g1 = s;
        fullscreenadactivity.startActivity(intent);
        g1 = s;
        fullscreenadactivity.g.a(new h(fullscreenadactivity.a, ));
        flag = true;
_L2:
        fullscreenadactivity.a(flag, true);
        return;
        Exception exception;
        exception;
        fullscreenadactivity.l.("VungleAd", (new StringBuilder("error loading call-to-action URL ")).append(g1).toString(), exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onEvent(x x)
    {
        Logger.v("VungleEvent", "postRoll.onCancel()");
        a.a(true, false);
    }

    public void onEvent(y y)
    {
        Logger.v("VungleEvent", "postRoll.onRepeat()");
        a.b();
    }

    Factory()
    {
    }
}
