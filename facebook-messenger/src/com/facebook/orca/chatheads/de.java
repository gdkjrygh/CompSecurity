// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.orca.emoji.ah;
import com.facebook.orca.emoji.ai;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.chatheads:
//            dc, dg, df, dh, 
//            dd

class de
    implements ah
{

    final dc a;

    private de(dc dc1)
    {
        a = dc1;
        super();
    }

    de(dc dc1, dd dd)
    {
        this(dc1);
    }

    public void a()
    {
        if (dc.a(a) == null)
        {
            return;
        }
        if (dc.a(a).h() != null)
        {
            ((df)dc.a(a).h()).a();
        }
        dc.a(a).b();
        dc.a(a, null);
        if (dc.d(a) != null)
        {
            dc.d(a).a();
        }
        dc.e(a).setEmojiKeyboardWindowControlListener(null);
    }

    public void a(Rect rect)
    {
        int i = dc.e(a).getAvailableScreenWidth();
        int j = dc.e(a).getAvailableScreenHeight();
        rect.bottom = dc.b(a).getDefaultDisplay().getHeight();
        rect.top = rect.bottom - j;
        rect.left = 0;
        rect.right = i;
    }

    public void a(Fragment fragment, String s, int i, int j, int k)
    {
        df df1;
        boolean flag;
        if (dc.a(a) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        dc.a(a, new dg(dc.b(a)));
        dc.a(a).setY(i);
        dc.a(a).setX(j);
        dc.a(a).c(c());
        if (k > 0)
        {
            dc.a(a).d(k);
        }
        df1 = new df(dc.c(a));
        df1.a(fragment, s);
        dc.a(a).a(df1);
        dc.a(a).a();
        dc.e(a).setEmojiKeyboardWindowControlListener(dc.d(a));
    }

    public void a(ai ai1)
    {
        dc.a(a, ai1);
    }

    public boolean b()
    {
        return dc.a(a) != null;
    }

    public int c()
    {
        return dc.e(a).getDesiredKeyboardWidth();
    }
}
