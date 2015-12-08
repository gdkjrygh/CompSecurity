// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.content.DialogInterface;

// Referenced classes of package com.yume.android.player:
//            G

final class g
    implements android.content.DialogInterface.OnClickListener
{

    g()
    {
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        G.a = false;
    }
}
