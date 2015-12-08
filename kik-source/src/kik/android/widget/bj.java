// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.SharedPreferences;
import com.kik.g.r;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment, as

final class bj extends r
{

    final as a;
    final GifSearchFragment b;

    bj(GifSearchFragment gifsearchfragment, as as)
    {
        b = gifsearchfragment;
        a = as;
        super();
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        GifSearchFragment.a(b, ((List) (obj)), a);
        GifSearchFragment.h(b).edit().putString("EMOJI_CACHE", GifSearchFragment.a(((List) (obj)))).putLong("TIMER_CACHE", System.currentTimeMillis()).apply();
    }

    public final void a(Throwable throwable)
    {
        throwable = GifSearchFragment.i(b);
        if (throwable == null)
        {
            b.a(GifWidget.a.g);
            return;
        } else
        {
            GifSearchFragment.a(b, throwable, a);
            return;
        }
    }
}
