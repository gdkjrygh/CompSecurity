// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            b

class a
    implements android.content.gInterface.OnClickListener
{

    final b a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.PICK");
        dialoginterface.setType("image/*");
        a.startActivityForResult(dialoginterface, 108);
    }

    _cls9(b b1)
    {
        a = b1;
        super();
    }
}
