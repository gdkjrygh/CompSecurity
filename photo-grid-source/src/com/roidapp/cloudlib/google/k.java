// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.roidapp.cloudlib.google:
//            SearchPhotoFragment

final class k
    implements android.widget.TextView.OnEditorActionListener
{

    final SearchPhotoFragment a;

    k(SearchPhotoFragment searchphotofragment)
    {
        a = searchphotofragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            SearchPhotoFragment.a(a);
        }
        return false;
    }
}
