// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.facebook.h;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity, ae

class s
    implements android.view.View.OnClickListener
{

    final int a;
    final long b;
    final WebrtcIncallActivity c;

    s(WebrtcIncallActivity webrtcincallactivity, int i, long l)
    {
        c = webrtcincallactivity;
        a = i;
        b = l;
        super();
    }

    public void onClick(View view)
    {
        int i = a;
        WebrtcIncallActivity.o(c).a(i + 1, b);
        for (int j = 0; j <= a; j++)
        {
            ((ImageButton)WebrtcIncallActivity.p(c).getChildAt(j)).setImageResource(h.voip_star_pressed);
        }

        c.finish();
    }
}
