// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.b.p;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ad;
import com.roidapp.cloudlib.ae;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.t;
import java.io.File;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.roidapp.cloudlib.google:
//            k, l, p, i, 
//            o, j, m, n

public class SearchPhotoFragment extends t
{

    public int o;
    private RelativeLayout p;
    private String q;
    private j r;
    private EditText s;
    private android.widget.TextView.OnEditorActionListener t;
    private android.content.DialogInterface.OnClickListener u;

    public SearchPhotoFragment()
    {
        o = 0;
        t = new k(this);
        u = new com.roidapp.cloudlib.google.l(this);
    }

    static void a(SearchPhotoFragment searchphotofragment)
    {
        String s1 = searchphotofragment.s.getText().toString();
        if (!TextUtils.isEmpty(s1) && !s1.trim().equals(searchphotofragment.q) || searchphotofragment.o == 0)
        {
            if (searchphotofragment.d != null)
            {
                searchphotofragment.d = new com.roidapp.cloudlib.google.p(searchphotofragment, searchphotofragment.getActivity());
                searchphotofragment.c.setAdapter(searchphotofragment.d);
                searchphotofragment.o = 0;
            }
            searchphotofragment.q = s1;
            if (!TextUtils.isEmpty(s1))
            {
                searchphotofragment.d();
            }
            ((InputMethodManager)searchphotofragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(searchphotofragment.s.getWindowToken(), 0);
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            p.setVisibility(0);
            return;
        } else
        {
            p.setVisibility(8);
            return;
        }
    }

    static void b(SearchPhotoFragment searchphotofragment)
    {
        searchphotofragment.startActivity(new Intent(searchphotofragment.getActivity(), al.g().d()));
        searchphotofragment.getActivity().finish();
    }

    static ad c(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.d;
    }

    static int d(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.e;
    }

    static ad e(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.d;
    }

    static int f(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.e;
    }

    static ad g(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.d;
    }

    static boolean h(SearchPhotoFragment searchphotofragment)
    {
        searchphotofragment.h = false;
        return false;
    }

    static AlertDialog i(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.f;
    }

    static AlertDialog j(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.f;
    }

    static ae k(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.j;
    }

    static ae l(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.j;
    }

    static TextView m(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.m;
    }

    static TextView n(SearchPhotoFragment searchphotofragment)
    {
        return searchphotofragment.m;
    }

    protected final void a(String s1)
    {
        String s3 = d.a(e);
        String s2 = com.roidapp.baselib.d.a.b(s3);
        File file = new File((new StringBuilder()).append(com.roidapp.baselib.d.a.a()).append("/").append(s2).toString());
        s2 = s1;
        if (file.exists())
        {
            s2 = s1;
            if (file.isFile())
            {
                s2 = s1;
                if (file.length() > 0L)
                {
                    s2 = s3;
                }
            }
        }
        super.a(s2);
    }

    public final void a(List list)
    {
        if (getActivity() != null)
        {
            a(false);
            if (list != null && list.size() > 0)
            {
                if (d != null)
                {
                    com.roidapp.cloudlib.google.p p1 = (com.roidapp.cloudlib.google.p)d;
                    if (p1.e != null && list != null)
                    {
                        p1.e.addAll(list);
                        p1.notifyDataSetChanged();
                    }
                    int i1 = ((i)list.get(0)).b();
                    ((com.roidapp.cloudlib.google.p)d).d(i1);
                    o = d.getCount();
                    Log.i("SearchPhotoFragment", (new StringBuilder("onPhotoListDownload, get photo size=")).append(list.size()).append(", showcount=").append(o).toString());
                    return;
                }
            } else
            {
                Log.w("SearchPhotoFragment", "onPhotoListDownload failed, get result is null");
                Toast.makeText(getActivity(), at.T, 0).show();
                return;
            }
        }
    }

    protected final p c()
    {
        return new o(this);
    }

    public final void d()
    {
        while (d != null && o > ((com.roidapp.cloudlib.google.p)d).b() || p.getVisibility() != 8) 
        {
            return;
        }
        a(true);
        String s1 = q;
        int i1 = o;
        try
        {
            Log.i("SearchPhotoFragment", (new StringBuilder("loadPhotos, from count=")).append(i1).append(",keyword=").append(s1).toString());
            r = new j(this, s1);
            r.a(i1);
            r.execute(new Void[0]);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            Log.i("SearchPhotoFragment", "Caught RejectedExecutionException Exception - loadInteresting");
            rejectedexecutionexception.printStackTrace();
            return;
        }
    }

    public final void h()
    {
        s.requestFocus();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new ah(getActivity()));
        d = new com.roidapp.cloudlib.google.p(this, getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.f, viewgroup, false);
        a(layoutinflater);
        b(layoutinflater);
        s = (EditText)layoutinflater.findViewById(ar.bo);
        s.setOnEditorActionListener(t);
        q = com.roidapp.cloudlib.common.a.t(getActivity());
        p = (RelativeLayout)layoutinflater.findViewById(ar.l);
        ((ImageButton)layoutinflater.findViewById(ar.bX)).setOnClickListener(new m(this));
        if (!com.roidapp.baselib.e.l.b(getActivity()))
        {
            com.roidapp.baselib.e.l.a(getActivity(), u, new n(this));
            return layoutinflater;
        }
        if (!TextUtils.isEmpty(q))
        {
            d();
            s.setText(q);
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (r != null)
        {
            r.cancel(true);
            r = null;
        }
        super.onDestroy();
        System.gc();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }
}
