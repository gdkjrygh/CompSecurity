// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.os.Bundle;
import com.qihoo.security.ui.fragment.utils.FragmentAction;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

class b
    implements Runnable
{

    final FragmentAction a;
    final Bundle b;
    final BaseResultFragment c;

    public void run()
    {
        BaseResultFragment.f(c).c(a, b);
    }

    (BaseResultFragment baseresultfragment, FragmentAction fragmentaction, Bundle bundle)
    {
        c = baseresultfragment;
        a = fragmentaction;
        b = bundle;
        super();
    }
}
