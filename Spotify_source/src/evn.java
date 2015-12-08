// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class evn
{

    int a;
    private ezf b;
    private ActivityFeedFragment c;
    private aa d;
    private View e;
    private View f;
    private android.view.View.OnClickListener g;

    public evn(aa aa1, Bundle bundle, View view, Flags flags, FeatureIdentifier featureidentifier, boolean flag)
    {
        g = new android.view.View.OnClickListener() {

            private evn a;

            public final void onClick(View view1)
            {
                switch (view1.getId())
                {
                default:
                    Assertion.a("If you end up here, Notifications tab architecture is bork3n");
                    return;

                case 2131821668: 
                    a.a();
                    return;

                case 2131821669: 
                    a.b();
                    break;
                }
            }

            
            {
                a = evn.this;
                super();
            }
        };
        ctz.a(aa1);
        ctz.a(view);
        ctz.a(flags);
        b = ezf.a(flags);
        gnl.a(b, featureidentifier);
        c = ActivityFeedFragment.a(flags);
        gnl.a(c, featureidentifier);
        d = aa1;
        aa1 = view.findViewById(0x7f11036a);
        e = aa1.findViewById(0x7f110464);
        f = aa1.findViewById(0x7f110465);
        e.setOnClickListener(g);
        f.setOnClickListener(g);
        if (bundle != null)
        {
            a = bundle.getInt("current_tab", 0x7f110464);
            c();
            return;
        }
        if (flag)
        {
            b();
            return;
        } else
        {
            a();
            return;
        }
    }

    private void c()
    {
        boolean flag1 = true;
        View view = e;
        boolean flag;
        if (a == 0x7f110464)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
        view = f;
        if (a == 0x7f110465)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
    }

    final void a()
    {
        if (d.a("fragment_tag") instanceof ActivityFeedFragment)
        {
            return;
        } else
        {
            d.a().b(0x7f110466, c, "fragment_tag").c();
            a = 0x7f110464;
            c();
            return;
        }
    }

    final void b()
    {
        if (d.a("fragment_tag") instanceof ezf)
        {
            return;
        } else
        {
            d.a().b(0x7f110466, b, "fragment_tag").c();
            a = 0x7f110465;
            c();
            return;
        }
    }
}
