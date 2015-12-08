// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.captcha;

import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import com.snapchat.android.api2.SolveCaptchaTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wZ;

// Referenced classes of package com.snapchat.android.fragments.captcha:
//            CaptchaFragment

final class b
    implements android.view.er
{

    private wZ a;
    private String b;
    private CaptchaFragment c;

    public final void onClick(View view)
    {
        if (c.getActivity() == null)
        {
            return;
        }
        Object obj = a;
        view = new ArrayList(((wZ) (obj)).a.size());
        for (obj = ((wZ) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); view.add(Boolean.valueOf(((valueOf)((Iterator) (obj)).next()).next))) { }
        (new SolveCaptchaTask(b, view, c)).execute();
        CaptchaFragment.a(c).setClickable(false);
        CaptchaFragment.b(c).setText("");
        CaptchaFragment.b(c).setClickable(false);
        CaptchaFragment.c(c).setVisibility(0);
    }

    (CaptchaFragment captchafragment, wZ wz, String s)
    {
        c = captchafragment;
        a = wz;
        b = s;
        super();
    }
}
