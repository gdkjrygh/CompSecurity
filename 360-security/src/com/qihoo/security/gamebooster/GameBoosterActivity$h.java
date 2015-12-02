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
        if (f instanceof LocalGamePkg)
        {
            LocalGamePkg localgamepkg = (LocalGamePkg)f;
            if (f != null && s.equals(localgamepkg.getPkgName()))
            {
                return 3;
            }
        }
        return super.a(s);
    }

    public void a(a a1)
    {
        super.a(a1);
        d(a1).setVisibility(0);
        d(a1).setTag(f);
        GameBoosterActivity.a(n(a1), f);
        GameBoosterActivity.a(o(a1), f);
        a(f, p(a1));
    }

    public (GameBoosterActivity gameboosteractivity)
    {
        super(gameboosteractivity);
        a = 3;
    }
}
