// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.p;
import com.tinder.managers.i;

// Referenced classes of package com.tinder.fragments:
//            ay, g

final class init> extends p
{

    final ay a;

    public final Fragment a(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return g.a(a.c.g());

        case 1: // '\001'
            return g.a(a.c.b());
        }
    }

    public final int getCount()
    {
        return 2;
    }

    public final CharSequence getPageTitle(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return a.getResources().getString(0x7f060134);

        case 1: // '\001'
            return a.getResources().getString(0x7f06005f);
        }
    }

    gment(ay ay1, m m)
    {
        a = ay1;
        super(m);
    }
}
