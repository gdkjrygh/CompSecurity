// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.QRBS.activity:
//            CreateGps

class this._cls0
    implements android.view.Listener
{

    final CreateGps this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.PICK");
        view.setType("vnd.android.cursor.dir/postal-address_v2");
        startActivityForResult(view, 0);
    }

    ner()
    {
        this$0 = CreateGps.this;
        super();
    }
}
