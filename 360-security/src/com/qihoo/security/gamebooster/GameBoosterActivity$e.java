// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.graphics.Color;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.qihoo.security.ui.result.AdvData;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity, LocalGamePkg

public static class a extends a
{

    public Object c;
    public Object d;
    public Object e;
    public Object f;
    private final GameBoosterActivity g;

    private void c()
    {
        if (c instanceof AdvData)
        {
            GameBoosterActivity.a(g, (AdvData)c, com.qihoo.security.adv..GameBoosterFolderAllLikeData);
        }
        if (d instanceof AdvData)
        {
            GameBoosterActivity.a(g, (AdvData)d, com.qihoo.security.adv..GameBoosterFolderAllLikeData);
        }
        if (e instanceof AdvData)
        {
            GameBoosterActivity.a(g, (AdvData)e, com.qihoo.security.adv..GameBoosterFolderAllLikeData);
        }
        if (f instanceof AdvData)
        {
            GameBoosterActivity.a(g, (AdvData)f, com.qihoo.security.adv..GameBoosterFolderAllLikeData);
        }
    }

    public int a(String s)
    {
        if (c instanceof LocalGamePkg)
        {
            LocalGamePkg localgamepkg = (LocalGamePkg)c;
            if (c != null && s.equals(localgamepkg.getPkgName()))
            {
                return 0;
            }
        }
        return super.a(s);
    }

    public void a(a a1)
    {
        super.a(a1);
        b(a1).setVisibility(8);
        c(a1).setVisibility(8);
        d(a1).setVisibility(8);
        a(a1).setVisibility(0);
        a(a1).setTag(c);
        GameBoosterActivity.a(e(a1), c);
        GameBoosterActivity.a(f(a1), c);
        a(c, g(a1));
        c();
        if (c instanceof LocalGamePkg)
        {
            a1.a.setBackgroundColor(0);
            return;
        } else
        {
            a1.a.setBackgroundColor(Color.rgb(250, 250, 250));
            return;
        }
    }

    protected void a(Object obj, View view)
    {
        if (obj instanceof AdvData)
        {
            obj = (AdvData)obj;
            if (((AdvData) (obj)).type == 0 && ((AdvData) (obj)).nativeAd != null)
            {
                ((AdvData) (obj)).nativeAd.a(view);
                GameBoosterActivity.a(g, ((AdvData) (obj)).nativeAd, view);
            }
        }
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        if (c instanceof AdvData)
        {
            arraylist.add((AdvData)c);
        }
        if (d instanceof AdvData)
        {
            arraylist.add((AdvData)d);
        }
        if (e instanceof AdvData)
        {
            arraylist.add((AdvData)e);
        }
        if (f instanceof AdvData)
        {
            arraylist.add((AdvData)f);
        }
        return arraylist;
    }

    public (GameBoosterActivity gameboosteractivity)
    {
        g = gameboosteractivity;
        a = 0;
    }
}
