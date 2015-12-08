// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.cmcm.a.a.a;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.e;
import com.roidapp.cloudlib.ads.f;
import com.roidapp.cloudlib.ads.g;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            a

final class d extends g
{

    private d(com.roidapp.photogrid.cloud.a a1)
    {
        super(a1);
    }

    d(com.roidapp.photogrid.cloud.a a1, byte byte0)
    {
        this(a1);
    }

    private static void a(com.roidapp.photogrid.cloud.a a1)
    {
        if (com.roidapp.photogrid.cloud.a.c(a1) != null)
        {
            com.roidapp.photogrid.cloud.a.c(a1).e();
        }
        com.roidapp.photogrid.cloud.a.e(a1);
        com.roidapp.photogrid.cloud.a.a(a1);
    }

    public final void a(Object obj)
    {
        obj = (com.roidapp.photogrid.cloud.a)obj;
        if (com.roidapp.photogrid.cloud.a.c(((com.roidapp.photogrid.cloud.a) (obj))) != null)
        {
            a a1 = f.a().a(40005);
            if (a1 == null)
            {
                if (com.roidapp.photogrid.cloud.a.c(((com.roidapp.photogrid.cloud.a) (obj))) != null && com.roidapp.photogrid.cloud.a.c(((com.roidapp.photogrid.cloud.a) (obj))).d() == 0)
                {
                    a(((com.roidapp.photogrid.cloud.a) (obj)));
                }
            } else
            {
                com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj))), 1, 6);
                if (com.roidapp.photogrid.cloud.a.d(((com.roidapp.photogrid.cloud.a) (obj))) != null && com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj))) != null && !com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj))).isFinishing())
                {
                    int j = (int)com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj))).getResources().getDimension(0x7f090054);
                    View view = LayoutInflater.from(com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj)))).inflate(0x7f03003a, com.roidapp.photogrid.cloud.a.d(((com.roidapp.photogrid.cloud.a) (obj))), false);
                    if (view != null)
                    {
                        com.roidapp.photogrid.cloud.a.d(((com.roidapp.photogrid.cloud.a) (obj))).removeAllViews();
                        ImageView imageview = (ImageView)view.findViewById(0x7f0d0122);
                        TextView textview = (TextView)view.findViewById(0x7f0d0123);
                        TextView textview1 = (TextView)view.findViewById(0x7f0d0124);
                        TextView textview2 = (TextView)view.findViewById(0x7f0d0125);
                        if (a1.f() != null)
                        {
                            h.a(com.roidapp.photogrid.cloud.a.b(((com.roidapp.photogrid.cloud.a) (obj)))).a(a1.f()).g().a(com.bumptech.glide.load.b.e.c).b(com.roidapp.baselib.b.a.b()).a(imageview);
                        }
                        if (textview != null)
                        {
                            textview.setText(a1.d());
                            int i;
                            if (a1.j())
                            {
                                i = 0x7f02013d;
                            } else
                            {
                                i = 0;
                            }
                            n.a(textview, 0, 0, i);
                        }
                        if (textview1 != null)
                        {
                            textview1.setText(a1.h());
                        }
                        if (textview2 != null)
                        {
                            if (a1.g() != null && a1.g().length() < 20)
                            {
                                textview2.setText(a1.g());
                            } else
                            {
                                textview2.setText(null);
                            }
                            n.a(textview2, 0, 0x7f02013e, 0);
                        }
                        a1.a(view);
                        com.roidapp.photogrid.cloud.a.d(((com.roidapp.photogrid.cloud.a) (obj))).getLayoutParams().height = j;
                        com.roidapp.photogrid.cloud.a.d(((com.roidapp.photogrid.cloud.a) (obj))).addView(view);
                        return;
                    }
                }
            }
        }
    }

    public final void a(Object obj, a a1)
    {
        com.roidapp.photogrid.cloud.a.a(com.roidapp.photogrid.cloud.a.b((com.roidapp.photogrid.cloud.a)obj), 4, 6);
    }

    public final void b(Object obj)
    {
        a((com.roidapp.photogrid.cloud.a)obj);
    }
}
