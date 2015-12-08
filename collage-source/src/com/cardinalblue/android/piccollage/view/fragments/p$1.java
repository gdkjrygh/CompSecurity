// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.view.a.x;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            p, ad

class r extends android.support.v4.view.Pager.SimpleOnPageChangeListener
{

    final p a;

    public void onPageSelected(int i)
    {
        Object obj;
        super.onPageSelected(i);
        i = p.a(a).a(i);
        obj = null;
        i;
        JVM INSTR tableswitch 3 5: default 48
    //                   3 83
    //                   4 92
    //                   5 101;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (ad)a.getChildFragmentManager().findFragmentByTag(((String) (obj)));
            ((ad) (obj)).e();
            ((ad) (obj)).a(a);
        }
        return;
_L2:
        obj = "find_featured_friends_fragment";
        b.D();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "find_facebook_friends_fragment";
        b.E();
        continue; /* Loop/switch isn't completed */
_L4:
        b.F();
        if (true) goto _L1; else goto _L5
_L5:
    }

    tener(p p1)
    {
        a = p1;
        super();
    }
}
