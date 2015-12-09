// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import com.vungle.log.Logger;
import com.vungle.publisher.aq;
import com.vungle.publisher.by;

// Referenced classes of package com.vungle.publisher.display.view:
//            VideoFragment, MuteButton

static class Factory extends by
{
    public static class Factory
    {

        VideoFragment.VideoEventListener a;

        public Factory()
        {
        }
    }


    private VideoFragment a;

    static VideoFragment a(Factory factory, VideoFragment videofragment)
    {
        factory.a = videofragment;
        return videofragment;
    }

    public void onEvent(aq aq1)
    {
        boolean flag = true;
        MuteButton mutebutton = VideoFragment.h(a);
        boolean flag1;
        if (aq1.b != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (aq1.a == 0)
        {
            if (aq1.b == 0)
            {
                flag = false;
            }
        } else
        if (aq1.b != 0)
        {
            flag = false;
        }
        if (flag)
        {
            StringBuilder stringbuilder = new StringBuilder("volume change ");
            if (flag1)
            {
                aq1 = "un";
            } else
            {
                aq1 = "";
            }
            Logger.d("VungleAd", stringbuilder.append(aq1).append("mute").toString());
            mutebutton.b();
            mutebutton.a(flag1);
        }
    }

    public Factory()
    {
    }
}
