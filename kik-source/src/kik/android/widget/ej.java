// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            VideoController

final class ej
    implements android.view.View.OnClickListener
{

    final VideoController a;

    ej(VideoController videocontroller)
    {
        a = videocontroller;
        super();
    }

    public final void onClick(View view)
    {
        VideoController.a(a);
        a.a(0);
    }
}
