// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.t;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            r, s, t, FlickrListCloud, 
//            w, z, aa, x, 
//            y, v, u

public class FlickrPhotoFragment extends t
{

    public int o;
    private RelativeLayout p;
    private OAuth q;
    private int r;
    private EditText s;
    private android.content.DialogInterface.OnClickListener t;
    private android.view.View.OnClickListener u;
    private android.widget.TextView.OnEditorActionListener v;
    private x w;
    private y x;
    private z y;
    private String z;

    public FlickrPhotoFragment()
    {
        o = 1;
        r = 0;
        t = new r(this);
        u = new s(this);
        v = new com.roidapp.cloudlib.flickr.t(this);
        z = "";
    }

    static int a(FlickrPhotoFragment flickrphotofragment, int i)
    {
        flickrphotofragment.r = i;
        return i;
    }

    static void a(FlickrPhotoFragment flickrphotofragment)
    {
        flickrphotofragment.startActivity(new Intent(flickrphotofragment.getActivity(), com/roidapp/cloudlib/flickr/FlickrListCloud));
        flickrphotofragment.getActivity().finish();
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

    static void b(FlickrPhotoFragment flickrphotofragment)
    {
        String s1 = flickrphotofragment.s.getText().toString();
        (new StringBuilder("count:")).append(flickrphotofragment.r);
        if (!TextUtils.isEmpty(s1) && (!s1.trim().equals(flickrphotofragment.z) || flickrphotofragment.r == 0))
        {
            if (flickrphotofragment.d != null)
            {
                ((w)flickrphotofragment.d).b();
                flickrphotofragment.d = null;
                System.gc();
            }
            flickrphotofragment.z = s1.trim();
            flickrphotofragment.o = 1;
            flickrphotofragment.d = new w(flickrphotofragment, flickrphotofragment.getActivity());
            flickrphotofragment.c.setAdapter(flickrphotofragment.d);
            flickrphotofragment.d();
            ((InputMethodManager)flickrphotofragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(flickrphotofragment.s.getWindowToken(), 0);
        }
    }

    public static void h()
    {
    }

    public final void a(PhotoList photolist)
    {
        a(false);
        if (photolist != null)
        {
            if (d != null)
            {
                ((w)d).a(photolist);
            }
            Log.i("FlickrPhotoFragment", (new StringBuilder("onLoadMore, showPages=")).append(o).append(",get size=").append(photolist.size()).append(",total pages=").append(photolist.getPages()).append(",total photos=").append(photolist.getTotal()).toString());
            o = o + 1;
            return;
        } else
        {
            Toast.makeText(getActivity(), at.T, 0).show();
            return;
        }
    }

    public final void a(Exception exception)
    {
        if (k != null)
        {
            super.a(exception);
            if (exception.getClass() == com/googlecode/flickrjandroid/FlickrException)
            {
                if (((FlickrException)exception).getErrorCode().equals("98"))
                {
                    k.sendEmptyMessage(8704);
                    return;
                }
            } else
            {
                exception = Message.obtain(k, 8705, getString(at.T));
                k.sendMessage(exception);
                return;
            }
        }
    }

    public final void d()
    {
        Object obj;
        while (d != null && o > ((w)d).c() || p.getVisibility() != 8) 
        {
            return;
        }
        a(true);
        obj = q;
        try
        {
            if (!TextUtils.isEmpty(s.getText().toString()))
            {
                y = new z(this, s.getText().toString());
                y.execute(new Void[0]);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.i("FlickrMain", "Caught RejectedExecutionException Exception - loadInteresting");
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        (new aa(this)).execute(new OAuth[] {
            obj
        });
        w = new x(this);
        w.execute(new OAuth[] {
            obj
        });
        return;
        x = new y(this);
        x.execute(new Void[0]);
        return;
    }

    public final void g()
    {
        boolean flag;
        if (p.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        } else
        {
            o = 1;
            d = new w(this, getActivity());
            c.setAdapter(d);
            d();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i("FlickrPhotoFragment", "FlickrPhotoFragment onCreate");
        a(new v(this, getActivity()));
        d = new w(this, getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.A, viewgroup, false);
        a(layoutinflater);
        b(layoutinflater);
        p = (RelativeLayout)layoutinflater.findViewById(ar.l);
        if (com.roidapp.cloudlib.common.a.j(getActivity()) == 0)
        {
            q = com.roidapp.cloudlib.common.a.h(getActivity());
        } else
        {
            q = null;
        }
        s = (EditText)layoutinflater.findViewById(ar.bo);
        s.setOnEditorActionListener(v);
        layoutinflater.findViewById(ar.bX).setOnClickListener(u);
        if (!l.b(getActivity()))
        {
            l.a(getActivity(), t, new u(this));
            return layoutinflater;
        } else
        {
            d();
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        Log.i("FlickrPhotoFragment", "onDestroy");
        if (w != null)
        {
            w.cancel(true);
            w = null;
        }
        if (x != null)
        {
            x.cancel(true);
            x = null;
        }
        if (y != null)
        {
            y.cancel(true);
            y = null;
        }
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        Log.i("FlickrPhotoFragment", "onPause");
    }

    public void onResume()
    {
        super.onResume();
        Log.i("FlickrPhotoFragment", "onResume");
    }
}
