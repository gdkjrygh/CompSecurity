// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity, LocalGamePkg

public static class a extends a
{

    public int a(String s)
    {
        if (d instanceof LocalGamePkg)
        {
            LocalGamePkg localgamepkg = (LocalGamePkg)d;
            if (d != null && s.equals(localgamepkg.getPkgName()))
            {
                return 1;
            }
        }
        return super.a(s);
    }

    public void a(a a1)
    {
        super.a(a1);
        b(a1).setVisibility(0);
        b(a1).setTag(d);
        GameBoosterActivity.a(h(a1), d);
        GameBoosterActivity.a(i(a1), d);
        a(d, j(a1));
    }

    public (GameBoosterActivity gameboosteractivity)
    {
        super(gameboosteractivity);
        a = 1;
    }
}
