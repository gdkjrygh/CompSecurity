// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class dkd extends dxj
{

    public dkd()
    {
    }

    public static dkd a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("key_title", s);
        bundle.putString("key_description", s1);
        s = new dkd();
        s.f(bundle);
        return s;
    }

    public final boolean G()
    {
        a().a();
        return true;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030075, viewgroup, false);
    }

    public final dke a()
    {
        return (dke)H().a(this);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        bundle = dkw.b(k());
        String s = dkw.c(k());
        Button button = (Button)view.findViewById(0x7f11034f);
        button.setText(0x7f0800af);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            private dkd a;

            public final void onClick(View view1)
            {
                a.a().a();
            }

            
            {
                a = dkd.this;
                super();
            }
        });
        view.findViewById(0x7f110350).setVisibility(8);
        ((TextView)view.findViewById(0x7f11026e)).setText(g().getString("key_title"));
        ((TextView)view.findViewById(0x7f1102ef)).setText(g().getString("key_description"));
        ((TextView)view.findViewById(0x7f11034c)).setText(bundle);
        ((TextView)view.findViewById(0x7f11034d)).setText(s);
    }
}
