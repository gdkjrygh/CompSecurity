// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz

class cd
    implements android.view.View.OnKeyListener
{

    final bz a;
    final bz.b b;

    cd(bz.b b1, bz bz)
    {
        b = b1;
        a = bz;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 23)
        {
            b.c = true;
            view.invalidate();
        }
        return false;
    }
}
