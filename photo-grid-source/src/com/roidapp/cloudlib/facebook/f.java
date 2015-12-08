// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbAlbumListActivity

final class f
    implements android.content.DialogInterface.OnKeyListener
{

    final FbAlbumListActivity a;

    f(FbAlbumListActivity fbalbumlistactivity)
    {
        a = fbalbumlistactivity;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            a.b();
        }
        return false;
    }
}
