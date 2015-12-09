// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments:
//            s, bk, bl, bi, 
//            bj

public class bh extends s
{

    private ImageView a;
    private ImageView b;
    private TypefaceTextView c;
    private TypefaceTextView d;
    private TypefaceTextView e;
    private TypefaceTextView f;

    public bh()
    {
    }

    private void U()
    {
        a.setBackgroundResource(0x7f020206);
        b.setBackgroundResource(0x7f020201);
        c.setText(0x7f0703fc);
        d.setText(0x7f0703f9);
        e.setText(0x7f07019b);
        f.setText(0x7f070319);
    }

    static void a(bh bh1, String s1, String s2)
    {
        bh1.a(s1, s2);
    }

    private void a(String s1, String s2)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f070049, new bk(this, s2));
        builder.setNegativeButton(0x7f070041, new bl(this));
        builder.create().show();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        layoutinflater = layoutinflater.inflate(0x7f03006b, viewgroup, false);
        a = (ImageView)layoutinflater.findViewById(0x7f0e0275);
        b = (ImageView)layoutinflater.findViewById(0x7f0e0279);
        c = (TypefaceTextView)layoutinflater.findViewById(0x7f0e0276);
        d = (TypefaceTextView)layoutinflater.findViewById(0x7f0e027a);
        e = (TypefaceTextView)layoutinflater.findViewById(0x7f0e0277);
        f = (TypefaceTextView)layoutinflater.findViewById(0x7f0e027b);
        viewgroup = (RelativeLayout)layoutinflater.findViewById(0x7f0e0274);
        bundle = (RelativeLayout)layoutinflater.findViewById(0x7f0e0278);
        U();
        viewgroup.setOnClickListener(new bi(this));
        bundle.setOnClickListener(new bj(this));
        a(a(0x7f0700de), ((android.app.Activity) (i())));
        return layoutinflater;
    }

    protected String a()
    {
        return "REWARDS";
    }

    public void b()
    {
        a(a(0x7f0700de));
        super.b();
    }
}
