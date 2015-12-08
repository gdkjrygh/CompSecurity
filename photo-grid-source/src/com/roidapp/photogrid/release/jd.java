// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class jd
    implements android.view.View.OnClickListener
{

    final ImageEditor a;

    jd(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void onClick(View view)
    {
        if (ImageEditor.y(a))
        {
            return;
        }
        if (a.g == null)
        {
            ImageEditor.A(a);
            ImageEditor.z(a);
            return;
        } else
        {
            a.h.sendEmptyMessage(ImageEditor.f());
            return;
        }
    }
}
