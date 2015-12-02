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
        if (e instanceof LocalGamePkg)
        {
            LocalGamePkg localgamepkg = (LocalGamePkg)e;
            if (e != null && s.equals(localgamepkg.getPkgName()))
            {
                return 2;
            }
        }
        return super.a(s);
    }

    public void a(a a1)
    {
        super.a(a1);
        c(a1).setVisibility(0);
        c(a1).setTag(e);
        GameBoosterActivity.a(k(a1), e);
        GameBoosterActivity.a(l(a1), e);
        a(e, m(a1));
    }

    public (GameBoosterActivity gameboosteractivity)
    {
        super(gameboosteractivity);
        a = 2;
    }
}
