// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.jcp.fragments:
//            ff

class fk
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final ff b;

    fk(ff ff1, String s)
    {
        b = ff1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a));
        b.a(dialoginterface);
    }
}
