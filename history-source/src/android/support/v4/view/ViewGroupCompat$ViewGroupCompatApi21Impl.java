// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompat, ViewGroupCompatApi21

static class R2Impl extends R2Impl
{

    public boolean isTransitionGroup(ViewGroup viewgroup)
    {
        return ViewGroupCompatApi21.isTransitionGroup(viewgroup);
    }

    public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
    {
        ViewGroupCompatApi21.setTransitionGroup(viewgroup, flag);
    }

    R2Impl()
    {
    }
}
