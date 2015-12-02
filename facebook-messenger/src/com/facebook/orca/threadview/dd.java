// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMessageFragment

class dd
    implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{

    final ThreadViewMessageFragment a;

    dd(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void onGlobalFocusChanged(View view, View view1)
    {
        ThreadViewMessageFragment.a(a, view, view1);
    }
}
