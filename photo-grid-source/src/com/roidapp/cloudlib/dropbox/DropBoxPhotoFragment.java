// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bumptech.glide.g.b.e;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ad;
import com.roidapp.cloudlib.af;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.t;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            f, g, h, i, 
//            k, a, n, l, 
//            c, e, j

public class DropBoxPhotoFragment extends t
{

    public int o;
    protected String p;
    private DropboxAPI q;
    private RelativeLayout r;
    private LinearLayout s;
    private Runnable t;
    private android.view.View.OnClickListener u;
    private Handler v;
    private android.content.DialogInterface.OnClickListener w;
    private Runnable x;
    private n y;

    public DropBoxPhotoFragment()
    {
        o = 0;
        p = "/";
        t = new f(this);
        u = new g(this);
        v = new h(this);
        w = new i(this);
        x = new k(this);
    }

    static int a(DropBoxPhotoFragment dropboxphotofragment, int i1)
    {
        dropboxphotofragment.e = i1;
        return i1;
    }

    static e a(DropBoxPhotoFragment dropboxphotofragment, ImageView imageview)
    {
        return dropboxphotofragment.a(imageview);
    }

    public static AndroidAuthSession a(Context context)
    {
        AppKeyPair appkeypair = new AppKeyPair(a.f, a.g);
        context = com.roidapp.cloudlib.common.a.w(context);
        if (context != null)
        {
            context = new AccessTokenPair(context[0], context[1]);
            return new AndroidAuthSession(appkeypair, a.h, context);
        } else
        {
            return new AndroidAuthSession(appkeypair, a.h);
        }
    }

    static ad a(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.d;
    }

    static void a(DropBoxPhotoFragment dropboxphotofragment, String s1)
    {
        dropboxphotofragment.a(s1);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            r.setVisibility(0);
            return;
        } else
        {
            r.setVisibility(8);
            return;
        }
    }

    static int b(DropBoxPhotoFragment dropboxphotofragment, int i1)
    {
        dropboxphotofragment.e = i1;
        return i1;
    }

    static ad b(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.d;
    }

    static af c(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.l;
    }

    static af d(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.l;
    }

    private void d(String s1)
    {
        try
        {
            y = new n(this, q);
            y.execute(new String[] {
                s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.i("DropBoxPhotoFragment", "Caught RejectedExecutionException Exception - loadInteresting");
        }
    }

    static Runnable e(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.t;
    }

    static int f(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.e;
    }

    static ad g(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.d;
    }

    static Handler h(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.v;
    }

    static DropboxAPI i(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.q;
    }

    static int j(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.a;
    }

    static int k(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.a;
    }

    static ah l(DropBoxPhotoFragment dropboxphotofragment)
    {
        return dropboxphotofragment.k;
    }

    public final void a(c c1)
    {
        a(false);
        if (c1 != null)
        {
            if (d != null)
            {
                ((com.roidapp.cloudlib.dropbox.l)d).a(c1);
            }
            o = o + c1.a.size();
            if (!p.equals("/"))
            {
                s.setVisibility(0);
                return;
            } else
            {
                s.setVisibility(8);
                return;
            }
        } else
        {
            Toast.makeText(getActivity(), at.T, 0).show();
            return;
        }
    }

    protected final android.widget.AdapterView.OnItemClickListener b()
    {
        return new com.roidapp.cloudlib.dropbox.e(this);
    }

    public final void c(String s1)
    {
        d = new com.roidapp.cloudlib.dropbox.l(this, getActivity());
        c.setAdapter(d);
        p = s1;
        a(true);
        d(p);
    }

    public final void d()
    {
        while (d != null && o > com.roidapp.cloudlib.dropbox.l.a((com.roidapp.cloudlib.dropbox.l)d).a() || r.getVisibility() != 8) 
        {
            return;
        }
        a(true);
        d(p);
    }

    public final void g()
    {
        if (!((AndroidAuthSession)q.getSession()).isLinked())
        {
            ((AndroidAuthSession)q.getSession()).startAuthentication(getActivity());
        } else
        {
            boolean flag;
            if (r.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                d = new com.roidapp.cloudlib.dropbox.l(this, getActivity());
                c.setAdapter(d);
                a(true);
                d(p);
                return;
            }
        }
    }

    public final boolean h()
    {
        if (p.equals("/"))
        {
            Intent intent = new Intent(getActivity(), al.g().d());
            intent.putExtra("fromCloud", true);
            startActivity(intent);
            getActivity().finish();
            return true;
        }
        int i1 = p.lastIndexOf('/');
        String s2 = p.substring(0, i1);
        String s1 = s2;
        if (s2.equals(""))
        {
            s1 = "/";
        }
        c(s1);
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        a = getResources().getDimensionPixelSize(ap.f);
        super.onCreate(bundle);
        k = new ah(getActivity());
        d = new com.roidapp.cloudlib.dropbox.l(this, getActivity());
        q = new DropboxAPI(a(getActivity()));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.i, viewgroup, false);
        a(layoutinflater);
        b(layoutinflater);
        r = (RelativeLayout)layoutinflater.findViewById(ar.l);
        s = (LinearLayout)layoutinflater.findViewById(ar.bs);
        s.setOnClickListener(u);
        ((ImageButton)layoutinflater.findViewById(ar.g)).setOnClickListener(u);
        if (!com.roidapp.baselib.e.l.b(getActivity()))
        {
            com.roidapp.baselib.e.l.a(getActivity(), w, new j(this));
            return layoutinflater;
        }
        if (!((AndroidAuthSession)q.getSession()).isLinked())
        {
            ((AndroidAuthSession)q.getSession()).startAuthentication(getActivity());
        } else
        {
            d();
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (!((AndroidAuthSession)q.getSession()).authenticationSuccessful())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ((AndroidAuthSession)q.getSession()).finishAuthentication();
        AccessTokenPair accesstokenpair = ((AndroidAuthSession)q.getSession()).getAccessTokenPair();
        if (((AndroidAuthSession)q.getSession()).isLinked())
        {
            d();
        }
        com.roidapp.cloudlib.common.a.b(getActivity(), accesstokenpair.key, accesstokenpair.secret);
        (new Thread(x)).start();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        illegalstateexception.printStackTrace();
        return;
    }
}
