// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.view.View;
import android.widget.AdapterView;
import com.scannerfire.utils.EncodeUtils;
import java.util.ArrayList;

// Referenced classes of package com.QRBS.activity:
//            CreateApp

class this._cls0
    implements android.widget.OnItemClickListener
{

    final CreateApp this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (new StringBuilder("market://details?id=")).append((String)CreateApp.access$2(CreateApp.this).get(i)).toString();
        (new EncodeUtils(CreateApp.this)).start(adapterview, (String)CreateApp.access$2(CreateApp.this).get(i));
    }

    ils()
    {
        this$0 = CreateApp.this;
        super();
    }
}
