// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            PickFolder, ImageSelector, kn, bj, 
//            ko

public final class km extends Fragment
{

    private LinearLayout a;
    private LinearLayout b;
    private ListView c;
    private bj d;
    private boolean e;
    private HashMap f;
    private String g[];
    private String h[];
    private Integer i[];

    public km()
    {
        e = false;
        f = new HashMap();
    }

    static void a(km km1)
    {
        km1.startActivityForResult(new Intent(km1.getActivity(), com/roidapp/photogrid/release/PickFolder), 2);
    }

    protected final void a(String as[], String as1[], Integer ainteger[])
    {
        if (as.length == 0)
        {
            e = false;
        } else
        {
            e = true;
        }
        g = as;
        h = as1;
        i = ainteger;
    }

    public final void onActivityResult(int j, int k, Intent intent)
    {
        if (2 == k && intent.getBooleanExtra("added", false))
        {
            ((ImageSelector)getActivity()).d();
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b7, null);
        a = (LinearLayout)layoutinflater.findViewById(0x7f0d02e1);
        b = (LinearLayout)layoutinflater.findViewById(0x7f0d02e3);
        c = (ListView)layoutinflater.findViewById(0x7f0d02e2);
        a.setOnClickListener(new kn(this));
        if (e)
        {
            b.setVisibility(8);
            c.setVisibility(0);
            d = new bj(getActivity(), g, i, h, c, f);
            c.setAdapter(d);
            return layoutinflater;
        }
        viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d02e4);
        try
        {
            viewgroup.setImageResource(0x7f0205d1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
        }
        viewgroup.setOnClickListener(new ko(this));
        c.setVisibility(8);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        if (f == null)
        {
            super.onDestroy();
            return;
        }
        Iterator iterator = f.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SoftReference softreference = (SoftReference)f.get(iterator.next());
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
        f.clear();
        f = null;
        super.onDestroy();
    }
}
