// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import android.content.Context;
import com.cleanmaster.ui.app.market.d;
import com.cleanmaster.ui.app.utils.MarketContext;

// Referenced classes of package com.picksinit:
//            goGp

public class SmartGoGp
    implements goGp
{

    private String mUrl;

    public SmartGoGp(String s)
    {
        mUrl = "";
        mUrl = s;
    }

    public void goGp(Context context)
    {
        d.a(new MarketContext(context), mUrl);
    }
}
