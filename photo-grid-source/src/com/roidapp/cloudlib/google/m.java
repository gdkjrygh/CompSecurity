// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.google:
//            SearchPhotoFragment

final class m
    implements android.view.View.OnClickListener
{

    final SearchPhotoFragment a;

    m(SearchPhotoFragment searchphotofragment)
    {
        a = searchphotofragment;
        super();
    }

    public final void onClick(View view)
    {
        SearchPhotoFragment.a(a);
    }
}
