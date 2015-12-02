// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bx
    implements android.view.View.OnFocusChangeListener
{

    final ThreadViewFragment a;

    bx(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        ThreadViewFragment.i(a);
    }
}
