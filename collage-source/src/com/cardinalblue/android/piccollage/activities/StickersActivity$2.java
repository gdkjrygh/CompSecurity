// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.n;
import com.cardinalblue.android.piccollage.view.a.u;
import com.supersonic.mediationsdk.sdk.Supersonic;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

class b
    implements android.support.v4.view.ngeListener
{

    final String a;
    final String b;
    final StickersActivity c;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        StickerBundle stickerbundle = StickersActivity.a(c).a(i);
        if (stickerbundle != null)
        {
            StickersActivity.a(c, stickerbundle.f());
            StickersActivity.a(c, com.cardinalblue.android.piccollage.activities.StickersActivity.b(c).isRewardedVideoAvailable());
            String s;
            n n1;
            if (stickerbundle.f().equals(a))
            {
                s = b;
            } else
            {
                s = "sticker preview list";
            }
            n1 = stickerbundle.h();
            com.cardinalblue.android.piccollage.a.b.n(stickerbundle.f(), s);
            if (n1 != null && n1.a() != null && !n1.a().isEmpty())
            {
                com.cardinalblue.android.piccollage.a.b.k(n1.a(), "sticker pack");
            }
        }
    }

    (StickersActivity stickersactivity, String s, String s1)
    {
        c = stickersactivity;
        a = s;
        b = s1;
        super();
    }
}
