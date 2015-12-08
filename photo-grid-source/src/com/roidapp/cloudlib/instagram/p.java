// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.app.Activity;
import com.roidapp.cloudlib.ad;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            r, m, InstagramPhotoFragment

public final class p extends ad
{

    final InstagramPhotoFragment e;
    private r f;

    public p(InstagramPhotoFragment instagramphotofragment, Activity activity)
    {
        e = instagramphotofragment;
        super(instagramphotofragment, activity);
        f = new r();
    }

    static r a(p p1)
    {
        return p1.f;
    }

    public final String a(int i)
    {
        return f.a(i).a();
    }

    public final String b(int i)
    {
        m m1 = f.a(i);
        if (m1 == null)
        {
            return null;
        } else
        {
            return m1.b();
        }
    }

    public final void b()
    {
        f.a.clear();
    }

    public final int getCount()
    {
        return f.a.size();
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }
}
