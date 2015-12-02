// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.qihoo.security.alasticbutton.ElasticImageButton;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a
    implements Runnable
{

    final BoosterFragment a;

    public void run()
    {
        BoosterFragment.k(a).performClick();
    }

    Button(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
