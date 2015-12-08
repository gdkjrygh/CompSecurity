// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.Album;
import com.cardinalblue.android.piccollage.model.gson.AlbumList;
import com.cardinalblue.android.piccollage.model.j;
import com.cardinalblue.android.piccollage.view.a.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class h extends a
{

    private final Context a;
    private final j d;
    private final m e;
    private List f;

    public h(Context context, m m1, j j1)
    {
        super(context);
        a = context;
        e = m1;
        d = j1;
    }

    protected transient Throwable a(Void avoid[])
    {
        String s;
        int i;
        i = 1;
        s = a.getString(0x7f070104);
        f = new ArrayList();
        avoid = d.a(1, true, s);
        f.addAll(avoid.getList());
        while (avoid.hasNextPage()) 
        {
            i++;
            try
            {
                avoid = d.a(i, true, s);
                f.addAll(avoid.getList());
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                return avoid;
            }
        }
        return null;
    }

    protected void a(Throwable throwable)
    {
        super.onPostExecute(throwable);
        if (throwable != null)
        {
            String s = throwable.getLocalizedMessage();
            if (throwable instanceof IOException)
            {
                s = a.getString(0x7f0701f1);
            }
            throwable = (new android.app.AlertDialog.Builder(a)).setTitle(0x1040014).setMessage(s).create();
            k.a(a, this, throwable);
        } else
        {
            throwable = f.iterator();
            while (throwable.hasNext()) 
            {
                Album album = (Album)throwable.next();
                e.add(album);
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Throwable)obj);
    }

    protected void onPreExecute()
    {
        super.a(a, 0x7f0701fa);
    }
}
