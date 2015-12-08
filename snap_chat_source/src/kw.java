// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;

public final class kw extends U
{

    public Fragment a;
    private final LeftSwipeContentFragment b;
    private final Bundle c;

    public kw(S s, LeftSwipeContentFragment leftswipecontentfragment, Bundle bundle)
    {
        super(s);
        b = leftswipecontentfragment;
        c = bundle;
    }

    public final Fragment a(int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 28
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        Object obj = null;
_L5:
        return ((Fragment) (obj));
_L2:
        return new Fragment();
_L3:
        SnapchatFragment snapchatfragment = b.newInstance();
        obj = snapchatfragment;
        if (c != null)
        {
            snapchatfragment.setArguments(c);
            return snapchatfragment;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (super.a(viewgroup, i)));
        if (i == 1)
        {
            a = (Fragment)viewgroup;
        }
        return viewgroup;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        super.a(viewgroup, i, obj);
        if (i == 1)
        {
            a = null;
        }
    }

    public final int c()
    {
        return 2;
    }
}
