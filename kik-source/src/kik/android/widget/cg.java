// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            ce

final class cg
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;

    cg(Context context)
    {
        a = context;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ce.a();
        ce.a(a);
        dialoginterface.dismiss();
    }
}
