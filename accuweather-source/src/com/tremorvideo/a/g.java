// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.content.Context;
import android.view.KeyEvent;

// Referenced classes of package com.tremorvideo.a:
//            e

public class g extends e
{

    protected g(Context context, String s, b.a a)
    {
        super(context, s, a);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        if (i == 84)
        {
            return true;
        } else
        {
            return super.onKeyLongPress(i, keyevent);
        }
    }
}
