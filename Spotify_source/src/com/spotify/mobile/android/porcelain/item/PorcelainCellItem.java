// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.item;

import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import drh;
import dru;
import dry;
import drz;
import dsb;
import dsg;
import ghl;

public interface PorcelainCellItem
    extends drh, dry, dsb
{

    public static final ghl b = new ghl() {

        public final Object a(Object obj)
        {
            return new dsg((PorcelainCellItem)obj);
        }

    };

    public abstract dru getAccessoryLeft();

    public abstract dru getAccessoryRight();

    public abstract PorcelainNavigationLink getLongClickLink();

    public abstract drz getPlayable();

    public abstract boolean isEnabled();

}
