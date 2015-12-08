// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import AA;
import Bd;
import Bt;
import Jo;
import Mf;
import Mh;
import Mj;
import Mk;
import Ml;
import Oa;
import android.view.View;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import lv;
import vv;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.view.ner
{

    private SendToFragment a;

    public final void onClick(View view)
    {
        boolean flag1 = true;
        view = SendToFragment.a(a);
        view.a("send");
        view.c();
        view = (LandingPageActivity)a.getActivity();
        if (view == null || SendToFragment.b(a).isEmpty() && SendToFragment.c(a).isEmpty())
        {
            return;
        }
        SendToFragment.a(a, com.snapchat.android.ui.window.on.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND);
        if (!SendToFragment.b(a).isEmpty())
        {
            SendToFragment.d(a).g();
        }
        Object obj = SendToFragment.l().mMediaMailingMetadata;
        ((MediaMailingMetadata) (obj)).a(SendToFragment.b(a));
        boolean flag;
        if (SendToFragment.l() instanceof AA)
        {
            if (SendToFragment.l().mSnapType == com.snapchat.android.model.e.SNAP)
            {
                if (!SendToFragment.c(a).isEmpty())
                {
                    Bt.Z();
                    Object obj1;
                    boolean flag2;
                    boolean flag3;
                    if (((LandingPageActivity) (view)).b != null)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    obj1 = (AA)SendToFragment.l();
                    if (!SendToFragment.b(a).isEmpty())
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    AnalyticsEvents.a(((AA) (obj1)), flag2, flag3, "SEND_TO_SCREEN");
                }
                ((Bd)obj).mPostToStories = SendToFragment.c(a);
            } else
            if (SendToFragment.l().mSnapType == com.snapchat.android.model.e.DISCOVER)
            {
                SendToFragment.e(a);
                SendToFragment.a(a, (vv)SendToFragment.l().mMediaExtras);
            }
        }
        obj = SendToFragment.f(a);
        obj1 = SendToFragment.l().mClientId;
        if (SendToFragment.b(a).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (SendToFragment.c(a).size() <= 0)
        {
            flag1 = false;
        }
        if (flag)
        {
            ((NetworkAnalytics) (obj)).a("SNAP_SENT_DELAY", ((String) (obj1)), "send_to_screen");
        }
        if (flag1)
        {
            ((NetworkAnalytics) (obj)).a("STORY_POST_DELAY", ((String) (obj1)), "send_to_screen");
        }
        Timber.c("SendToFragment", "Posts SnapReadyForSendingEvent event from initBottomPanel.", new Object[0]);
        Mf.a().a(new Oa(SendToFragment.l()));
        Mf.a().a(new Ml());
        Mf.a().a(new Mj(false, false));
        Mf.a().a(new Mk((byte)0));
        Mf.a().a(new Mh(CameraDisplayState.SHOW));
        Jo.a(view, SendToFragment.g(a));
    }

    usBarDrawMode(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
