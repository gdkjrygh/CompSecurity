// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.messages.ipc.k;

// Referenced classes of package com.facebook.orca.threadview:
//            e

class g
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final e b;

    g(e e1, Context context)
    {
        b = e1;
        a = context;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = e.b(b).a(a);
        a.startActivity(dialoginterface);
    }
}
