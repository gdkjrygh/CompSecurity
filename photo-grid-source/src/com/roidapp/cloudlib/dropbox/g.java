// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment

final class g
    implements android.view.View.OnClickListener
{

    final DropBoxPhotoFragment a;

    g(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void onClick(View view)
    {
        int i = a.p.lastIndexOf('/');
        String s = a.p.substring(0, i);
        view = s;
        if (s.equals(""))
        {
            view = "/";
        }
        a.c(view);
    }
}
