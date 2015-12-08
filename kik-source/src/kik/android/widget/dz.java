// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;
import com.kik.android.a;
import kik.a.d.k;
import kik.a.e.i;
import kik.a.e.r;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class dz
    implements android.content.DialogInterface.OnClickListener
{

    final TalkToCoverView a;

    dz(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.c.c(TalkToCoverView.e(a).a());
        a.d.b(TalkToCoverView.e(a).b());
        a.a.b("Chat Screen Block Clicked").a("Result", true).b();
    }
}
