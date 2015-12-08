// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, ProgressDialogFragment

final class sw
    implements android.content.DialogInterface.OnCancelListener
{

    final ViewPictureFragment a;

    sw(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (ViewPictureFragment.c(a).isAdded())
        {
            ViewPictureFragment.c(a).dismiss();
        }
        a.J();
    }
}
