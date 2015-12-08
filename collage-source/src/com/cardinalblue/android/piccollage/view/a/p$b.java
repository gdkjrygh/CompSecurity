// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            p

public static class _cls3.a extends Fragment
{

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = k.t();
        layoutinflater = layoutinflater.inflate(0x7f030145, viewgroup, false);
        viewgroup = layoutinflater.findViewById(0x7f10016c);
        android.view.Group.LayoutParams layoutparams = viewgroup.getLayoutParams();
        layoutparams.width = ((Point) (bundle)).x;
        layoutparams.height = ((Point) (bundle)).y;
        viewgroup.setLayoutParams(layoutparams);
        layoutinflater.findViewById(0x7f10029d).setOnClickListener(new android.view.View.OnClickListener() {

            final p.b a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.aM("grid");
                com.cardinalblue.android.piccollage.a.b.bk();
                d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.b());
            }

            
            {
                a = p.b.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f10029f).setOnClickListener(new android.view.View.OnClickListener() {

            final p.b a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.c();
                com.cardinalblue.android.piccollage.a.b.a("gallery template");
                com.cardinalblue.android.piccollage.a.b.aM("empty");
                d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.a());
            }

            
            {
                a = p.b.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f10029e).setOnClickListener(new android.view.View.OnClickListener() {

            final p.b a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.bj();
                d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.c());
            }

            
            {
                a = p.b.this;
                super();
            }
        });
        return layoutinflater;
    }

    public _cls3.a()
    {
    }
}
