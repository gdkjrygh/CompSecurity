// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            eu, WebVideoView

final class ev
    implements android.content.DialogInterface.OnClickListener
{

    final eu a;

    ev(eu eu1)
    {
        a = eu1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (WebVideoView.i(a.a) != null)
        {
            WebVideoView.i(a.a).onCompletion(WebVideoView.g(a.a));
        }
    }
}
