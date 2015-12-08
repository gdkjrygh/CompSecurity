// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.SharedPreferences;
import com.kik.g.p;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment, RobotoEditText, bm

public final class a
{

    final GifSearchFragment a;

    public final void a(String s, String s1)
    {
        GifSearchFragment.c(a, false);
        a._searchEditText.setText(s1);
        if (a._searchEditText.isFocused())
        {
            a._searchEditText.setSelection(s.length());
        }
        GifSearchFragment.a(a, s).a(new bm(this, s));
        if (GifSearchFragment.h(a).getBoolean("GIF_HINT_BAR_KEY", true))
        {
            int i = GifSearchFragment.h(a).getInt("GIF_EMOJI_TAPPED_KEY", 0) + 1;
            s = GifSearchFragment.h(a).edit();
            s.putInt("GIF_EMOJI_TAPPED_KEY", i);
            if (i >= 3)
            {
                GifSearchFragment.j(a);
                s.putBoolean("GIF_HINT_BAR_KEY", false);
            }
            s.apply();
        }
    }

    public r(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
    }
}
