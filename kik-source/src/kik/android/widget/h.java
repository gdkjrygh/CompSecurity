// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            e, BugmeBarView

final class h
    implements android.content.DialogInterface.OnCancelListener
{

    final e a;

    h(e e1)
    {
        a = e1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        BugmeBarView.a(a.a, false);
    }
}
