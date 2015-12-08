// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class in
    implements android.view.View.OnClickListener
{

    final ImageEditor a;

    in(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void onClick(View view)
    {
        while (ImageEditor.y(a) || ImageEditor.s(a) == null) 
        {
            return;
        }
        ImageEditor.a(a, true);
        a.h.sendEmptyMessage(ImageEditor.k());
    }
}
