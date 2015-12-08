// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.google:
//            SearchPhotoFragment

final class l
    implements android.content.DialogInterface.OnClickListener
{

    final SearchPhotoFragment a;

    l(SearchPhotoFragment searchphotofragment)
    {
        a = searchphotofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        SearchPhotoFragment.b(a);
    }
}
