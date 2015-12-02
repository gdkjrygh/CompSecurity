// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.text.Html;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

class b
    implements Runnable
{

    final String a;
    final String b;
    final GameBoosterActivity c;

    public void run()
    {
        q.a().a(Html.fromHtml(a));
        com.qihoo.security.support.b.a(11112, b, null);
    }

    (GameBoosterActivity gameboosteractivity, String s, String s1)
    {
        c = gameboosteractivity;
        a = s;
        b = s1;
        super();
    }
}
