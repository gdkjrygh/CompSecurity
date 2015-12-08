// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b.a.a;

import android.content.Context;
import android.os.Bundle;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.videolib.b.a.a;
import com.roidapp.videolib.b.a.b;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.aa;
import jp.co.cyberagent.android.a.ab;
import jp.co.cyberagent.android.a.ag;
import jp.co.cyberagent.android.a.h;
import jp.co.cyberagent.android.a.x;
import jp.co.cyberagent.android.a.y;

public final class c
    implements a
{

    private final Context a;
    private final CloudFilterInfo b;

    public c(Context context, CloudFilterInfo cloudfilterinfo)
    {
        a = context;
        b = cloudfilterinfo;
    }

    public final List a(b b1)
    {
        ArrayList arraylist = new ArrayList();
        int i = ((Integer)b1.a(0)).intValue();
        int j = ((Integer)b1.a(1)).intValue();
        Object obj1 = b.f;
        ab ab1 = new ab();
        Object obj = b.a(a, ((Bundle) (obj1)).getString("screen"));
        if (obj != null)
        {
            ab1.a(d.a(((java.io.InputStream) (obj)), i, j));
        }
        ag ag1 = new ag();
        b1 = ((b) (obj));
        if (obj != null)
        {
            b1 = b.a(a, ((Bundle) (obj1)).getString("acv"));
            ag1.a(b1);
        }
        obj = new aa();
        ((aa) (obj)).a(bi.f(Integer.parseInt(((Bundle) (obj1)).getString("saturation"))));
        y y1 = new y();
        if (b1 != null)
        {
            y1.a(d.a(b.a(a, ((Bundle) (obj1)).getString("overlay")), i, j));
        }
        b1 = new x();
        obj1 = b.a(a, ((Bundle) (obj1)).getString("normal"));
        if (obj1 != null)
        {
            b1.a(d.a(((java.io.InputStream) (obj1)), i, j));
        }
        arraylist.add(new h());
        arraylist.add(ab1);
        arraylist.add(new h());
        arraylist.add(b1);
        arraylist.add(y1);
        arraylist.add(ag1);
        arraylist.add(obj);
        return arraylist;
    }
}
