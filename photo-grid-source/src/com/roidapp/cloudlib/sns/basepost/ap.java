// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad

final class ap
    implements android.widget.TextView.OnEditorActionListener
{

    final ad a;

    ap(ad ad1)
    {
        a = ad1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        i;
        JVM INSTR tableswitch 4 4: default 20
    //                   4 22;
           goto _L1 _L2
_L1:
        return false;
_L2:
        ad.q(a);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
