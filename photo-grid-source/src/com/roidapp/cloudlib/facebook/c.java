// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.DialogInterface;
import android.content.Intent;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            al, FbAlbumListActivity

final class c
    implements android.content.DialogInterface.OnClickListener
{

    final FbAlbumListActivity a;

    c(FbAlbumListActivity fbalbumlistactivity)
    {
        a = fbalbumlistactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        al.a(a);
        a.a();
        a.startActivity(new Intent(a, al.g().d()));
        a.finish();
    }
}
