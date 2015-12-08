// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.g.b.e;
import com.roidapp.baselib.b.k;
import com.roidapp.baselib.b.p;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.facebook.FbPhotoFragment;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib:
//            as, ar, z, aa, 
//            ab, u, x, ac, 
//            ah, ae, v, w, 
//            y, ap, ad, af

public abstract class t extends Fragment
{

    protected int a;
    protected int b;
    public GridView c;
    protected ad d;
    protected int e;
    protected AlertDialog f;
    protected k g;
    protected boolean h;
    protected p i;
    protected ae j;
    protected ah k;
    protected af l;
    protected TextView m;
    protected final List n = new ArrayList();
    private ImageView o;

    public t()
    {
        e = -1;
        h = false;
        k = null;
        l = null;
    }

    static ImageView a(t t1)
    {
        return t1.o;
    }

    private void c(String s)
    {
        if (getActivity() == null)
        {
            return;
        }
        if (h)
        {
            Log.w("BaseFragment", "showDownloadDialog, but one is exist.");
            return;
        }
        h = true;
        Log.i("BaseFragment", (new StringBuilder("begin to download ")).append(s).toString());
        if (f == null || !f.isShowing())
        {
            f = (new android.app.AlertDialog.Builder(getActivity())).create();
            f.setIcon(0x1080055);
            View view = LayoutInflater.from(getActivity()).inflate(com.roidapp.cloudlib.as.a, null);
            f.setView(view);
            f.setCancelable(false);
            f.show();
        }
        ProgressBar progressbar = (ProgressBar)f.findViewById(ar.q);
        progressbar.setProgress(0);
        m = (TextView)f.findViewById(ar.t);
        if (i == null)
        {
            i = c();
        }
        g.a(s, o, progressbar, i);
        View view1 = f.findViewById(ar.r);
        view1.setOnClickListener(new z(this, s, progressbar));
        view1.setVisibility(8);
        f.findViewById(ar.o).setOnClickListener(new aa(this, s));
        f.setOnDismissListener(new ab(this));
    }

    protected android.widget.AbsListView.OnScrollListener a()
    {
        return new u(this);
    }

    protected final e a(ImageView imageview)
    {
        return new x(this, imageview);
    }

    protected final void a(View view)
    {
        o = (ImageView)view.findViewById(com.roidapp.cloudlib.ar.p);
    }

    public final void a(ae ae1)
    {
        j = ae1;
    }

    public final void a(af af)
    {
        l = af;
    }

    public final void a(ah ah1)
    {
        k = ah1;
    }

    public void a(Exception exception)
    {
        if (exception != null && k != null && (exception.getClass() == java/net/UnknownHostException || exception.getClass() == java/io/FileNotFoundException || exception.getClass() == java/net/SocketTimeoutException))
        {
            k.post(new ac(this));
        }
    }

    protected void a(String s)
    {
        Object obj;
        String s1;
        android.graphics.BitmapFactory.Options options;
        if (this instanceof FbPhotoFragment)
        {
            obj = com.roidapp.baselib.d.a.b(com.roidapp.baselib.d.a.a(s));
        } else
        {
            obj = com.roidapp.baselib.d.a.b(s);
        }
        s1 = (new StringBuilder()).append(com.roidapp.baselib.d.a.a()).append("/").append(((String) (obj))).toString();
        obj = new File(s1);
        if (!((File) (obj)).exists() || !((File) (obj)).isFile() || ((File) (obj)).length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s1, options);
        if (options.outWidth > 0 && options.outHeight > 0)
        {
            if (j != null)
            {
                j.a(s1);
            }
            return;
        }
        try
        {
            if (o != null)
            {
                o.setImageDrawable(null);
            }
            ((File) (obj)).delete();
            c(s);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        ((File) (obj)).delete();
        c(s);
        return;
    }

    protected android.widget.AdapterView.OnItemClickListener b()
    {
        return new v(this);
    }

    protected final void b(View view)
    {
        c = (GridView)view.findViewById(ar.bK);
        c.setAdapter(d);
        c.setOnScrollListener(a());
        c.setOnItemClickListener(b());
        c.getViewTreeObserver().addOnGlobalLayoutListener(new w(this));
    }

    public final void b(String s)
    {
        if (f != null)
        {
            f.findViewById(ar.q).setVisibility(8);
            f.findViewById(ar.r).setVisibility(0);
            ((TextView)f.findViewById(ar.s)).setText(s);
            com.roidapp.baselib.b.k.a(o);
            o.setImageDrawable(null);
        }
    }

    protected p c()
    {
        return new y(this, getClass().getSimpleName());
    }

    public abstract void d();

    public final ah e()
    {
        return k;
    }

    public final int f()
    {
        return n.size();
    }

    public void g()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getResources().getDimensionPixelSize(ap.g);
        g = new k(getActivity(), com.roidapp.baselib.d.a.a());
        g.a(this instanceof FbPhotoFragment);
    }

    public void onDestroy()
    {
        com.roidapp.baselib.b.k.a(o);
        if (c != null)
        {
            c.setAdapter(null);
            d = null;
        }
        if (f != null && f.isShowing())
        {
            f.dismiss();
            f = null;
        }
        super.onDestroy();
    }
}
