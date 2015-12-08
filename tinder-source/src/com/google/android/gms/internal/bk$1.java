// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            bk, cl

final class a
    implements android.content.gInterface.OnClickListener
{

    final bk a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a;
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.darContract.Events.CONTENT_URI);
        intent.putExtra("title", ((bk) (dialoginterface)).b);
        intent.putExtra("eventLocation", ((bk) (dialoginterface)).f);
        intent.putExtra("description", ((bk) (dialoginterface)).e);
        if (((bk) (dialoginterface)).c > -1L)
        {
            intent.putExtra("beginTime", ((bk) (dialoginterface)).c);
        }
        if (((bk) (dialoginterface)).d > -1L)
        {
            intent.putExtra("endTime", ((bk) (dialoginterface)).d);
        }
        intent.setFlags(0x10000000);
        d.c();
        cl.a(a.a, intent);
    }

    (bk bk1)
    {
        a = bk1;
        super();
    }
}
