// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

public final class iad
    implements dia
{

    public iad()
    {
    }

    public static Bundle a(String s, int i, int j, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("custom_title", s);
        bundle.putInt("min_selection", i);
        bundle.putInt("max_selection", j);
        bundle.putString("custom_button_text", s1);
        return bundle;
    }

    public final dif a(Activity activity, Bundle bundle)
    {
        return new iaa(activity, (hzh)olm.a(activity, hzh), bundle.getString("custom_title"), Math.max(1, bundle.getInt("min_selection")), bundle.getInt("max_selection"), bundle.getString("custom_button_text"));
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.actionbar.modes.multi_select_mode";
    }
}
