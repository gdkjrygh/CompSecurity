// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fti
    implements cua
{

    private final boolean a;
    private final boolean b;

    public fti(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = true;
        obj = (com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item)obj;
        if (obj == null)
        {
            return false;
        }
        obj = ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item) (obj)).mDisableWhen;
        boolean flag2 = ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen.d);
        boolean flag;
        if (a && ((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!b || !((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen) (obj)).equals(com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item.DisableWhen.c))
        {
            flag1 = false;
        }
        return flag | flag2 | flag1;
    }
}
