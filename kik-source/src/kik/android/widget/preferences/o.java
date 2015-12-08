// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget.preferences:
//            m

final class o
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    o(m m)
    {
        a = m;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
