// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.content.DialogInterface;

// Referenced classes of package com.microsoft.onlineid.ui:
//            SignOutActivity

final class a
    implements android.content.ClickListener
{

    final SignOutActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }

    ner(SignOutActivity signoutactivity)
    {
        a = signoutactivity;
        super();
    }
}
