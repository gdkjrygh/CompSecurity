// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.Activity;
import com.roidapp.cloudlib.ad;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            af, FbPhotoFragment

final class aj extends ad
{

    final FbPhotoFragment e;
    private ArrayList f;

    public aj(FbPhotoFragment fbphotofragment, Activity activity)
    {
        e = fbphotofragment;
        super(fbphotofragment, activity);
        f = new ArrayList();
    }

    public final String a(int i)
    {
        if (f != null)
        {
            return ((af)f.get(i)).b();
        } else
        {
            return "";
        }
    }

    public final void a(List list, boolean flag)
    {
        if (f != null && list != null)
        {
            if (flag)
            {
                f.addAll(list);
            } else
            {
                f.addAll(0, list);
            }
            notifyDataSetChanged();
        }
    }

    public final String b(int i)
    {
        if (f != null)
        {
            return ((af)f.get(i)).a();
        } else
        {
            return "";
        }
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int i)
    {
        return f.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }
}
