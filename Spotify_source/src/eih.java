// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class eih
{

    public static fxy a(String s, String s1, String s2, boolean flag, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s1);
        bundle.putString("track_uri", s2);
        bundle.putBoolean("autoplay", flag);
        s1 = new eig();
        a(s, bundle, ((fxy) (s1)));
        fyw.a(s1.F(), flags);
        return s1;
    }

    public static void a(String s, Bundle bundle, fxy fxy1)
    {
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        bundle = new Bundle(bundle);
        bundle.putString("artist_uri", s);
        fxy1.F().f(bundle);
    }
}
