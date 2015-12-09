// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.events.h;
import com.cardinalblue.android.piccollage.model.Collage;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            p

public static class _cls3.b extends Fragment
{

    private Collage a;
    private int b;
    private View c;

    static Collage a(_cls3.b b1)
    {
        return b1.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (Collage)getArguments().getParcelable("extra_collage");
        b = getArguments().getInt("position", -1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03012d, viewgroup, false);
        bundle = k.t();
        viewgroup = (ImageView)layoutinflater.findViewById(0x7f10026e);
        android.view.Group.LayoutParams layoutparams = viewgroup.getLayoutParams();
        layoutparams.width = ((Point) (bundle)).x;
        int l;
        if (a.y())
        {
            l = ((Point) (bundle)).x;
        } else
        {
            l = ((Point) (bundle)).y;
        }
        layoutparams.height = l;
        viewgroup.setLayoutParams(layoutparams);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final p.a a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new h(1, com.cardinalblue.android.piccollage.view.a.p.a.a(a)));
            }

            
            {
                a = p.a.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f10026f).setOnClickListener(new android.view.View.OnClickListener() {

            final p.a a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new h(2, com.cardinalblue.android.piccollage.view.a.p.a.a(a)));
            }

            
            {
                a = p.a.this;
                super();
            }
        });
        c = layoutinflater.findViewById(0x7f10026f);
        bundle = layoutinflater.findViewById(0x7f10019b);
        bundle.setVisibility(0);
        g.a(getActivity()).a(a.q()).l().a(i.a).c().d().a(true).a(com.bumptech.glide.load.engine.b.b).a(new e(bundle, viewgroup) {

            final View a;
            final ImageView b;
            final p.a c;

            public boolean a(Bitmap bitmap, File file, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                a.setVisibility(8);
                bitmap = b.getLayoutParams();
                bitmap.height = -2;
                b.setLayoutParams(bitmap);
                return false;
            }

            public boolean a(Exception exception, File file, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                f.a(exception);
                return false;
            }

            public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                return a(exception, (File)obj, j1, flag);
            }

            public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                return a((Bitmap)obj, (File)obj1, j1, flag, flag1);
            }

            
            {
                c = p.a.this;
                a = view;
                b = imageview;
                super();
            }
        }).a(viewgroup);
        return layoutinflater;
    }

    public void onPageSelected(com.cardinalblue.android.piccollage.events.i l)
    {
label0:
        {
            if (c != null)
            {
                if (b == l.b && l.a)
                {
                    break label0;
                }
                c.setVisibility(8);
            }
            return;
        }
        c.setVisibility(0);
        k.a(getActivity(), a.p());
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.a().a(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a().b(this);
    }

    public _cls3.b()
    {
    }
}
