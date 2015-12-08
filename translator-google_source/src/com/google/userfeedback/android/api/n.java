// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.DialogInterface;

// Referenced classes of package com.google.userfeedback.android.api:
//            m

final class n
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    n(m m)
    {
        a = m;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
