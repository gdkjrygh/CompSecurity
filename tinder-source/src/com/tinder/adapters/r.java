// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.o;
import com.tinder.fragments.bu;
import com.tinder.model.WhatsNew;
import java.util.List;

public final class r extends o
{

    private List a;

    public r(List list, m m)
    {
        super(m);
        a = list;
    }

    public final Fragment a(int i)
    {
        bu bu1 = new bu();
        bu1.a = (WhatsNew)a.get(i);
        return bu1;
    }

    public final int getCount()
    {
        return a.size();
    }
}
