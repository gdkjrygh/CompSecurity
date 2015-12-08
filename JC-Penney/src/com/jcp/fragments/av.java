// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            JCPCreateAccountFragment

class av
    implements android.view.View.OnTouchListener
{

    final JCPCreateAccountFragment a;
    final JCPCreateAccountFragment..ViewInjector b;

    av(JCPCreateAccountFragment..ViewInjector viewinjector, JCPCreateAccountFragment jcpcreateaccountfragment)
    {
        b = viewinjector;
        a = jcpcreateaccountfragment;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onPasswordEditTextTouch(view, motionevent);
    }
}
