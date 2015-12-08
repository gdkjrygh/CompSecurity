// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.StickerInfo;
import com.roidapp.photogrid.release.ab;
import com.roidapp.photogrid.release.c;
import com.roidapp.photogrid.release.re;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            w, z, t

public final class y extends w
{

    private String j;
    private boolean k;
    private String l;
    private WeakReference m;

    public y(Context context, String s, t t)
    {
        super(context, 2, t);
        j = s;
        b();
    }

    static WeakReference a(y y1)
    {
        return y1.m;
    }

    private void b()
    {
        k = false;
        Object obj1 = c.a(d.getResources());
        if (!((List) (obj1)).isEmpty())
        {
            Object obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                StickerInfo stickerinfo = (StickerInfo)((Iterator) (obj1)).next();
                if (stickerinfo.b.startsWith(".") && !n.a(d, (new StringBuilder("com.roidapp.photogrid.plugin.stickers")).append(stickerinfo.b).toString()))
                {
                    ((List) (obj)).add(stickerinfo);
                }
            } while (true);
            if (!((List) (obj)).isEmpty())
            {
                obj = (StickerInfo)((List) (obj)).get((int)(Math.random() * (double)((List) (obj)).size()));
                if (obj != null)
                {
                    h = 0x7f07027f;
                    l = ((StickerInfo) (obj)).b;
                    if (".valentinequote".equals(((StickerInfo) (obj)).b))
                    {
                        a = 0x7f0204e3;
                        b = 0x7f0702f1;
                        g = 0x7f07012d;
                        return;
                    }
                    if (".christmas2014".equals(((StickerInfo) (obj)).b))
                    {
                        a = 0x7f0204e0;
                        b = 0x7f0702f2;
                        g = 0x7f07012e;
                        return;
                    }
                    if (".christmas".equals(((StickerInfo) (obj)).b))
                    {
                        a = 0x7f0204df;
                        b = 0x7f0702f2;
                        g = 0x7f07012e;
                        return;
                    } else
                    {
                        a = ((StickerInfo) (obj)).d;
                        c = ((StickerInfo) (obj)).c;
                        g = 0x7f07012b;
                        return;
                    }
                }
            }
        }
        f = true;
    }

    public final volatile View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        return super.a(layoutinflater, view, viewgroup);
    }

    final void a(BaseAdapter baseadapter)
    {
        m = new WeakReference(baseadapter);
    }

    protected final void b(BaseAdapter baseadapter)
    {
        if (d != null)
        {
            b();
            if (baseadapter != null)
            {
                baseadapter.notifyDataSetChanged();
            }
        }
    }

    public final void onClick(View view)
    {
        if (d instanceof ParentActivity)
        {
            ParentActivity parentactivity = (ParentActivity)d;
            if (l == null)
            {
                l = ".valentinequote";
            }
            if (k)
            {
                af.c(d, (new StringBuilder()).append(j).append("/sticker/unlock").toString());
                String s = l;
                if (parentactivity.E() && !parentactivity.h() && !parentactivity.isFinishing())
                {
                    re re1 = new re();
                    re1.a(new z(this, parentactivity, s));
                    re1.setStyle(0, 0x7f0b0027);
                    n.a(parentactivity.getSupportFragmentManager(), re1, "videoAdDialog");
                }
            } else
            {
                af.c(d, (new StringBuilder()).append(j).append("/sticker/free_download").append(l).toString());
                ab.a(parentactivity, l);
            }
            super.onClick(view);
            return;
        } else
        {
            Log.e("StickerCard", "context is not Activity.");
            return;
        }
    }
}
