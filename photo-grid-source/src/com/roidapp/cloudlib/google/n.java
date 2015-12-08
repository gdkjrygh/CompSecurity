// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.cloudlib.google:
//            SearchPhotoFragment

final class n
    implements android.content.DialogInterface.OnKeyListener
{

    final SearchPhotoFragment a;

    n(SearchPhotoFragment searchphotofragment)
    {
        a = searchphotofragment;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            SearchPhotoFragment.b(a);
        }
        return false;
    }
}
