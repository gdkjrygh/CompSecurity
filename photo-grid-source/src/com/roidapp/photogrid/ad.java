// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.view.View;
import com.roidapp.videolib.k;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class ad
    implements k
{

    final MainPage a;

    ad(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void a(boolean flag, String s)
    {
label0:
        {
            if (!a.isFinishing() && MainPage.I(a) != null)
            {
                MainPage.I(a).setVisibility(8);
                MainPage.J(a);
                if (!flag)
                {
                    break label0;
                }
                MainPage.K(a);
            }
            return;
        }
        if (s.indexOf("UnsatisfiedLinkError") > 0)
        {
            MainPage.L(a);
            return;
        } else
        {
            MainPage.M(a);
            return;
        }
    }
}
