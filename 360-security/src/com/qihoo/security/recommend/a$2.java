// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.recommend;

import android.view.View;

// Referenced classes of package com.qihoo.security.recommend:
//            a, RecommendHelper

class a
    implements android.view..OnClickListener
{

    final a a;

    public void onClick(View view)
    {
        RecommendHelper.a().b(com.qihoo.security.recommend.a.b(a));
        if (com.qihoo.security.recommend.a.a(a) != null)
        {
            com.qihoo.security.recommend.a.a(a).a(com.qihoo.security.recommend.a.b(a));
        }
    }

    mmendHelper(a a1)
    {
        a = a1;
        super();
    }
}
