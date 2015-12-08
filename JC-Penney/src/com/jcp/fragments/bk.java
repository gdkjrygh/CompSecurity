// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.jcp.fragments:
//            bh

class bk
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final bh b;

    bk(bh bh1, String s)
    {
        b = bh1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a));
        b.a(intent);
        dialoginterface.dismiss();
    }
}
