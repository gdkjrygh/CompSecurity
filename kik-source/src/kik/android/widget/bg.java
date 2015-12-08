// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment, RobotoEditText

final class bg
    implements android.widget.TextView.OnEditorActionListener
{

    final List a;
    final GifSearchFragment b;

    bg(GifSearchFragment gifsearchfragment, List list)
    {
        b = gifsearchfragment;
        a = list;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            GifSearchFragment.g(b);
            GifSearchFragment.a(b, b._searchEditText.getText().toString(), a.size());
        }
        return false;
    }
}
