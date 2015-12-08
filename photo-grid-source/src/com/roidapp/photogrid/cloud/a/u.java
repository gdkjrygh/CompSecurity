// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.a.a;
import com.roidapp.photogrid.common.az;
import com.roidapp.videolib.core.l;
import com.roidapp.videolib.e;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            l, v, t

public final class u extends com.roidapp.photogrid.cloud.a.l
{

    private boolean a;
    private int b;
    private Boolean c;
    private Bitmap g;

    public u(Context context, t t, boolean flag)
    {
        super(context, 3, t);
        a = flag;
        if (a)
        {
            switch ((int)(Math.random() * 3D))
            {
            default:
                b = 4;
                return;

            case 0: // '\0'
                b = 0;
                return;

            case 1: // '\001'
                b = 1;
                break;
            }
            return;
        }
        if (d == null)
        {
            flag = false;
            break MISSING_BLOCK_LABEL_75;
        }
        l.a();
        if (!l.d())
        {
            flag = false;
            continue;
        }
        if (c != null) goto _L2; else goto _L1
_L1:
        context = d.getApplicationContext();
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(context))
        {
            context = Boolean.valueOf(false);
            c = context;
            flag = context.booleanValue();
            continue;
        }
        com.roidapp.photogrid.cloud.a.v.a[e.a().a(context, com.roidapp.cloudlib.a.a.a(context).c("video", "black_list")) - 1];
        JVM INSTR tableswitch 1 3: default 196
    //                   1 210
    //                   2 228
    //                   3 246;
           goto _L2 _L3 _L4 _L5
_L2:
        flag = Boolean.TRUE.equals(c);
        continue;
_L3:
        context = Boolean.valueOf(true);
        c = context;
        flag = context.booleanValue();
        continue;
_L4:
        context = Boolean.valueOf(false);
        c = context;
        flag = context.booleanValue();
        continue;
_L5:
        e.a();
        context = Boolean.valueOf(e.a(context));
        c = context;
        flag = context.booleanValue();
        continue;
        do
        {
            if (flag)
            {
                b = 6;
                return;
            }
            switch (az.q)
            {
            case 2: // '\002'
            case 3: // '\003'
            default:
                switch ((int)(Math.random() * 3D))
                {
                default:
                    b = 4;
                    return;

                case 0: // '\0'
                    b = 0;
                    return;

                case 1: // '\001'
                    b = 1;
                    break;
                }
                break;

            case 1: // '\001'
                if (Math.random() > 0.5D)
                {
                    b = 0;
                    return;
                } else
                {
                    b = 4;
                    return;
                }

            case 0: // '\0'
                if (Math.random() > 0.5D)
                {
                    b = 1;
                    return;
                } else
                {
                    b = 4;
                    return;
                }

            case 4: // '\004'
                if (Math.random() > 0.5D)
                {
                    b = 0;
                    return;
                } else
                {
                    b = 1;
                    return;
                }
            }
            break;
        } while (true);
        return;
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        TextView textview;
        TextView textview1;
        if (f || layoutinflater == null)
        {
            return null;
        }
        if (view != null && !(view.getTag() instanceof u))
        {
            view = null;
        }
        if (view == null)
        {
            view = layoutinflater.inflate(0x7f030013, viewgroup, false);
        }
        if (view == null)
        {
            return null;
        }
        view.setOnClickListener(this);
        viewgroup = (ImageView)view.findViewById(0x7f0d007d);
        textview = (TextView)view.findViewById(0x7f0d007b);
        textview1 = (TextView)view.findViewById(0x7f0d007c);
        layoutinflater = (ImageView)view.findViewById(0x7f0d007e);
        layoutinflater.setVisibility(8);
        if (viewgroup == null)
        {
            return null;
        }
        b;
        JVM INSTR tableswitch 0 6: default 156
    //                   0 163
    //                   1 186
    //                   2 156
    //                   3 156
    //                   4 209
    //                   5 156
    //                   6 232;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L1 _L5
_L1:
        view.setTag(this);
        return view;
_L2:
        n.a(viewgroup, 0x7f02045f);
        textview1.setText(0x7f0702b0);
        textview.setText(0x7f0702bf);
        continue; /* Loop/switch isn't completed */
_L3:
        n.a(viewgroup, 0x7f020461);
        textview1.setText(0x7f0702af);
        textview.setText(0x7f0702bf);
        continue; /* Loop/switch isn't completed */
_L4:
        n.a(viewgroup, 0x7f0205ce);
        textview1.setText(0x7f0702b1);
        textview.setText(0x7f0702bf);
        continue; /* Loop/switch isn't completed */
_L5:
        textview1.setText(0x7f0702b2);
        textview.setText(0x7f0702bf);
        if (g != null && !g.isRecycled())
        {
            viewgroup.setImageBitmap(g);
        }
        viewgroup = layoutinflater.getLayoutParams();
        viewgroup.height = 75;
        viewgroup.width = 75;
        layoutinflater.setImageResource(0x7f0200fa);
        layoutinflater.setVisibility(0);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a()
    {
        if (g != null && !g.isRecycled())
        {
            g.recycle();
        }
        g = null;
        super.a();
    }

    final void a(Bitmap bitmap)
    {
        if (d == null)
        {
            return;
        } else
        {
            g = bitmap;
            return;
        }
    }

    final int b()
    {
        return b;
    }
}
