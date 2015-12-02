// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.bugreporter:
//            ab, ae

class ad
    implements android.content.DialogInterface.OnClickListener
{

    final ab a;

    ad(ab ab1)
    {
        a = ab1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ab.a(a).a();
        dialoginterface.cancel();
    }
}
