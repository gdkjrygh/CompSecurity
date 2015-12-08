// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;
import com.kik.android.a;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class ea
    implements android.content.DialogInterface.OnClickListener
{

    final TalkToCoverView a;

    ea(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.b("Chat Screen Block Clicked").a("Result", false).b();
    }
}
