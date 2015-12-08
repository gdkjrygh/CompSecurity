// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            BugmeBarView

final class m
    implements android.content.DialogInterface.OnClickListener
{

    final BugmeBarView a;

    m(BugmeBarView bugmebarview)
    {
        a = bugmebarview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
