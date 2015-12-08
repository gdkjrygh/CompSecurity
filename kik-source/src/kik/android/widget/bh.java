// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment

final class bh
    implements android.view.View.OnFocusChangeListener
{

    final GifSearchFragment a;

    bh(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag && a.f() != null)
        {
            a.f().a();
        }
    }
}
