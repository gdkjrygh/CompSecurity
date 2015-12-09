// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.item;

import dqz;
import dsb;
import dse;
import ghl;

public interface PorcelainCardItem
    extends dqz, dsb
{

    public static final ghl c = new ghl() {

        public final Object a(Object obj)
        {
            return new dse((PorcelainCardItem)obj);
        }

    };

    public abstract TextStyle getTextStyle();

}
