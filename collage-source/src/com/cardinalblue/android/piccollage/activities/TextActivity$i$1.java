// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.Font;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

class a
    implements android.widget.mClickListener
{

    final a a;

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = ((Font)a(a).tItem(j)).fontName;
        d.a().c(new nit>(adapterview));
        a.a.getText().getTextFormat().getFont().setFontName(adapterview);
        a.tArguments().putParcelable("text_model", a.a);
    }

    xtModel(xtModel xtmodel)
    {
        a = xtmodel;
        super();
    }
}
