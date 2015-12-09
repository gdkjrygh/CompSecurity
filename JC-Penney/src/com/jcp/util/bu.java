// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.widget.ImageView;

// Referenced classes of package com.jcp.util:
//            bt, a

final class bu
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ImageView a;
    final String b;

    bu(ImageView imageview, String s)
    {
        a = imageview;
        b = s;
        super();
    }

    public void onGlobalLayout()
    {
        bt.a(a.getViewTreeObserver(), this);
        a.setImageBitmap(com.jcp.util.a.a(b, a.getHeight(), a.getWidth()));
    }
}
