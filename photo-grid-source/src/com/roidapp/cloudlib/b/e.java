// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package com.roidapp.cloudlib.b:
//            a, j, g

final class e extends FragmentPagerAdapter
{

    final a a;

    public e(a a1, FragmentManager fragmentmanager)
    {
        a = a1;
        super(fragmentmanager);
    }

    public final int getCount()
    {
        return 2;
    }

    public final Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            if (com.roidapp.cloudlib.b.a.b(a) == null)
            {
                com.roidapp.cloudlib.b.a.a(a, new j());
            }
            return com.roidapp.cloudlib.b.a.b(a);

        case 1: // '\001'
            break;
        }
        if (com.roidapp.cloudlib.b.a.d(a) == null)
        {
            com.roidapp.cloudlib.b.a.a(a, new g());
        }
        return com.roidapp.cloudlib.b.a.d(a);
    }

    public final CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            return super.getPageTitle(i);

        case 0: // '\0'
            return "USERS";

        case 1: // '\001'
            return "HASHTAGS";
        }
    }
}
