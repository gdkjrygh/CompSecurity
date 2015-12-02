// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.widget.RatingBar;
import android.widget.TextView;
import com.qihoo.security.ui.result.AdvData;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

static class c extends c
{

    AdvData c;
    private final String f;

    public void a(c c1)
    {
        super.a(c1);
        if (c1 != null)
        {
            String s = c.btnName;
            float f1 = c.starLevel;
            if (r(c1) != null)
            {
                r(c1).setText(s);
            }
            if (s(c1) != null)
            {
                if (f1 != 0.0F)
                {
                    s(c1).setRating(f1);
                    return;
                } else
                {
                    s(c1).setRating(5F);
                    return;
                }
            }
        }
    }

    protected String c()
    {
        return f;
    }

    public (AdvData advdata, String s, GameBoosterActivity gameboosteractivity)
    {
        super(advdata, gameboosteractivity);
        a = 5;
        f = s;
        c = advdata;
    }
}
