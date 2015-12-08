// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Br;
import Bt;
import Ei;
import PA;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import cn;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.ProfilePictureView;
import com.snapchat.android.ui.SharedProfileSnapcodeView;
import javax.inject.Provider;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class <init>
    implements PA
{

    private ProfileFragment a;

    public final void a(cn cn, String s)
    {
        boolean flag2 = true;
        if (a.getActivity() != null) goto _L2; else goto _L1
_L1:
        Timber.d("ProfileFragment", "getActivity() returned null in onSvgLoaded() we need to figure this out!", new Object[0]);
_L4:
        return;
_L2:
        if (cn == null)
        {
            cn = ProfileFragment.v(a);
            s = a.getActivity();
            ProfileFragment.b(a);
            cn.c(s, Bt.r());
            return;
        }
        ProfileFragment.b(a);
        if (!TextUtils.equals(Bt.r(), s)) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (ProfileFragment.r(a) == null)
        {
            ProfileFragment.w(a);
        }
        ProfileFragment.r(a).setSVG(cn);
        a.a(8);
        ProfileFragment.b(a);
        if (Bt.Q())
        {
            break MISSING_BLOCK_LABEL_346;
        }
        ProfileFragment.b(a);
        if (!Bt.bc())
        {
            break MISSING_BLOCK_LABEL_346;
        }
        flag = true;
_L5:
        boolean flag1;
        if (flag)
        {
            a.h.setText(ProfileFragment.x(a));
            a.g.setVisibility(0);
        } else
        {
            a.g.setVisibility(8);
        }
        s = (Br)ProfileFragment.y(a).get();
        if (s != null && s.g())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ProfileFragment.b(a);
        if (!Bt.bF() && !flag && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ProfileFragment.l(a).setVisibility(0);
        } else
        {
            ProfileFragment.l(a).setVisibility(8);
        }
        if (a.e == null)
        {
            a.e = (ProfilePictureView)ProfileFragment.z(a).inflate();
            a.e.setCallback(a);
        }
        a.e.setSnapcodeSvg(cn);
        if (ProfileFragment.A(a) == null)
        {
            ProfileFragment.B(a);
        }
        ProfileFragment.A(a).setSnapcodeSvg(cn);
        Timber.c("ProfileFragment", "profile images - snapcode was loaded from cache", new Object[0]);
        return;
        flag = false;
          goto _L5
    }

    private A(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }

    a(ProfileFragment profilefragment, byte byte0)
    {
        this(profilefragment);
    }
}
