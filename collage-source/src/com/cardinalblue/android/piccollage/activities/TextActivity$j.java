// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

public static class <init> extends <init>
{

    private CheckedTextView b;

    static CheckedTextView a(<init> <init>1)
    {
        return <init>1.b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c7, null);
        b = (CheckedTextView)layoutinflater.findViewById(0x7f100205);
        boolean flag = a.getText().getTextFormat().hasTextBorder();
        b.setChecked(flag);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final TextActivity.j a;

            public void onClick(View view)
            {
                TextActivity.j.a(a).toggle();
                boolean flag1 = TextActivity.j.a(a).isChecked();
                d.a().c(new TextActivity.e(flag1));
                a.a.getText().getTextFormat().setTextBorder(flag1);
                a.getArguments().putParcelable("text_model", a.a);
                com.cardinalblue.android.piccollage.a.b.ai();
            }

            
            {
                a = TextActivity.j.this;
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
