// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.app.Activity;
import com.roidapp.cloudlib.ad;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.google:
//            i, SearchPhotoFragment

final class p extends ad
{

    public List e;
    final SearchPhotoFragment f;
    private int g;

    public p(SearchPhotoFragment searchphotofragment, Activity activity)
    {
        f = searchphotofragment;
        super(searchphotofragment, activity);
        g = 100;
        e = new ArrayList();
    }

    public final String a(int j)
    {
        if (e != null && j >= 0)
        {
            return ((i)e.get(j)).a();
        } else
        {
            return "";
        }
    }

    public final int b()
    {
        return g;
    }

    public final String b(int j)
    {
        if (e != null && j >= 0)
        {
            return ((i)e.get(j)).c();
        } else
        {
            return "";
        }
    }

    public final void d(int j)
    {
        if (j > 0)
        {
            g = j;
        }
        if (g > 100)
        {
            g = 100;
        }
    }

    public final int getCount()
    {
        return e.size();
    }

    public final Object getItem(int j)
    {
        return e.get(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }
}
