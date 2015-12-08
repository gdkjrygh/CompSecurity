// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

public final class iaj
    implements dia
{

    public iaj()
    {
    }

    public static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("custom_title", s);
        return bundle;
    }

    public final dif a(Activity activity, Bundle bundle)
    {
        bundle = bundle.getString("custom_title");
        return new iah(activity, (hzh)olm.a(activity, hzh), bundle);
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.actionbar.modes.single_select_mode";
    }
}
