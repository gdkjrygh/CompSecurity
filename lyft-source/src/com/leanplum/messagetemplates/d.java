// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.content.DialogInterface;
import com.leanplum.ActionContext;

// Referenced classes of package com.leanplum.messagetemplates:
//            c

final class d
    implements android.content.DialogInterface.OnClickListener
{

    private final ActionContext a;

    d(c c, ActionContext actioncontext)
    {
        a = actioncontext;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.runActionNamed("Dismiss action");
    }
}
