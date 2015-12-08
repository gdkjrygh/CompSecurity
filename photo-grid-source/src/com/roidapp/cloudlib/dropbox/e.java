// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.roidapp.cloudlib.af;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.c;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            DropBoxPhotoFragment, l, c

final class e
    implements android.widget.AdapterView.OnItemClickListener
{

    final DropBoxPhotoFragment a;

    e(DropBoxPhotoFragment dropboxphotofragment)
    {
        a = dropboxphotofragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        if (DropBoxPhotoFragment.a(a) != null)
        {
            a.getActivity();
            if (!c.a())
            {
                Toast.makeText(a.getActivity(), a.getString(at.ag), 0).show();
            } else
            {
                DropBoxPhotoFragment.a(a, i);
                adapterview = (com.dropbox.client2.DropboxAPI.Entry)l.a((l)DropBoxPhotoFragment.b(a)).a.get(i);
                if (((com.dropbox.client2.DropboxAPI.Entry) (adapterview)).isDir)
                {
                    a.c(((com.dropbox.client2.DropboxAPI.Entry) (adapterview)).path);
                    return;
                }
                if (com.roidapp.cloudlib.dropbox.DropBoxPhotoFragment.c(a) != null && DropBoxPhotoFragment.d(a).a())
                {
                    DropBoxPhotoFragment.b(a, i);
                    (new Thread(DropBoxPhotoFragment.e(a))).start();
                    return;
                }
            }
        }
    }
}
