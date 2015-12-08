// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import android.widget.EditText;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.j;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            aj

class a
    implements android.view.OnClickListener
{

    final com.cardinalblue.android.piccollage.events.ts.aj._cls1.a a;
    final aj b;

    public void onClick(View view)
    {
        d.a().c(new j(aj.a(b).getText().toString(), a));
    }

    (aj aj1, com.cardinalblue.android.piccollage.events. )
    {
        b = aj1;
        a = ;
        super();
    }
}
