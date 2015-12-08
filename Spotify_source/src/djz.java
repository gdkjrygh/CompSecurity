// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class djz extends dxj
{

    public djz()
    {
    }

    public static djz a()
    {
        return new djz();
    }

    public final dka F()
    {
        return (dka)H().a(this);
    }

    public final boolean G()
    {
        F().b();
        return true;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030075, viewgroup, false);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ((TextView)view.findViewById(0x7f11026e)).setText(0x7f0800b3);
        ((android.view.ViewGroup.MarginLayoutParams)view.findViewById(0x7f11026e).getLayoutParams()).topMargin = k().getResources().getDimensionPixelSize(0x7f0c0084);
        ((TextView)view.findViewById(0x7f1102ef)).setText(0x7f0800b2);
        bundle = (TextView)view.findViewById(0x7f1102a3);
        bundle.setText(0x7f0800b0);
        bundle.setVisibility(0);
        ((TextView)view.findViewById(0x7f11034e)).setVisibility(0);
        bundle = (Button)view.findViewById(0x7f11034f);
        bundle.setText(0x7f0800bf);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            private djz a;

            public final void onClick(View view1)
            {
                a.F().a();
            }

            
            {
                a = djz.this;
                super();
            }
        });
        bundle = (Button)view.findViewById(0x7f110350);
        bundle.setText(0x7f0800be);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            private djz a;

            public final void onClick(View view1)
            {
                a.F().b();
            }

            
            {
                a = djz.this;
                super();
            }
        });
        bundle = dkw.b(k());
        String s = dkw.c(k());
        ((TextView)view.findViewById(0x7f11034c)).setText(bundle);
        ((TextView)view.findViewById(0x7f11034d)).setText(s);
    }
}
