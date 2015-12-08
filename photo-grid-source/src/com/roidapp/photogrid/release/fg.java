// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import com.roidapp.photogrid.b.f;

// Referenced classes of package com.roidapp.photogrid.release:
//            fb, PhotoGridActivity, ih

final class fg
    implements android.view.View.OnClickListener
{

    final fb a;

    fg(fb fb1)
    {
        a = fb1;
        super();
    }

    public final void onClick(View view)
    {
        if (fb.b(a).i)
        {
            return;
        } else
        {
            ih.C().j("template/layout");
            fb.b(a).a(4);
            fb.b(a).a(4, 5, false);
            f.a("TemplateSelect_View", "LayoutTemplate_TemplateSelect");
            return;
        }
    }
}
