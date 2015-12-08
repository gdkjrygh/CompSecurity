// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.model.gson.ColorOptionList;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

public static class <init> extends <init>
{

    private ColorOption b;
    private int c;
    private a d;

    static <init> a(<init> <init>1)
    {
        return <init>1.d;
    }

    private  a(ColorOptionList coloroptionlist)
    {
        return new <init>(getActivity(), 0x7f0300f4, coloroptionlist.colorOptions);
    }

    static ColorOption a(.colorOptions coloroptions, ColorOption coloroption)
    {
        coloroptions.b = coloroption;
        return coloroption;
    }

    static ColorOption b(b b1)
    {
        return b1.b;
    }

    public volatile void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = a(getActivity()).a();
        c = a.getText().getTextFormat().getTextColor();
        layoutinflater = layoutinflater.inflate(0x7f0300c6, null);
        bundle = (GridView)layoutinflater.findViewById(0x7f100204);
        d = a(viewgroup);
        d.a(viewgroup.getColorOptionIndex(c));
        bundle.setAdapter(d);
        bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TextActivity.h a;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                TextActivity.h.a(a).a(i);
                TextActivity.h.a(a).notifyDataSetInvalidated();
                TextActivity.h.a(a, (ColorOption)TextActivity.h.a(a).getItem(i));
                com.cardinalblue.android.piccollage.controller.d.a().c(new TextActivity.d(com.cardinalblue.android.piccollage.activities.TextActivity.h.b(a)));
                a.a.getText().getTextFormat().setTextColor(com.cardinalblue.android.piccollage.activities.TextActivity.h.b(a).getColor());
                a.a.getText().getTextFormat().setBorderColor(com.cardinalblue.android.piccollage.activities.TextActivity.h.b(a).getContrastColor());
                a.getArguments().putParcelable("text_model", a.a);
            }

            
            {
                a = TextActivity.h.this;
                super();
            }
        });
        return layoutinflater;
    }

    public _cls1.a()
    {
        super(null);
    }
}
