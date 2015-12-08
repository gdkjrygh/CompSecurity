// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.view.View;
import com.roidapp.baselib.view.FixedDrawerLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class jw
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final ImageSelector b;

    jw(ImageSelector imageselector, Dialog dialog)
    {
        b = imageselector;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
        ImageSelector.r(b).e(ImageSelector.q(b));
    }
}
