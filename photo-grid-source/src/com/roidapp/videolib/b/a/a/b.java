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
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.aa;
import jp.co.cyberagent.android.a.ag;
import jp.co.cyberagent.android.a.p;
import jp.co.cyberagent.android.a.x;
import jp.co.cyberagent.android.a.y;

public final class b
    implements a
{

    private final Context a;
    private final CloudFilterInfo b;

    public b(Context context, CloudFilterInfo cloudfilterinfo)
    {
        a = context;
        b = cloudfilterinfo;
    }

    public final List a(com.roidapp.videolib.b.a.b b1)
    {
        ArrayList arraylist = new ArrayList();
        x x1 = new x();
        int i = ((Integer)b1.a(0)).intValue();
        int j = ((Integer)b1.a(1)).intValue();
        b1 = b.f;
        Object obj = b.a(a, b1.getString("normal"));
        if (obj != null)
        {
            x1.a(d.a(((java.io.InputStream) (obj)), i, j));
        }
        obj = new y();
        Object obj1 = b.a(a, b1.getString("overlay"));
        if (obj1 != null)
        {
            ((y) (obj)).a(d.a(((java.io.InputStream) (obj1)), i, j));
        }
        obj1 = new ag();
        Object obj2 = b.a(a, b1.getString("acv"));
        if (obj2 != null)
        {
            ((ag) (obj1)).a(((java.io.InputStream) (obj2)));
        }
        arraylist.add(obj1);
        obj2 = new p();
        ((p) (obj2)).a(Float.parseFloat(b1.getString("hue")));
        aa aa1 = new aa();
        aa1.a(bi.f(Integer.parseInt(b1.getString("saturation"))));
        arraylist.add(aa1);
        arraylist.add(obj2);
        arraylist.add(obj1);
        arraylist.add(obj);
        arraylist.add(x1);
        return arraylist;
    }
}
