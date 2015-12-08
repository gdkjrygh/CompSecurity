// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.roidapp.photogrid.cloud.t;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class kf extends Fragment
{

    private HashMap a;
    private String b[];
    private String c[];
    private Integer d[];
    private ListView e;
    private boolean f;
    private t g;
    private android.widget.AdapterView.OnItemClickListener h;

    public kf()
    {
        a = new HashMap();
        f = false;
    }

    protected final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        h = onitemclicklistener;
    }

    protected final void a(String as[], String as1[], Integer ainteger[])
    {
        f = true;
        b = as;
        c = as1;
        d = ainteger;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ad, null);
        e = (ListView)layoutinflater.findViewById(0x7f0d028f);
        if (f)
        {
            g = new t(getActivity(), e, b, c, d, a, (byte)0);
        } else
        {
            g = new t(getActivity());
        }
        e.setAdapter(g);
        if (h != null)
        {
            e.setOnItemClickListener(h);
        }
        return layoutinflater;
    }

    public final void onDestroy()
    {
        if (a == null)
        {
            super.onDestroy();
            return;
        }
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SoftReference softreference = (SoftReference)a.get(iterator.next());
            if (softreference != null)
            {
                Bitmap bitmap = (Bitmap)softreference.get();
                if (bitmap != null && !bitmap.isRecycled())
                {
                    bitmap.recycle();
                    softreference.clear();
                    iterator.remove();
                }
            }
        } while (true);
        a.clear();
        a = null;
        super.onDestroy();
    }
}
