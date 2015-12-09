// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ftj
    implements cua
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public ftj(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        a = flag;
        b = flag1;
        c = flag2;
        d = flag3;
        e = flag4;
    }

    public final boolean a(Object obj)
    {
        boolean flag4 = true;
        obj = (com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item)obj;
        if (obj == null)
        {
            return false;
        }
        obj = ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item) (obj)).mVisibleWhen;
        boolean flag5 = ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.a);
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (a && ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b && ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.c))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (d && c && ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.e))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (d && ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.f))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!e || !((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.ShowWhen.g))
        {
            flag4 = false;
        }
        return flag3 | (flag5 | flag | flag1 | flag2) | flag4;
    }
}
