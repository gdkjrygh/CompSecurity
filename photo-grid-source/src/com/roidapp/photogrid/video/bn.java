// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package com.roidapp.photogrid.video:
//            VideoPictureEditActivity

final class bn
    implements Runnable
{

    final AnimationDrawable a;
    final VideoPictureEditActivity b;

    bn(VideoPictureEditActivity videopictureeditactivity, AnimationDrawable animationdrawable)
    {
        b = videopictureeditactivity;
        a = animationdrawable;
        super();
    }

    public final void run()
    {
        if (a != null)
        {
            a.start();
        }
    }
}
