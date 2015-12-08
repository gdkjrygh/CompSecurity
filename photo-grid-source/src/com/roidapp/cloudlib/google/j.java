// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.google:
//            q, SearchPhotoFragment

public final class j extends c
{

    private WeakReference a;
    private String b;
    private int c;

    public j(SearchPhotoFragment searchphotofragment, String s)
    {
        c = 0;
        a = new WeakReference(searchphotofragment);
        b = s;
    }

    private transient List a()
    {
        new q();
        List list;
        List list1;
        try
        {
            list1 = q.b(b, c);
        }
        catch (Exception exception)
        {
            SearchPhotoFragment searchphotofragment = (SearchPhotoFragment)a.get();
            if (searchphotofragment != null)
            {
                searchphotofragment.a(exception);
            }
            exception.printStackTrace();
            return null;
        }
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        list = list1;
        if (list1.size() != 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        list = q.a(b, c);
        return list;
    }

    public final void a(int i)
    {
        c = i;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onCancelled()
    {
        SearchPhotoFragment searchphotofragment = (SearchPhotoFragment)a.get();
        if (searchphotofragment != null)
        {
            searchphotofragment.a(null);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        SearchPhotoFragment searchphotofragment = (SearchPhotoFragment)a.get();
        if (searchphotofragment != null)
        {
            searchphotofragment.a(((List) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }
}
