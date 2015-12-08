// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

final class qn extends FragmentPagerAdapter
{

    final ScanCodeTabFragment a;

    qn(ScanCodeTabFragment scancodetabfragment, FragmentManager fragmentmanager)
    {
        a = scancodetabfragment;
        super(fragmentmanager);
    }

    public final int getCount()
    {
        return !ScanCodeTabFragment.f() ? 1 : 2;
    }

    public final Fragment getItem(int i)
    {
        if (i == ScanCodeTabFragment.d(a))
        {
            return ScanCodeTabFragment.e(a);
        } else
        {
            return ScanCodeTabFragment.h(a);
        }
    }
}
