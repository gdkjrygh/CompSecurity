// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

static class d extends d
{

    AdvData d;
    GameBoosterActivity e;

    public void a(d d1)
    {
        super.a(d1);
        if (d1 == null)
        {
            return;
        }
        String s = d.title;
        String s1 = d.icon;
        String s2 = c();
        if (t(d1) != null)
        {
            t(d1).setText(s2);
        }
        if (q(d1) != null)
        {
            q(d1).setText(s);
        }
        if (u(d1) != null && s1 != null)
        {
            u(d1).a(s1, 0x7f02015d);
        }
        if (d.type == 0 && v(d1) != null && d.nativeAd != null)
        {
            d.nativeAd.a(v(d1));
            GameBoosterActivity.a(e, d.nativeAd, v(d1));
        }
        d1.a.setTag(d);
        GameBoosterActivity.a(e, d, com.qihoo.security.adv..GameBoosterFolderHotAdvData);
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(d);
        return arraylist;
    }

    protected String c()
    {
        if (d == null)
        {
            return "";
        } else
        {
            return d.btnDesc;
        }
    }

    public (AdvData advdata, GameBoosterActivity gameboosteractivity)
    {
        a = 6;
        e = gameboosteractivity;
        d = advdata;
    }
}
