// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.NetworkOperatorPremiumActivationFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class fxw
{

    public static void a(aa aa1, Flags flags, Class class1)
    {
        if (aa1.a("dialog_presenter") == null)
        {
            DialogPresenter dialogpresenter = new DialogPresenter();
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            linkedhashmap.put("trial_fragment", fzc.a(flags));
            if (class1 == com/spotify/music/MainActivity)
            {
                linkedhashmap.put("terms_of_service_changed_detector_fragment", gpp.a(flags));
            }
            linkedhashmap.put("playback_error_dialog_fragment", fzd.a(flags));
            linkedhashmap.put("offline_sync_error_fragment", fzb.a(flags));
            linkedhashmap.put("disk_almost_full_fragment", new fyp());
            linkedhashmap.put("feature_error_fragment", fyr.a(flags));
            linkedhashmap.put("tag_remote_playback_fragment", fzg.a(flags));
            linkedhashmap.put("app_rater_fragment", new fyn());
            linkedhashmap.put("marketing_opt_in_fragment", new fyz());
            linkedhashmap.put("network_operator_premium_activation_fragment", NetworkOperatorPremiumActivationFragment.a(flags));
            linkedhashmap.put("churn_locked_state_detector_fragment", gnm.a(flags));
            linkedhashmap.put("artist_love_dialog_presenter_fragment", fpn.a(flags));
            linkedhashmap.put("no_streaming_upsell_detector_fragment", gqd.a(flags));
            aa1 = aa1.a().a(dialogpresenter, "dialog_presenter");
            for (flags = linkedhashmap.entrySet().iterator(); flags.hasNext(); aa1.a((Fragment)class1.getValue(), (String)class1.getKey()))
            {
                class1 = (java.util.Map.Entry)flags.next();
            }

            aa1.c();
            aa1 = linkedhashmap.values().iterator();
            while (aa1.hasNext()) 
            {
                flags = (fze)aa1.next();
                boolean flag;
                if (!TextUtils.isEmpty(flags.f()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ctz.a(flag, "Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                flags.a(dialogpresenter);
            }
        }
    }
}
