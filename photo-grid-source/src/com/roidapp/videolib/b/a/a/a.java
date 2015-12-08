// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b.a.a;

import android.content.Context;
import android.os.Bundle;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.videolib.b.a.b;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.ab;
import jp.co.cyberagent.android.a.ag;
import jp.co.cyberagent.android.a.h;

public final class a
    implements com.roidapp.videolib.b.a.a
{

    private final Context a;
    private final CloudFilterInfo b;

    public a(Context context, CloudFilterInfo cloudfilterinfo)
    {
        a = context;
        b = cloudfilterinfo;
    }

    public final List a(b b1)
    {
        ArrayList arraylist = new ArrayList();
        int i = ((Integer)b1.a(0)).intValue();
        int j = ((Integer)b1.a(1)).intValue();
        b1 = b.f;
        ab ab1 = new ab();
        ab1.a(d.a(b.a(a, b1.getString("screen")), i, j));
        ag ag1 = new ag();
        ag1.a(b.a(a, b1.getString("acv")));
        arraylist.add(new h());
        arraylist.add(ab1);
        arraylist.add(ag1);
        return arraylist;
    }
}
