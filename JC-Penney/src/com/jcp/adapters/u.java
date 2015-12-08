// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.jcp.activities.ViewPagerWithZoomActivity;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            s

class u
    implements android.view.View.OnClickListener
{

    final ImageView a;
    final s b;

    u(s s1, ImageView imageview)
    {
        b = s1;
        a = imageview;
        super();
    }

    public void onClick(View view)
    {
        if (a.getDrawable() != null && s.a(b) != null && !s.a(b).isEmpty())
        {
            view = new Intent(s.b(b), com/jcp/activities/ViewPagerWithZoomActivity);
            view.putExtra("PPID", s.c(b));
            ViewPagerWithZoomActivity.c(s.d(b));
            ViewPagerWithZoomActivity.b(s.a(b));
            ViewPagerWithZoomActivity.a(s.e(b));
            s.b(b).startActivity(view);
        }
    }
}
