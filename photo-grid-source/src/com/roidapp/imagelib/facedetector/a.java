// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.roidapp.baselib.gl.c;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.roidapp.imagelib.facedetector:
//            b, c, e, f, 
//            LoadImageView, d

public final class a extends Fragment
    implements android.view.View.OnClickListener
{

    protected View a;
    protected int b;
    private Button c;
    private ImageButton d;
    private LoadImageView e;
    private String f;
    private int g;
    private float h[];
    private boolean i;
    private boolean j;
    private bi k;
    private b l;
    private volatile boolean m;
    private Integer n[];
    private e o;
    private Bitmap p;
    private Handler q;

    public a()
    {
        j = true;
        b = 20;
        l = new b();
        m = false;
        q = new com.roidapp.imagelib.facedetector.b(this);
    }

    static Bitmap a(a a1, Bitmap bitmap)
    {
        a1.p = bitmap;
        return bitmap;
    }

    static String a(a a1)
    {
        return a1.f;
    }

    static void a(a a1, Throwable throwable, String s)
    {
        a1.q.post(new com.roidapp.imagelib.facedetector.c(a1, throwable, s));
    }

    static boolean a(a a1, boolean flag)
    {
        a1.m = flag;
        return flag;
    }

    static e b(a a1)
    {
        return a1.o;
    }

    static LoadImageView c(a a1)
    {
        return a1.e;
    }

    static Bitmap d(a a1)
    {
        return a1.p;
    }

    static float[] e(a a1)
    {
        return a1.h;
    }

    static Integer[] f(a a1)
    {
        return a1.n;
    }

    static Handler g(a a1)
    {
        return a1.q;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof e)
        {
            o = (e)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet ImagePreviewFragment.OnCameraEditListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (!m)
        {
            int i1 = view.getId();
            if (i1 == g.P)
            {
                (new Thread(new f(this))).start();
                return;
            }
            if (i1 == g.M && o != null)
            {
                o.b();
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ImageLibrary.a().a("ImagePreviewFragment/onCreate");
        bundle = getArguments();
        if (bundle != null)
        {
            f = bundle.getString("edit_image_path");
            g = bundle.getInt("entry_from");
            h = bundle.getFloatArray("edit_face_matrix");
        }
        com.roidapp.baselib.gl.c.a();
        if (com.roidapp.baselib.gl.c.b(getActivity()))
        {
            i = true;
            k = new bi(getActivity());
            if (k != null)
            {
                k.a(l, b);
                k.c(i);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        float f1;
        ImageLibrary.a().a("ImagePreviewFragment/onCreateView");
        a = layoutinflater.inflate(h.k, viewgroup, false);
        layoutinflater = a;
        ImageLibrary.a().a("ImagePreviewFragment/initView");
        e = (LoadImageView)layoutinflater.findViewById(g.aF);
        getActivity();
        layoutinflater = f;
        viewgroup = new ArrayList();
        f1 = (float)Runtime.getRuntime().maxMemory() / 1024F / 1024F;
        if (f1 < 96F) goto _L2; else goto _L1
_L1:
        viewgroup.add(0, Integer.valueOf(4096));
        viewgroup.add(1, Integer.valueOf(2048));
        viewgroup.add(2, Integer.valueOf(1024));
_L4:
        bundle = new Integer[viewgroup.size()];
        viewgroup.toArray(bundle);
        layoutinflater = com.roidapp.imagelib.b.d.a(layoutinflater, bundle);
        (new StringBuilder("Load min length is ")).append(Arrays.toString(layoutinflater));
        n = layoutinflater;
        (new Thread(new com.roidapp.imagelib.facedetector.d(this, f, 0))).start();
        layoutinflater = a;
        c = (Button)layoutinflater.findViewById(g.P);
        c.setOnClickListener(this);
        d = (ImageButton)layoutinflater.findViewById(g.M);
        d.setOnClickListener(this);
        return a;
_L2:
        if (f1 < 96F && f1 >= 64F)
        {
            viewgroup.add(0, Integer.valueOf(2048));
            viewgroup.add(1, Integer.valueOf(1024));
            viewgroup.add(2, Integer.valueOf(640));
        } else
        if (f1 < 64F && f1 >= 32F)
        {
            viewgroup.add(0, Integer.valueOf(1660));
            viewgroup.add(1, Integer.valueOf(960));
            viewgroup.add(2, Integer.valueOf(640));
        } else
        if (f1 < 32F)
        {
            viewgroup.add(0, Integer.valueOf(640));
            viewgroup.add(1, Integer.valueOf(480));
            viewgroup.add(2, Integer.valueOf(320));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
    }

    public final void onDetach()
    {
        super.onDetach();
        o = null;
    }
}
