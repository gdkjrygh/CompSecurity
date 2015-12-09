// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

class a
    implements android.view.ner
{

    final a a;

    public void onClick(View view)
    {
        a(a).toggle();
        boolean flag = a(a).isChecked();
        d.a().c(new nit>(flag));
        a.a.getText().getTextFormat().setTextBorder(flag);
        a.tArguments().putParcelable("text_model", a.a);
        com.cardinalblue.android.piccollage.a.b.ai();
    }

    xtModel(xtModel xtmodel)
    {
        a = xtmodel;
        super();
    }
}
