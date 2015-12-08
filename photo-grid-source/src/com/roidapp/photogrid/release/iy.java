// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            aq, ImageEditor

final class iy
    implements android.view.View.OnClickListener
{

    final ImageEditor a;

    iy(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void onClick(View view)
    {
        a.a((aq)view);
    }
}
