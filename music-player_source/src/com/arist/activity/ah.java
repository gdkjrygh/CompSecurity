// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.support.v4.view.bs;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.arist.activity:
//            MusicPlayActivity

final class ah extends bs
{

    final MusicPlayActivity a;
    private final LinearLayout b;

    ah(MusicPlayActivity musicplayactivity, LinearLayout linearlayout)
    {
        a = musicplayactivity;
        b = linearlayout;
        super();
    }

    public final void a(int i)
    {
        int j = 0;
        do
        {
            if (j >= b.getChildCount())
            {
                return;
            }
            View view = b.getChildAt(j);
            boolean flag;
            if (i == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            j++;
        } while (true);
    }
}
