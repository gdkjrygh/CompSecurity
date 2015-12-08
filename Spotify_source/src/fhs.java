// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.share.model.Network;
import java.util.Locale;

public final class fhs
{

    public Network a;
    private gin b;
    private gip c;

    public fhs(Network network, gin gin1)
    {
        a = network;
        b = gin1;
        network = a.getNetworkType();
        c = gip.d((new StringBuilder("share_network_preference_selected_")).append(network.toString().toLowerCase(Locale.getDefault())).toString());
    }

    public final void a(boolean flag)
    {
        if (flag && !a())
        {
            throw new IllegalStateException("The network must be connected to set selected true.");
        } else
        {
            b.b().a(c, flag).b();
            return;
        }
    }

    public final boolean a()
    {
        return a.getState().equals(com.spotify.mobile.android.spotlets.share.model.Network.State.a);
    }

    public final boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a())
        {
            flag = flag1;
            if (b.f(c))
            {
                gin gin1 = b;
                gip gip1 = c;
                gin1.h(gip1);
                flag = flag1;
                if (gin1.a(gip1, false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
