// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.hlistview.AdapterView;
import com.roidapp.baselib.hlistview.HListView;
import com.roidapp.baselib.hlistview.s;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.groupinfo.BaseGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.LocalGroupInfo;
import com.roidapp.imagelib.j;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bj, ba, ab, bb, 
//            bc, r, bf, b, 
//            bd, be

public final class az extends HListView
    implements s
{

    private bj aA;
    private LocalGroupInfo aB[];
    private final be aC = new ba(this);
    private final bf az;

    public az(Context context, bf bf1, boolean flag)
    {
        super(context);
        aA = new bj();
        aB = null;
        az = bf1;
        a(this);
        a(f.bp);
        aB = aA.b;
        a(new ab(new ArrayList(Arrays.asList(aB)), getContext(), flag));
    }

    public final be A()
    {
        return aC;
    }

    public final IGroupInfo B()
    {
        ab ab1 = (ab)z();
        if (ab1 == null)
        {
            return null;
        } else
        {
            return ab1.a;
        }
    }

    public final void a(AdapterView adapterview, View view, int i)
    {
        adapterview = (BaseGroupInfo)adapterview.j(i);
        ImageLibrary.a().a("ImageFilterBaseView/onItemClick/position:".concat(String.valueOf(i)));
        if (!(adapterview instanceof CloudGroupInfo)) goto _L2; else goto _L1
_L1:
        if (n.a(getContext(), ((CloudGroupInfo)adapterview).c)) goto _L4; else goto _L3
_L3:
        view = new android.app.AlertDialog.Builder(getContext());
        view.setTitle(j.m);
        view.setMessage(j.c);
        view.setNegativeButton(j.a, new bb(this));
        view.setPositiveButton(j.d, new bc(this, adapterview));
        view.show();
_L6:
        return;
_L4:
        adapterview.a(r.b(getContext(), ((CloudGroupInfo)adapterview).c));
_L2:
        if (adapterview != null && az != null)
        {
            az.a(adapterview);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(b b1, IGroupInfo igroupinfo, bd bd1)
    {
        int i = b1.c;
        CloudGroupInfo cloudgroupinfo = b1.a;
        int k = b1.b;
        b1 = (ab)z();
        IGroupInfo igroupinfo1 = b1.a(cloudgroupinfo.c());
        if (igroupinfo1 != null)
        {
            b1.b(igroupinfo1);
        }
        b1.a(i + k, cloudgroupinfo);
        if (igroupinfo != null && igroupinfo.c() == cloudgroupinfo.c() && n.a(getContext(), cloudgroupinfo.c))
        {
            cloudgroupinfo.a(r.b(getContext(), cloudgroupinfo.c));
            cloudgroupinfo.a(igroupinfo.a());
            a(((IGroupInfo) (cloudgroupinfo)));
            bd1.a(cloudgroupinfo);
        }
        b1.notifyDataSetChanged();
    }

    public final void a(IGroupInfo igroupinfo)
    {
        ab ab1;
        ab1 = (ab)z();
        break MISSING_BLOCK_LABEL_8;
        if (ab1 != null && igroupinfo != ab1.a)
        {
            Object obj = ab1.a;
            if (obj != null)
            {
                int i = ab1.a(((IGroupInfo) (obj)));
                ((IGroupInfo) (obj)).a(null);
                obj = findViewWithTag(Integer.valueOf(i));
                if (obj != null)
                {
                    ((View) (obj)).setBackgroundResource(f.bp);
                }
            }
            ab1.a = igroupinfo;
            igroupinfo = findViewWithTag(Integer.valueOf(ab1.a(igroupinfo)));
            if (igroupinfo != null)
            {
                igroupinfo.setBackgroundColor(getResources().getColor(d.b));
                return;
            }
        }
        return;
    }
}
