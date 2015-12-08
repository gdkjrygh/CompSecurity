// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            BugmeBarView

final class j
    implements android.content.DialogInterface.OnCancelListener
{

    final kik.android.util.p.a a;
    final BugmeBarView b;

    j(BugmeBarView bugmebarview, kik.android.util.p.a a1)
    {
        b = bugmebarview;
        a = a1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel(true);
        BugmeBarView.a(b, false);
    }
}
