// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;
import com.facebook.l;

// Referenced classes of package com.facebook.share.widget:
//            ShareButton, i, h

final class g
    implements android.view.View.OnClickListener
{

    final ShareButton a;

    g(ShareButton sharebutton)
    {
        a = sharebutton;
        super();
    }

    public final void onClick(View view)
    {
        ShareButton.a(a, view);
        if (((l) (a)).b != null)
        {
            view = new i(((l) (a)).b, ((h) (a)).d);
        } else
        {
            view = new i(ShareButton.a(a), ((h) (a)).d);
        }
        view.a(((h) (a)).c);
    }
}
