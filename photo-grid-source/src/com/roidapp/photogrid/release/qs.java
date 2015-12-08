// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.net.Uri;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ig, qt, RetouchActivity

final class qs
    implements Runnable
{

    final IGroupInfo a;
    final com.roidapp.imagelib.b.b b;
    final int c;
    final String d;
    final ig e;
    final RetouchActivity f;

    qs(RetouchActivity retouchactivity, IGroupInfo igroupinfo, com.roidapp.imagelib.b.b b1, int i, String s, ig ig1)
    {
        f = retouchactivity;
        a = igroupinfo;
        b = b1;
        c = i;
        d = s;
        e = ig1;
        super();
    }

    public final void run()
    {
        Object obj = new bi(f);
        if (com.roidapp.imagelib.filter.groupinfo.b.a(a))
        {
            ((bi) (obj)).a(a.a());
        }
        ((bi) (obj)).a(b);
        ((bi) (obj)).a(c);
        ((bi) (obj)).c(true);
        obj = (new com.roidapp.imagelib.e.b(f, ((com.roidapp.imagelib.e.a) (obj)))).a(d);
        if (obj != null)
        {
            e.b = ((Uri) (obj)).getPath();
        }
        f.runOnUiThread(new qt(this));
    }
}
