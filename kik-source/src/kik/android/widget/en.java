// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            VideoController

final class en
    implements android.view.View.OnClickListener
{

    final VideoController a;

    en(VideoController videocontroller)
    {
        a = videocontroller;
        super();
    }

    public final void onClick(View view)
    {
        if (VideoController.c(a) == null)
        {
            return;
        } else
        {
            int i = VideoController.c(a).d();
            VideoController.c(a).a(i + 15000);
            a.d();
            a.a(0);
            return;
        }
    }
}
