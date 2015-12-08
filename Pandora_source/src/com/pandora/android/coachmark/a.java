// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.pandora.android.coachmark:
//            d

public class a extends d
{

    private Activity a;

    public a(Activity activity)
    {
        a = activity;
    }

    public View a()
    {
        View view = a.findViewById(0x102002c);
        if (view == null)
        {
            throw new RuntimeException("insertShowcaseViewWithType cannot be used when the theme has no ActionBar");
        } else
        {
            return view;
        }
    }
}
