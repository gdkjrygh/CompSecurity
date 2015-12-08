// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.video:
//            VideoPictureEditActivity

final class bo
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final VideoPictureEditActivity b;

    bo(VideoPictureEditActivity videopictureeditactivity, Dialog dialog)
    {
        b = videopictureeditactivity;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
        VideoPictureEditActivity.a(b);
    }
}
