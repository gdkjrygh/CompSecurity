// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            PagerTabStrip, ViewPager

final class a
    implements android.view.ener
{

    final PagerTabStrip a;

    public final void onClick(View view)
    {
        a.a.setCurrentItem(a.a.b() + 1);
    }

    (PagerTabStrip pagertabstrip)
    {
        a = pagertabstrip;
        super();
    }
}
