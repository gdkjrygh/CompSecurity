// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.text.TextUtils;
import com.qihoo.security.gamebooster.draglist.DragLayerListView;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameBoosterActivity

class a
    implements Runnable
{

    final String a;
    final GameBoosterActivity b;

    public void run()
    {
        if (!TextUtils.isEmpty(a) && GameBoosterActivity.e(b) != null)
        {
            int j = GameBoosterActivity.f(b).getCount();
            int i = 0;
            while (i < j) 
            {
                a a1 = GameBoosterActivity.f(b).a(i);
                GameBoosterActivity.a(b, a1.a(a));
                if (GameBoosterActivity.g(b) >= 0)
                {
                    GameBoosterActivity.e(b).a(i);
                    GameBoosterActivity.b(b, i);
                    GameBoosterActivity.a(b, a);
                    return;
                }
                i++;
            }
        }
    }

    View(GameBoosterActivity gameboosteractivity, String s)
    {
        b = gameboosteractivity;
        a = s;
        super();
    }
}
