// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.Font;
import com.cardinalblue.android.piccollage.model.gson.FontList;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.squareup.a.b;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

public static class <init> extends <init>
{

    private getResources b;

    static <init> a(<init> <init>1)
    {
        return <init>1.b;
    }

    public volatile void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300c8, null);
        layoutinflater = (FontList)k.a(getResources(), 0x7f060006, com/cardinalblue/android/piccollage/model/gson/FontList);
        bundle = getActivity();
        int j;
        if (layoutinflater != null)
        {
            layoutinflater = ((FontList) (layoutinflater)).fontList;
        } else
        {
            layoutinflater = new ArrayList();
        }
        b = new <init>(bundle, 0x7f03014c, layoutinflater);
        layoutinflater = (ListView)viewgroup.findViewById(0x7f100206);
        layoutinflater.setAdapter(b);
        layoutinflater.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TextActivity.i a;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                adapterview = ((Font)TextActivity.i.a(a).getItem(l)).fontName;
                d.a().c(new TextActivity.f(adapterview));
                a.a.getText().getTextFormat().getFont().setFontName(adapterview);
                a.getArguments().putParcelable("text_model", a.a);
            }

            
            {
                a = TextActivity.i.this;
                super();
            }
        });
        a = (TextScrapModel)getArguments().getParcelable("text_model");
        bundle = a.getText().getTextFormat().getFont().getFontName();
        j = b.a(bundle);
        if (j >= 0)
        {
            layoutinflater.performItemClick(layoutinflater.getChildAt(j), j, j);
            layoutinflater.setSelectionFromTop(j, getResources().getDimensionPixelSize(0x7f0b013b) / 2);
        }
        return viewgroup;
    }

    public _cls1.a()
    {
        super(null);
    }
}
