// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.graphics.Bitmap;
import android.widget.GridView;
import android.widget.ImageView;

// Referenced classes of package com.ijoysoft.appwall:
//            g, p

final class q
    implements g
{

    final p a;
    private final GridView b;

    q(p p, GridView gridview)
    {
        a = p;
        b = gridview;
        super();
    }

    public final void a(String s, Bitmap bitmap)
    {
        s = (ImageView)b.findViewWithTag(s);
        if (s != null)
        {
            s.setImageBitmap(bitmap);
        }
    }
}
