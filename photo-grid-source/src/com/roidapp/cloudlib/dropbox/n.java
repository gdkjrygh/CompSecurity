// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.util.Log;
import android.widget.Toast;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.Session;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.at;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            o, c, a, DropBoxPhotoFragment

public final class n extends c
{

    Comparator a;
    private WeakReference b;
    private DropboxAPI c;
    private boolean d;

    public n(DropBoxPhotoFragment dropboxphotofragment, DropboxAPI dropboxapi)
    {
        a = new o(this);
        b = new WeakReference(dropboxphotofragment);
        c = dropboxapi;
    }

    private transient com.roidapp.cloudlib.dropbox.c a(String as[])
    {
        Object obj;
        d = false;
        obj = as[0];
        Log.i("LoadDropBoxPhotoTask", (new StringBuilder("load path is ")).append(((String) (obj))).toString());
        as = new com.roidapp.cloudlib.dropbox.c();
        if (!c.getSession().isLinked()) goto _L2; else goto _L1
_L1:
        obj = c.metadata(((String) (obj)), 0, null, true, null);
        Log.i("LoadDropBoxPhotoTask", (new StringBuilder("The file dir : ")).append(((com.dropbox.client2.DropboxAPI.Entry) (obj)).isDir).toString());
        obj = ((com.dropbox.client2.DropboxAPI.Entry) (obj)).contents.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.dropbox.client2.DropboxAPI.Entry entry = (com.dropbox.client2.DropboxAPI.Entry)((Iterator) (obj)).next();
            Log.i("DbExampleLog", (new StringBuilder("The file's rev is now: ")).append(entry.rev).append(",name is ").append(entry.fileName()).append(" type").append(entry.mimeType).toString());
            if (entry.isDir || a.i.contains(entry.mimeType))
            {
                ((com.roidapp.cloudlib.dropbox.c) (as)).a.add(entry);
            }
        } while (true);
          goto _L3
        Object obj1;
        obj1;
        String s = ((DropboxException) (obj1)).getMessage();
        if (s != null && s.contains("certificate"))
        {
            d = true;
        }
        ((DropboxException) (obj1)).printStackTrace();
_L2:
        return as;
_L3:
        Collections.sort(((com.roidapp.cloudlib.dropbox.c) (as)).a, a);
        return as;
        obj1;
        ((Error) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onCancelled()
    {
        DropBoxPhotoFragment dropboxphotofragment = (DropBoxPhotoFragment)b.get();
        if (dropboxphotofragment != null)
        {
            dropboxphotofragment.a(null);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (com.roidapp.cloudlib.dropbox.c)obj;
        DropBoxPhotoFragment dropboxphotofragment = (DropBoxPhotoFragment)b.get();
        if (dropboxphotofragment != null)
        {
            if (d)
            {
                android.support.v4.app.FragmentActivity fragmentactivity = dropboxphotofragment.getActivity();
                if (fragmentactivity != null)
                {
                    Toast.makeText(fragmentactivity, at.aZ, 0).show();
                }
            }
            dropboxphotofragment.a(((com.roidapp.cloudlib.dropbox.c) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }
}
