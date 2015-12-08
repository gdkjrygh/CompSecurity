// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.bumptech.glide.t;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.roidapp.baselib.b.a;
import com.roidapp.cloudlib.ad;
import com.roidapp.cloudlib.ag;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            c, DropBoxPhotoFragment, m, d

final class l extends ad
{

    final DropBoxPhotoFragment e;
    private com.roidapp.cloudlib.dropbox.c f;

    public l(DropBoxPhotoFragment dropboxphotofragment, Activity activity)
    {
        e = dropboxphotofragment;
        super(dropboxphotofragment, activity);
        f = new com.roidapp.cloudlib.dropbox.c();
    }

    static com.roidapp.cloudlib.dropbox.c a(l l1)
    {
        return l1.f;
    }

    public final String a(int i)
    {
        if (f != null)
        {
            com.dropbox.client2.DropboxAPI.Entry entry = (com.dropbox.client2.DropboxAPI.Entry)f.a.get(i);
            if (!entry.isDir)
            {
                return entry.path;
            }
        }
        return "";
    }

    public final void a(com.roidapp.cloudlib.dropbox.c c1)
    {
        if (f != null && c1 != null)
        {
            f.a.addAll(c1.a);
            notifyDataSetChanged();
        }
    }

    public final String b(int i)
    {
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        Object obj;
        obj = (com.dropbox.client2.DropboxAPI.Entry)f.a.get(i);
        obj = DropBoxPhotoFragment.i(e).media(((com.dropbox.client2.DropboxAPI.Entry) (obj)).path, true).url;
        return ((String) (obj));
        DropboxException dropboxexception;
        dropboxexception;
        dropboxexception.printStackTrace();
        DropBoxPhotoFragment.l(e).post(new m(this));
        return "";
    }

    public final int getCount()
    {
        return f.a.size();
    }

    public final Object getItem(int i)
    {
        return f.a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        com.dropbox.client2.DropboxAPI.Entry entry;
        if (view == null)
        {
            view = b.inflate(as.E, null);
            viewgroup = new ag();
            viewgroup.b = (TextView)view.findViewById(ar.be);
            viewgroup.a = (ImageView)view.findViewById(ar.aY);
            view.setTag(viewgroup);
            view.setLayoutParams(c);
        } else
        {
            viewgroup = (ag)view.getTag();
        }
        if (view.getLayoutParams().height != a)
        {
            view.setLayoutParams(c);
        }
        entry = (com.dropbox.client2.DropboxAPI.Entry)f.a.get(i);
        if (entry.isDir)
        {
            ((ag) (viewgroup)).b.setVisibility(0);
            ((ag) (viewgroup)).b.setText(entry.fileName());
            ((ag) (viewgroup)).a.setImageResource(aq.x);
            return view;
        } else
        {
            ((ag) (viewgroup)).b.setVisibility(8);
            h.a(e).a(new com.roidapp.cloudlib.dropbox.d(DropBoxPhotoFragment.i(e))).a(a(i)).a(e.c).g().b(com.roidapp.baselib.b.a.b()).b(DropBoxPhotoFragment.j(e), DropBoxPhotoFragment.k(e)).a(com.roidapp.cloudlib.dropbox.DropBoxPhotoFragment.a(e, ((ag) (viewgroup)).a));
            return view;
        }
    }
}
