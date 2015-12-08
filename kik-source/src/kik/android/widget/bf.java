// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.text.Editable;
import android.widget.ImageView;
import com.kik.m.s;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment

final class bf extends s
{

    final GifSearchFragment a;

    bf(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        if (editable.equals(""))
        {
            GifSearchFragment.e(a);
            a._searchCancel.setVisibility(4);
            a.a(GifWidget.a.c);
            return;
        }
        a._searchCancel.setVisibility(0);
        if (GifSearchFragment.f(a))
        {
            GifSearchFragment.a(a, editable);
            return;
        } else
        {
            GifSearchFragment.c(a, true);
            return;
        }
    }
}
