// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;

public final class ftk
    implements cua
{

    private final boolean a;

    public ftk(boolean flag)
    {
        a = flag;
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = false;
        obj = (com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item)obj;
        if (obj == null)
        {
            return false;
        }
        obj = ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item) (obj)).mVisibleFor;
        boolean flag2 = ((HashSet) (obj)).contains(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.For.b);
        boolean flag3 = ((HashSet) (obj)).contains(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.For.a);
        boolean flag = flag1;
        if (a)
        {
            flag = flag1;
            if (((HashSet) (obj)).contains(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.For.c))
            {
                flag = true;
            }
        }
        return flag | (flag2 | flag3);
    }
}
