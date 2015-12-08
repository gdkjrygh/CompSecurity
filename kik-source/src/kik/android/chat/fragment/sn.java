// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.widget.MediaController;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class sn extends MediaController
{

    final ViewPictureFragment a;

    sn(ViewPictureFragment viewpicturefragment, Context context)
    {
        a = viewpicturefragment;
        super(context);
    }

    public final void show()
    {
    }

    public final void show(int i)
    {
        super.show(15000);
    }
}
